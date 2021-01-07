import java.util.Scanner;

/**
 * 
 */

/**
 * @author ericq
 * Diseña un programa mediante métodos, que te muestre las tablas de 
 * multiplicar del 1 al 10.El usuario debe introducir el número de la
 * tabla que se desea imprimir.
 * 07/01/2020
 * Eric Quintero Moreno
 * 1º DAM
 */

public class T4_Ejercicio_14 {

	/**
	 * @param args
	 * Tablas de multiplicar
	 */
	
	public static void tablas(int x) {
		
		System.out.println("La tabla de multiplicar del " +x+ " es:");
		System.out.println(+x * 1);
		System.out.println(+x * 2);
		System.out.println(+x * 3);
		System.out.println(+x * 4);
		System.out.println(+x * 5);
		System.out.println(+x * 6);
		System.out.println(+x * 7);
		System.out.println(+x * 8);
		System.out.println(+x * 9);
		System.out.println(+x * 10);
	}
	
	public static void main(String[] args) {
		 Scanner teclado = new Scanner(System.in);
		 
		 System.out.println("Dime el número de la tabla que quieras multiplicar");
		 int x = teclado.nextInt();
		 
		 tablas(x);
		 
		 teclado.close();

	}

}
