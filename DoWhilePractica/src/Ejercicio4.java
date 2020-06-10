import java.util.Scanner;

public class Ejercicio4 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int num = 0;
		int diez= 0;			
		do {
			num = in.nextInt();
			if(num==10) {
				diez = 1;
			}
		} while (num!= -1);
		if(diez != 1)
			System.out.println("NO");
		else
			System.out.println("SI");
	}
}
