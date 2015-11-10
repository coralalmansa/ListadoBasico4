/**
*15. Define la clase IvaConMetodos que calcule los impuestos que se aplican a un precio
*base en función de si el iva es superreducido (4%), reducido (10%) o general (21%).
*
*Para ello define y usa los siguientes métodos:
*	a. pedirIVA()
*	b. pedirPrecio()
*	c. continuar()
*	d. calcularIva(double, char)
*
* @author Coral Almansa
* @version 1.0
*/

public class IvaConMetodos{
	public static void main(String[] args){
		char tipoIva;
		double precio;


		do{
			tipoIva = pedirIva();
			System.out.println("El IVA " + tipoIva + " de " + precio + " es: " + calcularIva(pedirPrecio(), tipoIva));
		}while (deseaContinuar());

	}//cierra main

	/**
	* Pide el precio base sobre el que aplicar el tipo de Iva
	* @return Precio base
	*/

	public static double pedirPrecio(){
		int precio;
		do{
			System.out.println("Introduzca un precio: ");
			precio = Teclado.leerEntero();
		}while (precio<=0);
		return precio;
	}//cierra el metodo pedirPrecio()


	/**
	* Pide el tipo de Iva a aplicar
	* @return Caracter que representa el tipo de Iva
	*/

	public static char pedirIva(){
		char tipoIva;
		do{
			System.out.println ("Indica el tipo de IVA: superreducido, reducido y general (s/r/g)");
			tipoIva=Teclado.leerCaracter();
			System.out.println(tipoIva);
		}while(tipoIva!='s' && tipoIva!='S' && tipoIva!='r' && tipoIva!='R' && tipoIva!='g' && tipoIva!='G');
		return tipoIva;
	}//cierra el metodo pedirIva()



	/**
	* Calcula el precio final aplicando los distintos tipos de Iva
	*
	* @param precio Precio base al que aplicar el Iva
	* @param tipoIva Tipo de Iva a aplicar
	* @return Precio final con Iva aplicado
	*/
	static double calcularIva(double precio, char tipoIva){
		double iva=0;
		switch(tipoIva){
			case 's':
				iva=0.04;
				break;
			case'S':
				iva=0.04;
				break;
			case 'r':
				iva=0.10;
				break;
			case 'R':
				iva=0.10;
				break;
			case 'g':
				iva=0.21;
				break;
			case 'G':
				iva=0.21;
				break;
		}
		return precio*iva;

	
	}//cierra el metodo calcularIva()


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