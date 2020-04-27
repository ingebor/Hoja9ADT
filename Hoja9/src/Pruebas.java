import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Pruebas {
	hashMap<String,String> hash = new hashMap<String,String>();
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
