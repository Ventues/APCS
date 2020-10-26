public class BankAccount implements Comparable
{
	public BankAccount(String nm, double amt) 
	{
		name = nm;
		balance = amt;
		accountCounter++;
		accountID = accountCounter;
	}

	public int compareTo(Object otherObject) 
	{
		BankAccount otherAccount = (BankAccount) otherObject;
		int retValue;
		if (balance < otherAccount.balance) 
		{
			retValue = -1;
		} else 
		{
			if (balance > otherAccount.balance) 
			{
				retValue = 1;
			} else {
				retValue = 0;
			}
		}
		return retValue;
	}

	public void deposit(double dp) 
	{
		balance = balance + dp;
	}

	public void withdraw(double wd) 
	{
		balance = balance - wd;
	}

	public String name;
	public double balance;
	private static int accountCounter = 0;
	public int accountID;
}