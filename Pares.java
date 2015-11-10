/**
*13. Define la clase Pares que de forma repetitiva indique si un número es par o impar.
*Define el método esPar(int)
*
* @author Coral Almansa
* @version 1.0
*/

public class Pares{
	public static void main(String[] args){
		
		do{
			System.out.println("Introduzca un n\u00A3mero para comprobar si es par: ");
			int numero = Teclado.leerEntero();

			esPar(numero);

		}while (deseaContinuar());

	}//cierra main

	/**
	* Comprueba si un numero solicitado por teclado es par o impar y lo muestra.
	* 
	* @param numero Entero pasado como argumento.
	*/
	static void esPar(int numero){
		if (numero%2==0){
			System.out.println("El n\u00A3mero indicado es par.");
		}else{
			System.out.println("El n\u00A3mero indicado es impar.");
		}

	}//cierra el metodo "esPar()"

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