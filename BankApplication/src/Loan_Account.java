

import java.util.Date;
import java.util.Scanner;

public class Loan_Account extends Account{
	Scanner sc=new Scanner(System.in);
	static long acc_no_la=300;
	long acc_la;
	public Loan_Account()
	{
		acc_la=++acc_no_la;
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
			System.out.println("Congrets!! Your Loan Account has opened...");
			System.out.println("");
			System.out.println("----Your Entering details are below----");
			System.out.println("");
			System.out.println("Your generated Account No is: "+this.acc_la);
			System.out.println("Name of the Account Holder: "+this.name);
			System.out.println("Account Balance is "+this.balance);
			System.out.println("Branch of the Account Holder: "+this.branch);
			System.out.println("Adhaar ID of the Account Holder: "+this.adhar);
			System.out.println("Address of the Account Holder: "+this.address);
			 doc=new Date();
			    System.out.println("Date of opening the account is "+doc);
		
	}
	

	public long getAcc_la() {
		return acc_la;
	}
	public void setAcc_la(long acc_la) {
		this.acc_la = acc_la;
	}
	public void calInterest()
	{
		System.out.println("How many years you kept your ammount");
		double year=sc.nextDouble();
		double interest;
		interest=this.balance*((Math.pow((1+this.intr),year))-1);
		System.out.println("The calculated interest is "+interest);
	}
}
