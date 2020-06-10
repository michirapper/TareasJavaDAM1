import java.util.Arrays;

public class Ejercicio1 {
	public static void main(String[] args) {
		int[] listado1 = { 6, 2, 3, 1, 4, 5, 7 };
		int[] listado2 = { 1, 2, 3, 4, 5, 6, 7 };
		boolean isSort = true;
		if (Arrays.equals(listado1, listado2)) {
			isSort = true;
		} else {
			isSort = false;
		}

		if (isSort)
			System.out.println("El vector esta ordenado ");
		else
			System.out.println("El vector NO está ordenado");
	}
}
