
public class SavingsAccount extends Account  {
	final double  minimumBalance=500;
	
	public boolean withdraw(double withdrawAmount)
	{
		double newBalance = balance - withdrawAmount;
		if(newBalance>=minimumBalance)
		{
			balance = newBalance;
			return true;
			
		}
		else
		{
			System.out.println("Balance will go below 500 : CANNOT MAKE A TRANSACTION");
			return false;
		}
	}
	
		
}
