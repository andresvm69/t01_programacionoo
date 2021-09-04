package prueba.uno;

public class PasajeroEconomico extends Pasajero{
	private String codigoDescuento;
	
	//Metodos SET Y GET
	public String getCodigoDescuento() {
		return codigoDescuento;
	}

	@Override
	public String toString() {
		return "PasajeroEconomico [nombre=" + nombre +",apellido=" + apellido +",edad=" + edad + ", codigoDescuento=" +codigoDescuento+ "]";
	}

	public void setCodigoDescuento(String codigoDescuento) {
		this.codigoDescuento = codigoDescuento;
	}
	

}
