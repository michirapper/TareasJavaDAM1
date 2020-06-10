
public class DVariables4 {
		public static void main(String[] args) {
			double a;
			a = triangleArea(3, 3, 3);
			System.out.println("A triangle with sides 3,3,3 has an area of:" + a);
			
			a = triangleArea(3, 4, 5);
			System.out.println("A triangle with sides 3,4,5 has an area of:" + a);
			
			a = triangleArea(9, 9, 9);
			System.out.println("A triangle with sides 9,9,9 has an area of:" + a);
		}

		// Write your code here
		public static double triangleArea(int a, int b, int c) {
			int s = (a+b+c)/2;
			double area = Math.pow ((s*(s-a)*(s-b)*(s-c)) , 0.5);
			return area;
			
			

		}
}
