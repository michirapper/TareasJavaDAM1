import java.util.Scanner;

public class Ejercicio20 {
	public static void main(String[] ar) {
		Scanner sc = new Scanner(System.in);
		int x = 1;
		int suma1 = 0;
		int suma2 = 0;
		int valor;
		System.out.println("1 lista");
		while (x <= 15) {
			System.out.print("numero: ");
			valor = sc.nextInt();
			suma1 += valor;
			x++;
		}
		System.out.println("2 lista");
		x = 1;
		while (x <= 15) {
			System.out.print("numero: ");
			valor = sc.nextInt();
			suma2 += valor;
			x++;
		}
		if (suma1 > suma2) {
			System.out.print("Lista 1 mayor");
		} else {
			if (suma2 > suma1) {
				System.out.print("Lista2 mayor");
			} else {
				System.out.print("Listas iguales");
			}
		}
	}
}
