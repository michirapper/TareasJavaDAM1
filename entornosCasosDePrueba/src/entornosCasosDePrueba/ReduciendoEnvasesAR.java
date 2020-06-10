package entornosCasosDePrueba;

import java.util.Scanner;

public class ReduciendoEnvasesAR {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int entrada = sc.nextInt();
		for (int i = 0; i < entrada; i++) {
			String stringf = sc.nextLine();
			String[] parts = stringf.split(" ");
			for (int j = 0; j < parts.length; j++) {
				System.out.println(parts.toString());
			}
		}
	}
}
