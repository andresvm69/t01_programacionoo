package ejercicios.varios.vectores.matrices;

import java.util.Scanner;

public class MainVector2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Declare un vector X cuya longitud se solicite al usuario de tipo int y
		// construya un programa que pida al usuario que ingrese los valores para cada
		// posicion y finalmente que se imprima todos los valores ingresados

		System.out.println("Ingrese el valor de longuitud  ");
		Scanner teclado = new Scanner(System.in);
		int L = teclado.nextInt();

		int X[] = new int[L];

		for (int i = 0; i < L; i++) {
			System.out.println("Ingrese el valor de la posicion " + i);

			Scanner lector = new Scanner(System.in);
			int N = lector.nextInt();
			X[i] = N;
		}
		// Recorriendo el vector lleno
		for (int i = 0; i < L; i++) {
			System.out.println("El valor de posicion " + i);
			System.out.println(X[i]);
		}
	}
}
