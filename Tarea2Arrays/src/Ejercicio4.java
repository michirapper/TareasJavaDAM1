import java.util.Scanner;

public class Ejercicio4 {
	public static int countClumps(int[] nums) {
		/// {Write you code here
		/// }
		int clumps = 0;
		boolean isClump = false;
		for (int i = 0; i < nums.length - 1; i++) {
			if (isClump) {
				if (nums[i] != nums[i + 1])
					isClump = false;
			} else if (nums[i] == nums[i + 1]) {
				isClump = true;
				clumps++;
			}
		}
		return clumps;
	}

	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		int[] nums = new int[5];
		System.out.println("Enter values into the array:");
		for (int i = 0; i < nums.length; i++)
			nums[i] = scanner.nextInt();
		System.out.println("Clumps:" + countClumps(nums));
	}
}
