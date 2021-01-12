/**
 * 
 */

/**
 * @author ericq
 * Diseñar un programa en el que se guarden 10 números decimales generados de forma aleatoria. 
 * Para generar números aleatorios en Java, podemos utilizar la función Math.random();
 * 08/01/2021
 * Eric Quintero Moreno
 * 1º DAM
 */

public class T5_Ejercicio_6 {

	/**
	 * @param args
	 * Llenar array con números aleatorios y mostrarlos
	 */

	public static void main(String[] args) {

		int [ ] aleatorios = new int [10];

		for (int i=0; i<aleatorios.length; i++) {
			aleatorios[i] = (int) (Math.random()*20)+1;
		}
		
		for (int i = 0; i < aleatorios.length; i++) {
			System.out.println(aleatorios[i]);
		}
		
	}

}
