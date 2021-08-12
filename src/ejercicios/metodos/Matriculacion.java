package ejercicios.metodos;

public class Matriculacion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Deberia validar que paso con el alumno
		//deberia valirdarque no hay cruce de materias
		//que existan profesores
		//Validaciones en general de la matriculacion
		// Si todo esta bien 
		//Deberia madar a imprimir
		Impresora impresion1 = new Impresora();//instanciar la clase
		int numeroImpresion = impresion1.imprimir("MAtriculacion exitosa #123456", 12);
		System.out.print("Se imprimio la matricula con numero de impresion: "+ numeroImpresion);
		
	}

}
