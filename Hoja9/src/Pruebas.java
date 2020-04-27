import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Pruebas {
	HashMapp<String,String> hash = new HashMapp<String,String>();
	public String Test( ) {
		String result = "";
		hash.put("dog", "perro");
		try {
			result = hash.get("dog");
		}
		catch (Exception E) {
			result = "Fallido";
		}
		
		return result;
	}
	@Test
	void test() {
		String resultado = Test();
		String esperado = "perro";
		assertEquals(esperado,resultado);
	}

}
