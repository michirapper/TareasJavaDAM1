import java.util.Scanner;

public class Ejercicio4 {

    public static void main(String[] args) {
             Scanner sc = new Scanner(System.in);
             double num = sc.nextDouble();
             double res = num;
             int exp = sc.nextInt();
             if(exp==0) {
                 res = 1;
             }
             for(int i = 2; i <= exp; i++) {
                 res *= num;
             }
             System.out.printf("%.02f", res);
    }

}
