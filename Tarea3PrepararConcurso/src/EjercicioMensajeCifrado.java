import java.util.*;

public class EjercicioMensajeCifrado {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<String> cumple = new ArrayList<String>();
		String num = sc.nextLine();
		String str[] = num.split(" ");
		cumple = Arrays.asList(str);
		Collections.sort(cumple);
		Set<String> hashSet = new HashSet<String>(cumple);
		if (!(hashSet.size() == cumple.size())) {
			System.out.println("Hay cumpleaños repetidos");
		} else {
			System.out.println("No hay cumpleaños repetidos");
		}
		sc.close();
	}

}