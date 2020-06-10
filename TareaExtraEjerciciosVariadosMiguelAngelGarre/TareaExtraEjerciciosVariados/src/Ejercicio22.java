import java.util.Scanner;

public class Ejercicio22 {
	public static void main(String[] ar) {
		Scanner sc = new Scanner(System.in);
		int suma, valor;
		suma = 0;
		do {
			System.out.print("Numero:");
			valor = sc.nextInt();
			if (valor != 9999) {
				suma = suma + valor;
			}
		} while (valor != 9999);
		System.out.print("El numero es ");
		System.out.println(suma);
		if (suma == 0) {
			System.out.println("El numero es cero.");
		} else {
			if (suma > 0) {
				System.out.println("El numero es positivo.");
			} else {
				System.out.println("El numero es negativo");
			}
		}
	}
}
