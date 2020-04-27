/**
 * @author Ingebor Rubio 19003, Pablo Reyna 19
 * @date 26/04/2020
 * Hoja de trabajo 9 Estructura de Datos
 */
public class Factory<K,V>{

	
	public iMap<String,String> getType(int option) {
		switch(option) {
		case 1:
			return new HashMapp<String,String>();
		default:
			return new HashMapp<String,String>();
		}
	}
}
