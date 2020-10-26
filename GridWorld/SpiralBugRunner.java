import info.gridworld.actor.ActorWorld;


public class SpiralBugRunner 
{
	  public static void main(String args[])
	  {
		  ActorWorld world = new ActorWorld();
		  SpiralBug sbg = new SpiralBug(6);
		  sbg.SetChangeLength(2);
		  world.add(sbg);
		  ZorroBug zb = new ZorroBug(3);
		    world.add(zb);
		  world.show();
	  }
}