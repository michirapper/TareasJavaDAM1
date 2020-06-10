import java.util.Scanner;

public class Ejercicio16 {
	public static void main(String[] args) {
		int contador = 0;
		int media = 0;
		Scanner sc = new Scanner(System.in);
		
	       while ( contador <= 4 ) {
	    	   int altura = sc.nextInt();
	    	   media = altura + media;
	          contador++;
	       }
	        
	       System.out.println(media/contador);
	}
}
