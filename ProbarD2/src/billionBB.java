
public class billionBB {
	public static void main(String[] args) {
		double balance = 100;
		int year = 0;
		while (balance < 1000000000000L) {
			double interest = balance * .01;
			balance = balance + interest;
			year++;
		}
		System.out.println("It will take " + year + " years.");
	}
}
