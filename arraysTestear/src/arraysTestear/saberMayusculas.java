package arraysTestear;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class saberMayusculas {
	public static void main(String[] args) {
		Pattern pattern = Pattern.compile("^[A-Z]");
		Scanner sc = new Scanner(System.in); 
		System.out.println("meter palabra");

		String palabra = sc.nextLine();
		StringBuilder textoSB = new StringBuilder(palabra);
		Matcher mather = pattern.matcher(textoSB);
		if (mather.find() == true) {
			System.out.println("Hay mayusculas");
		} else {
			System.out.println("No hay mayusculas");
		}
	}
}