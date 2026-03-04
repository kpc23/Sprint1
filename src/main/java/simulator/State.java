/**
 * 
 */
package simulator;

/**
 * 
 */
public class State
{
	public String p1Name;
	public int p1Score;
	public int p1Action;
	
	public String p2Name;
	public int p2Score;
	public int p2Action;
	
	/**
	 * @param p1Name
	 * @param p1Score
	 * @param p1Action
	 * @param p2Name
	 * @param p2Score
	 * @param p2Action
	 */
	public State(String p1Name, int p1Score, int p1Action, 
				String p2Name, int p2Score, int p2Action)
	{
		this.p1Name = p1Name;
		this.p1Score = p1Score;
		this.p1Action = p1Action;
		this.p2Name = p2Name;
		this.p2Score = p2Score;
		this.p2Action = p2Action;
	}

	

}
