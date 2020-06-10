import java.util.Scanner;

public class Ejercicio2 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int numero1 = in.nextInt();
		int numero2 = in.nextInt();
		System.out.println(numero1 + numero2);
		System.out.println(numero1 - numero2);
		System.out.println(numero1 * numero2);
		if (numero2 == 0) {
			
			System.out.println("ERROR: Numero/0");
		} else {
			System.out.println(numero1 / numero2);
		}

	}
}
