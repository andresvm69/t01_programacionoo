package ejercicios.varios.vectores.matrices;

import java.util.Scanner;

public class MainVector1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Declare un vector X[3] y contruya un programna que pida al usuario que
		// ingrese los valores para cada posicion
		char X[] = new char[3];
		
		for (int i=0; i<3 ; i++) {
			System.out.println("Ingrese el valor de la posicion " + i);
			
			Scanner lector= new Scanner( System.in);
			char n =lector.nextLine().charAt(0);
		    X[i]=n;
		}
		//Recorriendo el vector lleno
		for(int i =0; i<3 ; i++) {
		System.out.println("El valor de posicion " + i);
		System.out.println(X[i]);
	}
	}
}
