
import java.util.Scanner;

public class Ejercicio2 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Introduzca números(0 para acabar):");
		int minimo = Integer.MAX_VALUE;
		int maximo = Integer.MIN_VALUE;
		int num = in.nextInt();
		while (num != 0) {
			if (num < minimo) {
				minimo = num;
			}
			if (num > maximo) {
				maximo = num;
			}
			num = in.nextInt();
		}
		System.out.println("El maximo es: " + maximo);
		System.out.println("El minimo es: " + minimo);
	}
}
