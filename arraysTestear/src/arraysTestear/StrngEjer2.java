package arraysTestear;

import java.util.Scanner;

public class StrngEjer2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the URL :");
		String s = sc.nextLine();
		StrngEjer2 obj = new StrngEjer2();
		s = obj.decodeURL(s);
		System.out.print("Decoded URL is :" + s);
	}

	public String decodeURL(String s) {
		
		s = s.replaceAll("%20"," " );
		s = s.replaceAll("%3A","?" );
		s = s.replaceAll("%3D","." );
		return s;
		
	//	return s.replaceAll("%20"," " ).replaceAll("%3A","?" ).replaceAll("%3D","." );
		
	}
	// {write your code here
	// }
}
