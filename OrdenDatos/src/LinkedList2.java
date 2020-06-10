
import java.util.Iterator;
import java.util.LinkedList;

public class LinkedList2 {
	public static void main(String[] args) {
		LinkedList<String> miColeccion = new LinkedList<String>();
		miColeccion.add("Collection");
		miColeccion.add("List");
		miColeccion.add("Set");
		miColeccion.add("SortedSet");
		miColeccion.add("Map");
		miColeccion.add("List");
		//miColeccion.remove("List");
		miColeccion.removeIf(p -> p.contains("List"));
		for (String elto : miColeccion) {
			System.out.println(elto);
		}
	}
}
