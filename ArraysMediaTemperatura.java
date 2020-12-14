import java.util.Scanner;

/**
 * 
 */

/**
 * @author ericq
 * Diseñar un programa que pida al usuario que introduzca 
 * 10 temperaturas enteras, guardándolas en un array. 
 * 11/12/2020
 * Eric Quintero Moreno
 * 1º DAM
 */
public class ArraysMediaTemperatura {

	/**
	 * @param args
	 * Diseñar un programa que pida al usuario que introduzca 10 temperaturas enteras, guardándolas en un array. 
	 */

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		int negativo = 0, positivo = 0, contpositivo = 0, contnegativo = 0;

		int [ ] temperaturas = new int [10];

		for (int cont = 0; cont < temperaturas.length; cont++) {

			System.out.println("Dime una temperatura");
			temperaturas [cont] = teclado.nextInt();

			if(temperaturas [cont] < 0) {
				negativo = temperaturas [cont] + negativo;
				contnegativo++;
			}

			else {
				positivo = temperaturas [cont] + positivo;
				contpositivo++;
			}
		}

		System.out.println("La media de los positivos es: "+positivo / contpositivo);
		System.out.println("La media de los negativos es: "+negativo / contnegativo);


		teclado.close();

	}

}
