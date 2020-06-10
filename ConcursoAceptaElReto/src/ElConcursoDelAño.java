import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public class ElConcursoDelAño {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int casosPrueba = sc.nextInt();
		int i = 0;
		while (i < casosPrueba) {
			int alumnos = sc.nextInt();
			HashSet<String> nombre = new HashSet<String>();
			for (int j = 0; j < alumnos; j++) {
				String x = sc.nextLine();
				nombre.add(x);
			}
			Iterator<String> z = nombre.iterator();
			while (z.hasNext())
				System.out.println(z.next());
		}
		i++;
		sc.close();
	}

}
