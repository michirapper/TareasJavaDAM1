package Ejercicio2;

import java.util.Scanner;

public class MaximMin {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Introduzca n�meros (0 para acabar):");
		int min = Integer.MAX_VALUE;//Almacena el valor m�ximo
		int max = Integer.MIN_VALUE;//Almacena el valor m�nimo
		int num1 = in.nextInt();
		//Con while vamos introduciendo n�meros hasta que se introduzca un 0
		while (num1!=0) {
			if (num1>max) {
				max = num1;
			}
			if(num1<min) {
				min = num1;	
			}
		num1=in.nextInt();
		//Con el while hemos conseguido averiguar cual era el numero m�ximo y el m�nimo de los introducidos
		}System.out.println("El maximo es: " + max);
		System.out.println("El minimo es: " + min);
		in.close();
	}
}
