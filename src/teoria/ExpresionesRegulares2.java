package teoria;

import java.util.Scanner;

/*COn este programa, vamos a leer
 * dats desde la consola
 * usando la clase Scanner
 * y comprobamos que el tipo es correto
 */

public class ExpresionesRegulares2 {
	public static void main(String[] args) {
		System.out.println("Introduce valores:");
		Scanner in = new Scanner(System.in);
		//leemos un número entero, pero como cadena
		String numeroLeido = in.next();
		String expresionRegular = "[0-9]+";
		//convertimos el número en cadena
		if (numeroLeido.matches(expresionRegular)) {
			int numero = Integer.parseInt(numeroLeido);
			System.out.printf("El valor doble del número introducido es: %d\n", numero*2);
		}	
		else {
			System.out.println("No has introducido un número entero");
		}
		System.out.println("Introduce solo una palabra:");
		String palabra = in.next();
		expresionRegular = "[a-zA-Z]+";
		if (palabra.matches(expresionRegular)) {
			System.out.printf("La palabra introducida es: %s\n", palabra);
		}	
		else {
			System.out.println("No has introducido una palabra");
		}
		in.close();
	}

}
