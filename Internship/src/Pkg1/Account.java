package Pkg1;

public class Account 
{
	double accBal=5000.00;
	
	void deposit( double amt)
	{
		System.out.println("Depositing amt"+amt);
		accBal=accBal+amt;
		//accBal=5000+3000;
	}
	void withdraw(double amt)
	{
		System.out.println("Withdrawing amt"+ amt);
		accBal=accBal- amt;
		//accBal=5000-3000;
	}

	public static void main(String[] args) 
	{
		Account a1=new Account();
		System.out.println("Account balance is"+a1.accBal);
		a1.deposit(3000.00);
		System.out.println("Account balance is"+a1.accBal);
		a1.withdraw(7000);
		System.out.println("Account balance is"+a1.accBal);
		

	}

}
