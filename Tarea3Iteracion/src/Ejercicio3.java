
public class Ejercicio3 {
	public static void main(String[] args) {
		int impares = 0;
		int pares = 0;
		int i;
		for (i = 100; i <= 200; i++) {
			if (i % 2 == 0) {
				pares = pares + i;
			} else if (i % 2 != 0) {
				impares = impares + i;
			}
		}
		System.out.println(pares);
		System.out.println(impares);
		
	}
}
