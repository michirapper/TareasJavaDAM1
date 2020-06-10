
public class rebajas {
	 static double precioNoRebajado ;
	 static double precioRebajado;
	 static double porcentaje;
	 public String ropa;
	
	public static void descubrePorcentaje(double precioNoRebajado, double precioRebajado) {
		porcentaje = (100 * precioRebajado) / precioNoRebajado ;
		System.out.println(porcentaje);
		
	}

}
