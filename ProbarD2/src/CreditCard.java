// TODO: Implement the sumCertainDigits method.
public class CreditCard {
	private long cardNumber;

	public CreditCard(long cardNumber) {
		this.cardNumber = cardNumber;
	}

	public boolean isCorrect() {
		int posicion = 1;
		long n = cardNumber;
		int sum = 0;
		while (n > 0) {
			int digit = (int) (n % 10);
			if (posicion % 2 == 1) {
				sum = sum + digit;
			} else if (digit < 5) {
				sum = sum + 2 * digit;
			} else {
				sum = sum + 2 * digit - 9;
			}

			posicion++;

			n = n / 10;
		}
		return sum % 10 == 0;
		
	}

	public static void main(String[] args) {
		CreditCard miTarjeta = new CreditCard(5583692465928964L);
		System.out.println("La tarjeta es valida " + miTarjeta.isCorrect());
		
	}
}
