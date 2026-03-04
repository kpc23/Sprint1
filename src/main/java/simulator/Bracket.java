/**
 * 
 */
package simulator;

import java.util.List;

/**
 * 
 */
public abstract class Bracket
{
	List<TourneyPlayer> players;

	/**
	 * Constructor
	 * @param players
	 */
	public Bracket(List<TourneyPlayer> players)
	{
		this.players = players;
	}
	public abstract List<TourneyPlayer[]> getPairs();
}
