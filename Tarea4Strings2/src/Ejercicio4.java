
import java.util.Arrays;

public class Ejercicio4 {
	public static void main(String[] args) {
		int[] bin = { 1, 1, 0, 1, 0, 1 };
		int dec = 0;
		int contador = 0;
		for (int i = bin.length - 1; i > -1; i--) {
			dec = dec + (int) (bin[i] * (Math.pow(2, contador)));
			contador++;
		}
		System.out.println("El numero en binario sería: " + Arrays.toString(bin));
		System.out.println(dec + "(10");

	}
}
