import java.util.Scanner;

public class Ejercicio5 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int y=sc.nextInt();
            int x=sc.nextInt();
        do  {

            if(x>y){
               System.out.println("MENOR");
               x=sc.nextInt();
            }
            else if (x<y){
               System.out.println("MAYOR");
               x=sc.nextInt();
            }


            }

            while(x!=y);
            System.out.println("ACERTASTE");


        sc.close();
        }
}