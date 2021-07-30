package whilee;

import java.util.Scanner;

public class Ejwhilee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Ingrese un número positivo: ");
		Scanner entrada = new Scanner(System.in);

		int n = entrada.nextInt();
		
		while (n != 0) {
			System.out.println("Ingrese un numero positivo");
			n = entrada.nextInt();
		}

	}

}
