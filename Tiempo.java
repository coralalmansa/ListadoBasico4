/**
*25. Define la clase Tiempo que dada una medida de tiempo expresada en horas, minutos y
*segundos con valores arbitrarios, elabore un programa que transforme dicha medida
*en una expresión correcta. Por ejemplo, dada la medida 3h 118m 195s, se deberá
*obtener como resultado 5h 1m 15s
*
*@author Coral Almansa
*@version 1.0
*/
class Tiempo{
	public static void main(String[] args){
		
		int h, m, s;
		
		System.out.println("Introduzca un numero de horas:");
		h=Teclado.leerEntero();
		System.out.println("Introduzca un numero de minutos:");
		m=Teclado.leerEntero();
		System.out.println("Introduzca un numero de segundos:");
		s=Teclado.leerEntero();

		calcularTiempo(h, m, s);
		
		
	}//main


	/**
	* Calcula y muestra el resultado
	*
	* @param h, m, s Horas, minutos y segundos introducidos por el usuario.
	*/
	public static void calcularTiempo(int h, int m, int s){
		do{
			if(m>=60){
				m-=60;
				h++;
			}
			if(s>=60){
				s-=60;
				m++;
			}
		}while(m>=60 || s>=60);		
		System.out.println("Serian " +h+" horas "+m+" minutos y "+s+" segundos");		
	}
	
}