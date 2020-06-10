import java.util.Scanner;

public class Ejercicio2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int num3 = sc.nextInt();
		if (((num1 + num2 + num3) / 3) >= 7) {
			System.out.println("Promocionado");
		}else {
			System.out.println("No Promocionado");
		}
	}
}
