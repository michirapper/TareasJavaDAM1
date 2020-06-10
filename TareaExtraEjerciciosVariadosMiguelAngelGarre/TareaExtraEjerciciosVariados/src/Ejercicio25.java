import java.util.Scanner;

public class Ejercicio25 {
	public static void main(String[] ar) {
		Scanner sc = new Scanner(System.in);
		int i;
		int numero;
		int suma;
		suma = 0;
		for (i = 1; i <= 10; i++) {
			numero = sc.nextInt();
			if (i > 5) {
				suma = suma + numero;
			}
		}
		System.out.print(suma);
	}
}
