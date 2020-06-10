
public class PruebaCalculadora {
	private int numl;
	private int num2;

	public PruebaCalculadora(int a, int b) {
		numl = a;
		num2 = b;
	}

	public int suma() {
		return numl + num2;
	}

	public int resta() {
		return numl - num2;
	}

	public int multiplica() {
		return numl * num2;
	}

	public int divide() {
		return numl / num2;
	}
}
