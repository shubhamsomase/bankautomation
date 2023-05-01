package casestudy.inheritance;

//import java.util.Scanner;

public class salary extends savingac {
  double roi=0.09;

public double getRoi() {
	return roi;
}

public void setRoi(int roi) {
	this.roi = roi;
}

public salary(long acno,String name,int bal) {
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

           
            System.out.printf("Amount withdraw is higher than available balance%n", amt);
            System.out.printf("Current Balance is : ", this.bal);

	 }
        else
        {
        	this.bal-=amt;
        	 System.out.printf("Amount  withdrawn%n", amt);
	            System.out.printf("Current Balance is: ", bal);
        }
}
void calint()
{
	bal+=(int)(bal*this.roi);
	System.out.printf("Current Balance after applying interest: ",bal);
	
}

void display()
{
	System.out.println("account type::salary");
	
	  System.out.println("account number:"+accno);
	  
	  System.out.println("account name:"+this.name);
	  System.out.println("available bal"+bal);
}


}
