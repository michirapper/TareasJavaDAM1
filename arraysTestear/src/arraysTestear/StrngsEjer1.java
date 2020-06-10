package arraysTestear;

import java.util.Scanner;

public class StrngsEjer1 {

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter username: ");
		String input = sc.next();
		if(input.equalsIgnoreCase("admin")) {
			System.out.println("Ususario Aceptado");
		}else {
			System.out.println("Usuario Incorrecto");
		}
	}
}
