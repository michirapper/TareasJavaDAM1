
import java.util.ArrayList;
import java.util.Collections;

public class Envoltorio1 {
	public static void main(String[] args) {
		ArrayList<String> miColeccion = new ArrayList<String>();
		miColeccion.add("Collection");
		miColeccion.add("List");
		miColeccion.add("Set");
		miColeccion.add("SortedSet");
		miColeccion.add("Map");
		Collections.sort(miColeccion);
		for (String elto : miColeccion) {
			System.out.println(elto);
		}
	}
}
