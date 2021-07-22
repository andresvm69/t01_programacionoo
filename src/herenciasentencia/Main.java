package herenciasentencia;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Ingrese dos numero");
		Scanner teclado = new Scanner(System.in);// TECLADO
		// ctrl+shift+o
		int A = teclado.nextInt();
		// System.out.println("numero ingresado:" + A);
		int B = teclado.nextInt();
		// System.out.println("numero ingresado 2: " + B);

		int S = A + B;
		int D = A - B;
		int P = A * B;

		System.out.println("La suma es:" + S);
		System.out.println();
		System.out.println("La resta es:" + D);
		System.out.println("El producto es:" + P);
	}

}
