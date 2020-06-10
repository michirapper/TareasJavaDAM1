public class UF6Tarea1 {
	public static int contador(int x, int y, int num) {
		int c = 0;
		if (x > 0 && y > 0) {
			System.out.print("Escribe un número: ");
			if (num >= x && num <= y) {
				System.out.println("\tNúmero en el rango");
				c++;
			} else
				System.out.println("\tNúmero fuera de rango");
		} else
			c = -1;

		return c;
	}
}