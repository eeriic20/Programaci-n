import java.util.Scanner;

/**
 * 
 */

/**
 * @author ericq
 * Diseñar un programa que, dado un número positivo y un dígito, diga 
 * en qué posición o posiciones aparece, de izquierda a derecha (izda 1…)
 * 17/12/2020
 * Eric Quintero Moreno
 * 1º DAM
 */
public class T4_Ejercicio_11 {

	/**
	 * @param args
	 * Declarar función y decir órdenes números
	 */

	public static int digitos(int x) {

		int cont=0;

		for (cont = 0; x > 0 ; cont++){
			x = x/10;
			}
		
		return cont;
	}
	
	public static void array(int x) {
		
		Scanner teclado=new Scanner(System.in);
		
		int cont=0, y,  i; 
		cont = digitos(x);
		
		int[] vector = new int[cont];
		
		for (i = vector.length-1; i >= 0; i--) {
			
			vector[i] = x % 10;
			x = x/10;
			
		}
		
		System.out.println("Dime el número que quieres saber en que posición esta");
		y = teclado.nextInt();
		
		for(i = 0; i < vector.length; i++) {
			
			if (vector[i] == y) {
				System.out.println("Esta en la posción " +vector[i]);
			}
			
		}
		
		
		teclado.close();
		
	}

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		System.out.println("Dime un número");
		int x = teclado.nextInt();

		digitos(x);
		
		array(x);

		teclado.close();
	}

}
