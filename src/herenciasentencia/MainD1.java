package herenciasentencia;

import java.util.Scanner;

public class MainD1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Se ingresa por teclado 2 n�meros: A y B se desea mostrar la divisi�n
		// entre dichos n�meros en caso de ser posible, caso contrario indicar
		// al usuario que la divisi�n es imposible.
		System.out.println("Ingrese dos numero");
		Scanner teclado = new Scanner(System.in);
		int A = teclado.nextInt();
		int B = teclado.nextInt();

		int D = A / B;

		if (B == 0) {

			System.out.println("La division si es posible" + D);
			System.out.println("La Division es:" + D);

		} else {

			System.out.println("La division sera imposible");

		}
		System.out.println("La Division es:" + D);

	}
}
