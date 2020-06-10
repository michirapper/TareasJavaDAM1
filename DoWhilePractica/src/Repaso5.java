import java.util.Scanner;

public class Repaso5 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int pares = 0;
		int impares = 0;
		int n;
		

		do {
			n = scan.nextInt();
			if ((n % 2) == 0) {
				pares++;
			} else {
				impares++;
			}
			System.out.println("hay " + pares + " numeros pares");
			System.out.println("hay " + impares + " numeros impares");
		} while (n != 0);
	}
}
