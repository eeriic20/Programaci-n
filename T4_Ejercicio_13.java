import java.util.Scanner;

/**
 * 
 */

/**
 * @author ericq
 * Realiza un programa que pida un número por teclado entero positivo y muestre de 
 * izquierda a derecha los dígitos pares, asímismo deberá sumarlos y mostrar esa suma.
 * 05/01/2021
 * Eric Quintero Moreno
 * 1º DAM
 */
public class T4_Ejercicio_13 {

	/**
	 * @param args
	 * Pedir un número por teclado entero positivo y muestre de izquierda a 
	 * derecha los dígitos pares, asímismo deberá sumarlos y mostrar esa suma.
	 */

	public static int digitos(int x) {

		int digitos = 0;
		int aux = x;

		while (aux!= 0) {
			aux = aux/10;
			digitos++;
		}

		return digitos;

	}

	public static int[] array(int x) {
		int digitos = digitos(x);
		int[] numeroConvertido = new int [digitos];
		int aux = x;

		for (int i = 0; i < digitos; i++) {
			numeroConvertido[i] = aux%10;
			aux = aux/10;
		}

		return numeroConvertido;
	}

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		int sumapares = 0;

		System.out.println("Dime un número");
		int x = teclado.nextInt();

		digitos(x);

		int [] numeroConvertido = array(x);

		System.out.println("Números pares: ");
		for (int i = numeroConvertido.length-1; i >= 0 ; i--) {
			if (numeroConvertido[i]%2==0) {
				System.out.print(numeroConvertido[i] + " ");
				sumapares = sumapares +numeroConvertido[i];
			}
		}

		System.out.println("Suma de los digitos pares " +sumapares);

		teclado.close();

	}

}
