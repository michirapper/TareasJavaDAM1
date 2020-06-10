import java.util.Scanner;

public class Ejercicio3 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Introduzca un número natural: ");
		int num = in.nextInt();
		int var = 0;
		for (int i = 1; i < num; i++) {
			if (num % i == 0) {
				var = var + i;
			}
		}
		if (var == num) {
			System.out.println("Perfecto");
		} else {
			System.out.println("No es perfecto");
		}
	}
}
