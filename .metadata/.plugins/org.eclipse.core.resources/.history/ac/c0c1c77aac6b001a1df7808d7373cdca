
public class Main {

	public static void main(String[] args) {
		Controlador miControlador = new Controlador();
		Modelo miModelo = new Modelo();
		Vista miVista = new Vista();
		Registro miRegistro = new Registro();
		Bienvenida miBienvenida = new Bienvenida();
		
		miControlador.setModelo(miModelo);
		miControlador.setVista(miVista);
		miControlador.setBienvenida(miBienvenida);
		miControlador.setRegistro(miRegistro);
		miModelo.setVista(miVista);
		miVista.setControlador(miControlador);
		miVista.setModelo(miModelo);		
		miVista.setVisible(true);
		
	}

}
