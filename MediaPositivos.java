/**
* 18. Define la clase MediaPositivos que calcule la media de una serie de números positivos, 
* introducidos por teclado. Dejará de leer cuando el usuario introduzca el 0. Utiliza 
* métodos. 
*
*@author Coral Almansa
*@version 1.0
*
*/

public class MediaPositivos{
	public static void main(String[] args){
 		double total=0;
 		double mediaNumero=media(total);
 		System.out.println("Media de los n\u00A3meros introducidos" +mediaNumero);
 		}
 	public static double numero(){
 		System.out.println("Introduzca un n\u00A3mero: ");
 		int num=Teclado.leerEntero();
 		return num;
 	}

 	static double media(double total){
 		double suma = 0;
 		for (int i=0;; i++){
 			double entero = numero();
 			if(entero>0){
 				suma=(suma+entero);
 			}if (entero<0){
 				System.out.println("Introduzca n\u00A3meros positivos");
 			}if (entero==0){
 				total=suma/i;
 				break;
 			}
 		}return total;
 	}
}

