package arraysTestear;

public class ArrayCopyy {
	public static void main(String[] args) {
		int[] primes = { 1, 2, 3, 5, 7, 9, 11, 13, 17, 21 };
		int[] c = new int[primes.length];
		System.arraycopy(primes, 1, c, 3, 6);  // copy array primes to array c

		for (int i = 0; i < primes.length; i++) {
			System.out.println(primes[i]);
		}
		System.out.println();
		System.out.println();
		for (int i = 0; i < c.length; i++) {
			System.out.println(c[i]);
		}
	}
}
