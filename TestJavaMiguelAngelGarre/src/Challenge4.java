import java.util.Scanner;
public class Challenge4 {
public static double number, answer;
public static void calculateSquare(double number) {
	System.out.println(Math.round(Math.sqrt(number))); 
}
public static void main(String[] args) {
Challenge4 challenge = new Challenge4();
final Scanner sc = new Scanner(System.in);
System.out.print("Enter a number: ");
number = sc.nextDouble();
challenge.calculateSquare(number);
}
}