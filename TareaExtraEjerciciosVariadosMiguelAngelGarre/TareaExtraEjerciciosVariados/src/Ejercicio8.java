import java.util.Scanner;

public class Ejercicio8 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Dia");
		int num1 = sc.nextInt();
		System.out.println("Mes");
		int num2 = sc.nextInt();
		if(num1 == 25 && num2 == 12) {
			System.out.println("Es Navidad");
		}else {
			System.out.println("No es Navidad");
		}
	}
}
