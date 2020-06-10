import java.util.Scanner;

public class Ejercicio10 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int num3 = sc.nextInt();

		if (num1 < 10 && num2 < 10 && num3 < 10) {
			System.out.println("Todos los números son menores a diez");
		}
	}
}
