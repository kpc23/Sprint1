/**
 * 
 */
package simulator;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 */
public class RoundRobinBracket extends Bracket
{

	/**
	 * 
	 */
	public RoundRobinBracket(List<TourneyPlayer> players)
	{
		super(players);
	}

	@Override
	public List<TourneyPlayer[]> getPairs()
	{
		List<TourneyPlayer[]> pairs = new ArrayList<>();
		for (int i = 0; i < players.size(); i++)
		{
			for (int j = i + 1; j < players.size(); j++)
			{
				pairs.add(new TourneyPlayer[] {
						players.get(i),players.get(j)
				});
			}
		}
		return pairs;
	}

}
