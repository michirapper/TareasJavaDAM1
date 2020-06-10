
public class ayuntamiento {
	public static void main(String[] args) {
		String statement = "No comment";
		if (statement == null) {
			System.out.println("The reporter didnt ask nothing");
		}
		else if (statement.equals("No comment")) {
			System.out.println("No comment");
		}
		else if (statement.equals("")) {
			System.out.println("Mayor didnt say nothing");
		}

	}
}
