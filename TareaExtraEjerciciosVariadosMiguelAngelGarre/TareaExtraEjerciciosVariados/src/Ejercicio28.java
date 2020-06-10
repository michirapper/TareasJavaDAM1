import java.util.Scanner;

public class Ejercicio28 {
	public static void main(String[] ar) {
		Scanner sc = new Scanner(System.in);
		int n;
		int i;
		int x;
		int y;
		int cant1 = 0;
		int cant2 = 0;
		int cant3 = 0;
		int cant4 = 0;
		System.out.print("Cantidad de puntos:");
		n = sc.nextInt();
		for (i = 1; i <= n; i++) {
			System.out.print("Ingrese coordenada x:");
			x = sc.nextInt();
			System.out.print("Ingrese coordenada y:");
			y = sc.nextInt();
			if (x > 0 && y > 0) {
				cant1++;
			} else {
				if (x < 0 && y > 0) {
					cant2++;
				} else {
					if (x < 0 && y < 0) {
						cant3++;
					} else {
						if (x > 0 && y < 0) {
							cant4++;
						}
					}
				}
			}
		}
		System.out.print("Cantidad de puntos en el primer cuadrante:");
		System.out.println(cant1);
		System.out.print("Cantidad de puntos en el segundo cuadrante:");
		System.out.println(cant2);
		System.out.print("Cantidad de puntos en el tercer cuadrante:");
		System.out.println(cant3);
		System.out.print("Cantidad de puntos en el cuarto cuadrante:");
		System.out.println(cant4);
	}
}
