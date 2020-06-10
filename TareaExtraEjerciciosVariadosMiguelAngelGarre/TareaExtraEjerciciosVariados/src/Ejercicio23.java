import java.util.Scanner;

public class Ejercicio23 {
	public static void main(String[] ar) {
		Scanner sc = new Scanner(System.in);
		int cuenta;
		double saldo;
		double suma;
		suma = 0;
		do {
			System.out.print("Numero cuenta ");
			cuenta = sc.nextInt();
			if (cuenta >= 0) {
				System.out.print("Saldo ");
				saldo = sc.nextFloat();
				if (saldo > 0) {
					System.out.println("Saldo del Acreedor");
					suma = suma + saldo;
				} else {
					if (saldo < 0) {
						System.out.println("Deudor");
					} else {
						System.out.println("Nulo");
					}
				}
			}
		} while (cuenta >= 0);
		System.out.print("Total del dinero de los Acreedores:");
		System.out.print(suma);
	}
}
