
public class Modelo {
	private Vista miVista;
	private final String usr;
	private final String pwd;
	private String resultado;
	private int fallos;

	public Modelo() {
		this.usr = "admin";
		this.pwd = "admin";
		fallos = 0;
	}

	public void setVista(Vista miVista) {
		this.miVista = miVista;
	}

	public void login(String usr, String pwd) {
		if (this.usr.equals(usr) && this.pwd.equals(pwd)) {
			resultado = "Correcto";
			fallos = 0;
		} else {
			fallos++;
			if (fallos == 3) {
				resultado = "Cerrar";
			} else
				resultado = "Incorrecto";
		}
		miVista.actualizar();
	}

	public String getResultado() {
		return this.resultado;
	}

}
