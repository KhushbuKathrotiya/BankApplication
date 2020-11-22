import java.util.Date;
import java.util.Scanner;

public class Salary_Account extends Account{
	Scanner sc=new Scanner(System.in);
	static long acc_no_sa2=400;
	long acc_sa2;
	public Salary_Account()
	{
		acc_sa2=++acc_no_sa2;
	}
	public void openAcc()
	{
		//System.out.println("-----Welcome to Saving Account----");
		System.out.println("Enter Name of the Account Holder: ");
		this.name=sc.nextLine();
		System.out.println("Enter Adhaar ID of the Account Holder: ");
		this.adhar=sc.nextLong();
		System.out.println("Enter Address of the Account Holder: ");
		this.address=sc.next();
		System.out.println("Enter Amount for Opening Account: ");
		this.balance=sc.nextFloat();
		/*if(this.balance<10000)
		{
			System.out.println("\n\nPlease Enter valid Amount... It should be greater than Rs.10000 \n\n");
			
		}
		else
		{*/
			System.out.println("");
			System.out.println("");
			System.out.println("Congrets!! Your Salary Account has opened...");
			System.out.println("");
			System.out.println("----Your Entering details are below----");
			System.out.println("");
			System.out.println("Your generated Account No is: "+this.acc_sa2);
			System.out.println("Name of the Account Holder: "+this.name);
			System.out.println("Account Balance is "+this.balance);
			System.out.println("Branch of the Account Holder: "+this.branch);
			System.out.println("Adhaar ID of the Account Holder: "+this.adhar);
			System.out.println("Address of the Account Holder: "+this.address);
			  doc=new Date();
			    System.out.println("Date of opening the account is "+doc);
		
	}
	public long getAcc_sa2() {
		return acc_sa2;
	}
	public void setAcc_sa2(long acc_sa2) {
		this.acc_sa2 = acc_sa2;
	}
	
}
