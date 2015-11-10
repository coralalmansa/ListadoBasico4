/**
 * Define la clase CerosYUnos que lea una secuencia de ceros y unos. Mostrará el número 
 * de ceros de la secuencia. Dejará de leer cuando el usuario introduzca el número 2. 
 *
 * @author Coral Almansa
 * @version 1.0
 */

public class CerosYUnos{
	public static void main(String[] args){
		int contadorCeros = 0;
		System.out.println("Introduzca una serie de 0 y 1. Para salir pulse 2: ");
		for(;;)
		{
			int numero = Teclado.leerEntero();
			if(numero==0)
				contadorCeros++;
			if(numero==2)
				break;
			if(numero!=0 || numero!=2)
				continue;
		}
		System.out.println("N\u00A3mero de ceros: "+contadorCeros);
	}
}