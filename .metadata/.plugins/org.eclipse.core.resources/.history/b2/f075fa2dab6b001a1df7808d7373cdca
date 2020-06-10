
public class Main {

	public static void main(String[] args) {
		Controlador miControlador = new Controlador();
		Modelo miModelo = new Modelo();
		Vista miVista = new Vista();
		Bienvenida miBienvenida = new Bienvenida();
		
		miControlador.setModelo(miModelo);
		miControlador.setVista(miVista);
		miControlador.setBienvenida(miBienvenida);
		miModelo.setVista(miVista);
		miVista.setControlador(miControlador);
		miVista.setModelo(miModelo);
		
		miVista.setVisible(true);
	}

}
