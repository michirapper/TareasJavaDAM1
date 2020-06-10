import java.util.Scanner;

public class Repaso1 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int count = 0;
		
		String asterisco = "*";
		 while (count < 5) {
			 int j = 0;
			 while(j<5) {
				 System.out.print("*");
				 j++;
			 }
			count++;
			System.out.println("");
		}
	}
}
