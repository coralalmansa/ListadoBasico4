/**
 * 24. Define la clase Alumnos que obtenga aleatoriamente las notas de 30 alumnos. 
 * La nota será un número decimal comprendido entre 0 y 10, ambos inclusive. 
 * Utiliza métodos. Al finalizar el programa deberá mostrar:
 * 	a. Total de notas
 *  b. Número de aprobados
 *  c. Número de suspensos
 *  d. Nota máxima
 *  e. Nota mínima
 *  f. Media
 *
 * @author Coral Almansa
 * @version 1.0
 */
 
public class Alumnos{
	public static void main(String[] args){

		int numAlumnos = 30, numAprobados=0;
		double nota, total = 0, mayor = -1, menor = 11;
	 
		for(int i= 0; i<numAlumnos;i++){
		nota = obtenerNota();
		System.out.println(nota);

		total += nota;
		if(estaAprobado(nota))
		numAprobados++;

		mayor = calcularMaxima(nota, mayor);
		menor = calcularMinima(nota, menor);
		}

	System.out.println("\nLa suma de las 30 notas es: " + total);
	System.out.println("El n\u00famero de aprobados es: " + numAprobados);
	System.out.println("El n\u00famero de suspensos es: " + (numAlumnos-numAprobados));
	System.out.println("La nota maxima es: " + mayor);
	System.out.println("La nota minima es: " + menor);
	System.out.println("La media es: " + (total/numAlumnos));

	}//main

	/**
	* Devuelve una nota que está comprendida entre el 0 y el 10.
	*
	* @return Entero positivo
	*/
	static double obtenerNota(){
		return Math.random()*10;
	}
	
	/**
	* Indica si la nota está aprobada
	*
	* @param nota Nota para comparar
	* @return true si está aprobada. false si no está aprobada
	*/
	static boolean estaAprobado(double nota){
		return (nota>=5)?true:false;
	}

	/**
	* Metodo que calcula la nota mayor.
	*
	* @param nota Nota para comparar
	* @param mayor Nota mayor
	* @return La nota mayor
	*/
	static double calcularMaxima(double nota, double mayor){
		if(nota>mayor){
		mayor = nota;
		}
		return mayor;
	}

	/**
	* Metodo que calcula la nota menor.
	*
	* @param nota Nota para comparar
	* @param menor Nota menor
	* @return La nota menor
	*/
	static double calcularMinima(double nota, double menor){
		if(nota<menor){
			menor = nota;
		}
		return menor;
	}




}