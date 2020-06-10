package coche;

public class vehiculo {
	private int ruedas;
	private int velocidad;

	public vehiculo(int ruedas, int velocidad) {
		this.ruedas = ruedas;
		this.velocidad = velocidad;
	}
	public vehiculo() {
		this (4,0);
	}
	public void arrancar() {
		System.out.println("Rummmm");
	}
	public void parar() {
		System.out.println("pufff");
	}
}
