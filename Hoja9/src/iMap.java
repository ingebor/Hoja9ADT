/**
 * 
 */

/**
 * @author Ingebor Rubio
 *
 */
public interface iMap<K extends Comparable<K>,V> {

	public void put(K key, V value);
	public String get(K key);
}
