package arraysTestear;
import java.util.Scanner;
public class HayMayusculasBucles {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("meter palabra");
		String palabra = sc.nextLine();
		boolean res = false;
		for (int i = 0; i < palabra.length(); i++) {
			if(Character.isUpperCase(palabra.charAt(i))) {
				res=true;
			}			
		}
		System.out.println(res?"Hay mayusculas":"No hay mayusculas");
	}
}
