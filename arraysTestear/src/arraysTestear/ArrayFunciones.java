package arraysTestear;
import java.util.*;
public class ArrayFunciones {

	public static void main(String a[]) throws Exception {
		// Declaro un vector inicial
		int[] miVector = { 11, 80, 66, 8, 9 };
		// Ordenación del vector
		Arrays.sort(miVector);
		// Busco un elemento en concreto en un vector ordenado
		System.out.println(Arrays.binarySearch(miVector, 10));
		// Imprimir un vector
		System.out.println(Arrays.toString(miVector));
	}
}
