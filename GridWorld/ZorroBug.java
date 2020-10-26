import info.gridworld.actor.Bug;
import info.gridworld.grid.Location;

public class ZorroBug extends Bug 
{	
	private int steps;
	private int Z_length;
	private int changeNum;
	private boolean finished;
	
    public ZorroBug()
    {
    	Z_length = 0;
    	reset();
    	finished = false;
    }
    
    public ZorroBug(int len)
    {
    	Z_length = len;
    	reset();
    	finished = false;
    }
    
    public void reset()
    {
    	steps = 0;
    	changeNum = 0;
    	setDirection(Location.EAST);
    }
    
    
   	public int getZ_length()
   	{
   		return Z_length;
   	}
   	
   	public void SetZ_length(int z)
   	{
   		Z_length = z;
   	}
   	
    public void act()
    {
    	if(steps < Z_length && canMove())
    	{
    		steps++;
    		move();
    	}
    	else
    	if(finished)
        {
        	turn();
        }
    	else
    	if(changeNum == 0 && canMove())
    	{
    		setDirection(Location.SOUTHWEST);
    		steps = 0;
    		changeNum++;
    	}
    	else
    	if(changeNum == 1 && canMove())
    	{
    		reset();
    		finished = true;
    	}
    	else
    	{
    		turn();
    		move();
    		reset();
    	}
    }
}
