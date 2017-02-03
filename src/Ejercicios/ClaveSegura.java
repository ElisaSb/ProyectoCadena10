package Ejercicios;

public class ClaveSegura {
	private String clave;

	public ClaveSegura(String clave) {
		this.clave = clave;
	}
	
	public boolean esClaveSegura(){
		switch (clave) {
		case (clave.length() >= 8):
			return true;
			break;

		default:
			break;
		}
	}
}
