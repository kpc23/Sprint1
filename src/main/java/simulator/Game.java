/**
 * 
 */
package simulator;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 */
public abstract class Game implements Subject
{
	int actions;
	State currentState;
	int roundsTaken = 0;
	List<Observer> listeners = new ArrayList<>();
	
	public void play(Participant p1, Participant p2) {
		p1.clearMemory();
		p2.clearMemory();
		int totalPlayer1 = 0;
		int totalPlayer2 = 0;
		roundsTaken=0;
			
		hookStartGame();
		
		while(!endGame()) {
			int action1 = p1.makeChoice(roundsTaken);
			int action2 = p2.makeChoice(roundsTaken);
			
			int[] scores = scoreActions(action1, action2);
			totalPlayer1 += scores[0];
			totalPlayer2 += scores[1];
			currentState = new State(
					p1.getName(), totalPlayer1, action1, 
					p2.getName(), totalPlayer2, action2
							);
			
			p1.addMemory(currentState);
			p2.addMemory(currentState);
			
			notifyObservers();
			roundsTaken++;
			
		}
		hookEndGame();
	}

	public void hookStartGame() {}
	public void hookEndGame() {}

	public abstract boolean endGame();
	public abstract int[] scoreActions(int action1, int action2);
	
	@Override
	public void register(Observer ob)
	{
		listeners.add(ob);
	}

	@Override
	public void deregister(Observer ob)
	{
		listeners.remove(ob);
	}

	@Override
	public void notifyObservers()
	{
		for(Observer o: listeners) {
			o.update(this);
		}
	}

	/**
	 * @return the currentState
	 */
	public State getCurrentState()
	{
		return currentState;
	}

}
