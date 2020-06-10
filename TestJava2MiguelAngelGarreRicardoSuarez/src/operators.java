import java.util.Scanner;
public class operators {
		public static void main(String[] args) {
			System.out.println("Enter a temperature in Celsius: ");
			Scanner scanCelsius = new Scanner(System.in);
			double Fahrenheit = 0;

			double Celsius = scanCelsius.nextDouble();
			Fahrenheit = (1.8 * Celsius) + 32;
			
			System.out.println("The temperature in Fahrenheit is: " + Fahrenheit);
		}
}
