import java.util.Scanner;

public class MediaWhile {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int value = 0;
		int contador = -1;
		float suma = 0;
		for (contador = -1; value != -1; contador++) {
			System.out.println("Introduzca valores (-1 para terminar)");
			value = in.nextInt();
			suma += value;
		}
		double media = (suma + 1) / (contador);
		if (media == 0) {
			System.out.printf("La media es 0");
		} else if (contador == 0) {
			System.out.println("No se han introducido numeros");

		} else {
			System.out.printf("La media es %f", media);
		}

	}
}
