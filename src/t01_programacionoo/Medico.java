package t01_programacionoo;

public class Medico extends Persona {

	private String nombre;
	private String apellido;
	private String genero;
	public String edad;

	void hablarPersona() {

		Persona persona = new Persona();
		persona.comer(nombre);

	}

	void comer() {

	}

}
