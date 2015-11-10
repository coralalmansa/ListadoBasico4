/**
 * 19. Define la clase Potencia que calcule y visualice la potencia de un número dada la base 
 * y el exponente. Se le preguntará al usuario si quiere repetir el programa. Utiliza 
 * métodos
 * 
 * @author Coral Almansa
 * @version 1.0
 */

public class Potencia{
	public static void main(String[] args){
		do{
			potencia();
		}while(deseaContinuar());
	}
	
	/**
	 * @param base número base de la potencia
	 * @param exp exponente de la potencia
	 * @return resultado de la potencia
	 */
	
	public static double potencia(){
		mostrarInstrucciones("introBase");
		int base = Teclado.leerEntero();
		mostrarInstrucciones("introExp");
		int exp = Teclado.leerEntero();
		
		double resultado = Math.pow(base, exp);
		System.out.println("Resultado de la potencia: "+resultado);
		return resultado;
	}

	/**
	 * 
	 * @param tipo
	 */
	
	private static void mostrarInstrucciones(String tipo){
		if (tipo == "introBase")
			System.out.println("Introduzca el valor de la Base: ");
		else if (tipo == "introExp")
			System.out.println("Introduzca el valor del Exponente: ");
	}

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
