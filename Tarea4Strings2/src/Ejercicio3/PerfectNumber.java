package Ejercicio3;

import java.util.Scanner;

public class PerfectNumber {
public static void main(String[] args) {
	// INICIALIACION
	Scanner in = new Scanner(System.in);
	System.out.println("Introduzca un número natural: ");
	int num1 = in.nextInt();
	int aux = 0;
	// PROCESO
	//Con el for recorremos el array y con el if hacemos la operación necesaria para saber si es perfecto
	for (int i = 1; i < num1; i++) {
		if (num1%i == 0) {//Calculamos si el resto de num1 es igual a 0
			aux = aux + i;//Almacenamos i en la variable auxiliar
		}
	}
	// SALIDA
	if (aux == num1) {
		System.out.println("Perfecto");
	} else {
		System.out.println("No es perfecto");
	}
	in.close();
}
}
