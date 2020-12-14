import java.util.Scanner;

/**
 * 
 */

/**
 * @author ericq
 * Diseñar un programa que pida al usuario que introduzca 
 * 10 números enteros, guardándolos en un array. Una vez 
 * se hayan introducido los números en el array, el programa 
 * debe calcular y mostrar la media de los números en posición 
 * par y en posición impar por separado.
 * 14/12/2020
 * Eric Quintero Moreno
 * 1º DAM
 */

public class ArraysParesOImpares {

	/**
	 * @param args
	 * Diseñar un arrays y calcular media pares o impares.
	 */

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		int impar = 0, par = 0, contpar = 0, contimpar = 0;

		int [ ] paresimpares = new int [10];

		for (int cont = 0; cont < paresimpares.length; cont++) {

			System.out.println("Dime un número");
			paresimpares [cont] = teclado.nextInt();

			if(paresimpares [cont] % 2 == 0) {
				par = paresimpares [cont] + par;
				contpar++;
			}

			else {
				impar = paresimpares [cont] + impar;
				contimpar++;
			}
		}

		System.out.println("La media de los pares es: "+par / contpar);
		System.out.println("La media de los impares es: "+impar / contimpar);


		teclado.close();

	}

}
