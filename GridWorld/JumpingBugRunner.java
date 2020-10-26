
import java.awt.Color;
import info.gridworld.actor.*;
import info.gridworld.grid.Location;


public class JumpingBugRunner 
{
    public static void main(String args[])
    {
    	ActorWorld world = new ActorWorld();
    	JumpingBug jb = new JumpingBug();
    	jb.setColor(Color.YELLOW);
    	world.add(new Location(7,8), jb);
    	world.add(new Location(4,8), new Rock());
    	world.add(new Location(3,5), new Rock());
    	world.add(new Location(4,4), new Rock());
    	world.show();
    }
}
