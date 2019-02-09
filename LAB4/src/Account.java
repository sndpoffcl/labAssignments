
public class Account {
	public double accNum;
	public double balance;
	public Person accHolder;

	public void deposit(double depositAmount)
	{
		balance = balance + depositAmount;
	}
	 
	public void withdraw(double withdrawAmount)
	{	
		double newBalance = balance - withdrawAmount;
		if(newBalance>=500)
		{
			balance = newBalance;
		}
		else
		{
			System.out.println("Balance will go below 500 : CANNOT MAKE A TRANSACTION");
		}
	}
	
	public double getAccountBalance()
	{
		return balance;
	}
	
	public double getAccNum() {
		return accNum;
	}
	public void setAccNum(double accNum) {
		this.accNum = accNum;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public Person getAccHolder() {
		return accHolder;
	}
	public void setAccHolder(Person accHolder) {
		this.accHolder = accHolder;
	}
	
	
}
