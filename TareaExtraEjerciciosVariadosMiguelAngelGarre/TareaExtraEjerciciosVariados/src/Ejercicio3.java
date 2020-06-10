import java.util.Scanner;

public class Ejercicio3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		if (num1 < 0 || num1 >= 100) {
			System.out.println("Ingrese un numero positivo de 1 o 2 cifras");
		} else if (num1 < 10) {
			System.out.println("El numero tiene 1 cifra");
		} else {
			System.out.println("El numero tiene 2 cifras");
		}
	}
}
