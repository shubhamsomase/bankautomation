package casestudy.inheritance;
import java.util.*;
import java.util.Scanner;
public class mainapp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.out.println("enter choice:1.open account"+"2.deposite"+"3.withdraw");
	Scanner sc=new Scanner(System.in);	
Account a[]=new Account[5];
int choice;
int i=0;
do
{ 
  choice=menu(sc);
  
 
  if(choice == 1) {
     a[i++] = createAccount(sc);
  } else if(choice == 2) {
      dodeposite(a, i, sc);
  } else if(choice == 3) {
      dowithdraw(a, i,sc);
  } else if(choice == 4) {
     applyinterst(a,i,sc);
  } 
  else if(choice==5)
  {
	  showdisplay(a,i,sc);
  }
  else if(choice==6)
  {
	  showaccount(a,i);
  }
  else {
      System.out.println("GoodBye!");
  }
  System.out.println();
} while(choice != 7);

	} 
	public static int showaccount(Account a[],int count)
	{
		int i;
		for(i=0;i<count;i++)
		{
			System.out.println(a[i].getAccno());
			
		}
		return -1;
	}
	public static int searchaccount(Account a[],int count, int accountnumber)
	{
		int i;
		for(i=0;i<count;i++)
		{
			if(a[i].getAccno()==accountnumber)
			{
				return i;
			}
		}
		return -1;
	}
	public static void dodeposite(Account a[],int i,Scanner sc)
	{
		System.out.print("\nPlease enter account number: ");
		int accountNumber=sc.nextInt();
		int index=searchaccount(a,i,accountNumber);
		if(index>=0)
		{
			System.out.print("\nPlease enter money to be depositedr: ");
			int amt=sc.nextInt();
			a[index].deposite(amt);
		}
			 else {
		            System.out.println("No account exist with AccountNumber: " + accountNumber);
		        }
		}
	public static void showdisplay(Account a[],int i,Scanner sc)
	{
		System.out.print("\nPlease enter account number: ");
		int accountNumber=sc.nextInt();
		int index=searchaccount(a,i,accountNumber);
		if(index>=0)
		{
			
			a[index].display();
		}
			 else {
		            System.out.println("No account exist with AccountNumber: " + accountNumber);
		        }
		}
	public static void dowithdraw(Account a[],int i,Scanner sc)
	{
		System.out.print("\nPlease enter account number: ");
		int accountNumber=sc.nextInt();
		int index=searchaccount(a,i,accountNumber);
		if(index>=0)
		{
			System.out.print("\nPlease enter money to be withdraw: ");
			int amt=sc.nextInt();
			a[index].withdraw(amt);
		}
			 else {
		            System.out.println("No account exist with AccountNumber: " + accountNumber);
		        }
		}
	public static void applyinterst(Account a[],int i,Scanner sc)
	{
		System.out.print("\nPlease enter account number: ");
		int accountNumber=sc.nextInt();
		int index=searchaccount(a,i,accountNumber);
		if(index>=0)
		{
			
			a[index].calint();
		}
			 else {
		            System.out.println("No account exist with AccountNumber: " + accountNumber);
		        }
		}
	
	 public static int menu(Scanner sc) {
	        System.out.println("Bank Account Menu");
	        System.out.println("1. Create New Account");
	        System.out.println("2. Deposit Funds");
	        System.out.println("3. Withdraw Funds");
	        System.out.println("4. Apply Interest");
	        System.out.println("5.show account");
	        System.out.println("6.show all account");
	        System.out.println("7.exit");

	        int choice;

	      
	            System.out.print("Enter choice: ");
	            choice = sc.nextInt();
	    
	        return choice;
	    }    
	   public static int accountMenu(Scanner sc) {
	        System.out.println("Select Account Type");
	        System.out.println("1. saving Account");
	        System.out.println("2. loan Account");
	        System.out.println("3. salary Account");
	        System.out.println("4. current Account");

	        int choice;
	        do {
	            System.out.print("Enter choice: ");
	            choice = sc.nextInt();
	        }while(choice < 1 || choice > 4);
	        
	        return choice;
	    } 
	

public static Account createAccount(Scanner sc) {

    Account account = null; 
   
  

    int accountNumber;
    System.out.print("Enter Account Number: ");
    accountNumber = sc.nextInt();
    int choice=accountMenu(sc);

    if(choice == 1)  { // chekcing account
       System.out.println("Enter name of account holder: ");
        String name = sc.nextLine();
        
        sc.nextLine();
        System.out.println("Enter min bal 10000 to open saving account: ");
        int amt = sc.nextInt();
        if(amt<10000)
        {
        	 System.out.println("insufficient bal to open account ");
        }
        else
        {
        account = new savingac(accountNumber,name,amt);
        }
        
    }
    else if(choice==2)
    {
    	 System.out.println("Enter name of account holder: ");
         String name = sc.nextLine();
         sc.nextLine();
        System.out.println("Please enter amount want as loan: ");
       int amt = sc.nextInt();
       sc.nextLine();
       System.out.println("Please enter installments: ");
       int install = sc.nextInt();
       sc.nextLine();
       System.out.println("Please enter time require to pay loan in years: ");
       int t= sc.nextInt();
       
       
        account = new loanac(accountNumber,name,amt,install,t);
    }
    else if(choice==3)
    {
    	 System.out.print("Enter name of account holder: ");
         String name = sc.nextLine();
         sc.nextLine();
        System.out.print("Please enter a salary: ");
       int amt = sc.nextInt();
       
       
        account = new salary(accountNumber,name,amt);
    }
    else if(choice==4)
    {
    	 System.out.print("Enter name of account holder: ");
         String name = sc.nextLine();
         sc.nextLine();
        System.out.print("Please set  max limit of your current account : ");
       int maxlimit = sc.nextInt();
       sc.nextLine();
       System.out.print("Please enter initial bal to open account: ");
       int bal = sc.nextInt();
       account = new current(accountNumber,name,bal,maxlimit); 
    }
    
    return account;
}

}
