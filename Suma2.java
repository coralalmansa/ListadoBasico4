/**
*9. Define la clase Suma2 que realice una suma y la muestre. Para ello implementa el
*método sumar con los dos argumentos que sean los sumandos. Ha de devolver su
*suma. Documéntalo correctamente (@param y @return)
*
* @author Coral Almansa
* @version 1.0
*/

public class Suma2{
	public static void main(String[] args){
		int suma;

		do{
			System.out.println("Introduzca el primer numero:");
			int sum1 = Teclado.leerEntero();

			System.out.println("Introduzca el segundo numero:");
			int sum2 = Teclado.leerEntero();

			suma= hallarSuma(sum1, sum2); //invoca el método "hallarSuma()"
			System.out.println("La suma de "+ sum1 + " y " + sum2 + " es: " + suma);
		}while (deseaContinuar());


	}//cierra main

	/**
	* Devuelve la suma de dos números
	* 
	* @param sum1	sumando primero
	* @param sum2	sumando segundo
	*
	* @return Suma resultante
	*/
	static int hallarSuma(int sum1, int sum2){
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
	}//cierra el metodo deseaContinuar()
		
}