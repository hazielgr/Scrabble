package palabras;
import java.io.File;
import java.util.Scanner;


public class validacion {
	
	public static boolean validarPalabra(String texto) {
	
		Scanner entrada = null;
		String linea;
		int numeroDeLinea = 1;
		boolean contiene = false;
	    File f = new File("C:\\Users\\mario\\Desktop\\datos\\Scrabble\\resources\\palabras.txt");
	    
	    try {
		    entrada = new Scanner(f);
		    while (entrada.hasNext()) { //mientras no se llegue al final del fichero
		    	
		    	linea = entrada.nextLine(); //se lee una l�nea
		    	
		    	if (linea.equalsIgnoreCase(texto)) {   //si la l�nea contiene el texto buscado se muestra por pantalla
		    		contiene = true;
		    		break;
		    		}
		    	numeroDeLinea++; //se incrementa el contador de l�neas
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



