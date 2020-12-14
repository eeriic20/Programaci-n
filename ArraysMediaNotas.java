import java.util.Scanner;

/**
 * 
 */

/**
 * @author ericq
 * Diseñar un programa que pida al usuario que introduzca las notas 
 * de programación de los alumnos de la clase, guardando estas en un 
 * array. Posteriormente a la inserción el programa debe calcular y 
 * mostrar la nota media del grupo. Además, también mostrar los alumnos 
 * con notas superiores a la media.
 * 14/12/2020
 * Eric Quintero Moreno
 * 1º DAM
 */

public class ArraysMediaNotas {

	/**
	 * @param args
	 * Diseñar un arrays y calcular nota media del grupo
	 */

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		int media = 0, contmedia = 0, mediatotal, cont;

		int [ ] notas = new int [10];

		for (cont = 0; cont < notas.length; cont++) {

			System.out.println("Dime un número");
			notas [cont] = teclado.nextInt();

			media = notas [cont] + media;
			contmedia++;
		}
		
		mediatotal = media / contmedia;
		
		System.out.println("La media de los pares es: "+mediatotal);
		
		teclado.close();

	}

}
