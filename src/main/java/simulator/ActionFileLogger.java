/**
 * 
 */
package simulator;

/**
 * 
 */
public class ActionFileLogger implements Observer
{
	@Override
	public void update(Game game)
	{
		State s = game.getCurrentState();
		System.out.println("Round " + (game.roundsTaken+1) + ": " + s.p1Name +" = " 
		+ s.p1Action + " VS " + s.p2Name + " = " + s.p2Action);

	}
}