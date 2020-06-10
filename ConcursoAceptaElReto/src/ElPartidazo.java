import java.util.Scanner;

public class ElPartidazo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int casosPrueba = sc.nextInt();
		int puerta1 = 0;
		int puerta2 = 0;
		int puerta3 = 0;
		int NumPuerta = 0;
		String puerta = sc.nextLine();
		for (int j = -1; j < casosPrueba; j++) {
			puerta = sc.nextLine();
			String[] puertaArray = puerta.split("");
			for (int i = 0; i < puertaArray.length; i++) {
				if (puertaArray[0].equals("A")) {
					NumPuerta = 3;
					puerta3++;
				} else {
					if (puertaArray.length - 1 % 2 == 0) {
						NumPuerta = 2;
						puerta2++;
					} else {
						NumPuerta = 1;
						puerta1++;
					}
				}
				System.out.println(puertaArray[i]);
			}

			System.out.println("Entrada " + puerta + " Puerta " + NumPuerta);
		}
		sc.close();
	}
}
