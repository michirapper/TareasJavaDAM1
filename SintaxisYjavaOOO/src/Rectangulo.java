
class Rectangulo {
	private int ancho = 0;
	private int alto = 0;

	public Rectangulo(int ancho, int alto) {
		this.ancho = ancho;
		this.alto = alto;
	}

//	public Rectangulo(int an, int alto) {
//		ancho = an; // atributo ancho sin referencia
//		this.alto = alto; // atributo alto con referencia para evitar ambigüedad
//	}

//	public int getAncho() {
//		return this.ancho;// devuelvo el atrituto con this
//	}

	public int getAncho() {
		return ancho;
	}

	public void setAncho(int ancho) {
		this.ancho = ancho;
	}

	public void setRectangulo(int ancho, int alto) {
		// Se necesita para diferenciar entre atrubuto y parámetro
		this.ancho = ancho;
		this.alto = alto;
	}

	public Rectangulo getRectangulo() {
		return this; // Devuelve una referencia al objeto completo
	}
}
