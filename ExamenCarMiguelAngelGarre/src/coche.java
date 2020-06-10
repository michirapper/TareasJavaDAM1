
public class coche {
	Integer cilindrada;
	String color;
	Double precio;
	boolean isArrancado;

	void arrancar() {
		if (isArrancado != true) {
			isArrancado = true;
			System.out.println("¡¡¡Brrrrrrr!!! El coche acaba de arrancar.");
		} else {
			System.out.println("¡¡¡Kisch, kishch!!! El coche ya está arrancado.");
		}
	}

	void verCoche() {
		System.out.println("Este coche es de color " + color + " tiene una cilindrada de " + cilindrada + " y cuesta "
				+ precio + " euros.");
		if (isArrancado == true) {
			System.out.println("Ahora mismo está arrancado.");
		} else {
			System.out.println("Ahora mismo está parado.");
		}
	}

	void pararCoche() {
		if (isArrancado == true) {
			System.out.println("Paramos el coche suavecito");
		} else {
			System.out.println("El coche esta parado en el arcen");
		}
	}

	void frenarCoche() {
		if (isArrancado == true) {
			System.out.println("Frenamos el coche con un derrape");
		} else {
			System.out.println("El coche esta parado en el arcen");
		}
	}

	void acelerarCoche() {
		if (isArrancado == true) {
			System.out.println("Aceleramos el coche a 200km/h");
		} else {
			System.out.println("El coche primero tiene que estar arrancado");
		}
	}

	public static void main(String args[]) {
		coche c;
		c = new coche();
		c.cilindrada = 1800;
		c.color = "plata";
		c.precio = 25000.0;
		System.out.println("¿Qué coche es este?");
		c.verCoche();
		System.out.println("Vamos a arrancar el coche");
		c.arrancar();
		System.out.println("¿Qué coche es este?");
		c.verCoche();
		System.out.println("Vamos a arrancar el coche");
		c.arrancar();
		System.out.println("Vamos a parar el coche");
		c.pararCoche();
		System.out.println("Vamos a arrancar el coche");
		c.arrancar();
		System.out.println("Vamos a frenar el coche");
		c.frenarCoche();
		System.out.println("Vamos a arrancar el coche");
		c.arrancar();
		System.out.println("Vamos a acelear el coche");
		c.acelerarCoche();
	}
}
