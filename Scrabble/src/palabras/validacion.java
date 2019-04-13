package palabras;
import java.io.File;
import java.util.Scanner;


public class validacion {
	/**

 * Esta clase se encarga de validar si la palabra se encuentra en el dicionario 

 * @author: Abigail Abarca, Haziel Gudino, Daniel Nunez, Victoria Ruiz
 

 * @version: 4/12/2019

 

 */
	
	public static boolean validarPalabra(String texto) {
	
		Scanner entrada = null;
		String linea;
		int numeroDeLinea = 1;
		boolean contiene = false;
	    File f = new File("C:\\Users\\abiga\\Desktop\\scrabble\\Scrabble\\resources\\palabras.txt");
	    
	    try {
		    entrada = new Scanner(f);
		    while (entrada.hasNext()) { //mientras no se llegue al final del fichero
		    	
		    	linea = entrada.nextLine(); //se lee una línea
		    	
		    	if (linea.equalsIgnoreCase(texto)) {   //si la línea contiene el texto buscado se muestra por pantalla
		    		contiene = true;
		    		break;
		    		}
		    	numeroDeLinea++; //se incrementa el contador de líneas
		    	}  
		    if (entrada != null) {
		    	entrada.close();
		    	}
	    }
	    catch(Exception e){
	    	System.out.println(e);
	    }
		return contiene;
	}
}



