
import java.util.Scanner;



public class TestAccountTransactions {
	public static void main(String[] args)
	{
		int switchKey;
		boolean flag = true; 
		Person kathy = new Person();
		Person smith = new Person();
		
		SavingsAccount kathyAcc = new SavingsAccount();
		CurrentAccount smithAcc = new CurrentAccount();
		
		
		while(flag)
		{	
			System.out.println("Please chose an option: ");
			System.out.println("1. Create a new account ");
			System.out.println("2. Deposit money in an account");
			System.out.println("3. Withdram money from an account");
			System.out.println("4. Check Balance");
			System.out.println("5. Exit");
			Scanner sc = new Scanner(System.in);
			switchKey = sc.nextInt();
			switch(switchKey)
			{
			case 1: 
					kathy.setName("Kathy");
					kathy.setAge(23);
					kathyAcc.setAccHolder(kathy);
					kathyAcc.setAccNum(1);
					kathyAcc.setBalance(3000);
					smith.setName("smith");
					smith.setAge(43);
					smithAcc.setAccHolder(smith);
					smithAcc.setAccNum(2);
					smithAcc.setBalance(2000);
					
					System.out.println("Accounts created : \n *****************");
					System.out.println("Kathy : \nName :" + kathy.getName() + "\nAge : " + kathy.getAge()+ 
										"\nAccount Number-" + kathyAcc.getAccNum() +
										"\nInitial Balance-" + kathyAcc.getBalance());
					System.out.println("Smith : \nName :" + smith.getName() + "\nAge : " + smith.getAge()+ 
							"\nAccount Number-" + smithAcc.getAccNum() +
							"\nInitial Balance-" + smithAcc.getBalance());
					break;
					
			case 2: System.out.println("Chose the account you want to deposit money to : 1. Smith , 2. Kathy");
					int submitOption = sc.nextInt();
					if(submitOption==1) //for smith account
					{
						System.out.println("enter the amount you to submit ");
						double amount = sc.nextDouble();
						smithAcc.deposit(amount);
						System.out.println("latest balance:  " + smithAcc.balance);
					}
					else if(submitOption==2) //for kathy account
					{
						System.out.println("enter the amount you to submit ");
						double amount = sc.nextDouble();
						kathyAcc.deposit(amount);
						System.out.println("latest balance:  " + kathyAcc.balance);
					}
					else
					{
						System.out.println("INVALID OPTION");
					}
					break;
			case 3: System.out.println("Chose the account you want to deposit money to : 1. Smith , 2. Kathy");
					submitOption = sc.nextInt();
					if(submitOption==1) //for smith account
					{
						System.out.println("enter the amount you to withdraw ");
						double amount = sc.nextDouble();
						smithAcc.withdraw(amount);
						System.out.println("latest balance:  " + smithAcc.balance);
					}
					else if(submitOption==2) //for kathy account
					{
						System.out.println("enter the amount you to withdraw ");
						double amount = sc.nextDouble();
						kathyAcc.withdraw(amount);
						System.out.println("latest balance:  " + kathyAcc.balance);
					}
					else
					{
						System.out.println("INVALID OPTION");
					}
					break;
			case 4: System.out.println("latest balance: SMITH  " + smithAcc.balance);
					System.out.println("latest balance: KATHY " + kathyAcc.balance);
					break;
			case 5: flag = false;
					break;
			default: System.out.println("Invalid option");
					break;
			}
		//	sc.close();
		}
		
		System.out.println("THANK YOU ");
		
	}
}
