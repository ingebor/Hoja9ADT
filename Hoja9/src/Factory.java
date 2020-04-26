/**
 * @author Ingebor Rubio
 *
 */
public class Factory<K extends Comparable<K>,V>{

	public iMap<K,V> getType(int option) {
		if(option==1) {
			return new HashMap<K,V>();
		}
		else
			return null;
	}
}
