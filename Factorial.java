/**
 * 22. Define la clase Factorial que muestre el factorial de un número 
 * introducido por teclado. (Factorial (4) = 4*3*2*1; Factorial (0) = 1) 
 * Realízalo con los tres bucles (factorialFor(), factorialDoWhile(), factorialWhile())
 *
 * @author Coral Almansa
 * @version 1.0
 */
 
public class Factorial{
	public static void main(String[] args){

		System.out.println("Introduzca un numero para calcular su factorial: ");
		int numero = Teclado.leerEntero();
		factorialFor(numero);
		factorialDoWhile(numero);
		factorialWhile(numero);

	}//main
	
	/**
	* Calcula y devuelve el factorial de un numero con el bucle FOR.
	*
	* @param numero Numero entero introducido por el usuario.
	*/
	static void factorialFor(int numero){
		int resultado = 1;
		for (int i=numero;numero>1;numero--) {
			resultado *= numero;
		}
		System.out.println("Factorial con for: " + resultado);
	}

	/**
	* Calcula y devuelve el factorial de un numero con el bucle Do...while.
	*
	* @param numero Numero entero introducido por el usuario.
	*/
	static void factorialDoWhile(int numero){
		int resultado = 1;
		do{
			resultado *= numero;
			numero--;
		}while(numero > 1);

		System.out.println("Factorial con do...while: " + resultado);
	}


	/**
	* Calcula y devuelve el factorial de un numero con el bucle WHILE.
	*
	* @param numero Numero entero introducido por el usuario.
	*/
	static void factorialWhile(int numero){
		int resultado = 1;

		while(numero > 1){
			resultado *= numero;
			numero--;
		}

		System.out.println("Factorial con while: " + resultado);
	}

}