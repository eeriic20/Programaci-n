import java.util.Scanner;

/**
 * 
 */

/**
 * @author ericq
 * Dise�ar un programa que pida al usuario que introduzca las notas 
 * de programaci�n de los alumnos de la clase, guardando estas en un 
 * array. Posteriormente a la inserci�n el programa debe calcular y 
 * mostrar la nota media del grupo. Adem�s, tambi�n mostrar los alumnos 
 * con notas superiores a la media.
 * 14/12/2020
 * Eric Quintero Moreno
 * 1� DAM
 */

public class ArraysMediaNotas {

	/**
	 * @param args
	 * Dise�ar un arrays y calcular nota media del grupo
	 */

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		int media = 0, contmedia = 0, mediatotal, cont;

		int [ ] notas = new int [10];

		for (cont = 0; cont < notas.length; cont++) {

			System.out.println("Dime un n�mero");
			notas [cont] = teclado.nextInt();

			media = notas [cont] + media;
			contmedia++;
		}
		
		mediatotal = media / contmedia;
		
		System.out.println("La media de los pares es: "+mediatotal);
		
		teclado.close();

	}

}
