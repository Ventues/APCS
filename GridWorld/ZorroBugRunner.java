import info.gridworld.actor.ActorWorld;
import info.gridworld.actor.Rock;
import info.gridworld.grid.Location;


public class ZorroBugRunner 
{
	public static void main(String args[])
	{
		ActorWorld world = new ActorWorld();
	    ZorroBug zb = new ZorroBug(3);
	    world.add(new Location(1,1),zb);
	    world.add(new Location(1,3),new Rock());
	    world.show();
	    
	}
}
