package ejercicios.varios.vectores.matrices;

import java.util.Scanner;

public class MainMatri11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1 Declare una matriz (3,4) de tipo char y desarrolle un programa que vaya solicitando
		// cada una de sus posiciones
		Scanner teclado=new Scanner (System.in);
		System.out.println("Ingrese el numero de filas del vector :" );
		//El usuario digita el numero de filas y yo debo leer desde teclado
		int longitudFila = teclado.nextInt();
		
		System.out.println("Ingrese el numero de columnas del vector :" );
		int longitudColumnas = teclado.nextInt();

		char A[][] = new char[longitudFila][longitudColumnas];
		for (int fila = 0; fila <  longitudFila; fila++) {
			for (int columna = 0; columna < longitudColumnas; columna++) {
				System.out.println("Ingrese el valor fila:" + fila +"columna:" + columna);
				// El usuario digite el valor por teclado
				
				char n= teclado.next().charAt(0);
				A[fila][columna]=n;
			}
		}
		System.out.println("Iniciamos a imprimir la matriz" );

		
		for (int fila =0; fila<longitudFila; fila++) {
			for(int columna =0; columna < longitudColumnas; columna++){
			System.out.print( A[fila][columna]+ " ");	
			
			}
			System.out.println();
		}

	}

}


	


