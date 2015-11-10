/**
*12. Define la clase Resta que realice de forma repetitiva restas y las muestre, siempre y
*cuando el usuario responda afirmativamente a la pregunta: 'Desea continuar (s/n)'.
*Para ello utiliza un método continuar (ejercicio anterior) e implementa también el
*método restar con los dos argumentos que sean los operandos. Ha de devolver su
*diferencia. Documéntalo correctamente (@param y @return)
*
* @author Coral Almansa
* @version 1.0
*/

public class Resta{
	public static void main(String[] args){
		int resta;

		do{
			System.out.println("Introduzca el minuendo:");
			int minuendo = Teclado.leerEntero();

			System.out.println("Introduzca el sustraendo:");
			int sustraendo = Teclado.leerEntero();

			resta = hallarResta(minuendo, sustraendo);
			System.out.println("El resultado de la resta es: " + resta);
		}while (deseaContinuar());

	}//cierra main

	/**
	* Resta dos numeros solicitados por teclado
	* 
	* @param minuendo	primer n&uacute;mero
	* @param sustraendo	segundo n&uacute;mero
	*
	* @return resta resultante
	*/
	static int hallarResta(int minuendo, int sustraendo){
		return minuendo -  sustraendo;
	}//cierra el metodo "hallarResta()"

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