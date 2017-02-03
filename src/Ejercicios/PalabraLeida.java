package Ejercicios;

public class PalabraLeida {
	private String contenidoPalabra;

	public PalabraLeida(String contenidoPalabra) {
		this.contenidoPalabra = contenidoPalabra;
	}
	
	//primer m�todo
	public int obtenerNumeroLetras(){
		return contenidoPalabra.length();
	}
	
	//segundo m�todo
	public boolean empiezaPorVocal(){
		return contenidoPalabra.matches("[aeiou�����AEIOU�����.*]");
	}
	
	//tercer m�todo
		public boolean terminaPorVocal(){
			return contenidoPalabra.matches(".*[aeiou�����AEIOU�����]");
		}
		
	//cuerto m�todo
		public int obtenerNumeroVocales(){
			int contador = 0;
			for (int i = 0; i < contenidoPalabra.length(); i++) {
				if ((""+contenidoPalabra.charAt(i)).matches("[aeiou�����AEIOU�������]")) {
					contador++;
				}
			}
			return contador;
		}
	
	//quinto m�todo
		public boolean contieneH(){
			return contenidoPalabra.toLowerCase().contains("h");
		}
		
	//sexto m�todo
		public boolean sonIguales(String palabra){
			return contenidoPalabra.equals(palabra);
		}
	
	//septimo m�todo
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
