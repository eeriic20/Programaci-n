import java.util.Scanner;

/**
 * 
 */

/**
 * @author ericq
 * Dise�ar un programa que, dado un n�mero positivo y un d�gito, diga 
 * en qu� posici�n o posiciones aparece, de izquierda a derecha (izda 1�)
 * 17/12/2020
 * Eric Quintero Moreno
 * 1� DAM
 */
public class T4_Ejercicio_11 {

	/**
	 * @param args
	 * Declarar funci�n y decir �rdenes n�meros
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
		
		System.out.println("Dime el n�mero que quieres saber en que posici�n esta");
		y = teclado.nextInt();
		
		for(i = 0; i < vector.length; i++) {
			
			if (vector[i] == y) {
				System.out.println("Esta en la posci�n " +vector[i]);
			}
			
		}
		
		
		teclado.close();
		
	}

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		System.out.println("Dime un n�mero");
		int x = teclado.nextInt();

		digitos(x);
		
		array(x);

		teclado.close();
	}

}
