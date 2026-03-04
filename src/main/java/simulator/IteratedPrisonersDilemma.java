/**
 * 
 */
package simulator;

/**
 * 
 */
public class IteratedPrisonersDilemma extends Game
{
	private int maxRounds;
	/**
	 * 
	 */
	public IteratedPrisonersDilemma(int maxRounds)
	{
		this.maxRounds = maxRounds;
	}

	@Override
	public boolean endGame()
	{
		return roundsTaken >= maxRounds;
	}

	@Override
	public int[] scoreActions(int action1, int action2)
	{
		//0 -> selfless, 1 ->selfish
		if(action1 == 0 && action2 == 0) {
			return new int[] {3,3};
		}
		
		if(action1 == 1 && action2 == 0) {
			return new int[] {5,0};
		}
		
		if(action1 == 0 && action2 == 1) {
			return new int[] {0,5};
		}
		
		return new int[]{1,1};
	}

}
