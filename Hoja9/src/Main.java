import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.Scanner;
import java.util.HashMap;

/**
 * @author Ingebor Rubio 19003, Pablo Reyna 19
 * @date 26/04/2020
 * Hoja de trabajo 9 Estructura de Datos
 */
@SuppressWarnings("unused")
public class Main {

	/**
	 * @param args
	 * @throws Exception 
	 */
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static void main(String[] args) throws Exception {
		Factory factory = new Factory();
		File archivoSpanish = new File("Spanish.txt");
		File archivoTexto = new File("texto.txt");
		FileReader fileR = new FileReader(archivoSpanish);
		BufferedReader buffR = new BufferedReader(fileR);
		Scanner read = new Scanner(System.in);
		//HashMap<String, String> hashMap = new HashMap<String,String>();
		
		System.out.println("------------------");
		System.out.println("|   Bienvenido   |");
		System.out.println("------------------");		
		
		if(archivoSpanish.exists()) {
			String words="";
			boolean flag = true;
			while(flag) {
				System.out.println("¿De que forma desea realizar la traduccion? \n1. HashMap \n2. SplayTree \n3. Deseo salir del programa");
				try {
					int option = read.nextInt();
					if(option<1 || option>3) {
						System.out.println("No ha ingresado una opcion correcta");
					}
					else if(option==1 || option==2) {
						iMap<String,String> thisThing = factory.getType(option);
						
						while((words = buffR.readLine())!=null){
							String[] eachLine = words.split("	");
							String traduc = eachLine[1];
							String[] valuesOfTraduc = traduc.split(",");
							String ingles = eachLine[0].toLowerCase();
							String espanol = valuesOfTraduc[0].toLowerCase();
							thisThing.put(ingles, espanol);
						}
						if(archivoTexto.exists()) {
							System.out.println("\nDesea traducir lo siguiente: ");
							Scanner translate = new Scanner(archivoTexto);
							String sentence = translate.nextLine().toLowerCase();
							System.out.println(sentence);
							String[] eachWord = sentence.split(" ");
							String fSentence = "";
							int numOfWords = eachWord.length;
							
							for(int i=0;i<numOfWords;i++) {
								String traduced = "";
								String got = thisThing.get(eachWord[i]);
								if(got==null) {
									traduced=("*")+eachWord[i]+("*");
								}
								else
									traduced=got;
								fSentence = fSentence + (" ") + traduced;
							}
							System.out.println("\nSu oracion traducida es: "+fSentence+"\n");
							System.out.println("----------------------------------------------------------------------------------------");
							translate.close();
							
						}
						else
							System.out.println("El archivo no se ha encontrado, usar el proporcionado por favor");
					}
					else if(option==3) {
						System.out.println("Saliendo, gracias por utilizar el programa");
						flag = false;
					}

				}
				catch(Exception E) {
					System.out.println("error");
				}
			}
		}
		else
			System.out.println("El archivo no se ha encontrado, usar el proporcionado por favor");
		
		buffR.close();
		read.close();
		
		
	}

}
