import java.util.Scanner;

public class Ejercicio5 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int num, max = 0, min = 0;

		for (int i = 1; i < 11; i++) {
			num = in.nextInt();
			if (min != 0 && max != 0) {
				if (num > max) {
					max = num;
				}
				if (num < min) {
					min = num;
				}
			}

			if (min == 0 || max == 0) {
				if (num > max) {
					max = num;
				}
				if (num < min) {
					min = num;
				}
			}
		}
		System.out.println("Numero Maximo: " + max);
		System.out.println("Numero Minimo: " + min);
	}

}
