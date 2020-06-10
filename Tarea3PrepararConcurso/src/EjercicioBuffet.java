import java.util.Scanner;

public class EjercicioBuffet {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		double[] precioCant = new double[5];
		precioCant[0] = 13.42; // Carne
		precioCant[1] = 18.27; // Pescado
		precioCant[2] = 8.75; // Verdura
		precioCant[3] = 2.75; // Postres
		precioCant[4] = 0.20; // Bebidas

		double gasto = 0;
		double beneficios = 0;
		System.out.print("Cantidad de clientes hoy: ");
		int totalClientes = in.nextInt();
		int edad;
		int mayor18 = 0;
		int menor18 = 0;

		for (int i = 0; i < totalClientes; i++) {
			System.out.print("Introduce la edad: ");
			edad = in.nextInt();
			int[] cantidades = new int[5];
			System.out.print("Kilos de carne (entero): ");
			cantidades[0] = in.nextInt();
			System.out.print("Kilos de pescado (entero): ");
			cantidades[1] = in.nextInt();
			System.out.print("Kilos de verdura (entero): ");
			cantidades[2] = in.nextInt();
			System.out.print("Unidades de postre (entero): ");
			cantidades[3] = in.nextInt();
			System.out.print("Número de bebidas (entero): ");
			cantidades[4] = in.nextInt();
			for (int j = 0; j < cantidades.length; j++) {
				gasto += precioCant[j] * cantidades[j];
			}
			if (edad < 18) {
				menor18++;
			} else {
				mayor18++;
			}
		}
		beneficios = (menor18 * 18 + mayor18 * 25) - gasto;
		System.out.println(beneficios > 0 ? "Hay beneficios" : "Hay pérdidas");
		in.close();
	}
}
