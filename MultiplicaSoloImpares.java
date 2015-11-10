/**
 * 17. Define la clase MultiplicaSoloImpares que multiplique 20 números impares leídos
 * desde teclado y muestre el resultado en pantalla. Define al menos los métodos
 * mostrarInstrucciones y leerImpar.
 *
 * @author Coral Almansa
 * @version 1.0
 *
 */

public class MultiplicaSoloImpares{
	public static void main(String[] args){
		int num;
		double total = 1;

		mostrarInstrucciones("intro");
		for(int i = 0; i < 20; i++){
		
			num = leerImpar();
			System.out.println(total + " * " + num + " = " + (total *= num));
		}
	}

	/**
	 * Muestra las instrucciones del programa.
	 * @param tipo El tipo de mensaje a mostrar.
	 */
	static void mostrarInstrucciones(String tipo){
		if (tipo == "intro")
			System.out.println("Introduce 20 n\u00A3meros impares que ser\u00A0n multiplicados.");
		else if (tipo == "leer")
			System.out.print("Introduce un n\u00A3mero impar: ");
		else if (tipo == "invalido")
			System.out.println("El n\u00A3mero introducido no es v\u00A0lido.");
	}

	/**
	 * Lee números impares introducidos por teclado.
	 * @return El número introducido, si es impar.
	 */
	static int leerImpar(){
		int num;
		do{
		
			mostrarInstrucciones("leer");
			num = Teclado.leerEntero();
			if (num % 2 == 0)
				mostrarInstrucciones("invalido");
		}
		while(num % 2 == 0); // Si el número introducido es par sigue preguntando.

		return num;
	}
}