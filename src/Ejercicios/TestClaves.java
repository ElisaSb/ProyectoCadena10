package Ejercicios;

import java.util.ArrayList;
import java.util.List;

public class TestClaves {
	public static void main(String[] args) {
		List<Integer> listaTama�o = new ArrayList<Integer>();
		final String FUENTE_CARACTERES = "aAbBcCdDeEfFgGhHiIjJkKlLmMnN��oOpPqQrRsStTuUvVwWxXyYzZ0123456789>?()=@.:,;!<&fg";
		//generar una lista din�mica de 10 tama�os de las futuras claves
		for (int i = 0; i < 10; i++) {
			int tama�o = (int)(Math.random()*101);
			listaTama�o.add(tama�o);
		}
		for (Integer integer : listaTama�o) {
			for (int i = 0; i < integer; i++) {
				//generar de forma aleatoria las posiciones
				int posicion = (int)(Math.random()*101);
				char caracter = FUENTE_CARACTERES.charAt(posicion);
			}
		}
	}
}
