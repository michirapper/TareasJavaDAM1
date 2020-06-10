package coche;

public class test {
	public static void main(String[] args) {
		vehiculo miCoche = new coche();
		miCoche.arrancar();
		((coche) miCoche).pasarITV();
		miCoche.parar();		
	}
}
