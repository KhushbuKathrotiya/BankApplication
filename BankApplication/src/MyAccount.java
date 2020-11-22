import java.util.Scanner;

public class MyAccount {

	public MyAccount()
	{
		
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String wish;
		int cnt=0;
		String del="NULL";
		int sa1,sa2,sa3,sa4;
		MyAccount my=new MyAccount();
		Account[][] mc=new Account[4][100];
		Account ga=new Saving_Account();
		System.out.println("------------Welcome to Bank Application--------");
		System.out.println("");
		
		
		do
		{
			
			
			System.out.println("\n------------MENU--------");
			System.out.println("\n1.Opening Account  2.Closing Account  3.Deposit Money  4.Withdraw money  5.End of the day Report 6.Check Interest 7.Exit");
			System.out.println("\nPlease Enter your choice : ");
			int ch=sc.nextInt();
		switch(ch)
		{
		case 1:
			
			System.out.println("\n------------MENU--------");
			System.out.println("\n1.Saving Account  2.Salary Account  3.Current Account 4.Loan Account");
			System.out.println("\nPlease Enter your choice from above for Opening an Account : ");
			int ch1=sc.nextInt();
			switch(ch1)
			{
			case 1:
				System.out.println("\n How many saving accounts do you want to open: ");
				sa1=sc.nextInt();
				for(int i=0;i<sa1;i++)
				{
					mc[0][i]=new Saving_Account();
					mc[0][i].openAcc();
				}
				
				break;
			case 2:
				System.out.println("\n How many salary accounts do you want to open: ");
				sa2=sc.nextInt();
				for(int i=0;i<sa2;i++)
				{
					mc[1][i]=new Salary_Account();
					mc[1][i].openAcc();
				}
				break;
			case 3:
				System.out.println("\n How many current accounts do you want to open: ");
				sa3=sc.nextInt();
				for(int i=0;i<sa3;i++)
				{
					mc[2][i]=new Current_Account();
					mc[2][i].openAcc();
				}
				break;
			case 4:
				System.out.println("\n How many Loan accounts do you want to open: ");
				sa4=sc.nextInt();
				for(int i=0;i<sa4;i++)
				{
					mc[3][i]=new Loan_Account();
					mc[3][i].openAcc();
				}
				break;
			}
			break;
		case 2:
			System.out.println("\n------------MENU--------");
			System.out.println("\n1.Saving Account  2.Salary Account  3.Current Account 4.Loan Account");
			System.out.println("\nPlease Enter your choice from above for Closing an Account : ");
			int ch2=sc.nextInt();
			switch(ch2)
			{
			case 1:
				System.out.println("\n Enter the Account Number do you want to close : ");
				Long acc1=sc.nextLong();
				 String str1="NO";
				 try {
					for(int i=0;i<20;i++)
					 {
						  if(mc[0][i].getAcc_sa1()==acc1)
						  {
							  mc[0][i]=null;
							  System.out.println("\nNow, Your Account Number "+acc1+" has been closed!!!!");
							  str1="YES";
							  break;
						  }
						
					  }
				} catch (Exception e) {
					// TODO Auto-generated catch block
					System.out.println("Your account number is invalid");
				}
				
				break;
			case 2:
				System.out.println("\n Enter the Account Number do you want to close : ");
				Long acc2=sc.nextLong();
				 String str2="NO";
				 try {
					for(int i=0;i<20;i++)
					 {
						  if(mc[1][i].getAcc_sa2()==acc2)
						  {
							  mc[1][i]=null;
							  System.out.println("\n Now, Your Account Number "+acc2+" has been closed!!!!");
							  str2="YES";
							  break;
						  }
						
					  }
				} catch (Exception e) {
					// TODO Auto-generated catch block
					 System.out.println("Your account number is invalid");
				}
				 
					 
				  
				break;
			case 3:
				System.out.println("\n Enter the Account Number do you want to close : ");
				Long acc3=sc.nextLong();
				 String str3="NO";
				 try {
					for(int i=0;i<20;i++)
					 {
						  if(mc[2][i].getAcc_ca()==acc3)
						  {
							  mc[2][i]=null;
							  System.out.println("\nNow,  Your Account Number "+acc3+" has been closed!!!!");
							  str3="YES";
							  break;
						  }
						
					  }
				} catch (Exception e) {
					// TODO Auto-generated catch block
					System.out.println("Your account number is invalid");
				}
				
				break;
			case 4:
				System.out.println("\n Enter the Account Number do you want to close : ");
				Long acc4=sc.nextLong();
				 String str4="NO";
				 try {
					for(int i=0;i<20;i++)
					 {
						  if(mc[3][i].getAcc_la()==acc4)
						  {
							  mc[3][i]=null;
							  System.out.println("\nNow,  Your Account Number "+acc4+" has been closed!!!!");
							  str4="YES";
							  break;
						  }
						
					  }
				} catch (Exception e) {
					// TODO Auto-generated catch block
					 System.out.println("Your account number is invalid");
				}
				 
				break;
			}
			break;
			
		case 3:
			System.out.println("\n------------MENU--------");
			System.out.println("\n1.Saving Account  2.Salary Account  3.Current Account 4.Loan Account");
			System.out.println("\nPlease Enter your choice from above for Deposit Money : ");
			int ch3=sc.nextInt();
			switch(ch3)
			{
			case 1:
				  System.out.println("\n Enter your account number");
				  int acc1=sc.nextInt();
				  String str1="NO";
				  try {
					for(int i=0;i<20;i++)
					  {
						  if(mc[0][i].getAcc_sa1()==acc1)
						  {
							  mc[0][i].deposite();
							
							  
							  str1="YES";
							  break;
						  }
						
					  }
				} catch (Exception e) {
					// TODO Auto-generated catch block
					 System.out.println("Your account number is invalid");
				}
				 
				break;
			case 2:
				 System.out.println("\n Enter your account number");
				  int acc2=sc.nextInt();
				  String str2="NO";
				  try {
					for(int i=0;i<20;i++)
					  {
						  if(mc[1][i].getAcc_sa2()==acc2)
						  {
							  mc[1][i].deposite();
						
							  
							  str2="YES";
							  break;
						  }
						
					  }
				} catch (Exception e) {
					// TODO Auto-generated catch block
					System.out.println("Your account number is invalid");
				}
				  
				break;
			case 3:
				 System.out.println("\n Enter your account number");
				  int acc3=sc.nextInt();
				  String str3="NO";
				  try {
					for(int i=0;i<20;i++)
					  {
						  if(mc[2][i].getAcc_ca()==acc3)
						  {
							  mc[2][i].deposite();
						
							  
							  str3="YES";
							  break;
						  }
						 
					  }
				} catch (Exception e) {
					// TODO Auto-generated catch block
					 System.out.println("Your account number is invalid");
				}
				break;
			case 4:
				 System.out.println("\n Enter your account number");
				  int acc4=sc.nextInt();
				  String str4="NO";
				  try {
					for(int i=0;i<20;i++)
					  {
						  if(mc[3][i].getAcc_la()==acc4)
						  {
							  mc[3][i].deposite();
							 
							  
							  str4="YES";
							  break;
						  }
						
					  }
				} catch (Exception e) {
					// TODO Auto-generated catch block
					 System.out.println("Your account number is invalid");
				}
				  
				break;
			}
			break;
			
			
			
		case 4:
			System.out.println("\n------------MENU--------");
			System.out.println("\n1.Saving Account  2.Salary Account  3.Current Account 4.Loan Account");
			System.out.println("\nPlease Enter your choice from above for withdrawn Money : ");
			int ch4=sc.nextInt();
			switch(ch4)
			{
			case 1:
				  System.out.println("\n Enter your account number");
				  int acc1=sc.nextInt();
				  String str1="NO";
				  try {
					for(int i=0;i<20;i++)
					  {
						  if(mc[0][i].getAcc_sa1()==acc1)
						  {
							  mc[0][i].withdrawn();
							 
							  
							  str1="YES";
							  break;
						  }
						
					  }
				} catch (Exception e) {
					// TODO Auto-generated catch block
					 System.out.println("Your account number is invalid");
				}
				  
				break;
			case 2:
				 System.out.println("\n Enter your account number");
				  int acc2=sc.nextInt();
				  String str2="NO";
				  try {
					for(int i=0;i<20;i++)
					  {
						  if(mc[1][i].getAcc_sa2()==acc2)
						  {
							  mc[1][i].withdrawn();
						
							
							  str2="YES";
							  break;
						  }
						
					  }
				} catch (Exception e) {
					// TODO Auto-generated catch block
					System.out.println("Your account number is invalid");
				}
				  
				break;
			case 3:
				 System.out.println("\n Enter your account number");
				  int acc3=sc.nextInt();
				  String str3="NO";
				  try {
					for(int i=0;i<20;i++)
					  {
						  if(mc[2][i].getAcc_ca()==acc3)
						  {
							  mc[2][i].withdrawn();
							 
							 
							  str3="YES";
							  break;
						  }
						 
					  }
				} catch (Exception e) {
					// TODO Auto-generated catch block
					System.out.println("Your account number is invalid");
				}
				  
				break;
			case 4:
				 System.out.println("\n Enter your account number");
				  int acc4=sc.nextInt();
				  String str4="NO";
				  try {
					for(int i=0;i<20;i++)
					  {
						  if(mc[3][i].getAcc_la()==acc4)
						  {
							  mc[3][i].withdrawn();
							  
							  
							  str4="YES";
							  break;
						  }
						
					  }
				} catch (Exception e) {
					// TODO Auto-generated catch block
					System.out.println("Your account number is invalid");
				}
				  
				break;
			}
			break;
			
		case 5:
			
			System.out.println("\n\n Total Number of Whole Transaction is  "+end_of_day_cnt(ga));
			System.out.println("\n\n Total Amount of Whole Transaction is  "+end_of_day_amt(ga));
			System.out.println("\n\n Total Deposited Amount is  "+end_of_day_deposit(ga));
			System.out.println("\n\n Total Withdrawal Amount is  "+end_of_day_withdrawal(ga));
			
			//System.out.println("\n\n Total Withdrawal Amount is  "+end_of_day_stat(ga));
			
			/*for(int i=0;i<sa1;i++)
			{
				mc[0][i].display_saving();
			}
			System.out.println("\n\n ");
			for(int i=0;i<100;i++)
			{
				mc[1][i].display_salary();
			}
			System.out.println("\n\n ");
			for(int i=0;i<100;i++)
			{
				mc[1][i].display_current();
			}
			System.out.println("\n\n ");
			for(int i=0;i<100;i++)
			{
				mc[1][i].display_loan();
			}
			System.out.println("\n\n ");*/
			break;
			
		case 6:
			System.out.println("\n------------MENU--------");
			System.out.println("\n1.Saving Account  2.Salary Account  3.Current Account 4.Loan Account");
			System.out.println("Enter your choice ");
			int choice=sc.nextInt();
			switch(choice)
			{
		case 1:
			  System.out.println("\n Enter your account number");
			  int acc1=sc.nextInt();
			  String str1="NO";
			  try {
				for(int i=0;i<20;i++)
				  {
					  if(mc[0][i].getAcc_sa1()==acc1)
					  {
						 
						  mc[0][i].calInterest();
						  
						  str1="YES";
						  break;
					  }
					
				  }
			} catch (Exception e) {
				// TODO Auto-generated catch block
				 System.out.println("Your account number is invalid");
			}
			 
			break;
		case 2:
			 System.out.println("\n Enter your account number");
			  int acc2=sc.nextInt();
			  String str2="NO";
			  try {
				for(int i=0;i<20;i++)
				  {
					  if(mc[1][i].getAcc_sa2()==acc2)
					  {
						 
						  mc[1][i].calInterest();
						  
						  str2="YES";
						  break;
					  }
					
				  }
			} catch (Exception e) {
				// TODO Auto-generated catch block
				System.out.println("Your account number is invalid");
			}
			  
			break;
		case 3:
			 System.out.println("\n Enter your account number");
			  int acc3=sc.nextInt();
			  String str3="NO";
			  try {
				for(int i=0;i<20;i++)
				  {
					  if(mc[2][i].getAcc_ca()==acc3)
					  {
						 
						  mc[2][i].calInterest();
						  
						  str3="YES";
						  break;
					  }
					 
				  }
			} catch (Exception e) {
				// TODO Auto-generated catch block
				 System.out.println("Your account number is invalid");
			}
			break;
		case 4:
			 System.out.println("\n Enter your account number");
			  int acc4=sc.nextInt();
			  String str4="NO";
			  try {
				for(int i=0;i<20;i++)
				  {
					  if(mc[3][i].getAcc_la()==acc4)
					  {
						 
						  mc[3][i].calInterest();
						  
						  str4="YES";
						  break;
					  }
					
				  }
			} catch (Exception e) {
				// TODO Auto-generated catch block
				 System.out.println("Your account number is invalid");
			}
			  
			break;
		}
			break;
		case 7:Object exit;
		       break;
		}
		System.out.println("\n\nDo you to continue [Y/N]: ");
		wish=sc.next();
		
	}
		while(wish.equals("y") || wish.equals("Y"));
		
		
	
	
	if(wish.equals("n") || wish.equals("N"))
	{
		System.out.println("\n\n\nThank you using our bank Application... ");
		System.out.println("\nChal bhag bhag sher aya ... ");
		Object exit;
	}
		}
	
	public static double end_of_day_amt(Account ga)
	{
		
			return ga.totalAmount();
	
	}
	public static double end_of_day_deposit(Account ga)
	{
		
			return ga.totalDeposit();
	
	}
	public static double end_of_day_withdrawal(Account ga)
	{
		
			return ga.totalWithdrawal();
	
	}
	public static int end_of_day_cnt(Account ga)
	{
		
		return  ga.totalCount();
		
	}
	public static String end_of_day_stat(Account ga)
	{
		
		return  ga.getStat();
		
	}
	
	
	

}
