/*http://chelintutorials.blogspot.com/
 *Chelin Tutorials 2011 Todos los Derechos Reservados.
 *Tut 18 - Ciclos y Condiciones
 */

public class tut18 {

	public static void main(String[] args) {
		int i=0;
		int c;
		float b= 0;
		
		while (i<10){
			//Ciclo while
			if (b==2){
				//Condicion if
				System.out.println("b es igual a 2 hago un ciclo");
				
				for (c=0;c<5;c++){
					//Ciclo For 
					System.out.println("ciclo dentro del if b==2...");
				}
				
			}
			
			i++;
			b+=2;
			System.out.println("i: "+i + " b: "+b);
		}

		
		
	}

}
