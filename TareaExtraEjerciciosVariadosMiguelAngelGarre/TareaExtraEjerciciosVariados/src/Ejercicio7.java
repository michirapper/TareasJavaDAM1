import java.util.Scanner;

public class Ejercicio7 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Numero de Preguntas");
		int num1 = sc.nextInt();
		System.out.println("Numero de respuestas correctas");
		int num2 = sc.nextInt();
		if ((num2 * 100) / num1 >= 90) {
			System.out.println("Nivel Maximo");
		} else if ((num2 * 100) / num1 >= 75 && (num2 * 100) / num1 < 90) {
			System.out.println("Nivel Medio");
		} else if ((num2 * 100) / num1 >= 50 && (num2 * 100) / num1 < 75) {
			System.out.println("Nivel Regular");
		} else if ((num2 * 100) / num1 < 50) {
			System.out.println("Fuera de nivel");
		} else {
			System.out.println("Error de Porcentaje");
		}
	}
}
