import java.util.Scanner;

public class MinFigura2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Buen trabajo "Figura inversa"
		//
		System.out.println("Ingrese el numero de filas");
		Scanner teclado = new Scanner(System.in);

		int n = teclado.nextInt();

		for (int fila = 1; fila <= n; fila = fila + 1) {

			for (int ast = n; ast >= fila; ast = ast - 1) {
				System.out.print("*");
			}
			System.out.println();// Salto de linea

		}

	}

}
