package arraysTestear;

public class ArraysOrdenarVectores2 {
	public static void main(String[] args) {
		int[] sueldos = { 1200, 750, 820, 550, 490 };
		// Implementa el algoritmo que acabas de ver en la parte teórica
		for (int f = 0; f < sueldos.length - 1; f++) {
			if (sueldos[f] > sueldos[f + 1]) {
				//int aux = sueldos[f+1];
				int aux = sueldos[f];
				sueldos[f] = sueldos[f + 1];
				sueldos[f + 1] = aux;
			}
		}
		System.out.println("El mayor sueldo de todos es: " + sueldos[sueldos.length - 1]);
	}
}
