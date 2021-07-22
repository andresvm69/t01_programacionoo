package herenciasentencia;

import java.util.Scanner;

public class Main2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// imprimir en pantalla los 10 primeros numeros impares
		System.out.println("Ingrese un numero");
		Scanner teclado = new Scanner(System.in);// TECLADO

		int N = teclado.nextInt();

		for (int C = 3; C < 20; C = C + 2) {

			System.out.println(C);
		}
		System.out.println("Se ha finalizado la impresion de los 10 primeros numeros impares");
	}

}
