/* http://chelintutorials.blogspot.com/
 * Chelin Tutorials 2011 Todos los Derechos Reservados.
 * Tut9 - Operaciones Matematicas */

public class tut09 {

	public static void main(String[] args) {
		
		int num1=25;
		int num2=13;
		int resultado;
		
		//Suma y Resta
		resultado = num1+num2;
		System.out.println("resultado: "+resultado);
		resultado = num1-num2;
		System.out.println("resultado: "+resultado);

		
		//Division entera y resto de la division (%)
		resultado = num1/num2;
		System.out.println("resultado: "+resultado);
		resultado = num1%num2;
		System.out.println("resultado: "+resultado);
		
		//Division tradicional
		//Debo tener almenos 1 objeto decimal (1.0f)
		float resultado2;
		resultado2 = 1.0f*  num1/num2;
		System.out.println("resultado2: "+resultado2);
		
		
	}

}
