/*http://chelintutorials.blogspot.com/
 *Chelin Tutorials 2011 Todos los Derechos Reservados.
 *Tut 62 - Polimorfismo con un Vector
 */

import java.util.Vector;


public class tut62 {

	public static void main(String[] args) {
		
		Vector<tut61Animal> mi_vector = new Vector<tut61Animal>();
		
		mi_vector.add(new tut61Oso()); //me permite agregar un objeto al vector
		mi_vector.add(new tut61Pez());
		mi_vector.add(new tut61Pajaro());
		
		(mi_vector.elementAt(0)).moverse(); //me devuelve el elemento en una determinada posicon
		
		
		mi_vector.add(0,new tut61Pajaro()); //agregar en la pos 0
		
		(mi_vector.elementAt(0)).moverse();
		
		
		
	}

}