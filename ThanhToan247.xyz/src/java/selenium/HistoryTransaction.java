/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package selenium;

import daos.RechargeDAO;
import daos.UserDAO;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import models.HistoryRecharge;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 *
 * @author hungt
 */
public class HistoryTransaction {

    public static void main(String[] args) throws InterruptedException {
        RechargeDAO historyRechargeDao = new RechargeDAO();
        UserDAO userDao = new UserDAO();
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\hungt\\Downloads\\selenium\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://vcbdigibank.vietcombank.com.vn/login");
        JavascriptExecutor js = (JavascriptExecutor) driver;
        Thread.sleep(15000);
        js.executeScript("document.querySelector('.account-list-item-ic').click()");
        Thread.sleep(2000);
        int count = 0;
        while (true) {
            if (count == 10) {
                count = 0;
                driver.get("https://vcbdigibank.vietcombank.com.vn/thongtintaikhoan/chitiettaikhoan");
                Thread.sleep(2000);
            }
            js.executeScript("document.querySelector('#ChiTietTaiKhoan > div > div > div.form-main-footer > div > div:nth-child(2) > div > a').click()");
            Thread.sleep(2000);
            List<WebElement> list = driver.findElements(By.cssSelector(".tab-content .list-info-txt-main"));
            for (int i = 0; i < list.size() / 2; i = i + 2) {
                String transactionContent = list.get(i).getAttribute("innerHTML").trim();
                System.out.println("46" + transactionContent);
                if (transactionContent.contains("TT247")) {
                    int userID = Integer.parseInt(transactionContent.replaceAll(".*TT247", "").replaceAll("[^0-9]+.*", ""));
                    String transactionID = transactionContent.split("TT247")[0].substring(0, 12);
                    String money = list.get(i + 1).getAttribute("innerHTML").replaceAll("[+ ,]", "");
                    List<HistoryRecharge> historyRecharge = historyRechargeDao.getHistoryRecharges(userID);
                    int sizeHistoryTransaction = historyRechargeDao.getHistoryRecharges(userID).size();
                    System.out.println("sizeHistoryTransaction"+sizeHistoryTransaction);
                    int countTransaction = 0;
                    if(sizeHistoryTransaction==0){
                        userDao.updateRemainingMoney(userID, Float.parseFloat(money));
                        historyRechargeDao.insertHistoryRecharge(transactionID, Float.parseFloat(money), new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date()), userID);
                                System.out.println("===========SUCCESSFULLY WITH:=================");
                                System.out.println("||" + transactionContent + "||");
                                System.out.println("||" + money + "||");
                                System.out.println("||" + userID + "||");
                                System.out.println("=======================================================");
                    }else{
                        for (int j = 0; j < historyRecharge.size(); j++) {
                        System.out.println("57" + j);
                        if (!transactionID.equals(historyRecharge.get(j).getTransactionID())) {
                            countTransaction++;
                            System.out.println("countTransaction"+countTransaction);
                            if (countTransaction == sizeHistoryTransaction) {
                                userDao.updateRemainingMoney(userID, Float.parseFloat(money));
                                historyRechargeDao.insertHistoryRecharge(transactionID, Float.parseFloat(money), new SimpleDateFormat("yyyy-MM-dd").format(new Date()), userID);
                                System.out.println("===========SUCCESSFULLY WITH:=================");
                                System.out.println("||" + transactionContent + "||");
                                System.out.println("||" + money + "||");
                                System.out.println("||" + userID + "||");
                                System.out.println("=======================================================");
                                
                            }

                        }
                    }
                    }
                    
                }
            }
            System.out.println("SLEEP 10s");
            Thread.sleep(10000);
            count++;
            System.out.println(count);
        }
    }
}
