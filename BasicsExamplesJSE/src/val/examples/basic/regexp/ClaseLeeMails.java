package val.examples.basic.regexp;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;


public class ClaseLeeMails {
	
	private static final String INICIO_MAIL = "***";
	private static final String FIN_MAIL = "///";
	
	private static String procesarLinea (String linea_actual)
	{
		String mails_de_linea_actual = "";
		
		//TODO este es el m�todo m�s dif�cil...recibir� una l�nea y tendr� que extraer de ella todos correos
		//e irlos concatenando en un String de salida
		//Pista---> Sabemos la longuitud de la linea, sabemos que un Email viene encerrado entre s�mbolos clave...
		// Paciencia y a pensar como si lo estuvieras cogiendo con las manos...ve declarando todas las condiciones, variables y bucles que necesites!!!
		//Poco a poco...El l�piz y papel, ayudan siempre un mont�n!
			
		return mails_de_linea_actual;
	}
	
	
	/**
	 * Este m�tdo ya viene hecho!
	 * En �l, recorro el fichero y devuelvo un String, que estar� compuesto por todos
	 * los mails que aparecen en el fichero separados por /
	 * 
	 * Por ejemplo, para este fichero: 
	 * 
	 * vxscavsdfgv***susana@kelly.org///asv afsvasczx xcvasdf'ow048t09q38r`0gf9uq nw9eru`	wefu8ioW�`EO
	 * qer`kgq`pegiq3'5oyq'3'oaae'5oy'q35oy'q35oygadkfbbASKLF,B`R,BEP�D,FVA�PSF,DV�,AFS`BKAFS�KBAFD�S
     * AOBRJ KQG'�3KGP`KVASF***francesco@hp.es///BLAL�DFBMMA
     * 
     * deber�a devolver un String que fuera susana@kelly.org/francesco@hp.es
     * 
     * Para simplificar el proceso, cada l�nea obtenida del fichero, la voy
     * a procesar aparte, en el m�todo procesarLinea; siguiendo as� una m�xima en programaci�n:
     * Si una cosa es muy larga o complicada....LA DIVIDO!
	 * 
	 * @param br
	 * @return
	 * @throws IOException
	 */
	private static String obtenerEmails (BufferedReader br) throws IOException
	{
		String lista_mails = "";
		String linea = null;
	
		boolean final_fichero = false;
		
		while (!final_fichero)
		{
			linea = br.readLine();
			if (linea == null)
			{
				final_fichero = true;
			} else 
				{
					lista_mails = lista_mails + procesarLinea (linea);
				
				}
		}
		
		return lista_mails;
		
	}
	
	private static BufferedReader abrirYPrepararFichero (String nombre) throws FileNotFoundException
	{
		BufferedReader br = null;
		
		//TODO Abrir y preparar la lectura de un fichero de texto
		
		return br;
	}
	
	private static String [] hacerArrayDeMails (String lista_mails)
	{
		String [] array_mails = null;
		
		//Recibo un String que contiene TODOS los mails, separados por una / ej: mail1/mail2/
		//Tengo que separarlos y devolver un array de Mails PISTA --> m�todo split de la clase String
		
		return array_mails;
	}
	
	private static void mostrarMails (String [] lista_mails)
	{
		//TODO Recorrer la lista de mails. S�lo para comprobar que ha ido bien
	}
	
	private static void ordenarMails (String [] array_mails)
	{
		//TODO OPCIONAL Tengo que ordenar el array de Strings y devolverlo 
	}
	
	private static void cerrarFichero (BufferedReader br) throws IOException
	{
		//TODO Recibo un fichero y lo devuelvo cerrado
	}
	

	/**
	 * NOTA Todos los m�todos de la clase son static, para facilitar su uso sin tener
	 * que instanciar un Objeto. Si no fueran static, con declarar un objeto de la clase
	 * ya podr�a llamar a los m�todos, por ejempleo
	 * 	
	 * 	ClaseLeeMails clm = new ClaseLeeMails();
	 *  clm.ababrirYPrepararFichero ... etc 
	 *  
	 *  OK????
	 * 	 
	 * */
	
	public static void main(String[] args) throws IOException {
		
		String nombre = "fichero.txt";//el nombre del fichero de entrada
		String lista_mails = null; //aqu� guardar� los mails, separados por la el s�mbolo /
		String [] array_mails = null; //aqu� guardaer los mails, cada uno en su posici�n!
		BufferedReader br = null; // Objeto para leer un fichero de texto por l�neas!
		
				
		br = abrirYPrepararFichero(nombre);
		lista_mails = obtenerEmails(br);
		cerrarFichero (br);
		array_mails =  hacerArrayDeMails(lista_mails);
		//ordenarMails (array_mails); // Este m�todo es opcional, aunque luego veremos que es muy f�cil de hacer!
		mostrarMails(array_mails);
		
	}
	
}
