/**
 * @author Ingebor Rubio 19003, Pablo Reyna 19822
 * @date 26/04/2020
 * Hoja de trabajo 9 Estructura de Datos
 */
import java.util.HashMap;
public class HashMapp <K,V> implements iMap <K ,V>{

	protected HashMap<String,String> hashMap = new HashMap<String,String>();
	
	/**
	 * @param String Key, String value
	 * guarda un nuevo valor
	 */
	@Override
	public void put(String key,String value) {
		hashMap.put(key,value);
	}
	
	/**
	 * @param String key
	 * devuelve el valor de una llave
	 */
	@Override
	public String get(String key) {
		return hashMap.get(key);
	}

}
