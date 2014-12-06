/*http://chelintutorials.blogspot.com/
 *Chelin Tutorials 2011 Todos los Derechos Reservados.
 *Tut 17 - Ciclo While 
 *
 *while (condicion){
 *	su_codigo
 *	}
 */


public class tut17 {
	
	public static void main (String args[]){
		
		int i=0;
		
		
		while (i>10){
			//Se repite mientras se cumpla la condicion
			System.out.println("Ciclo i:"+i);
			i++; //cuidado con la condicion, sin esta linea entrariamos en un ciclo
				 //infinito
		}
		
		System.out.println("Fuera del Ciclo i:"+i);
		
	}
	
}
