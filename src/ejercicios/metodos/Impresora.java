//1. declaracion del paquete
package ejercicios.metodos;

//2. declaracion de importaciones

//3.comentarios
//clase que se encarga de realizar un impreson en formatos A$

//4.declaracin de la clase
public class Impresora {
	//	5.constantes
	//	6. variables
	public String color;
	
	
	//7. comstrcutor
	public Impresora() {
		
	}
	
	//8. metodos
	public int imprimir (String datosAImprimir, int letra) {
		//validacion que existan materias
		System.out.println("Logo UCE");
		System.out.println("**************");
		System.out.println(datosAImprimir);
		System.out.println("**************");
		System.out.println("Pie de firma");
		
		return 7;
	}
	

}
