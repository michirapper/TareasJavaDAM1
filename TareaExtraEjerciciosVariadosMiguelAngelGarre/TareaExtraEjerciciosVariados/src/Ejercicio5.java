import java.util.Scanner;

public class Ejercicio5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		if (num1 >= 0) {
			System.out.println("El numero es Positivo");
		} else if (num1 < 0) {
			System.out.println("El numero es Negativo");
		} else {
			System.out.println("NULL");
		}
	}
}
