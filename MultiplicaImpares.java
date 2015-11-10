/**
* 16. Define la clase MultiplicaImpares que multiplique los 20 primeros números impares y 
* muestre el resultado en pantalla.
*
*@author Coral Almansa
*@version 1.0
*
*/

public class MultiplicaImpares {
	public static void main(String[] args){
		  int cont=1;
     for (int i=1;i<40;i=i+2) 
         cont=cont*i;
     System.out.println("El producto de los 20 primeros numeros impares es: "+cont); 			
	}
}