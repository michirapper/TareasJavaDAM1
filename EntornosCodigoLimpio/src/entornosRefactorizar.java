
public class entornosRefactorizar {
	private static final float EUROS_PESETAS_CHANGE_RATE = 166.386f;

	public float conv(float euros) {
		float pesetas = euros * EUROS_PESETAS_CHANGE_RATE;
		return pesetas;
	}
}
