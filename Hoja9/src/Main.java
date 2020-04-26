import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

/**
 * @author Ingebor Rubio 19003, Pablo Reyna 19
 * @date 26/04/2020
 * Hoja de trabajo 9 Estructura de Datos
 */
public class Main {

	/**
	 * @param args
	 * @throws Exception 
	 */
	public static void main(String[] args) throws Exception {
		Factory factory = new Factory();
		File archivoSpanish = new File("Spanish.txt");
		File archivoTexto = new File("texto.txt");
		FileReader fileR = new FileReader(archivoSpanish);
		BufferedReader buffR = new BufferedReader(fileR);
		
		System.out.println("------------------");
		System.out.println("|   Bienvenido   |");
		System.out.println("------------------");
		System.out.println("Desea traducir lo siguiente: ");
		
		if(archivoSpanish.exists()) {
			String words="";
			String muestra = "";
			int count = 0;
			while((words = buffR.readLine())!=null && count <20) {
				String[] eachLine = words.split("	");
				String traduc = eachLine[1];
				String[] valuesOfTraduc = traduc.split(",");
				String ingles = eachLine[0].toLowerCase();
				String espanol = valuesOfTraduc[0].toLowerCase();
				muestra = muestra + "\n" +ingles + " significa: " + espanol;
				count++;
			}
			System.out.println(muestra);
			
		}
		buffR.close();
		
		if(archivoTexto.exists()) {
			Scanner translate = new Scanner(archivoTexto);
			String sentence = translate.nextLine().toLowerCase();
			System.out.println(sentence);
			String[] words = sentence.split(" ");
			String fSentence = "";
			int numOfWords = words.length;
			
			for(int i = 0;i<numOfWords;i++) {
				//Código para traducir
			}
			translate.close();
		}
	}

}
