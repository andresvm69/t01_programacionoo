package reserva.de.vuelo;

import ejercicios.ordenamiento.Estudiante;

public class Main {

	public void vuelo() {
		
		PasajeroVip pasajerovip1 =new PasajeroVip();
		pasajerovip1.setNombre("pasajero 1");
		pasajerovip1.setApellido("pasajero 1");
		pasajerovip1.setEdad(28);
		
		PasajeroVip pasajerovip2 =new PasajeroVip();
		pasajerovip2.setNombre("pasajero 2");
		pasajerovip2.setApellido(" pasajero 2");
		pasajerovip2.setEdad(23);
		
		PasajeroVip pasajerovip3 =new PasajeroVip();
		pasajerovip3.setNombre("pasajero 3");
		pasajerovip3.setApellido("pasajero 3");
		pasajerovip3.setEdad(25);
		
		PasajeroVip pasajerovip4 =new PasajeroVip();
		pasajerovip4.setNombre("pasajero 4");
		pasajerovip4.setApellido("pasajero 4");
		pasajerovip4.setEdad(24);
		
		PasajeroVip pasajerovip5 =new PasajeroVip();
		pasajerovip5.setNombre("pasajero 5");
		pasajerovip5.setApellido("pasajero 5");
		pasajerovip5.setEdad(29);
		
		PasajeroVip pasajerovip6 =new PasajeroVip();
		pasajerovip6.setNombre("pasajero 6");
		pasajerovip6.setApellido("pasajero 6");
		pasajerovip6.setEdad(43);
		
		PasajeroVip pasajerovip7 =new PasajeroVip();
		pasajerovip7.setNombre("pasajero 7");
		pasajerovip7.setApellido("pasajero 7");
		pasajerovip7.setEdad(34);
		
		PasajeroVip pasajerovip8 =new PasajeroVip();
		pasajerovip8.setNombre("pasajero 8");
		pasajerovip8.setApellido("pasajero 8");
		pasajerovip8.setEdad(54);
		
		PasajeroVip pasajerovip9 =new PasajeroVip();
		pasajerovip9.setNombre("pasajero 9");
		pasajerovip9.setApellido("pasajero 9");
		pasajerovip9.setEdad(12);
		
		PasajeroVip pasajerovip10 =new PasajeroVip();
		pasajerovip10.setNombre("pasajero 10");
		pasajerovip10.setApellido("pasajero 10");
		pasajerovip10.setEdad(54);
		
		PasajerosEconomicos pasajeroeconomico1 = new PasajerosEconomicos();
		pasajeroeconomico1.setNombre("pasajerob1");
		pasajeroeconomico1.setApellido("pasajerob1");
		pasajeroeconomico1.setEdad(0); 
		
		PasajerosEconomicos pasajeroeconomico2 = new PasajerosEconomicos();
		pasajeroeconomico2.setNombre("pasajerob2");
		pasajeroeconomico2.setApellido("pasajerob2");
		pasajeroeconomico2.setEdad(0); 
		
		
		PasajerosEconomicos pasajeroeconomico3 = new PasajerosEconomicos();
		pasajeroeconomico3.setNombre("pasajerob3");
		pasajeroeconomico3.setApellido("pasajerob3");
		pasajeroeconomico3.setEdad(0); 
		
		
		PasajerosEconomicos pasajeroeconomico4 = new PasajerosEconomicos();
		pasajeroeconomico4.setNombre("pasajerob4");
		pasajeroeconomico4.setApellido("pasajerob4");
		pasajeroeconomico4.setEdad(0); 
		
		PasajerosEconomicos pasajeroeconomico5 = new PasajerosEconomicos();
		pasajeroeconomico5.setNombre("pasajerob5");
		pasajeroeconomico5.setApellido("pasajerob5");
		pasajeroeconomico5.setEdad(0); 
		
		PasajerosEconomicos pasajeroeconomico6 = new PasajerosEconomicos();
		pasajeroeconomico6.setNombre("pasajerob6");
		pasajeroeconomico6.setApellido("pasajerob6");
		pasajeroeconomico6.setEdad(0); 
		
		PasajerosEconomicos pasajeroeconomico7 = new PasajerosEconomicos();
		pasajeroeconomico7.setNombre("pasajerob7");
		pasajeroeconomico7.setApellido("pasajerob7");
		pasajeroeconomico7.setEdad(0); 
		
		PasajerosEconomicos pasajeroeconomico8 = new PasajerosEconomicos();
		pasajeroeconomico8.setNombre("pasajerob8");
		pasajeroeconomico8.setApellido("pasajerob8");
		pasajeroeconomico8.setEdad(0); 
		
		PasajerosEconomicos pasajeroeconomico9 = new PasajerosEconomicos();
		pasajeroeconomico9.setNombre("pasajerob9");
		pasajeroeconomico9.setApellido("pasajerob9");
		pasajeroeconomico9.setEdad(0); 
		
		PasajerosEconomicos pasajeroeconomico10 = new PasajerosEconomicos();
		pasajeroeconomico10.setNombre("pasajerob10");
		pasajeroeconomico10.setApellido("pasajerob10");
		pasajeroeconomico10.setEdad(0); 
		
		PasajeroVip listaPasajeros[][] = new PasajeroVip[4][5];
		listaPasajeros[0][0]= pasajerovip1;
		listaPasajeros[0][1]= pasajerovip2;
		listaPasajeros[0][2]= pasajerovip3;
		listaPasajeros[0][3]= pasajerovip4;
		listaPasajeros[0][4]= pasajerovip5;
		listaPasajeros[1][0]= pasajerovip6;
		listaPasajeros[1][1]= pasajerovip7;
		listaPasajeros[1][2]= pasajerovip8;
		listaPasajeros[1][3]= pasajerovip9;
		listaPasajeros[1][4]= pasajerovip10;
		
		PasajerosEconomicos listaPasajeros1[][] = new PasajerosEconomicos[4][5];
		listaPasajeros1[3][0]= pasajeroeconomico1;
		listaPasajeros1[3][1]= pasajeroeconomico2;
		listaPasajeros1[3][2]= pasajeroeconomico3;
		listaPasajeros1[3][3]= pasajeroeconomico4;
		listaPasajeros1[3][4]= pasajeroeconomico5;
		listaPasajeros1[4][0]= pasajeroeconomico6;
		listaPasajeros1[4][1]= pasajeroeconomico7;
		listaPasajeros1[4][2]= pasajeroeconomico8;
		listaPasajeros1[4][3]= pasajeroeconomico9;
		listaPasajeros1[4][4]= pasajeroeconomico10;
		
		
		
		System.out.println("VUELOS");

		System.out.println(" ");

		
		for(int fila=0 ;fila<8; fila++){
			for (int columna =0 ;columna< 8; columna++) {
				System.out.println(listaPasajeros1[fila][columna]+ " ");
					
			}
		}
		
		System.out.println(" ");
			}
	
	
		
		
		
		
		
		
		
	}

