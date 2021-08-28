package ejercicios.ajedrez;

public class Main {

	public void ajedrez() {
		
//PEON     
		Peon peon1 =new Peon();
		peon1.setColor("Blanco");
		
		Peon peon2 =new Peon();
		peon2.setColor("Blanco");
		
		Peon peon3 =new Peon();
		peon3.setColor("Blanco");
		
		Peon peon4 =new Peon();
		peon4.setColor("Blanco");
		
		Peon peon5 =new Peon();
		peon5.setColor("Blanco");
		
		Peon peon6 =new Peon();
		peon6.setColor("Blanco");
		
		Peon peon7 =new Peon();
		peon7.setColor("Blanco");
		
		Peon peon8 =new Peon();
		peon8.setColor("Blanco");
		
		
	//NEGROS
		
		Peon peon1b =new Peon();
		peon1b.setColor("Negro");
		
		Peon peon2b =new Peon();
		peon2b.setColor("Negro");
		
		Peon peon3b =new Peon();
		peon3b.setColor("Negro");
		
		Peon peon4b =new Peon();
		peon4b.setColor("Negro");
		
		Peon peon5b =new Peon();
		peon5b.setColor("Negro");
		
		Peon peon6b =new Peon();
		peon6.setColor("Negro");
		
		Peon peon7b =new Peon();
		peon7b.setColor("Negro");
		
		Peon peon8b =new Peon();
		peon8b.setColor("Negro");

//AlFIL
		Alfil alfil1 = new Alfil();
		alfil1.setColor("Blanco");
		
		Alfil alfil2 = new Alfil();
		alfil2.setColor("Blanco");
		
		//NEGROS
		
		Alfil alfil1b = new Alfil();
		alfil1b.setColor("Negro");
		
		Alfil alfil2b = new Alfil();
		alfil2b.setColor("Negro");
		
//CABALLOS
		Caballo caballo1 = new Caballo();
		caballo1.setColor("Blanco");
		
		Caballo caballo2 = new Caballo();
		caballo2.setColor("Blanco");
		
		//NEGROS
		
		Caballo caballo1b = new Caballo();
		caballo1b.setColor("Negro");
		
		Caballo caballo2b = new Caballo();
		caballo2b.setColor("Negro");
		
//REINA
		Reina reina1 = new Reina();
		reina1.setColor("Blanco");
		
		//Negro
		Reina reina1b = new Reina();
		reina1b.setColor("Negro");
		
		
//TORRE
		
		Torre torre1=new Torre();
		torre1.setColor("Blanco");
		
		Torre torre2=new Torre();
		torre2.setColor("Blanco");
		
		//Negros
		
		Torre torre1b=new Torre();
		torre1b.setColor("Negro");
		
		Torre torre2b=new Torre();
		torre2b.setColor("Negro");
		
//REY
		Rey rey1=new Rey();
		rey1.setColor("Blanco");
		
		//Negro
		
		Rey rey1b=new Rey();
		rey1b.setColor("Blanco");
		
		Pieza tablaAjedrez[][] = new Pieza[8][8];
		tablaAjedrez[1][0] =peon1;
		tablaAjedrez[1][1] =peon2;
		tablaAjedrez[1][2] =peon3;
		tablaAjedrez[1][3] =peon4;
		tablaAjedrez[1][4] =peon5;
		tablaAjedrez[1][5] =peon6;
		tablaAjedrez[1][6] =peon7;
		tablaAjedrez[1][7] =peon8;
		tablaAjedrez[6][0] =peon1b;
		tablaAjedrez[6][1] =peon2b;
		tablaAjedrez[6][2] =peon3b;
		tablaAjedrez[6][3] =peon4b;
		tablaAjedrez[6][4] =peon5b;
		tablaAjedrez[6][5] =peon6b;
		tablaAjedrez[6][6] =peon7b;
		tablaAjedrez[6][7] =peon8b;
		tablaAjedrez[0][2] =alfil1;
		tablaAjedrez[0][5] =alfil2;
		tablaAjedrez[7][2] =alfil1b;
		tablaAjedrez[7][5] =alfil2b;
		tablaAjedrez[0][1] =caballo1;
		tablaAjedrez[0][6] =caballo2;
		tablaAjedrez[7][1] =caballo1b;
		tablaAjedrez[7][6] =caballo2b;
		tablaAjedrez[0][4] =reina1;
		tablaAjedrez[7][4] =reina1b;
		tablaAjedrez[0][2] =torre1;
		tablaAjedrez[0][5] =torre2;
		tablaAjedrez[7][2] =torre1b;
		tablaAjedrez[7][5] =torre2b;
		tablaAjedrez[0][3] =rey1;
		tablaAjedrez[7][3] =rey1b;
		
		

		System.out.println("AJEDREZ");

		System.out.println(" ");

		
		for(int fila=0 ;fila<8; fila++){
			for (int columna =0 ;columna< 8; columna++) {
				System.out.println(tablaAjedrez[fila][columna]+ " ");
					
			}
		}
		
		System.out.println(" ");
			}
		

		
	}
