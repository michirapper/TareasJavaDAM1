
public class Ejercicio3 {
	public static void main(String[] args) {
		// Ejemplos: el primero debería devolver que Hay Escalera mientras que el
		// segundo no
		int[] cartas1 = { 3, 4, 5, 6, 7 };
		int[] cartas2 = { 3, 5, 6, 7, 8 };
		boolean esEscalera = true;
		// Implementa un algoritmo que sea capaz de averiguar si hay o no escalera en el
		// array de cartas
		// Piensa en el juego del póker, en el que hay escalera si las cartas son
		// consecutivas
		// Almacena tu resultado en la variable esEscalera para que funcione el mensaje
		// final
		// Mensaje final

		for (int i = 0; i < cartas2.length - 1; i++) {

			if (cartas2[i] + 1 != cartas2[i + 1]) {
				esEscalera = false;
			}
		}

		System.out.println(esEscalera ? "Hay Escalera" : "No hay Escalera");
	}
}
