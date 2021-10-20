package AssertionPro;
import java.util.Scanner;
public class checkAge {
     static boolean Age=true;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc=new Scanner(System.in);
        int Age=sc.nextInt();
        assert Age>=18;/*only check the Assertion means the writing of assumption is correct or not*/
        System.out.println("your allow to the voating:"+Age);
	}

}
