/**
*10. Define la clase DeseaContinuar que realice la siguiente pregunta: Desea continuar
*(s/n). En caso de que el usuario indique una s (minúscula o mayúscula) el programa
*seguirá preguntando. En otro caso, que se salga del programa. Para ello implementa el
*método continuar que devuelva true en caso de introducir una s, y false en caso
*contrario. Documéntalo correctamente (@return)
*
* @author Coral Almansa
* @version 1.0
*/

public class DeseaContinuar{
	public static void main(String[] args){

		deseaContinuar();
	}//cierra main

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
