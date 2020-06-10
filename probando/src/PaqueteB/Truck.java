package PaqueteB;

import PaqueteA.coche;
import PaqueteA.PaqueteC.bike;

public class Truck {
	public static void main(String[] args) {
		coche miCoche = new coche(); // No se puede, por que no se conocen, a no ser que se haga un import
		bike miBici = new bike();
	}
}
