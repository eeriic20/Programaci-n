import java.util.Scanner;

/**
 * 
 */

/**
 * @author ericq
 * Diseñar un programa en el que se guarden los datos de 10 empleados. Para ello, 
 * se guardará en un array llamado nombres los nombres de estos diez empleados y en 
 * un array llamado sueldos en el que se guarden los sueldos de estos empleados. Los 
 * datos se deben pedir por teclado para que sean introducidos por el usuario. Una vez 
 * introducidos los datos de los empleados, se debe imprimir por pantalla los datos del 
 * empleado con el sueldo más alto. 
 * 08/01/2021
 * Eric Quintero Moreno
 * 1º DAM
 */

public class T5_Ejercicio_5 {

	/**
	 * @param args
	 * Guardar datos empleados y sueldos
	 */

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		int i = 0;
		double sMayor = 0;
		String nMayor = null;
		
		String[] nombres = new String [10];
		double[] sueldos = new double [10];

		for (i = 0; i < nombres.length; i++) {
			System.out.println("Dime el nombre");
			nombres[i] = teclado.nextLine();

			System.out.println("Dime el sueldo");
			sueldos[i] = teclado.nextDouble();

			if(sueldos[i] > sMayor) {
				sMayor = sueldos[i];
				nMayor = nombres[i];
			}
			teclado.nextLine();
		}

		System.out.println("El empleado con el mayor sueldo es: " +nMayor);
		System.out.println("Su sueldo es de: " +sMayor);

		teclado.close();

	}

}
