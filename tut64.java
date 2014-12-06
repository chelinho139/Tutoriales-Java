/*http://chelintutorials.blogspot.com/
 *Chelin Tutorials 2011 Todos los Derechos Reservados.
 *Tut 62 - Polimorfismo con un Vector
 */

import java.util.Iterator;
import java.util.Vector;


public class tut64 {

	public static void main(String[] args) {
		
		Vector<tut61Animal> mi_vector = new Vector<tut61Animal>();
		
		mi_vector.add(new tut61Oso()); //me permite agregar un objeto al vector
		mi_vector.add(new tut61Pez());
		mi_vector.add(new tut61Pajaro());

		Iterator<tut61Animal> iterador  = mi_vector.iterator();
		
		while (iterador.hasNext()){
			(iterador.next()).moverse();
		}
		

		

		
		
		
	}

}