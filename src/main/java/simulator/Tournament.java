/**
 * 
 */
package simulator;

import java.util.List;

/**
 * 
 */
public class Tournament
{
	Game game;
	Bracket bracket;
	/**
	 * @param game
	 * @param bracket
	 */
	public Tournament(Game game, Bracket bracket)
	{
		this.game = game;
		this.bracket = bracket;
	}

	public void playTournament() {
		List<TourneyPlayer[]> gameMatch = bracket.getPairs();
		
		for(TourneyPlayer[] pair : gameMatch) {
			
			TourneyPlayer tp1 = pair[0];
			TourneyPlayer tp2 = pair[1];
			
			System.out.println(
					
					"\nGame Match: " + tp1.getParticipant().getName() + " VS " 
					+ tp2.getParticipant().getName()
					
					);
			game.play(tp1.getParticipant(),tp2.getParticipant());
			
			State endState = game.getCurrentState();
			
			tp1.addScore(endState.p1Score);
			tp2.addScore(endState.p2Score);
			
			tp1.addOpponent(tp2.getParticipant().getName());
			tp2.addOpponent(tp1.getParticipant().getName());

		}
	}
}
