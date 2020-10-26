import info.gridworld.actor.Bug;


public class SpiralBug extends Bug
{
private int steps;
private int sideLength;
private int changeNum = 0;
private int changeLen = 2;
/**
* Constructs a box bug that traces a square of a given side length.
* @param length the side length
*/
	public SpiralBug(int length) 
	{
		steps = 0;
		sideLength = length;
	}
    
	public int getChangeLength()
	{
		return changeLen;
	}
	
	public void SetChangeLength(int c)
	{
		changeLen = c;
	}
	public void act() 
	{
		if(changeNum == 2)
		{
		   sideLength += changeLen;
		   changeNum = 0;
		}
		if (steps < sideLength && canMove()) 
		{
			move();
			steps++;
		} 
		else 
		{
			turn();
			turn();
			steps = 0;
			changeNum++;
		}
	}
}