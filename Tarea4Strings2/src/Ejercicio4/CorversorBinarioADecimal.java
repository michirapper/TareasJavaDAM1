package Ejercicio4;

import java.util.Arrays;
public class CorversorBinarioADecimal {
	public static void main(String[] args) {
		// INICIALIZACION
		// Introducimos el binario en un Array
		int [] bin1 = {1,1,0,1,0,1};
		// La variable dec, sirve para ir sumando los dividendos
		int dec =  0;
		int count = 0;
		// PROCESO
		//Recorremos bin1 de final a principio.
		for (int i = bin1.length-1; i > -1; i--) {	
			// Con Math.pow elevamos la base, siempre será 2, ya que estamos en binario.
			// El contador se incrementa en cada iteración encontrando así los exponentes correctos.
			dec += (int) (bin1[i]*(Math.pow(2,count)));
			count++;
		}
		// SALIDA
		System.out.println("El numero en binario sería: "+ Arrays.toString(bin1));
		System.out.println(dec+"(10");


	}
}
