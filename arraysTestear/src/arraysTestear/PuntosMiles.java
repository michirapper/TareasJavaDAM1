package arraysTestear;

public class PuntosMiles {
	public static void main(String[] args) {
		String numeros = "123456789";
		numeros = separarMiles(numeros);
		System.out.println(numeros);
	}

	public static String separarMiles(String numeros) {
		StringBuilder aux = new StringBuilder(numeros);
		aux.reverse();
		for (int i = 3; i < aux.length(); i+=4) {
			aux.insert(i, '.');
		}
		aux.reverse();
		
		return aux.toString();

	}
}
