
import java.util.ArrayList;
import java.util.Collections;

public class Envoltorio2 {
	public static void main(String[] args) {
		ArrayList<String> miColeccion = new ArrayList<String>();
		miColeccion.add("Collection");
		miColeccion.add("List");
		miColeccion.add("Set");
		miColeccion.add("SortedSet");
		miColeccion.add("Map");
		System.out.println("Lista inicial: ");
		for (String elto : miColeccion) {
			System.out.print(elto + " ");
		}
		System.out.println();
		Collections.rotate(miColeccion, 3);      
		System.out.println("Lista Final: ");
		for (String elto : miColeccion) {
			System.out.print(elto + " ");
		}

	}
}
