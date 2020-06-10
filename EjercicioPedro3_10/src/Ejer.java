
public class Ejer {
	private char convierteLetra(int letra) {
		int rango = 'Z' - 'A' + 1;
		int siguiente = (letra - 'A') + 27;
		int siguienteCircular = siguiente % rango;
		char res = (char) (siguienteCircular + 'A');
		return res;
	}

	private String conviertePalabra(String palabra) {
		String res = "";
		for (int i = 0; i < palabra.length(); i++) {
			res += convierteLetra(palabra.charAt(i));
		}
		return res;
	}

	public static void main(String[] args) {
		String frase = "QUERIDOS REYES MAGOS HE SIDO MUY PERO QUE MUY BUENO Y QUIERO QUE ME TRAIGAIS UNA ZAMBOMBA";
		String fraseCodificada = "";
		Ejer programa = new Ejer();
		String[] palabras = frase.split(" ");
		for (int i = 0; i < palabras.length; i++) {
			fraseCodificada += programa.conviertePalabra(palabras[i]);
			if (i < palabras.length - 1) {
				fraseCodificada += " ";
			}
		}
		System.out.println(fraseCodificada);
	}
}
