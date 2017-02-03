package Ejercicios;

import java.util.Scanner;

public class TestPalabra {
	public static void main(String[] args) {
		System.out.println("Introduce una palabra:");
		Scanner in = new Scanner(System.in);
		String palabra = in.next();
		PalabraLeida p = new PalabraLeida(palabra);
		//Devuelve primer m�todo
		System.out.printf("%s tiene %d letras\n",p,p.obtenerNumeroLetras());
		//Devuelve segundo y tercer m�todo
		System.out.printf("%s empieza por vocal: %b, " + "acaba en vocal: %b\n",p,p.empiezaPorVocal(),p.terminaPorVocal());
		//Devuelve cuarto m�todo
		System.out.printf("%s contiene h o H:%b\n",p,p.contieneH());
		//Devuelve quinto m�todo
		System.out.printf("%s tiene %d vocales\n",p,p.obtenerNumeroVocales());
		//Devuelve sexto m�todo
		System.out.printf("%s es pal�ndromo: %b\n",p,p.esPalindromo());
		//Devuelve septimo m�todo
		System.out.printf("%s es igual a %s: %b\n",p,("prueba"),p.sonIguales("prueba"));
		
	}
}
