package arraysTestear;

public class ContarMatrizesBidimensionales {
	public static void main(String[] args) {
		int j;
		int[][] miMatriz = { { 1, 2, 3, 4, 5 }, { 6, 7, 8, 9, 10 }, { 2, 3 }, { 1 }, { 1, 2, 3, 4, 5, 6, 7, 8 } };

		for (int i = 0; i < miMatriz.length; i++) {
			for (int k = 0; k < miMatriz[i].length; k++) {
				System.out.println( miMatriz[i][k] + " ");
			}
			System.out.println();
		}

//		for (int i = 0; i < miMatriz.length; i++) {
//			for ( j = 0; j < miMatriz[i].length; j++) {
//			System.out.printf("%10.3f", miMatriz[i][j]);
//			}
//			System.out.println();
//		}

		// System.out.println("Cantidad de filas: " + miMatriz.length);
		// System.out.println("Cantidad de columnas: " + miMatriz[1].length);

	}
}
