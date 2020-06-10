import java.util.Scanner;

public class Ejercicio1 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int edad = in.nextInt();
		if (edad >= 18) {
			System.out.println("eres mayor de edad");
		} else {
			System.out.println("eres menor de edad");
		}
	}
}
