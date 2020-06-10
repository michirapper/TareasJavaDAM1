import java.util.Scanner;

public class Ejercicio24 {
	public static void main(String[] ar) {
		Scanner sc = new Scanner(System.in);
		int base;
		int altura;
		int superficie;
		int cantidad;
		int i;
		int n;
		cantidad = 0;
		System.out.print("Cuantos triángulos procesará:");
		n = sc.nextInt();
		for (i = 1; i <= n; i++) {
			System.out.print("Base: ");
			base = sc.nextInt();
			System.out.print("Altura ");
			altura = sc.nextInt();
			superficie = (base * altura) / 2;
			System.out.print("Superficie: ");
			System.out.println(superficie);
			if (superficie > 12) {
				cantidad = cantidad + 1;
			}
		}
		System.out.print("Triángulos de superficie superior a 12 son: ");
		System.out.print(cantidad);
	}
}
