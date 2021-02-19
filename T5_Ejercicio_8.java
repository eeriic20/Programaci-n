import java.util.Scanner;
import java.util.StringTokenizer;

public class T5_Ejercicio_8 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int i;
		String frase;
		
		System.out.println("Dime una frase");
		frase = sc.nextLine();

		String[] result = frase.split("\\s");
		for (i = 0; i < result.length; i++) {
		}

		System.out.println("Tu frase tiene " +i+ " palabras.");
		
		sc.close();

	}

}
