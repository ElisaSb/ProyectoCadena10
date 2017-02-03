package Ejercicios;

public class PalabraLeida {
	private String contenidoPalabra;

	public PalabraLeida(String contenidoPalabra) {
		this.contenidoPalabra = contenidoPalabra;
	}
	
	//primer método
	public int obtenerNumeroLetras(){
		return contenidoPalabra.length();
	}
	
	//segundo método
	public boolean empiezaPorVocal(){
		return contenidoPalabra.matches("[aeiouáéíóúAEIOUÁÉÍÓÚ.*]");
	}
	
	//tercer método
		public boolean terminaPorVocal(){
			return contenidoPalabra.matches(".*[aeiouáéíóúAEIOUÁÉÍÓÚ]");
		}
		
	//cuerto método
		public int obtenerNumeroVocales(){
			int contador = 0;
			for (int i = 0; i < contenidoPalabra.length(); i++) {
				if ((""+contenidoPalabra.charAt(i)).matches("[aeiouáéíóúAEIOUÁÉÍÓÚüÜ]")) {
					contador++;
				}
			}
			return contador;
		}
	
	//quinto método
		public boolean contieneH(){
			return contenidoPalabra.toLowerCase().contains("h");
		}
		
	//sexto método
		public boolean sonIguales(String palabra){
			return contenidoPalabra.equals(palabra);
		}
	
	//septimo método
		public boolean esPalindromo(){
			StringBuilder sBuilder = new StringBuilder(contenidoPalabra);
			String palabraAlReves = sBuilder.reverse().toString();
			return contenidoPalabra.equals(palabraAlReves);
		}

	@Override
	public String toString() {
		return contenidoPalabra;
	}
}
