import java.util.Scanner;

public class Ejercicio14 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int num3 = sc.nextInt();
		if(num1 > num2 && num1 > num3) {
			System.out.println("El numero mayor es " + num1);
		}else if(num2 > num1 && num2 > num3) {
			System.out.println("El numero mayor es " + num2);
		}else if(num3 > num2 && num3 > num1) {
			System.out.println("El numero mayor es " + num3);
		}
		
		if(num1 < num2 && num1 < num3) {
			System.out.println("El numero menor es " + num1);
		}else if(num2 < num1 && num2 < num3) {
			System.out.println("El numero menor es " + num2);
		}else if(num3 < num2 && num3 < num1) {
			System.out.println("El numero menor es " + num3);
		}
	}
}
