package teoria;

public class ExpresionesRegulares1 {
	public static void main(String[] args) {
		String cadena = "Java";
		String expresionRegular = "Java";
		//ejemplos sencillos
		System.out.printf("%s encaja con %s, %b\n", cadena, expresionRegular, cadena.matches(expresionRegular));
		expresionRegular = "java";
		System.out.printf("%s encaja con %s, %b\n", cadena, expresionRegular, cadena.matches(expresionRegular));
		//ejemplos de uno del . (cualquier caracter excepto saltos de linea)
		System.out.printf("%s encaja con %s, %b\n", "hola mundo", "hol. mundo", "hola mundo".matches("hol. mundo"));
		//añadimos el + 1 o más ocurrencias
		System.out.printf("%s encaja con %s, %b\n", "hola mundo", "hol.+", "hola mundo".matches("hol.+"));
		System.out.printf("%s encaja con %s, %b\n", "hola mundo", "hol.*", "hola mundo".matches("hol.*"));
		//usamos [abcd] que contiene alguno de  estos caracteres
		System.out.printf("%s encaja con %s, %b\n", "hola mundo", "hol[aei] mundo", "hola mundo".matches("hol[aei] mundo"));
		//usamos [bcd] que contiene alguno de  estos caracteres
		System.out.printf("%s encaja con %s, %b\n", "hola mundo", "hol[ei] mundo", "hola mundo".matches("hol[ei] mundo"));
		//uso de expresiones como [a-z]
		System.out.printf("%s encaja con %s, %b\n", "hola mundo", "hol[a-z] mundo", "hola mundo".matches("hol[a-z] mundo"));
		//vamos a cambiar [] con * + ?
		System.out.printf("%s encaja con %s, %b\n", "hola mundo", "hol[a-z]+", "hola mundo".matches("hol[a-z]+"));
		//usamos \w
		System.out.printf("%s encaja con %s, %b\n", "hola mundo", "hol\\w+ \\w+", "hola mundo".matches("hol\\w+ \\w+"));
	}
}
