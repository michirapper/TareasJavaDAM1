
public class main {
	public static void main(String[] args) {
		pajaro c ;
		coche e ;
		rebajas r;
		
		c = new pajaro();
		e = new  coche();
		r = new rebajas();
		
		c.setEdad(15);
		c.printEdad();		
		
		e.getVelocidad();
		e.acelera(5);
		e.getVelocidad();
		e.frena(8);
		e.getVelocidad();
		
		r.descubrePorcentaje(100, 50);
	}
}
