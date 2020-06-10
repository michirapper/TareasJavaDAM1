package coche;

public class coche extends vehiculo {
	private int combustible;

	public coche(int ruedas, int velocidad, int combustible) {
		super(ruedas, velocidad);
		this.combustible = combustible;
	}
	public coche() {
		this(4, 0, 1);
	}
	public void pasarITV() {
		System.out.println("ITV Ok");
	}

}
