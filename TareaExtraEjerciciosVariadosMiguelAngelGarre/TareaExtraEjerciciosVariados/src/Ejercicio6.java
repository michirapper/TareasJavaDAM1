import java.util.Scanner;

public class Ejercicio6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		if (num1 >= 1000 || num1 < 0) {
			System.out.println("Error solo numeros positivos de hasta 3 cifras");
		}else if(num1<10){
			System.out.println("Tiene 1 cifra");
			
		}else if(num1<100) {
			System.out.println("Tiene 2 cifras");
		}else if(num1<1000)  {
			System.out.println("Tiene 3 cifras");
		}

	}
}
