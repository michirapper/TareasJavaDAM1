package arraysTestear;

import java.util.*;

public class ArrayOrientadoObjetos {
	public static void main(String[] args) {
		// int[] numeros = {1,0,5,8,0,1,0};
		// Util ejemplo = new Util();
		// ArrayUtil ejemplo = new ArrayUtil();
		// Util[] varios = new Util [5];
		// varios[0]= new Util();
		// varios[1]= new Util();
		// varios[2]= new Util();
		// varios[3]= new Util();
		// varios[4]= new Util();
		// System.out.println(varios[3].getCount(new int[]{1,0,5,8,0,1,0}));

		// System.out.println(ejemplo.inReverse(new int[] {1, 2, 3, 4}));

		// int [] numeros = new int [] {1,3,90,5,7};
		Integer[] numeros = { 1, 3, 90, 5, 7 };

		Arrays.sort(numeros);

		// Sorting integer Array in descending order
		
		Arrays.sort(numeros, Collections.reverseOrder());

		// Arrays.sort(numeros, Collections.reverseOrder());
		//System.out.println(Arrays.toString(numeros));
		System.out.println(Arrays.toString(numeros));
		
		System.out.println(Arrays.binarySearch(numeros, 1));

	}
}
