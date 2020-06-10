package arraysTestear;

public class Util {
	public int getCount(int[] values) {
		int count = 0;
		for (int current : values) {
			if (current == 0) {
				count++;
			}
		}
		return count;
	}
}
