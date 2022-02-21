
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author hungt
 */
public class NewClass {

    public static void main(String[] args) {
        String transactionContent = "MBVCB.1751067237.TT24737.CT tu 1020539233 DOAN HAI PHONG toi0291000350547 NGUYEN TRONG HUNG";
        System.out.println(Arrays.toString(transactionContent.split("TT247")));
        System.out.println(transactionContent.split("TT247")[0].substring(0, 12));
        System.out.println(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date()));
        
    }
}
