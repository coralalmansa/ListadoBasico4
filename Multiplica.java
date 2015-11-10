/**
*11. Define la clase Multiplica que realice de forma repetitiva multiplicaciones y las
*muestre, siempre y cuando el usuario responda afirmativamente a la pregunta:
*'¿Desea continuar? (s/n)'. Para ello utiliza un método continuar (ejercicio anterior) e
*implementa también el método multiplicar con los dos argumentos que sean los
*factores. Ha de devolver su producto. Documéntalo correctamente (@param y @return)
*
* @author Coral Almansa
* @version 1.0
*/

public class Multiplica{
	public static void main(String[] args){

		int multiplicacion;

		do{
			System.out.println("Introduzca el primer numero:");
			int num1 = Teclado.leerEntero();

			System.out.println("Introduzca el segundo numero:");
			int num2 = Teclado.leerEntero();

			multiplicacion= hallarMultiplicacion(num1, num2); //invoca el metodo "hallarMultiplicacion()"
			System.out.println("El producto de "+ num1 + " y " + num2 + " es: " + multiplicacion);

		}while (deseaContinuar());


	}//cierra main
		
	/**
	* Devuelve el producto de dos numeros
	* 
	* @param num1	factor primero
	* @param num2	factor segundo
	*
	* @return multiplicacion resultante
	*/
	static int hallarMultiplicacion(int num1, int num2){
		return num1 * num2;
	}//cierra el metodo "hallarMultiplicacion()"

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