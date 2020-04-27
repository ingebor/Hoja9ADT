/**
 * @author Ingebor Rubio 19003, Pablo Reyna 19
 * @date 26/04/2020
 * Hoja de trabajo 9 Estructura de Datos
 */
import java.util.HashMap;
public class hashMap <K,V> implements iMap <K ,V>{

	protected HashMap<String,String> hashMap = new HashMap<String,String>();
	
	@Override
	public void put(String key,String value) {
		hashMap.put(key,value);
	}
	
	@Override
	public String get(String key) {
		return hashMap.get(key);
	}

}
