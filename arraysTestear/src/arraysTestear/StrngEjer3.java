package arraysTestear;

import java.util.Scanner;

public class StrngEjer3 {

	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a string:");
		String s = scanner.next();
		if (s.length() <= 3) {
			s = s.toUpperCase();
		} else {
			String aux = s.substring(s.length() - 3).toUpperCase();
			s = s.substring(0, s.length() - 3) + aux;
		}
		// String[] parts = s.split(s, s.length() - 3);
		// String caracteresMayusculas = s.substring(s.length() - 3);
		System.out.println(s);

	}
}
