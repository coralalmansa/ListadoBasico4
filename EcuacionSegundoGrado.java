/**
 * Define la clase EcuacionSegundoGrado que muestre las soluciones de una
 * ecuación de segundo grado ax2 + bx + c = 0. Se le preguntará al usuario si
 * quiere repetir el programa. Utiliza métodos (deseaContinuar,
 * leerCoeficientes, mostrarResultados)
 *
 * @author Coral Almansa
 * @version 1.0
 */
 
public class EcuacionSegundoGrado{
	public static void main(String[] args){

		do{
			double a = leerCoeficientes("coeficiente a: ");
			double b = leerCoeficientes("coeficiente b: ");
			double c = leerCoeficientes("coeficiente c: ");
			mostrarResultados(a,b,c);
		}while(deseaContinuar());
	}//main


	/**
	* Lee los coeficientes de la ecuacion introducidos por teclado por el usuario.
	*
	* @param mensaje
	*/

	public static double leerCoeficientes(String mensaje){
		return Teclado.leerEntero("- Introduzca el "+mensaje);
	}


	/**
	* Muestra el resultado o resultados de la ecuación.
	*
	* @param double a Coeficiente 'a' de la ecuacion.
	* @param double b Coeficiente 'b' de la ecuacion.
	* @param double c Coeficiente 'c' de la ecuacion.
	*/
	static void mostrarResultados(double a, double b, double c){
		
		double x1 = (-b + (Math.sqrt((b*b)-(4*a*c))))/(2*a);
        double x2 = (-b - (Math.sqrt((b*b)-(4*a*c))))/(2*a);
		
        System.out.println("EL valor de x1 es: " + x1);
        System.out.println("EL valor de x2 es: " + x2);
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