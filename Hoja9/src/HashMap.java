/**
 * @author Ingebor Rubio
 *
 */
public class HashMap <K,V> implements iMap {

	protected HashMap<K,V> hashMap;
	
	public void put(String key,String value) {
		hashMap.put(key,value);
	}
	
	public String get(Object key) {
		return hashMap.get(key);
	}

}
