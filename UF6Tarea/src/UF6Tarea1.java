public class UF6Tarea1 {
	public static int contador(int x, int y, int num) {
		int c = 0;
		if (x > 0 && y > 0) {
			System.out.print("Escribe un n�mero: ");
			if (num >= x && num <= y) {
				System.out.println("\tN�mero en el rango");
				c++;
			} else
				System.out.println("\tN�mero fuera de rango");
		} else
			c = -1;

		return c;
	}
}