//import java.util.Scanner;
//
//public class DoWhileIteracion {
//	public static void main(String[] args) {
//		Scanner in = new Scanner(System.in);
//		int value;
//		do {
//			System.out.println("Enter a value <100: ");
//			value = in.nextInt();
//		} while (value >= 100);
//		System.out.println("Thank you");
//	}
//}
//public class DoWhileIteracion {
//	public static void main(String[] args) {
//		int x = 0;
//		do {
//		System.out.println(x);
//		x++;
//		} while (x<10); 
//	}
//}

import java.util.Scanner;

public class DoWhileIteracion {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int count = 0;
		int value = 0;
		int sumaDeTodo;
		int sumaAnterior;
		do {
			System.out.println("Enter a value <100: ");
			sumaAnterior = value;
			value = in.nextInt();
			sumaDeTodo = sumaAnterior + value;
			count++;
		} while (value >= 100 || value != 0);
		System.out.println(sumaDeTodo );
	}
}
