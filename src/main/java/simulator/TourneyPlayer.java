package simulator;

import java.util.ArrayList;
import java.util.List;

public class TourneyPlayer
{		
	private Participant participant;
	private int totalScore = 0;
	private List<String> playersPlayed = new ArrayList<>();


	public TourneyPlayer(Participant participant)
	{
		this.participant = participant;
		this.totalScore = 0;
	}
	
	/**
	 * @return the participant
	 */
	public Participant getParticipant()
	{
		return participant;
	}

	/**
	 * 
	 * @param score
	 * @return the total score
	 */
	public int addScore(int score)
	{
		return totalScore+=score;
	}
	
	/**
	 * @return the totalScore
	 */
	public int getTotalScore()
	{
		return totalScore;
	}
	
	/**
	 * @param opp - opponent name
	 */
	public void addOpponent(String opp)
	{
		if(!playersPlayed.contains(opp)) {
			playersPlayed.add(opp);
		}
	}


	/**
	 * @return if the opponent has been played.
	 */
	public boolean hasPlayed(String opp)
	{
		return playersPlayed.contains(opp);
	}
}
