package entornosCasosDePrueba;

import java.util.Scanner;

public class casosDePrueba {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Introduce 10 numeros: ");
		int i = 0;
		int pares = 0;
		int impar = 0;
		while (i < 10) {
			int entrada = sc.nextInt();
			if(entrada % 2 == 0) {
				pares++;
			}
			else {
				impar++;
			}
			i++;
		}
		System.out.println(pares);
		System.out.println(impar);

	}
}
