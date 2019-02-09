
public class SavingsAccount extends Account  {
	final double  minimumBalance=500;
	
	public void withdraw(double withdrawAmount)
	{
		double newBalance = balance - withdrawAmount;
		if(newBalance>=minimumBalance)
		{
			balance = newBalance;
			
		}
		else
		{
			System.out.println("Balance will go below 500 : CANNOT MAKE A TRANSACTION");
		}
	}
	
		
}
