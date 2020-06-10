import java.util.Scanner;
import java.util.Stack;

public class AceptaElReto140 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//int numeroNumeros = sc.nextInt();
		 int numeroNumeros = 2201;

		int NuevoNumeroNumeros = 90;
		String mas = " ";
		Stack<String> stack = new Stack<String>();
		while (numeroNumeros > 0) {
			NuevoNumeroNumeros = numeroNumeros % 10;
			stack.push(Integer.toString(NuevoNumeroNumeros));
			numeroNumeros = numeroNumeros / 10;
		}
		Stack<String> reverse = new Stack<String>();
		while (!stack.isEmpty()) {
			String value = stack.pop();
			reverse.push(value);
		}
//			System.out.println(stack.size());
//		for (int i = 0; i <= stack.size() ; i++) {
//			System.out.println(i);
//			if (!(i == stack.size())) {
//				mas = " + ";
//			} else {
//				mas = " =";
//			}
//			System.out.print(stack + mas);
//		}
		int suma = 0;
		for (String elto : reverse) {
			String lastnumber = reverse.lastElement();
			if (!elto.equals(lastnumber)) {
				mas = " + ";
			} else {
				mas = " = ";
			}
			suma += Integer.parseInt(elto);
			System.out.print(elto + mas);
		}
		System.out.print(suma);
		sc.close();
	}
}
