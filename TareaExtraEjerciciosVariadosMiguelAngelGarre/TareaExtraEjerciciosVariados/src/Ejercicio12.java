import java.util.Scanner;

public class Ejercicio12 {
	public static void main(String[] ar) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Coordenada x:");
		int x = sc.nextInt();
		System.out.print("Coordenada y:");
		int y = sc.nextInt();
		if (x > 0 && y > 0) {
			System.out.print("Primer cuadrante");
		} else if (x < 0 && y > 0) {
			System.out.print("Segundo cuadrante");
		} else if (x < 0 && y < 0) {
			System.out.print("Tercer cuadrante");
		} else {
			System.out.print("Cuarto cuadrante");
		}
	}
}
