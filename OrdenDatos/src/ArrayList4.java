import java.util.ArrayList;
import java.util.Collections;

public class ArrayList4 {

	public static void main(String[] args) {
		ArrayList<String> miColeccion = new ArrayList<String>();
		miColeccion.add("Collection");
		miColeccion.add("List");
		miColeccion.add("Set");
		miColeccion.add("SortedSet");
		miColeccion.add("Map");

		Collections.rotate(miColeccion, - 1);
//		String aux = miColeccion.get(0);
//		miColeccion.remove(0);
//		miColeccion.add(aux);
		
//		miColeccion.remove(0);
//		String aux = miColeccion.get(0);		
//		miColeccion.add(miColeccion.size(), aux);
		
		// Para imprimir la lista tras la rotaci�n, recuerda las operaciones remove y
		// add
		// El resultado deber�a ser: List, Set, SortedSet, Map y Collection
		for (String elto : miColeccion) {
			System.out.println(elto);

		}
	}
}
