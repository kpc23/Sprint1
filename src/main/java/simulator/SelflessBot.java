/**
 * 
 */
package simulator;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 */
public class SelflessBot implements Participant
{
	private String name;
	private List<State> memory = new ArrayList<>();

	/**
	 * 
	 */
	public SelflessBot(String name)
	{
		this.name = name;
	}

	@Override
	public String getName()
	{
		return name;
	}

	@Override
	public int makeChoice(int round)
	{
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void addMemory(State state)
	{
		// TODO Auto-generated method stub
		memory.add(state);
	}

	@Override
	public void clearMemory()
	{
		// TODO Auto-generated method stub
		memory.clear();
	}

}
