/**
 * 
 */
package simulator;

/**
 * 
 */
public interface Subject
{
	void register(Observer ob);
	void deregister(Observer ob);
	void notifyObservers();
}
