package arraysTestear;
import java.util.Scanner;

public class arrayNormal {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int [] sueldos;
		sueldos = new int[5];
		sueldos[0] = 1200;
		sueldos[1] = 750;
		sueldos[2] = 820;
		sueldos[3] = 550;
		sueldos[4] = 490;
		for (int i = 0; i < sueldos.length; i++) {
			System.out.println(sueldos [i]);
		}
		
		
		//int [] sueldos2 = {1200, 750, 820, 550, 490};
		//int [] sueldos3 = {sc.nextInt(),sc.nextInt() };
		

	}
}
