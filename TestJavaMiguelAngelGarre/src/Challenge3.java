	import java.util.Scanner;
	class Challenge3 {
	public static void main(String args[]) {
	Scanner scanner = new Scanner(System.in);
	System.out.println("Enter a number:");
	double dob = scanner.nextDouble();
	System.out.println(Math.round((Math.ceil(dob))));
	System.out.println(Math.round(Math.floor(dob)));
 
	}
}
