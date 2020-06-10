import java.util.*;

public class Ejercicio2 {
	public static void main(String[] args) {
		int i;
		int[] numeros = new int[5];

		Scanner teclado = new Scanner(System.in);

		for (i = 0; i < numeros.length; i++) {
			numeros[i] = teclado.nextInt();
		}

		for (int y = 0; y < numeros.length - 1; y++) {
			for (int j = 0; j < numeros.length - y - 1; j++) {
				if (numeros[j + 1] < numeros[j]) {
					int aux = numeros[j + 1];
					numeros[j + 1] = numeros[j];
					numeros[j] = aux;
				}
			}
		}

		for (i = 0; i < numeros.length; i++) {
			System.out.println(numeros[i]);
		}
	}
}
