
import java.util.LinkedList;
import java.util.PriorityQueue;

public class PriorityQueue1 {
	public static void main(String[] args) {
		LinkedList<String> miColeccion = new LinkedList<String>();
		miColeccion.add("Collection");
		miColeccion.add("List");
		miColeccion.add("Set");
		miColeccion.add("SortedSet");
		miColeccion.add("Map");
		String aux = miColeccion.poll();
		miColeccion.add(aux);
//		System.out.println("Primer elemento:");
//		System.out.println(miColeccion.poll());
//		System.out.println("Resto de elementos:");
		for (String elto : miColeccion) {
			System.out.println(elto);
		}
	}

}
