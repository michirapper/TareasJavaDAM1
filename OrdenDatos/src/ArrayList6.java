
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class ArrayList6 {
	public static void main(String[] args) {
		ArrayList<String> miColeccion = new ArrayList<String>();
		miColeccion.add("Collection");
		miColeccion.add("List");
		miColeccion.add("Set");
		miColeccion.add("SortedSet");
		miColeccion.add("Map");
		String elto;
		
		
// miColeccion.removeIf(p -> p.startsWith("S"));

//	for (int i = 0; i < miColeccion.size(); i++) {
//		if (miColeccion.get(i).substring(0,1).contentEquals("S")) {
//			miColeccion.remove(miColeccion.get(i));
//			i--;
//		}
//		
//	}

		Iterator<String> paseador = miColeccion.iterator();
		while (paseador.hasNext()) {
			elto = paseador.next();
			if (elto.startsWith("S")) {
				paseador.remove();
			}
		}
		System.out.println(miColeccion.toString());
	}

}
