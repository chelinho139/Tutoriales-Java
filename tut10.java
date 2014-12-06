/* http://chelintutorials.blogspot.com/
 * Chelin Tutorials 2011 Todos los Derechos Reservados.
 * Tut10 - Operadores de Incremento */
public class tut10 {

	public static void main(String[] args) {
		
		int var1=0;
		int var2=3;
		
		//Asignacion Rapida
		//Es lo msimo que hacer var1= var1 + var2;
		var1+= var2;
		var1-= var2;
		var1*= var2;
		var1/= var2;
		
		//Asignacion Unitaria (resto o sumo 1)
		//var1+=1;
		var1++;
		var1++;
		var1++;
		
		//var1-=1;
		var1--;
		var1--;
		var1--;
		
		//imprimirlo
		System.out.println("var1 es "+var1);
		
		
	}

}
