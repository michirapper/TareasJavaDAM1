import java.util.Scanner;

public class Ejercicio21 {
	public static void main(String[] ar) {
		Scanner sc = new Scanner(System.in);
		int x = 1;
		int pares = 0;
		int impares = 0;
		int valor;
		System.out.print("Cuants numeros:");
		int n = sc.nextInt();
		while (x <= n) {
			System.out.print("numeros: ");
			valor = sc.nextInt();
			if (valor % 2 == 0) {
				pares++;
			} else {
				impares++;
			}
			x = x + 1;
		}
		System.out.print("Pares:");
		System.out.println(pares);
		System.out.print("Impares:");
		System.out.print(impares);
	}
}
