public class Ejercicio2 {
	public static void main(String[] args) {
		int value = 10;
		int suma = 0;
		int multiplicacion = 1;
		for (int i = 1; i <= value; i++) {
			 suma = i + suma;
			 multiplicacion = multiplicacion*i;
		}
		System.out.println(suma);
		System.out.println(multiplicacion);
	}
}
