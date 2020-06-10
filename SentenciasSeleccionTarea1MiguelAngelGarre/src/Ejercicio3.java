import java.util.Scanner;

public class Ejercicio3 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int numero1 = in.nextInt();
		int numero2 = in.nextInt();
		if (numero1 < numero2) {
			System.out.println(numero1);
			System.out.println(numero2);
		} else {
			System.out.println(numero2);
			System.out.println(numero1);
		}
	}
}
