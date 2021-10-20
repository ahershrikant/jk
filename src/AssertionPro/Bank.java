package AssertionPro;
import java.util.Scanner;
public abstract class Bank {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		long AccountNumber=sc.nextLong();
		System.out.println(AccountNumber);
		String IFSCCode=sc.nextLine();
		System.out.println(IFSCCode);
		String N=sc.nextLine();
		System.out.println(N);
	}

}
