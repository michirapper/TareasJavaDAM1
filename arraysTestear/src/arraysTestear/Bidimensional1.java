package arraysTestear;

public class Bidimensional1 {
	public static void main(String[] args) {
		int j;
		double[][] prices1 = new double[3][2];
		double[][] prices2 = { { 3.979, 4.099 }, { 4.199, 4.299 }, { 4.599, 4.499 }, };
		
		for (int i = 0; i < prices2.length; i++) {
			for ( j = 0; j < prices2[0].length; j++) {
			System.out.printf("%10.3f", prices2[i][j]);
			}
			System.out.println();
		}

	}

}
