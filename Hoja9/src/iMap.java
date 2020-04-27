/**
 * @author Ingebor Rubio 19003, Pablo Reyna 19822
 * @date 26/04/2020
 * Hoja de trabajo 9 Estructura de Datos
 */
public interface iMap<K,V> {

	/**
	 * guarda una nueva llave con su valor
	 * @param key
	 * @param value
	 */
	public void put(String key, String value);
	
	/**
	 * obtiene el valor de una llave 
	 * @param key
	 * @return
	 */
	public String get(String key);
}
