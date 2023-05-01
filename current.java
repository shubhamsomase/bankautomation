package casestudy.inheritance;

public class current extends Account {
  int maxlimit;
  double roi=0.05;
public int getMaxlimit() {
	return maxlimit;
}

public void setMaxlimit(int maxlimit) {
	this.maxlimit = maxlimit;
}



public current(long acno, String name, int bal, int maxlimit) {
	super(acno, name, bal);
	this.maxlimit = maxlimit;
}

@Override
void deposite(int amt)
{
	
	
	   if (amt > 0 ) {
           this.bal += amt;
            System.out.printf("Amount  deposited%n", amt);
            System.out.printf("Current Balance is: ", bal);

        } else {
            System.out.println("A negative amount cannot be deposited");
        }
	
	
	
}
@Override
void withdraw(int amt)
{
	 if (amt>maxlimit) {

           
            System.out.printf("Amount withdraw is higher than max limit that you set%n", maxlimit);
            System.out.printf("Current Balance is : ", bal);

        }
        else
        {
        	this.bal-=amt;
        	 System.out.printf("Amount  withdraw%n", amt);
	            System.out.printf("Current Balance is: ", bal);
        }
	
}
void calint()
{
	bal+=(int)(bal*this.roi);
	System.out.printf("Current Balance after applying interest: "+bal);
}
void display()
{
	System.out.println("account type::current");
	
	  System.out.println("account number:"+accno);
	  
	  System.out.println("account name:"+this.name);
	  System.out.println("available bal"+bal);
	  System.out.println("maxlimit:"+maxlimit);
	  
}
}
