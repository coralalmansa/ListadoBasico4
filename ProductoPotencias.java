/**
 * Define la clase ProductoPotencias que calcule y visualice el producto de las potencias 
 * de 2 entre 0 y 10.
 *
 * @author Coral Almansa
 * @version 1.0
 */

public class ProductoPotencias{
	public static void main(String[] args){
		System.out.println("\n\tVamos a calcular el producto de las portencias de 2 entre 0 y 10:");
		mostrarResultado(calcularProducto());

	}//cierra main


	/**
	* Método que muestra el resultado.
	*/
	static void mostrarResultado(long resultado){
		System.out.println("\n\tEl producto de las potencias de 2 entre 0 y 10 es: " + resultado); 
	}//cierra el metodo mostrarResultado()

	/**
	* Método que devuelve el producto de las potencias de 2 entre 0 y 10
	*
	* return Producto resultante
	*/
	static long calcularProducto(){
		long producto = 1;
		for (int i = 0; i<11; i++)
	 	producto *= calcularPotencia(i);

	 	return producto;
	}//cierra el método calcularProducto()

	/**
	* Devuelve el n&utilde;mero 2 elevado al argumento
	*
	* return El 2 elevado al exponente
	*/
	static long calcularPotencia(int exp){
		long potencia = 1;
	 	for (int i = 0; i<exp; i++)
	 	potencia *= 2;
	 
		return potencia;
	}//cierra el metodo calcularPotencia()

	
}