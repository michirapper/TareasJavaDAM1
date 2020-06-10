
public class temperatura {
	double celsisusToFarenheit;
	double farenheitToCelsius;
	
	public static void setCelsiusToFarenheit(double celsisusToFarenheit) {
		double grado = celsisusToFarenheit;
		double F = 1.8 * grado +32;
		System.out.println(F);
	}
	public static void setFarenheitToCelsius(double FarenheitTocelsius) {
			
		double grado = FarenheitTocelsius;
		double C= (grado-32) / 1.8;
		System.out.println(C);
		
	}	
	public static void main(String[] args) {
		
		setCelsiusToFarenheit(0);
		setFarenheitToCelsius(32);
	}

}
