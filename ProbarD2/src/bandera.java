import java.awt.Color;
import java.util.Scanner;

public class bandera {
	static Scanner in = new Scanner(System.in);
	private static int width;
	private static int height;

	public static boolean isInMiddle(int x, int y) {
		boolean xInMiddle = x >= width / 3 && x < width * 2 / 3;

		boolean yInMiddle = y >= height / 3 && y < height * 2 / 3;
		return xInMiddle && yInMiddle;
	}

	public static Color getColorAt(int x, int y) {
		Color c;
		if (isInMiddle(x, y)) {
			c = Color.BLUE;
		} else {
			c = Color.WHITE;
		}
		return c;

	}

	public static void main(String[] args) {
		if (isInMiddle(4, 5))
			System.out.println("Esta en el medio");
		else
			System.out.println("NO esta en el medio");
	}
}
