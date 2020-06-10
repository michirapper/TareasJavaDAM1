package arraysTestear;

public class ArraysOrdenarVectores3_1 {
public static void main(String[] args) {
	int[] listado1 = { 1, 2, 3, 4, 5, 6 ,6};
	boolean hayRepetidos = false;
	for (int i = 0; i < listado1.length; i++) {
		for (int j = 0; j < listado1.length; j++) {
			if(i!=j) {
				if(listado1[i] == listado1[j]) {
					hayRepetidos = true;
				}
			}
		}
	}
	System.out.println(hayRepetidos);
}
}
