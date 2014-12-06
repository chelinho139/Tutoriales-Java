/*http://chelintutorials.blogspot.com/
 *Chelin Tutorials 2011 Todos los Derechos Reservados.
 *Tut 19 - Break & Continue
 */

public class tut19 {

	public static void main(String[] args) {
		
		int i=0;
		int x=0;
		
		
		//Ejemplo de break
		while (i<10){
			i++;			
			if (i==6){
				break; //Esto me rompe el ciclo completamente
			}
			
			System.out.println("i: "+i);
		}
		//Fin del ciclo while
		System.out.println("Fin del ciclo i:"+i);
		
		
		//Ejemplo de continue
		while (x<10){
			x++;			
			if (x==6){
				continue; //continue me saltea un loop del ciclo, es decir todo lo q sigue en ese ciclo
			}
			System.out.println("x: "+x);
			
		}
		//Fin del ciclo
		System.out.println("Fin del ciclo x:"+x);

	}
}
