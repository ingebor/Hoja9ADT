/**
 * @author Ingebor Rubio
 *
 */
public class HashMap <K extends Comparable<K>,V> implements iMap <K ,V>{

	protected HashMap<Association> hashMap;
	
	@Override
	public void put(K key,V value) {
		hashMap.put(key,value);
	}
	
	@Override
	public String get(K key) {
		return hashMap.get(key);
	}

}
