import java.util.Arrays;

public class LuchaEgos {
	static java.util.Scanner in;

	public static boolean casoDePrueba() {
		int n = Integer.parseInt(in.nextLine());
		if (n == 0)
			return false;
		// Lectura del caso
		String[] egos = in.nextLine().split(" ");
		String[] preferencias = in.nextLine().split(" ");
		boolean huboPelea = false;
		boolean compatibleUno = false;
		boolean compatibleDos = false;
		for (int i = 0; i < egos.length; i++) {
			for (int j = i + 1; j < preferencias.length; j++) {
				// Preferencias de (i) encajan con el ego (j) y
				char simbolo = preferencias[i].charAt(0);
				if (simbolo == '=') {
					compatibleUno = egos[j].charAt(0) == preferencias[i].charAt(1);
				} else if (simbolo == '<') {
					compatibleUno = egos[j].charAt(0) < preferencias[i].charAt(1);
				} else {
					compatibleUno = egos[j].charAt(0) > preferencias[i].charAt(1);
				}
				simbolo = preferencias[j].charAt(0);
				if (simbolo == '=') {
					compatibleDos = egos[i].charAt(0) == preferencias[j].charAt(1);
				} else if (simbolo == '<') {
					compatibleDos = egos[i].charAt(0) < preferencias[j].charAt(1);
				} else {
					compatibleDos = egos[i].charAt(0) > preferencias[j].charAt(1);
				}
				if (compatibleUno && compatibleDos) {
					System.out.println((i+1) + " " + (j+1));
					huboPelea = true;
				}
				// preferencias de (j) encajan con el ego de (i)

			}
		}
		if (!huboPelea) {
			System.out.println("NO HAY");
		}
		System.out.println("---");
		return true;
	}

	public static void main(String args[]) {
		in = new java.util.Scanner(System.in);
		while (casoDePrueba())
			;
	}
}
