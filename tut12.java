/* http://chelintutorials.blogspot.com/
 * Chelin Tutorials 2011 Todos los Derechos Reservados.
 * Tut12 - Comparaciones Logicas */
public class tut12 {
	
	public static void main(String args[]){
		
		boolean resultado; //solo puede guardar true o false
		
		//creo dos enteros
		int x,y;
		x=5;
		y=3;
		
		resultado=  x==y; //x igual a y?
		System.out.println("resultado:"+resultado);
		
		resultado=  x>y; //x mayor a y?
		System.out.println("resultado:"+resultado);		
		
		resultado=  x<y; //x menor a y? 
		System.out.println("resultado:"+resultado);
		
		resultado=  x!=y; //x distinto a y?
		System.out.println("resultado:"+resultado);		
		
		//tmb esta >= y <= ...
		
	}

}
