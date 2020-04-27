import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
class Pruebas {
	SplayTree<String> tree = new SplayTree<String>();
	public String Test( ) {
		String result = "";
		try {
			result = tree.buscar("cat");
		}
		catch (Exception E) {
			result = "Fallido";
		}
		
		return result;
	}
	@Test
	void test() {
		String resultado = Test();
		String esperado = "gato";
		assertEquals(esperado,resultado);
	}

}
