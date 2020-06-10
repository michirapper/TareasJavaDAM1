import java.util.Scanner;

public class Ejercicio4 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int numero1 = in.nextInt();
		int numero2 = in.nextInt();
		int numero3 = in.nextInt();

		if (numero1 > numero2 && numero1 > numero3) {
			System.out.println(numero1);
		}else if(numero2 > numero1 && numero2 > numero3) {
			System.out.println(numero2);
		}else if (numero3 > numero1 && numero3 > numero2) {
			System.out.println(numero3);
		}
	}

}
