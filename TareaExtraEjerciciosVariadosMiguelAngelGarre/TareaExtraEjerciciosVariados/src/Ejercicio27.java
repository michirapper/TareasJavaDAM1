import java.util.Scanner;

public class Ejercicio27 {
	public static void main(String[] ar) {
		Scanner sc = new Scanner(System.in);
		int i;
		int valor;
		System.out.print("Ingrese un valor entre 1 y 10:");
		valor = sc.nextInt();
		for (i = valor; i <= valor * 12; i += valor) {
			System.out.print(i);
			System.out.print("-");
		}
	}
}
