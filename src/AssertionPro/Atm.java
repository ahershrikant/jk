package AssertionPro;
import java.util.Scanner;
public class Atm {
    

   static int name() {
	   Scanner sc=new Scanner(System.in);
	   System.out.println("choose your Account just type a Number");
	   
	   int ch=sc.nextInt();
	   
	   switch(ch) {
	   
	   case 1 :
		   System.out.println("Saving Account");
		   /*choose it what are you doing*/
		   String [] Choose= {"1.check Balance\n2.Deposite\n3.Withdraw\n4.Receipt\n5Transaction\nExist"};
		   int oper=0;
		   System.out.println("choose\n"+Choose[oper]);
		  /*choose the operation what are you doing*/
		  System.out.println("coose what operation you perform"); 
		   int operation=sc.nextInt();
		   switch(operation) {
		   case 1:
			   System.out.println("Check Balance\n");
			   /*fetch the bank detail customer and then move to print the Account amount*/
			   System.out.println( "Rs");
			   break;
		   case 2:
			   System.out.println("Deposite");
			int accountBalance=2000;
			 long   rs=sc.nextLong();
			   long paise=accountBalance+rs;
			   System.out.println("Rs:"+paise);
			   
			   break;
		   case 3:
			   System.out.println("Withdraw");
			int accountBalance1=2000;
			   long rs1=sc.nextLong();
			   long paise1=accountBalance1-rs1;
			   System.out.println("Rs:"+paise1);
			   break;
		   case 4:
			   System.out.println("Receipt");
			   break;
		   case 5:
			   System.out.println("Transaction");
			   break;
		   default:
			   System.out.println("Exist");
			   break;
		   
			 
			   
		   }
		   break;
   
	   case 2:
			   System.out.println("Current Account");
			   
			   String [] ChooseOper = {".check Balance\n2.Deposite\n3.Withdraw\n4.Receipt\n5Transaction\nExist"};
			   int opert=0;
			   System.out.println("choose\n"+ChooseOper[opert]);
			  /*choose the operation what are you doing*/
			  System.out.println("coose what operation you perform"); 
			   int operation2=sc.nextInt();
			   switch(operation2) {
			   case 1:
				   System.out.println("Check Balance");
				   break;
			   case 2:
				   System.out.println("Deposite");
				   break;
			   case 3:
				   System.out.println("Withdraw");
				   break;
			   case 4:
				   System.out.println("Receipt");
				   break;
			   case 5:
				   System.out.println("Transaction");
				   break;
			   default:
				   System.out.println("Exist");
				   break;
			    }
			   break;
	   default:
			  System.out.println("Exist Account");
			   break;


	   }
	   
	   
	  return ch; 
   }
    
	public static void main(String[] args) {
		// Bank w=new Bank();
		 Scanner sc=new Scanner(System.in);
		 System.out.println("Enter the password");
		   long Password=sc.nextInt();
		   System.out.println("The password is:"+Password);
		   System.out.println("choose your Account");
		   String[] accountType= {"1.Saving Account\n 2.Current Account\n 3.Exist Account"};
		   int i=0;
		   System.out.println( accountType[i]);
		   
       	int Account=name();
      
	
	}
    

}
