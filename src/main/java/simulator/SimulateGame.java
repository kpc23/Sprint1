/**
 * 
 */
package simulator;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 */
public class SimulateGame
{
	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		Participant p1 = new SelfishBot("Selfish");
		Participant p2 = new SelflessBot("Selfless");
		Participant p3 = new AlternatingBot("Alternating");
		
		Game game = new IteratedPrisonersDilemma(5);
		
		game.register(new ActionFileLogger());
		game.register(new ResultsFileLogger());
		
		List<TourneyPlayer> players = new ArrayList<>();
		
		players.add(new TourneyPlayer(p1));
		players.add(new TourneyPlayer(p2));
		players.add(new TourneyPlayer(p3));
		
		Bracket bracket = new RoundRobinBracket(players);
		Tournament tournament = new Tournament(game, bracket);
		tournament.playTournament();
	}

}
