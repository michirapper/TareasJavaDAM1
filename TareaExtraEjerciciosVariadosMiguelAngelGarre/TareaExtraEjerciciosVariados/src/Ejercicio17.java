
import java.util.Scanner;

public class Ejercicio17 {
	public static void main(String[] args) {
		int contador = 0;
		int entre100300 = 0;
		int mayor300 = 0;

		Scanner sc = new Scanner(System.in);

		while (contador <= 4) {
			int sueldo = sc.nextInt();
			if(sueldo >= 100 && sueldo <=300) {
				entre100300++;
			}else if(sueldo>300) {
				mayor300++;
			}
			contador++;
		}

		System.out.println("Numeros mayor a 300 " + mayor300);
		System.out.println("Numeros entre 100 y 300 " + entre100300);
	}
}
