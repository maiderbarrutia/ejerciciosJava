package conversionesTipoDatos;

public class MainConversiones {

	public static void main(String[] args) {
		
		
		
		
		//CASTING ENTRE VALORES NUMÉRICOS
		double num = 1.64;
		System.out.println("Double: " + num);
		
		//Casteo a entero
		int numInt = (int) num;
		System.out.println("Int: " + numInt);
		
		//Casteo a long
		long numLong = (long) num;
		System.out.println("Long: " + numLong);
		
		//Metodos de conversión
		
		//CASTING ENTRE DIFERENTES VALORES (CONVERSIÓN DE TIPOS): PASAR A NUMERO
		String cantidad = "15";
		String precio = "150.27";
		
		int cantEntero = Integer.parseInt(cantidad);
		System.out.println("Cantidad en número: " + cantEntero);
		
		double precioDouble = Double.parseDouble(precio);
		System.out.println("Precio en número: " + precioDouble);
		
		System.out.println("El valor total de la compra es: " + (cantEntero * precioDouble));
		
		
		//CASTING ENTRE DIFERENTES VALORES (CONVERSIÓN DE TIPOS): PASAR A STRING
		int edad = 30;
		double estatura = 1.67;
		
		String edadString = String.valueOf(edad);
		System.out.println("Edad en string: " + edadString);
		
		String estaturaString = String.valueOf(estatura);
		System.out.println("Edad en string: " + estaturaString);
		
	}

}
