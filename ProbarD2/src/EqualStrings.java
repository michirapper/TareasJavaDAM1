
public class EqualStrings {
public static void main(String[] args) {
	String first = "Uda";
	String second = "cIty";
	String FirstandSecond = first + second;
	String third = "Udacity";
	if(FirstandSecond.equalsIgnoreCase(third)) {
		System.out.println("They are the same");
	}else {
		System.out.println("firstandsecond is " + FirstandSecond);
	}
}
}
