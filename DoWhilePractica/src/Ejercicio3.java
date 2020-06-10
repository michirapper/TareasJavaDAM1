import java.util.Scanner;

public class Ejercicio3 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int num = 0;
		int negativo= 0;
		int count = 0;			
		 while (count != 10) {
			num = in.nextInt();
			if(num<0) {
				negativo = 1;
			}
			count++;
		}
		if(negativo != 1)
			System.out.println("NO");
		else
			System.out.println("SI");
	}
}
