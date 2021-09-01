package menu.prueba;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int opcion;
		Scanner teclado = new Scanner(System.in);
		
		do {
		
		System.out.println("**********************************************");
		System.out.println("**Banco del Pichincha seleccione una opción***");
		System.out.println("1. Retirar dinero");
		System.out.println("2. Cambiar de clave");
		System.out.println("3. Bloquear cuenta");
		System.out.println("4. Salir");
		System.out.println(" Elija su opcion");
		opcion = teclado.nextInt();
		
		if (opcion == 1) {
			System.out.print("Ingrese el valor a retirar: ");
			int Valor = teclado.nextInt();
			System.out.println("El valor a retirar es: " + Valor);
			System.out.println(" ");

		} else if (opcion == 2) {
			System.out.println("Ingrese nueva clave: ");
			String Contra = teclado.next();
			System.out.println("Su clave ha sido cambiada con exito.");
			System.out.println(" ");

		} else if (opcion == 3) {
			System.out.println("!CUENTA BLOQUEADA!");
			System.out.println(" ");

		} else if (opcion != 4) {
			System.out.println("Elija otra opcion");
			System.out.println(" ");}
		
		} while (opcion != 4);

	}

}