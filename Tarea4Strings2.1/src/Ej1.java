
import java.util.Scanner;

public class Ej1 {
	public static void main(String[] args) {
		// INICIALIZACION
		Scanner sc = new Scanner(System.in);
		int cash = sc.nextInt();//cantidad de dinero
		Ej1 programa = new Ej1();
		StringBuilder bilets = new StringBuilder();
		// PROCESO
		bilets = programa.countBilets(cash);//Igualo el stringbuilder al que me devuelve el metodo
		// SALIDA
		System.out.println(bilets.toString());
	}

	private StringBuilder countBilets(int cash) {
		// INICIALIZACION
		int[] billetes = { 500, 200, 100, 50, 20, 10, 5 };
		char moneda = '€';
		int cantBilets[];
		cantBilets = new int[8];//Array para almacenar la cantidad de billetes que se necesitan + sobrante(8)
		int count = 0;
		StringBuilder infoCash = new StringBuilder();//Para almacenar el string de salida
		// PROCESO
		for (int i = 0; i < billetes.length; i++) {
			cantBilets[i] = cash / billetes[i];//Almacenas en la primera posicion el cash / billete en concreto
			cash = cash - (billetes[i] * cantBilets[i]);//Vamos restando la cantidad a cash
		}
		cantBilets[7] = cash;//Almacenas cantidad restante en la posicion 7
		for (int i = 0; i < cantBilets.length - 1; i++) {//Recorremos cantidad de billetes
			if (cantBilets[i] > 0) {
				if (count > 0) {//Si el contador ha incrementado es que ya ha habido algun billete, por tanto antes de añadir otro metemos el +
					infoCash.append(" + ");
				}
				infoCash.append(cantBilets[i] + "x" + billetes[i] + moneda);//Añadimos cantidad + billetes + monedas a un string
				count++;//El contador te sirve para saber si hay que introducir " + " entre cantidades
			}
			if (i == cantBilets.length - 2 && cantBilets[cantBilets.length - 1] > 0) {//Para el sobrante. Cuando esta en la posicion del sobrante y haya sobrante
				if (count > 0) {
					infoCash.append(" + ");//Le añades si el contador es > 0 le añades +
				}
				infoCash.append(cantBilets[7] + "" + moneda + "(sobran)");//Si sumas cantBilets a moneda directamente
			}
		}
		return infoCash;

	}
}
