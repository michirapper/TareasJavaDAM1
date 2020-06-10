//import java.util.Scanner;
//
//public class dowhileIteracion {
//	public static void main(String[] args) {
//		Scanner in = new Scanner(System.in);
//		int value = 100;
//		while (value >= 100) {
//			System.out.println("Enter a value <100: ");
//			value = in.nextInt();
//		}
//	}
//}

import java.util.Scanner;

public class WhileIteracion {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter a value <100: ");
		int value = in.nextInt();
		while (value >= 100) {
			System.out.println("Enter a value <100: ");
			value = in.nextInt();
		}
	}
}
