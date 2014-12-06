/*http://chelintutorials.blogspot.com/
 *Chelin Tutorials 2011 Todos los Derechos Reservados.
 *Tut 28- Variables y metodos "Static"
 */

public class tut28 {

	public static void main(String[] args) {
		
		//creo algunas instancias
		claseestatica c1 = new claseestatica();
		claseestatica c2 = new claseestatica();
		claseestatica c3 = new claseestatica();	
		
		//modifico los atributos normales
		c1.x++;
		c2.x++;
		System.out.println("x de c: "+c1.x); //podemos ver que no hay cambio
		
		//modifico los atributos estaticos
		c1.incrementarx();
		c2.incrementarx();
		c3.incrementarx();
		claseestatica.xcompartida++; //tambien puedo modificar sin crear una instancia
		

		System.out.println("x comp de c1: "+c1.xcompartida);//vemos que cambio
		System.out.println("x comp de c3: "+c3.xcompartida);	
	}
	
	
	
	
	
	

}
