/**
 * 23. Define la clase LeeCinco que lea cinco valores numéricos y 
 * calcule su producto. Se le preguntará al usuario si quiere repetir 
 * el programa. Utiliza métodos (deseaContinuar, leerCincoNumeros, 
 * System.out.println(“El producto es: ' + calcularResultado()…)
 *
 * @author Coral Almansa
 * @version 1.0
 */
 
public class LeeCinco{
	public static void main(String[] args){

		do{
			int num1 = leerCincoNumeros("primer numero: ");
			int num2 = leerCincoNumeros("segundo numero: ");
			int num3 = leerCincoNumeros("tercer numero: ");
			int num4 = leerCincoNumeros("cuarto numero: ");
			int num5 = leerCincoNumeros("quinto numero: ");
			System.out.println("El producto es: " + calcularResultado(num1, num2, num3, num4, num5));
		}while (deseaContinuar());


	}//main

	

	public static int leerCincoNumeros(String mensaje){
		return Teclado.leerEntero("- Introduzca el "+mensaje); 
	}


	/**
	* Devuelve el resultado del producto de cinco numeros.
	*
	* @param num1, num2, num3, num4, num5 Numeros enteros introducidos por el usuario.
	* @return resultado Resultado del producto.
	*/
	public static int calcularResultado(int num1, int num2, int num3, int num4, int num5){
		int resultado = num1*num2*num3*num4*num5;
		return resultado;
	}

	/**
	* Pregunta al usuario si desea continuar ejecutando el programa
	*
	* @return verdadero si se introduce s (minuscula o mayuscula), falso si se introduce n (minuscula o mayuscula)
	*/
	static boolean deseaContinuar(){
		char respuesta;
		do{
			System.out.println("\nDesea volver a ejecutar el calculo? (S/N): ");
			respuesta = Character.toUpperCase(Teclado.leerCaracter());
		} while(respuesta!='S' && respuesta!='N');

		return respuesta=='S'?true:false;
	}

}