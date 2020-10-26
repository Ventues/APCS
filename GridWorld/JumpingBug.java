import info.gridworld.actor.*;
import info.gridworld.actor.Bug;
import info.gridworld.actor.Flower;
import info.gridworld.grid.Grid;
import info.gridworld.grid.Location;


public class JumpingBug extends Bug
{
	private int numTurnDegrees;
	Location moveHere;
	
    public JumpingBug()
    {
    	super();
    }
    public boolean canMove()
    {
    	Grid<Actor> gr = getGrid();
		Location loc = getLocation();
		Location next = loc.getAdjacentLocation(getDirection());
		Location Next = next.getAdjacentLocation(getDirection());
		if (!gr.isValid(next)) 
		{
			numTurnDegrees = 225;
			return false;
		}
		if(gr.get(next) instanceof Rock || gr.get(next) instanceof Bug)
		{
			if ((gr.get(Next)) instanceof Rock || (gr.get(Next)) instanceof Bug) 
			{
				numTurnDegrees = 45;
				return false;
			}
			if (!gr.isValid(Next)) 
			{
				numTurnDegrees = 135;
				return false;
			}
			moveHere = Next;
		}
		else
			moveHere = next;
		return true;
    }
    public void move()
    {
    	Grid<Actor> gr = getGrid();
		Location loc = getLocation();
		moveTo(moveHere);
		Flower flower = new Flower(getColor());
		flower.putSelfInGrid(gr, loc);
    }
    public void turn(int degrees)
    {
    	setDirection(getDirection() + numTurnDegrees);
    }
    
    public void act()
    {
    	if(canMove())
    		move();
    	else
    	  turn(numTurnDegrees);
    }
}
