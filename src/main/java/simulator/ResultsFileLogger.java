/**
 * 
 */
package simulator;

/**
 * 
 */
public class ResultsFileLogger implements Observer
{
	@Override
	public void update(Game game)
	{
		State s = game.getCurrentState();
		System.out.println("Score: " + s.p1Name +"-" 
		+ s.p1Score + " vs " + s.p2Name + "-" + s.p2Score);

	}

}
