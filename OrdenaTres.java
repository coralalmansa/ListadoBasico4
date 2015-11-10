/**
 * 21. Define la clase OrdenaTres que ordene tres números enteros 
 * introducidos por teclado y los muestre por pantalla de forma decreciente. 
 * Se le preguntará al usuario si quiere repetir el programa. Utiliza métodos 
 * (deseaContinuar, leerTresEnteros, mostrarResultados…)
 *
 * @author Coral Almansa
 * @version 1.0
 */
 
public class OrdenaTres{
	public static void main(String[] args){
		int num1;
		int num2;
		int num3;

		do{
			num1=leerTresEnteros("Introduce un numero: ");
			num2=leerTresEnteros("Introduce otro numero: ");
			num3=leerTresEnteros("Introduce otro numero: ");
			mostrarResultados(num1,num2,num3);
		}while(deseaContinuar());

	}//main


	static int leerTresEnteros(String mensaje){
		System.out.print(mensaje);
		return Teclado.leerEntero();
	}


	/**
	* Compara tres numeros y los ordena de forma decreciente.
	*
	* @param num1 Primer numero
	* @param num2 Segundo numero
	* @param num3 Tercer numero
	**/
	static void mostrarResultados(int num1, int num2, int num3){
		if (num1<num2 && num1<num3)
		if (num2<num3)
			System.out.println("\n" + num1 + " < " + num2 + " < " + num3);
		else
			System.out.println("\n" + num1 + " < " + num3 + " < " + num2);
		else if (num2<num1 && num2<num3)
		if (num1<num3)
			System.out.println("\n" + num2 + " < " + num1 + " < " + num3);
		else
			System.out.println("\n" + num2 + " < " + num3 + " < " + num1);
		else if (num3<num1 && num3<num2)
		if (num1<num2)
			System.out.println("\n" + num3 + " < " + num1 + " < " + num2);
		else
			System.out.println("\n" + num3 + " < " + num2 + " < " + num1);
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
	}

}