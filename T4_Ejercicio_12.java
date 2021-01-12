import java.util.Scanner;

/**
 * 
 */

/**
 * @author ericq
 * Realiza un programa que pinte la letra L por pantalla hecha con asteriscos. El
 * programa pedirá la altura. El palo horizontal de la L tendrá una longitud de la
 * mitad (división entera entre 2) de la altura más uno.
 * 05/01/2021
 * Eric Quintero Moreno
 * 1º DAM
 */
public class T4_Ejercicio_12 {

	/**
	 * @param args
	 * Pintar letra L
	 */

	public static void pintarL(int x) {
		
		int y = (x/2) + 1;
		
		for (int cont = 0; cont < x - 1; cont++) {
			System.out.println("*");
		}
		
		for (int cont = 0; cont < y; cont++) {
			System.out.print("*");
		}
		
	}
	
	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		System.out.println("Dime la altura de la L");
		int x = teclado.nextInt();
		
		pintarL(x);

		teclado.close();

	}

}
