
public class CurrentAccount {
	public double overdraftLimit;
	public double overdraftBal;
	public boolean withdraw(double withdrawAmount)
	{
		double newBalance = overdraftBal - withdrawAmount;
		if(newBalance>=overdraftLimit)
		{
			overdraftBal = newBalance;
			return true;
			
		}
		else
		{
			System.out.println("Balance will go below 500 : CANNOT MAKE A TRANSACTION");
			return false;
		}
	}
}
