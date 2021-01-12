import java.util.Scanner;

/**
 * 
 */

/**
 * @author ericq
 * Dise�ar un programa en el que se pida al usuario que introduzca 10 n�mero enteros 
 * y �stos se guarden en un array. Una vez introducidos, el programa debe mostrar por 
 * pantalla cu�ntos n�meros negativos, cu�ntos n�meros positivos y cu�ntos 0 hay en el array. 
 * 08/01/2021
 * Eric Quintero Moreno
 * 1� DAM

 */

public class T5_Ejercicio_4 {

	/**
	 * @param args
	 * Cuantos negativos, positivos y 0 hay
	 */

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		int i, zeros = 0, positivos = 0, negativos = 0;

		int [ ] numeros = new int [10];

		for (i = 0; i < numeros.length; i++) {

			System.out.println("Dime un n�mero");
			numeros [i] = teclado.nextInt();

		}

		for (i = 0; i < numeros.length; i++) {

			if (numeros[i]==0) {
				zeros++;
			}

			else {

				if (numeros[i]>0) {
					positivos++;
				}

				else {
					negativos++;
				}

			}

		}

		System.out.println("Hay " +zeros+ " 0");
		System.out.println("Hay " +positivos+ " n�meros positivos");
		System.out.println("Hay " +negativos+ " n�meros negativos");

		teclado.close();

	}

}
