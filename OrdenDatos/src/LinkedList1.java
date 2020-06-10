import java.util.LinkedList;
import java.util.Collection;
import java.util.Iterator;

public class LinkedList1 {
	public static void main(String[] args) {
		LinkedList<String> miColeccion = new LinkedList<String>();
		miColeccion.add("Collection");
		miColeccion.add("List");
		miColeccion.add("Set");
		miColeccion.add("SortedSet");
		miColeccion.add("Map");
		String elto;
		Iterator<String> paseador = miColeccion.iterator();
		while (paseador.hasNext()) {
			elto = paseador.next();
			if (elto.charAt(0) == 'S')
				paseador.remove();
			else
				System.out.println(elto);
		}
	}
}
