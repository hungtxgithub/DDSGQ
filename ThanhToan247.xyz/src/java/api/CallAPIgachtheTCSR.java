package api;

import org.apache.commons.lang3.RandomStringUtils;
import org.json.JSONObject;
import org.json.JSONTokener;


public class CallAPIgachtheTCSR {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			try {				
				//test gọi api nạp thẻ
				String APIKEY = "XSQDWVNNIXYZPJBDDWVTAVOIYQYOFTBL";   //truy cập https://thecaosieure.com/profile để lấy
				String mathe = "224464795476046";
				String serial_the = "20000170728725";
				String menh_gia = "10000"; //10k
				String cardType="Viettel" ; // "Viettel" hoặc "Mobifone" hoặc "VietnamMobile"
				String taikhoan_tcsr = "hungtienxinh";			
				String transId="48446868";
				String zAPIURL = "https://thecaosieure.com/gachthe?account="+taikhoan_tcsr +"&cardType=" + cardType + "&cardCode=" + mathe
							+ "&APIKey=" + APIKEY + "&transId="+transId + "&cardSerial=" + serial_the+ "&cardAmount=" + menh_gia;
				System.out.println("thecaosieure call:" + zAPIURL);				
				java.net.URL obj = new java.net.URL(zAPIURL);
				JSONTokener tokener = new JSONTokener(obj.openStream());
				JSONObject root = new JSONObject(tokener);
				System.out.println("thecaosieure_return:" + root.toString());
				
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
//                        86749503
	}

}