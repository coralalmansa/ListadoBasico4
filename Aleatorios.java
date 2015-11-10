/**
*14. Define la clase Aleatorios que de forma repetitiva muestre un número aleatorio entre
*un mínimo y un máximo. Define el método generarAleatorio(min, max).
*
* @author Coral Almansa
* @version 1.0
*/

public class Aleatorios{
	public static void main(String[] args){
		int max = 0;
		int min = 0;

		do{
		System.out.println("Introduzca el valor minimo:");
		min = Teclado.leerEntero();
		System.out.println("Introduzca el valor m\u00A0ximo:");
		max = Teclado.leerEntero();

		if (max>min)
			System.out.println(generarAleatorio(min, max));
		else
			System.out.println("ERROR. El valor maximo debe ser mayor que el valor minimo ");
		}while (deseaContinuar());

	}//cierra main

	/**
	* Genera y devuelve un aleatorio entre dos valores enteros.
	*
	* @param min Valor mínimo
	* @param max Valor máximo
	* @return Numero aleatorio entre dos valores dados.
	*/

	static double generarAleatorio(int min , int max){
 		double aleatorio = max - min;
 		return (Math.random() * aleatorio) + min;
 		
 	} //cierra el metodo generarAleatorio()

	/**
	* Pregunta al usuario si desea continuar ejecutando el programa
	*
	* @return verdadero si se introduce s (minuscula o mayuscula), falso si se introduce n (minuscula o mayuscula)
	*/

	static boolean deseaContinuar(){
		char respuesta;
		do{
			System.out.println("\nDesea volver a ejecutar el calculo (S/N): ");
			respuesta = Character.toUpperCase(Teclado.leerCaracter());
		} while(respuesta!='S' && respuesta!='N');

			return respuesta=='S'?true:false;
	}//cierra el metodo deseaContinuar()
}