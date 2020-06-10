import java.util.Scanner;

public class AsteriscosRepaso2 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int count = 0;
		String asterisco = "*";
		while (count < 10) {
			int j = 0;
			while (j < count) {
				System.out.print("*");
				j++;
			}
			count++;
			System.out.println("");
		}
	}
}
