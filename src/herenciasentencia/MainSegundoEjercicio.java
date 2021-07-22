package herenciasentencia;

import java.util.Scanner;

public class MainSegundoEjercicio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Ingrese un numero");

		Scanner teclado = new Scanner(System.in);// TECLADO
		int A = teclado.nextInt();
		
		if(A==1){ 
			//SI
			System.out.println("Numero Correcto");
		}else {
			//NO
			System.out.println("Numero incorrecto");
			System.out.println("El numero es:" + A);
		}
		
	}

}
