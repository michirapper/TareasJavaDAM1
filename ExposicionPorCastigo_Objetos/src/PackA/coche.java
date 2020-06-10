
class coche {
	private int velocidad;

	public coche() {
		 velocidad = 10;
	}
	public int getVelocidad() {
		System.out.println(velocidad);
		return velocidad; 
		
	}
	public void acelera (int mas) {
		velocidad = mas + velocidad ; 
	}
	public void frena (int menos) {
		velocidad = velocidad - menos;
	}
	
}
