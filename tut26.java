/*http://chelintutorials.blogspot.com/
 *Chelin Tutorials 2011 Todos los Derechos Reservados.
 *Tut 26- Mas Sobre Constructores
 */


public class tut26 {
	
	public static void main(String args[]){
		
		Contacto_Full c1= new Contacto_Full("Chelo",1565488631);
		c1.imprimir();

		Contacto_Full c2= new Contacto_Full("Bob",12313123,200898);
		c2.imprimir();
		

		Contacto_Full c3= new Contacto_Full("Berto",1231311123,220898,"chelo_c@live.com","BuenosAires 231");
		c3.imprimir();
		
		
	}
	

}
