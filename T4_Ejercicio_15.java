import java.util.Scanner;

/**
 * 
 */

/**
 * @author ericq
 * Realiza un programa que pida por pantalla un n�mero entero y pinte 
 * un cuadrado como el del siguiente ejemplo, usando m�todos.
 * 07/01/2021
 * Eric Quintero Moreno
 * 1� DAM
 */
public class T4_Ejercicio_15 {

	/**
	 * @param args
	 * Realiza un programa que pida por pantalla un n�mero entero y pinte 
	 * un cuadrado como el del siguiente ejemplo, usando m�todos.
	 */

	public static void rectangulo(int base, int altura) {
		
		int cont2 = 1;
		
		for (int cont=1; cont <= altura; cont++) {
			for (int cont1=1; cont1 < base; cont1++) {
				System.out.print(cont2);
			}
			System.out.println(cont2);
			
			cont2++;
		}
	}

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		System.out.println("Dime un n�mero");
		int base = teclado.nextInt();

		int altura = base;

		rectangulo(base, altura);

		teclado.close();

	}

}
