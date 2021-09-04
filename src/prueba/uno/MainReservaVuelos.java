package prueba.uno;

import java.util.Scanner;

public class MainReservaVuelos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner tecladoint=new Scanner (System.in);
		Scanner tecladoString=new Scanner (System.in);
		System.out.println("Ingrese imformacion de pasajero");
		System.out.println("Ingrese nombre:");
		String nombre = tecladoString.nextLine();
		System.out.println("Ingrese apellido:");
		String apellido = tecladoString.nextLine();
		System.out.println("Ingrese edad:");
		int edad = tecladoint.nextInt();
		System.out.println("Que tipo de pasajero es: 1.PasajeroVip 2.Pasajero Economico");
		int opcion = tecladoint.nextInt();
		
		String membresia="";
		String descuento="";
		if(opcion == 1) {
			System.out.println("Ingrese Codigo Membresia");
			membresia =tecladoString.nextLine();
		}else {
			System.out.println("Ingrese Codigo Descuento");
			descuento= tecladoString.nextLine();
		}
		
		
		PasajeroVip pasajero1 = new PasajeroVip();
		pasajero1.setApellido("Teran");
		pasajero1.setNombre("Daniel");
		pasajero1.setCodigoMembresia("as647asah");
		pasajero1.setEdad(25);
		
		PasajeroVip pasajero2=new PasajeroVip("Javier", "Cruz", "asdfg",30);
		
		PasajeroEconomico pasajeroEconomico1 = new PasajeroEconomico();
		pasajeroEconomico1.setNombre("Edison");
		pasajeroEconomico1.setApellido("Cayambe");
		pasajeroEconomico1.setCodigoDescuento("asdfgh");
		pasajeroEconomico1.setEdad(35);
		
		PasajeroEconomico pasajeroEconomico2 = new PasajeroEconomico();
		pasajeroEconomico2.setNombre("Edison2");
		pasajeroEconomico2.setApellido("Cayambe2");
		pasajeroEconomico2.setCodigoDescuento("asdf");
		pasajeroEconomico2.setEdad(34);
		
		
		Pasajero[][] asientos = new Pasajero[4][5];
		asientos[0][0]=pasajero1;
		asientos[0][0]=pasajero2;
		asientos[0][1]=pasajeroEconomico1;
		asientos[3][0]=pasajeroEconomico2;

		int opcionSalir = -1;
		do {
			System.out.println("Ingrese datos del siento,0continuar, -1 SALIR");
			opcionSalir = tecladoint.nextInt();
			if(opcionSalir ==0) {
				System.out.println("Ingrese datos del asiento");
				System.out.println("Ingrese fila del asiento:");
				int fila = tecladoint.nextInt();
				System.out.println("Ingrese columna del asiento:");
				int columna = tecladoint.nextInt();
				
				System.out.println("Los datos del pasajero son:");
				System.out.println(asientos[fila][columna]);
				
			}else if(opcionSalir== -1) {
				System.out.println("Va ha salir del sistema");
			}
			}while (opcionSalir != -1);
			
		}
			
	}
		
		   
	


