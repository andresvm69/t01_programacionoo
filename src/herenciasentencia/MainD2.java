package herenciasentencia;

import java.util.Scanner;

public class MainD2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Se ingresa por teclado 2 números: A y B se desea saber si A es múltiplo de B, 
		// imprimir en pantalla los textos correspondientes para cada caso.
		System.out.println("Ingrese dos numero");
		Scanner teclado = new Scanner(System.in);
		int A = teclado.nextInt();
		int B = teclado.nextInt();
		
		int M = A % B;
		
		if (M== 0) {

			System.out.println("A si es multiplo de B");

		} else {

			System.out.println("A no es multiplo de B");

		}

		
		


	}

}
