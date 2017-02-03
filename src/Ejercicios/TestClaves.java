package Ejercicios;

import java.util.ArrayList;
import java.util.List;

public class TestClaves {
	public static void main(String[] args) {
		List<Integer> listaTamaño = new ArrayList<Integer>();
		final String FUENTE_CARACTERES = "aAbBcCdDeEfFgGhHiIjJkKlLmMnNñÑoOpPqQrRsStTuUvVwWxXyYzZ0123456789>?()=@.:,;!<&fg";
		//generar una lista dinámica de 10 tamaños de las futuras claves
		for (int i = 0; i < 10; i++) {
			int tamaño = (int)(Math.random()*101);
			listaTamaño.add(tamaño);
		}
		for (Integer integer : listaTamaño) {
			for (int i = 0; i < integer; i++) {
				//generar de forma aleatoria las posiciones
				int posicion = (int)(Math.random()*101);
				char caracter = FUENTE_CARACTERES.charAt(posicion);
			}
		}
	}
}
