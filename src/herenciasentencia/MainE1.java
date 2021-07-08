package herenciasentencia;

import java.util.Scanner;

public class MainE1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Ingrese el valor del sueldo");

		Scanner teclado = new Scanner(System.in);// TECLADO
		int S = teclado.nextInt();
		int B =40;
		
		if(S<300){ 
			//SI
			System.out.println("Su bonificacion es:" + B);
		}else {
			//NO
			System.out.println("No tiene bonificacion");
			System.out.println("Su bonificacion es:" + 0);
		}
		
	}

	}

