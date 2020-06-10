	import java.util.Scanner;
public class Equals {

	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		boolean equal = false;
		System.out.println("Enter the 1st number:");
		int num1 = scanner.nextInt();
		System.out.println("Enter the 2nd number:");
		int num2 = scanner.nextInt();
		
	if (num1 == num2) {
			equal = true;
		} else if (num1 == (-num2)){
		equal = true;
} else {
			equal = false;
}
		
		
		System.out.println("Result is:" + equal);
	}
}
