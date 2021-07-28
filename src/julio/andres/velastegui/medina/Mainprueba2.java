package julio.andres.velastegui.medina;

import java.util.Scanner;

public class Mainprueba2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int SP = 0;
		float PI = 0;
		int CI = 0;
		int SI = 0;
		
		for (int i = 1; i != -1; i++) {
			System.out.print("Ingrese un número positivo: ");
			Scanner teclado = new Scanner(System.in);
			int N = teclado.nextInt();
			if (N == -1) {
				i = -2;

			} else if (N % 2 == 0) {
				SP=SP+N;

			} else if (N % 2!= 0) {
				SI =SI + N;
				PI =SI / CI;
				CI =CI + 1;

			}
		}
		System.out.println();
		System.out.println("Suma de números pares es: " + SP);
		System.out.println("Promedio de números impares es: " + PI);
	}

}
