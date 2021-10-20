package AssertionPro;
import java.util.Scanner;
public class CheckAssertion {
    static boolean encryptionLogic=true;
	public static void main(String[] args) {
	    String creditCardNumber="466886654664";
	    creditCardNumber=envryPtionLogic(creditCardNumber);
		assert encryptionLogic;/*just test it problem as developer logic is correct or not that is called the white box testing or unit testing*/
		System.out.println("The value is:"+creditCardNumber);
		}
      static String envryPtionLogic(String creditCardNumber)
      {
    	  encryptionLogic=true;
    	  String last4Digit=creditCardNumber.substring(5);
    	  System.out.println("last4Digit"+last4Digit);
    	  return  creditCardNumber.replace(last4Digit, "XXXX");
    		      
    	  
      }
}
