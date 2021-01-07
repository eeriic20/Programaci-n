import java.util.Scanner;

/**
 * 
 */

/**
 * @author ericq
 * Diseñar un programa en el que se cree un array de 20 elementos, llamado pares, 
 * en el que se guarden los 20 primeros números pares. Una vez se haya llenado el 
 * array se deben imprimir por pantalla los valores de este array.
 * 07/01/2021
 * Eric Quintero Moreno
 * 1º DAM
 */

public class T5_Ejercicio_3 {

	/**
	 * @param args
	 * Arrays y pares
	 */
	
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		int cont=0;
		
		int [ ] pares = new int [20];
		
		for (int i = 0; i < pares.length; i++) {
			pares[i]=cont;
			cont=cont+2;
		}
		
		for (int i = 0; i < pares.length; i++) {
			System.out.println(pares[i]);
		}
		
		
		teclado.close();

	}

}
