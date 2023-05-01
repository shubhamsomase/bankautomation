package casestudy.inheritance;

public abstract class Account {
	 long accno=0;
	String name;
    int bal;
  
public Account( long acno,String name, int bal) {
	this.accno=acno;
	this.name = name;
	this.bal = bal;
}
public Account()
{
	
}
public  long getAccno() {
	return accno;
}
public  void setAccno(long accno) {
	this.accno = accno;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getBal() {
	return bal;
}
public void setBal(int bal) {
	this.bal = bal;
}
abstract void deposite(int amt);
abstract void withdraw(int amt);
abstract void calint();
abstract void display();
//abstract void open();

}
