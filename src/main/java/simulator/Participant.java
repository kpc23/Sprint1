/**
 * 
 */
package simulator;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 */
public interface Participant
{
	String getName();
	int makeChoice(int round);
	void addMemory(State state);
	void clearMemory();
}