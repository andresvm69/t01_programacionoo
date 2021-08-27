package ejercicios.ajedrez;

public class Main extends Pieza{

	private static final Object[] Pieza = null;

	public void ajedrez() {
		
//PEON
		Pieza peon1 =new Pieza();
		peon1.setColor("Blanco");
		
		Pieza peon2 =new Pieza();
		peon2.setColor("Blanco");
		
		Pieza peon3 =new Pieza();
		peon3.setColor("Blanco");
		
		Pieza peon4 =new Pieza();
		peon4.setColor("Blanco");
		
		Pieza peon5 =new Pieza();
		peon5.setColor("Blanco");
		
		Pieza peon6 =new Pieza();
		peon6.setColor("Blanco");
		
		Pieza peon7 =new Pieza();
		peon7.setColor("Blanco");
		
		Pieza peon8 =new Pieza();
		peon8.setColor("Blanco");
		
		
	//NEGROS
		
		Pieza peon1b =new Pieza();
		peon1b.setColor("Negro");
		
		Pieza peon2b =new Pieza();
		peon2b.setColor("Negro");
		
		Pieza peon3b =new Pieza();
		peon3b.setColor("Negro");
		
		Pieza peon4b =new Pieza();
		peon4b.setColor("Negro");
		
		Pieza peon5b =new Pieza();
		peon5b.setColor("Negro");
		
		Pieza peon6b =new Pieza();
		peon6.setColor("Negro");
		
		Pieza peon7b =new Pieza();
		peon7b.setColor("Negro");
		
		Pieza peon8b =new Pieza();
		peon8b.setColor("Negro");

//AlFIL
		Pieza alfil1 = new Pieza();
		alfil1.setColor("Blanco");
		
		Pieza alfil2 = new Pieza();
		alfil2.setColor("Blanco");
		
		//NEGROS
		
		Pieza alfil1b = new Pieza();
		alfil1b.setColor("Negro");
		
		Pieza alfil2b = new Pieza();
		alfil2b.setColor("Negro");
		
//CABALLOS
		Pieza caballo1 = new Pieza();
		caballo1.setColor("Blanco");
		
		Pieza caballo2 = new Pieza();
		caballo2.setColor("Blanco");
		
		//NEGROS
		
		Pieza caballo1b = new Pieza();
		caballo1b.setColor("Negro");
		
		Pieza caballo2b = new Pieza();
		caballo2b.setColor("Negro");
		
//REINA
		Pieza reina1 = new Pieza();
		reina1.setColor("Blanco");
		
		//Negro
		Pieza reina1b = new Pieza();
		reina1b.setColor("Negro");
		
		
//TORRE
		
		Pieza torre1=new Pieza();
		torre1.setColor("Blanco");
		
		Pieza torre2=new Pieza();
		torre2.setColor("Blanco");
		
		//Negros
		
		Pieza torre1b=new Pieza();
		torre1b.setColor("Negro");
		
		Pieza torre2b=new Pieza();
		torre2b.setColor("Negro");
		
//REY
		Pieza rey1=new Pieza();
		rey1.setColor("Blanco");
		
		//Negro
		
		Pieza rey1b=new Pieza();
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
		
		

		System.out.println("Ajedrez");

		System.out.println(" ");

		
		for(int fila=0 ;fila<8; fila++){
			for (int columna =0 ;columna< 8; columna++) {
				System.out.println(tablaAjedrez[fila][columna]+ " ");
					
			}
		}
		
		System.out.println(" ");
			}
		

		
	}
