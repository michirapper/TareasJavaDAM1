
public class ClaseB extends ClaseA{
	private int atributoB;
	public void metodoB() {
		System.out.println("Esto es el metodo de B");
	}
	public void metodoA() {
		System.out.println("Soy aka A - redefinido");
	}
	public void metodoABIS() {
		super.metodoA();
	}
}
