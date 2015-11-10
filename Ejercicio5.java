/**
* 5. Indica el resultado de las siguientes expresiones, suponiendo que inicialmente x vale 1:
* a. (1 > x) && ( 1 > x++)
* b. (1 == x) || (10 > x++)
* c. (++x) + x;
* d. x + (++x)
* e. (1 > x) || ( 1 > x--)
* f. (1 > x) || ( 1 > --x)
*
* @author Coral Almansa
* @version 1.0
*/

public class Ejercicio5 {
    public static void main(String[] args) {

        int x=1;
		boolean expresionA=(1 > x) && ( 1 > x++); //false
		System.out.println("El resultado de A:"+expresionA);

		x=1;
		boolean expresionB=(1 == x) || (10 > x++); //true
		System.out.println("El resultado de B:"+expresionB);

		x=1;
		int expresionC=(++x) + x; //4
		System.out.println("El resultado de C:"+expresionC);

		x=1;
		int expresionD=x + (++x); //3
		System.out.println("El resultado de D:"+expresionD);

		x=1;
		boolean expresionE=(1 > x) || ( 1 > x--); //false
		System.out.println("El resultado de E:"+expresionE);

		x=1;
		boolean expresionF=(1 > x) || ( 1 > --x); //true				
		System.out.println("El resultado de E:"+expresionF);
	}
}