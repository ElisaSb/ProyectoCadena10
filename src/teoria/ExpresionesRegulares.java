package teoria;

import java.util.Scanner;

public class ExpresionesRegulares {
	public static void main(String[] args) {
		System.out.println("Introduce un DNI o un NIF");
		Scanner in = new Scanner(System.in);
		String valorIntroducido = in.next();
		String expresionRegular = "[\\d[{8}+[TRWAGMYFPDXBNJZSQVHLCKE]?";
			if (valorIntroducido.matches(expresionRegular)) {
				System.out.printf("El valor introducido es correcto: %s", valorIntroducido);
			}	
			else {
				System.out.println("No has introducido un valor correcto.");
			}
		in.close();
	}
}
