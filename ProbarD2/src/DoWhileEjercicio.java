
import java.util.Scanner;

public class DoWhileEjercicio {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int value; // A user entered value between 0 and 100 inclusive.
		do {
			System.out.print("Enter an integer [0-100]: ");
			value = in.nextInt();
		} while (value > 100 || value > 0);
		System.out.println("Thank you for entering " + value);
	}
}
