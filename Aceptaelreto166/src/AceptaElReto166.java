import java.util.ArrayList;
import java.util.Scanner;

public class AceptaElReto166 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String entrada = sc.nextLine();
		String[] parts = entrada.split(" ");
		String comienzo = parts[0];
		String finalArray = parts[1];
		int comienzoInt = Integer.parseInt(comienzo);
		int finalint = Integer.parseInt(finalArray);
		int mayor;
		int menor;
		int count = 0;
		if (comienzoInt > finalint) {
			mayor = comienzoInt;
			menor = finalint;
		} else {
			mayor = finalint;
			menor = comienzoInt;
		}
		ArrayList<Integer> numeros = new ArrayList<Integer>();
		System.out.println(mayor);
		System.out.println(menor);
		for (int i = mayor; i <= 99; i--) {
			numeros.add(count);
			count++;
		}

	}
}
