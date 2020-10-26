import java.util.*;
public class Tester 
{
	public static void main(String args[]) 
	{
		Scanner kb = new Scanner(System.in);
		String answer = "";
		final int length = 15;
		boolean alive[][] = new boolean[length][length];
		for (int i = 0; i < length; i++)
			for (int j = 0; j < length; j++) 
			{
				alive[i][j] = false;
				int k = (int)(Math.random()*15);
				int l = (int)(Math.random()*15);
				alive[k][l] =true;
			}
		for (;;) 
		{
			display(alive);
			answer = kb.nextLine();
			for (int row = 1; row < length - 1; row++)
				for (int col = 1; col < length - 1; col++) 
				{
					int live_count = 0;
					for (int i = row - 1; i <= row + 1; i += 2)
						for (int j = col - 1; j < col + 1; j += 2) 
							if (alive[i][j] == true)
								live_count++;
					if (alive[row - 1][col] == true)
						live_count++;
					if (alive[row + 1][col] == true)
						live_count++;
					if (alive[row][col] == true) 
					{
						if (live_count < 2)
							alive[row][col] = false;
						if (live_count == 2 || live_count == 3)
							alive[row][col] = true;
						if (live_count > 3)
							alive[row][col] = false;
					} 
					else 
					{
						if (live_count == 3)
							alive[row][col] = true;
						else
							alive[row][col] = false;
					}
				}
		}
	}
	
	public static void display(boolean board[][])
	{
		int length = board[0].length;
		for(int row = 0; row < length;row++)
		{
			for(int col = 0; col < length; col++)
			{
				if(board[row][col] == true)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println("");
		}
	}
}
