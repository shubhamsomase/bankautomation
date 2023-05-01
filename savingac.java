package casestudy.inheritance;
//import java.util.*;
public class savingac extends Account{
	
	
 double roi=0.08;
	
	
	
  public double getRoi() {
	return roi;
}
public void setRoi(double roi) {
	this.roi = roi;
}
public savingac()
  {
	 super(); 
  }
	public savingac( long acno,String name, int bal) {
		super(acno,name,bal);
	    
		
	}
	
	
 
	void deposite(int amt)
	{
		
		
		   if (amt > 0) {
	           this.bal += amt;
	            System.out.printf("Amount  deposited%n", amt);
	            System.out.printf("Current Balance is: ", bal);

	        } else {
	            System.out.println("A negative amount cannot be deposited");
	        }
		
		
		
	}
	void withdraw(int amt)
	{
		 if (amt> bal) {

	           
	            System.out.printf("Amount withdraw is higher than available balance%n",+ amt);
	            System.out.printf("Current Balance is : ", bal);

	        } else if(bal<=10000) {
	            System.out.println("you an not withdraw money it is limit of savin account ");
	        }
	        else
	        {
	        	this.bal-=amt;
	        	 System.out.printf("Amount  deposited%n", amt);
		            System.out.printf("Current Balance is: ", bal); 
	        }
		
	}
	void calint()
	{
		bal+=(int)(bal*this.roi);
		System.out.printf("Current Balance after applying interest: "+this.bal);  
	}
	void display()
	{
		System.out.println("account type::saving");
		
	  System.out.println("account number:"+accno);
	  
	  System.out.println("account name:"+this.name);
	  System.out.println("available bal"+bal);
	  
	}

}
