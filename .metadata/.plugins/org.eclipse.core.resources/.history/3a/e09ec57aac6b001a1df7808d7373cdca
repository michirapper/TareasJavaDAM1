
public class Controlador {
	private Modelo miModelo;
	private Vista miVista;
	private Bienvenida miBienvenida;
	private Registro miRegistro;
	
	public void setBienvenida(Bienvenida miBienvenida) {
		this.miBienvenida = miBienvenida;
	}
	public void setRegistro(Registro miRegistro) {
		this.miRegistro = miRegistro;
	}
	public void setModelo(Modelo miModelo) {
		this.miModelo = miModelo;
	}
	public void setVista(Vista miVista) {
		this.miVista = miVista;
	}
	public void login() {
		String usr = miVista.getUsr();
		String pwd = miVista.getPwd();
		miModelo.login(usr,pwd);
		
	}
	public void registro() {
		miVista.setVisible(false);
		miRegistro.setVisible(true);
	}
	public void bienvenida() {
		miVista.setVisible(false);
		miBienvenida.setVisible(true);
	}
	
}
