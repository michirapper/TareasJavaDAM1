
public class SumaParesImpares {
	public static void main(String[] args) {
		int impares = 0;
		int pares = 0;
		int i;
		for (i = 0; i <= 50; i++) {
			if (i % 2 == 0) {
				pares = pares + i;
			}else if(i % 2 != 0) {
				impares = impares + i;
			}
		}
		System.out.println("La suma de los impares es " + impares);
		System.out.println("La suma de los pares es " + pares);
	}
}
