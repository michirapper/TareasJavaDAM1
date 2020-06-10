package arraysTestear;

public class ForeachPares {
	public static void main(String[] args) {
		boolean respuesta = true;
		Integer [] numeros = { 10, 80, 66, 8, 4, 2 };

		for (Integer num : numeros) {
			if (num%2!=0) {
				respuesta = false;
			}

		}
		if (respuesta) {
			System.out.println("si");
		} else {
			System.out.println("no");
		}
	}
}
