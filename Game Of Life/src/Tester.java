import java.util.*;
public class Tester 
{
	public static void main(String args[]) throws InterruptedException 
	{
		Scanner kb = new Scanner(System.in);
		String answer = "";
		final int length = 15;
		boolean alive[][] = new boolean[length][length];
		boolean alive_co[][] = new boolean[length][length];
		/*for (int i = 0; i < length; i++)
			for (int j = 0; j < length; j++) 
			{
				alive_co[i][j] = false;
				int k = (int)(Math.random()*15);
				int l = (int)(Math.random()*15);
				alive_co[k][l] = true;
			    
			}*/
		alive_co[1][7] = true;
		alive_co[2][8] = true;
		alive_co[3][6] = true;
		alive_co[3][7] = true;
		alive_co[3][8] = true;

		for (;;) 
		{
			for(int i = 0 ;i < length;i++)
				for(int j = 0; j < length;j++)
					alive[i][j] = alive_co[i][j];
			display(alive);
			Thread.sleep(300);
			for(int r = 0;r < length;r++)
				for(int c = 0; c < length;c++)
				{
					int live_count = 0;
					if((r == 0 && c == 0))
					{
						if(alive[1][0] == true)
							live_count++;
						if(alive[1][1] == true)
							live_count++;
						if(alive[0][1] == true)
							live_count++;
						
					}
					else
					if(r == 0 && c == length-1)
					{
						if(alive[r][c-1] == true)
							live_count++;
						if(alive[r+1][c-1] == true)
							live_count++;
						if(alive[r+1][c] == true)
							live_count++;
					}
					else
					if(r == length-1 && c == 0)
					{
						if(alive[r-1][c] == true)
							live_count++;
						if(alive[r-1][c+1] == true)
							live_count++;
						if(alive[r][c+1] == true)
							live_count++;
					}
					else
					if(r == length-1 && c == length-1)
					{
						if(alive[r-1][c] == true)
							live_count++;
						if(alive[r-1][c-1] == true)
							live_count++;
						if(alive[r][c-1] == true)
							live_count++;
					}
					else
					if(r == 0)
					{
						if(alive[r][c-1] == true)
							live_count++;
						if(alive[r+1][c-1] == true)
							live_count++;
						if(alive[r+1][c] == true)
							live_count++;
						if(alive[r+1][c+1] == true)
							live_count++;
						if(alive[r][c+1] == true)
							live_count++;
					}
					else
					if(c == 0)
					{
						if(alive[r-1][c] == true)
							live_count++;
						if(alive[r-1][c+1] == true)
							live_count++;
						if(alive[r][c+1] == true)
							live_count++;
						if(alive[r+1][c+1] == true)
							live_count++;
						if(alive[r+1][c] == true)
							live_count++;
					}
					else
					if(r == length-1)
					{
						if(alive[r][c-1] == true)
							live_count++;
						if(alive[r-1][c-1] == true)
							live_count++;
						if(alive[r-1][c] == true)
							live_count++;
						if(alive[r-1][c+1] == true)
							live_count++;
					    if(alive[r][c+1] == true)
					    	live_count++;
					}
					else
					if(c == length-1)
					{
						if(alive[r-1][c] == true)
							live_count++;
						if(alive[r-1][c-1] == true)
							live_count++;
						if(alive[r][c-1] == true)
							live_count++;
						if(alive[r+1][c-1] == true)
							live_count++;
						if(alive[r+1][c] == true)
							live_count++;
					}
					else
						continue;
					if (alive[r][c] == true) 
					{
						if (live_count < 2)
							alive_co[r][c] = false;
						if (live_count == 2 || live_count == 3)
							alive_co[r][c] = true;
						if (live_count > 3)
							alive_co[r][c] = false;
					} 
					else 
					{
						if (live_count == 3)
							alive_co[r][c] = true;
						else
							alive_co[r][c] = false;
					}
					
					
				}
			for (int row = 1; row < length - 1; row++)
				for (int col = 1; col < length - 1; col++) 
				{
					int live_count = 0;
					for (int i = row - 1; i <= row + 1; i++)
						for (int j = col - 1; j <= col + 1; j+=2) 
							if (alive[i][j] == true)
								live_count++;
					if (alive[row - 1][col] == true)
						live_count++;
					if (alive[row + 1][col] == true)
						live_count++;
					if (alive[row][col] == true) 
					{
						if (live_count < 2)
							alive_co[row][col] = false;
						if (live_count == 2 || live_count == 3)
							alive_co[row][col] = true;
						if (live_count > 3)
							alive_co[row][col] = false;
					} 
					else 
					{
						if (live_count == 3)
							alive_co[row][col] = true;
						else
							alive_co[row][col] = false;
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
