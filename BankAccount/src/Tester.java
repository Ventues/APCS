import java.io.*;
import java.util.*;
import java.text.*; //for NumberFormat

public class Tester 
{
	public static void main(String args[]) 
	{
		NumberFormat formatter = NumberFormat.getNumberInstance();
		formatter.setMinimumFractionDigits(2);
		formatter.setMaximumFractionDigits(2);
		String name;
		int j;
		BankAccount ba;
		Map<Integer, BankAccount> accounts = new HashMap<Integer, BankAccount>();
		Scanner kbReader = new Scanner(System.in);
		for (j = 0; j < 4; j++) // provides for inputting 4 accounts
		{
			System.out.print("Please enter the name to whom the account belongs. ");
			name = kbReader.nextLine( );
			System.out.print("Please enter the amount of the deposit. ");
			double amount = Double.parseDouble(kbReader.nextLine());
			System.out.println(""); //gives an eye pleasing blank line between accounts
			ba = new BankAccount(name, amount);
			accounts.put(ba.accountID, ba);
		}
		Set<Integer> accountsSet = accounts.keySet();
		Iterator<Integer> iter = accountsSet.iterator();
		while(iter.hasNext())
		{
			Object key = iter.next();
			ba = accounts.get(key);
			System.out.println(ba.accountID + ">>>" + ba.name + ">>>" + ba.balance);
		}
		System.out.println("");
		System.out.print("Please enter the ID for the account that you wish to view. ");
		int id = kbReader.nextInt( );
		Integer idw = new Integer(id);
		ba = accounts.get(idw);
		System.out.println(ba.accountID + ">>>" + ba.name + ">>>" + ba.balance);
	}
}