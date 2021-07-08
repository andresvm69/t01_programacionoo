package herenciasentencia;

import java.util.Scanner;

public class MainD3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Se ingresa por teclado el sueldo de un empleado y se desea pagar una bonificación
		//de acuerdo con la siguiente tabla:
		System.out.println("Ingrese el valor del sueldo");

		Scanner teclado = new Scanner(System.in);// TECLADO
		int S = teclado.nextInt();
		int B =100;
		int B1 =70;
		int B2 =50;
		
		if(S<300){ 
			//SI
			System.out.println("Su bonificacion es:" + B);
		}else {
			//NO
			System.out.println();
		
		}
		
		if(S >=300 && S <=400 ){ 
			//SI
			System.out.println("Su bonificacion es:" + B1);
		}else {
			//NO
			System.out.println();


	}
		if(S>400){ 
			//SI
			System.out.println("Su bonificacion es:" + B2);
		}else {
			//NO
			System.out.println();


	}
	}
}

