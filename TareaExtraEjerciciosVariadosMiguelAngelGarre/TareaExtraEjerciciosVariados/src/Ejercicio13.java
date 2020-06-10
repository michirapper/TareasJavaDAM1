import java.util.Scanner;

public class Ejercicio13 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Sueldo");
		int num1 = sc.nextInt();
		System.out.print("Años de Antiguedad");
		int num2 = sc.nextInt();
		if (num1 < 500 && num2 >= 10) {
			System.out.println("Sueldo= " + num1 * 1.2);
		} else if (num1 < 500 && num2 < 10) {
			System.out.println("Sueldo= " + num1 * 1.05);
		}

	}
}
