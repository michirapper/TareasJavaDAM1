import java.util.Scanner;

public class Ejercicio15 {
	public static void main(String[] args) {
		int contador = 1;
		int mayores = 0;
		int menores = 0;
		Scanner sc = new Scanner(System.in);
		
	       while ( contador <= 10 ) {
	    	   int num1 = sc.nextInt();
	    	   if(num1 >= 7) {
	    		   mayores++;
	    	   }else if(num1 < 7) {
	    		   menores++;
	    	   }
	          contador++;
	       }
	       System.out.println("Hay " + mayores + " numeros mayores o iguales a 7");
	       System.out.println("Hay " + menores + " numeros menores a 7");
	}
}
