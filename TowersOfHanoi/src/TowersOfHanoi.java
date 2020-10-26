import java.util.*;

public class TowersOfHanoi 
{
	static Stack<String> st1 = new Stack<String>();
	static Stack<String> st2 = new Stack<String>();
	static Stack<String> st3 = new Stack<String>();
	static int number = 0;
	
	static final int ASCIIForA = 65;
	public static void main(String args[])
	{
		number = 3;
	    reset();
	    TowersOfHanoiSolver(st1,st2,st3,number);
	    
	    printCurrentSituation();
	}
	
	public static void reset()
	{
		for(int i = number-1;i >= 0 ; i--)
		{
			String str = "" + (char)(ASCIIForA + i);
		    st1.push(str);
		}
	}
	public static void TowersOfHanoiSolver(Stack<String> s1, Stack<String> s2, Stack<String> s3,int n)
	{
		 System.out.print(n);
		 printCurrentSituation();
	    if(n == 1)
	    {
	    	s3.push(s1.pop());
	    	return;
	    }
	    TowersOfHanoiSolver(s1,s3,s2,n-1);
	}
	public static void printCurrentSituation()
	{
		System.out.println("\n---------------");
		for(int i = number-1; i >= 0;i--)
		{
			if(i < st1.size())
			    System.out.print(st1.get(i));
			else
				System.out.print(" ");
			System.out.print("   ");
			if(i < st2.size())
			    System.out.print(st2.get(i));
			else
				System.out.print(" ");
			System.out.print("   ");
			if(i < st3.size())
			    System.out.println(st3.get(i));
			else
				System.out.println(" ");
		}
		System.out.println("---------------\n");
	}
}
