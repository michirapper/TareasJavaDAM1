package arraysTestear;

import java.util.Arrays;

public class ArraysOrdenarVectores3 {
	public static void main(String[] args) {
		boolean repeticion = false;
		int[] listado1 = { 1, 2, 3, 4, 5, 6 };
		// int[] listado2 = { 1, 4, 3, 5, 6 };
//		for (int i = 0; i < listado1.length; i++) {
//			for (int j = 0; j < listado1.length; j++) {
//				System.out.println(listado1[j]);
//				if (listado1[i] == listado1[j]) {
//					resultado = true;
//				}
//			}
//			
//		}
		Arrays.sort(listado1);
		for (int i = 0; i < listado1.length - 1; i++) {
			if (listado1[i] == listado1[i + 1]) {
				repeticion = true;
			} else {
				repeticion = false;
			}
		}
		if (repeticion) {
			System.out.println("Se repite al menos 1 numero");
		} else {
			System.out.println("No se repite ningun numero");
		}

		// Implementa una forma de saber si el array está ordenado o no
		// Almacena el resultado en la variable isSort
		// System.out.println("El, vector ordenado " + Arrays.toString(listado));
		// System.out.println(resultado);
	}
}
