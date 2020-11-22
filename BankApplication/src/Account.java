import java.util.Scanner;
import  java.util.Date;
public  abstract class Account {
	long acc_sa2;
	long acc_sa1;
	long acc_la;
	long acc_ca;
	
	public static int count_d=0;
	public static int count_w=0;
	public int total_count;
	public static double total_amt=0.0;
	public static double[] str=new double[2];
	public static String str1;
	public Date dep;
	public Date doc;
	public Date wit;

	
	
	public long getAcc_sa2() {
		return acc_sa2;
	}

	public void setAcc_sa2(long acc_sa2) {
		this.acc_sa2 = acc_sa2;
	}

	public long getAcc_sa1() {
		return acc_sa1;
	}

	public void setAcc_sa1(long acc_sa1) {
		this.acc_sa1 = acc_sa1;
	}

	public long getAcc_la() {
		return acc_la;
	}

	public void setAcc_la(long acc_la) {
		this.acc_la = acc_la;
	}

	public long getAcc_ca() {
		return acc_ca;
	}

	public void setAcc_ca(long acc_ca) {
		this.acc_ca = acc_ca;
	}
	double intr=0.05;
	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public long getAdhar() {
		return adhar;
	}

	public void setAdhar(long adhar) {
		this.adhar = adhar;
	}
	String name;
	static final String branch="SBI Nagpur";
	float balance;
	String address;
	
	long adhar;
	Scanner sc=new Scanner(System.in);
	public Account()
	{
		
	}
	
	public void  deposite()
	{
		System.out.println(" \n\n Enter the amount you wanted to deposite ");
		float amt=sc.nextFloat();
		
		this.balance=this.balance+amt;
		
		System.out.println("\n\n Your current balance is "+this.balance);
		str1+="\n"+"Deposited Amount is "+amt+"\n";
		count_d++;
		total_amt+=this.balance;
		str[0]+=amt;
		dep=new Date();
		System.out.println("Date of depositing money is "+dep);
		
		
	}
	
	public static int getCount_d() {
		return count_d;
	}

	public static void setCount_d(int count_d) {
		Account.count_d = count_d;
	}

	public static int getCount_w() {
		return count_w;
	}

	public static void setCount_w(int count_w) {
		Account.count_w = count_w;
	}

	public void  withdrawn()
	{
		System.out.println(" \n\n Enter the amount you wanted to withdrawn ");
		float amt=sc.nextFloat();
		if(amt>this.balance)
		{
			System.out.println("Insufficient Balance ");
		}
		else
		{
			this.balance=this.balance-amt;
			str1+="\n"+"Withdrawal Amount is "+amt+"\n";
			System.out.println("\n\n Your current balance is "+this.balance);
			wit=new Date();
			System.out.println("Date of withdrawing money is "+wit);
		}
		count_w++;
		total_amt+=this.balance;
		str[1]+=amt;
	} 
	
	public void calInterest()
	{
		System.out.println("\n\nHow many years you kept your ammount");
		int year=sc.nextInt();
		double interest;
		interest=year*this.intr*this.balance;
		System.out.println("\n\nThe calculated interest is "+interest);
	}
	
	/*public void totalAmount()
	{
		total_count=count_w+count_d;
		System.out.println("\n\n Total Number of Whole Transaction is  "+this.total_count);
		System.out.println("\n\n Total Amount of Whole Transaction is  "+this.total_amt);
		
	}
	*/
	
	
	public void display_salary()
	{
		System.out.println("Your generated Account No is: "+this.acc_sa2);
		System.out.println("Name of the Account Holder: "+this.name);
		System.out.println("Branch of the Account Holder: "+this.branch);
		System.out.println("Adhaar ID of the Account Holder: "+this.adhar);
		System.out.println("Address of the Account Holder: "+this.address);
	}
	public void display_saving()
	{
		System.out.println("Your generated Account No is: "+this.acc_sa1);
		System.out.println("Name of the Account Holder: "+this.name);
		System.out.println("Branch of the Account Holder: "+this.branch);
		System.out.println("Adhaar ID of the Account Holder: "+this.adhar);
		System.out.println("Address of the Account Holder: "+this.address);
	}
	public void display_current()
	{
		System.out.println("Your generated Account No is: "+this.acc_sa1);
		System.out.println("Name of the Account Holder: "+this.name);
		System.out.println("Branch of the Account Holder: "+this.branch);
		System.out.println("Adhaar ID of the Account Holder: "+this.adhar);
		System.out.println("Address of the Account Holder: "+this.address);
	}
	public void display_loan()
	{
		System.out.println("Your generated Account No is: "+this.acc_sa1);
		System.out.println("Name of the Account Holder: "+this.name);
		System.out.println("Branch of the Account Holder: "+this.branch);
		System.out.println("Adhaar ID of the Account Holder: "+this.adhar);
		System.out.println("Address of the Account Holder: "+this.address);
	}
	
	public String getStat() {
		return str1;
	}
	public double totalAmount()
	{
		return total_amt;
	}
	public double totalDeposit()
	{
		return str[0];
	}
	public double totalWithdrawal()
	{
		return str[1];
	}
	
	public int totalCount()
	{
		total_count=count_w+count_d;
		return total_count;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getBalance() {
		return balance;
	}
	public void setBalance(float balance) {
		this.balance = balance;
	}
	public Scanner getSc() {
		return sc;
	}
	public void setSc(Scanner sc) {
		this.sc = sc;
	}
	public static String getBranch() {
		return branch;
	}
	public abstract void openAcc();
	
	
}
