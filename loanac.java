package casestudy.inheritance;

//import java.util.Scanner;

public class loanac extends savingac{
       
	int installments;
	int t;
	double roi=0.12;
	public int getInstallments() {
		return installments;
	}
	public void setInstallments(int installments) {
		this.installments = installments;
	}
	public int getT() {
		return t;
	}
	public void setT(int t) {
		this.t = t;
	}
	public loanac(long accno,String name,int bal, int installments, int t) {
		super(accno,name,bal);
		this.installments = installments;
		this.t = t;
	}
	void deposite(int amt)
	{
		
		
		   if (amt > 0) {
	           this.bal = -this.bal+ amt;
	            System.out.printf("Amount  deposited%n", amt);
	            System.out.printf("Current Balance is: ", bal);

	        } else {
	            System.out.println("A negative amount cannot be deposited");
	        }
		
		
		
	}
	void withdraw(int amt)
	{
		
	      this.bal-=amt;
	        	 System.out.printf("Amount  withdrawd%n", amt);
		            System.out.printf("Current Balance is: "+bal);
	        
	}
		
	void calint()
	{
		bal+=(int)(bal*this.roi);
		System.out.printf("Current Balance after applying loan is: "+ -bal);
		
	}
	void display()
	{
		System.out.println("account type::loan");
		
		  System.out.println("account number:"+accno);
		  
		  System.out.println("account name:"+this.name);
		  System.out.println("loan bal:"+ -bal);
		  System.out.println("installments:"+installments);
		  System.out.println("time in year:"+t);
	}
}
