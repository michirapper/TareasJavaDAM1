
import java.util.Stack;

public class Stack1 {
	public static void main(String[] args) {
		Stack<String> miColeccion = new Stack<String>();
		miColeccion.push("Collection");
		miColeccion.push("List");
		miColeccion.push("Set");
		miColeccion.push("SortedSet");
		miColeccion.push("Map");
		while (!miColeccion.isEmpty()) {
			//String quitar = miColeccion.pop();
			
			System.out.println(miColeccion.pop());
		}
	}

}
