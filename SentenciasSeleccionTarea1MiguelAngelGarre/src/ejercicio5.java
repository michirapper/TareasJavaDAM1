import java.util.Scanner;

public class ejercicio5 {
public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	double numero1 = in.nextDouble();
	int numero = (int)numero1;
	
	switch (numero) {
	case 10 :
		System.out.println("Sobresaliente");
		break;
	case 9 :
		System.out.println("Sobresaliente");
		break;
	case 8 :
		System.out.println("Notable");
		break;
	case 7 :
		System.out.println("Notable");
		break;
	case 6 :
		System.out.println("Notable");
		break;
	case 5 :
		System.out.println("Bien");
		break;
	case 4 :
		System.out.println("Insuficiente");
		break;
	case 3 :
		System.out.println("Insuficiente");
		break;
	case 2 :
		System.out.println("Muy deficiente");
		break;
	case 1 :
		System.out.println("Muy deficiente");
		break;
	default:
		System.out.println("Muy deficiente");
	}
	}
}
