/**
*8. Define la clase Suma que realice una suma y la muestre. Para ello implementa el
*método sumar que devuelva la suma de dos números, solicitados por teclado.
*
* @author Coral Almansa
* @version 1.0
*/

public class Suma{
	public static void main(String[] args){

		do{
			System.out.println("La suma es: " + hallarSuma());
		}while (deseaContinuar());

	}//cierra main

	/**
	* Devuelve la suma de dos numeros
	* 
	* @return suma resultante
	*/
	static int hallarSuma(){
		System.out.println("Introduzca el primer numero:");
		int sum1 = Teclado.leerEntero();

		System.out.println("Introduzca el segundo numero:");
		int sum2 = Teclado.leerEntero();
		return sum1 + sum2;
	}//cierra el metodo "hallarSuma()"

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
	}
	
}