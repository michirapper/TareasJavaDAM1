package arraysTestear;

import java.util.Arrays;

public class ArrayOrdenarVectores {
	public static void main(String[] args) {
		int[] listado1 = { 6, 2, 3, 1, 4, 5, 7 };
		int[] listado2 = { 1, 2, 3, 4, 5, 6, 7 };
		boolean isSort = false;
		for (int i = 0; i < listado1.length; i++) {
			for (int j = 0; j < listado1.length; j++) {
				if (listado1[i] == listado1[j]) {
					isSort = true;
				} else {
					isSort = false;
				}
				System.out.println(listado1[i]);
				System.out.println(listado1[j]);
			}
		}

		// Implementa una forma de saber si el array est� ordenado o no
		// Almacena el resultado en la variable isSort
		if (isSort)
			System.out.println("El vector est� ordenado");
		else
			System.out.println("El vector NO est� ordenado");
	}

}
