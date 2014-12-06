/*http://chelintutorials.blogspot.com/
 *Chelin Tutorials 2011 Todos los Derechos Reservados.
 *Tut 62 - Polimorfismo con un Vector
 */

import java.util.Vector;


public class tut63 {

	public static void main(String[] args) {
		
		Vector<tut61Animal> mi_vector = new Vector<tut61Animal>();
		
		mi_vector.add(new tut61Oso()); //me permite agregar un objeto al vector
		mi_vector.add(new tut61Pez());
		mi_vector.add(new tut61Pajaro());
		mi_vector.add(new tut61Pajaro());
		mi_vector.add(new tut61Pajaro());
		mi_vector.add(new tut61Pez());
		
		System.out.println(mi_vector.size()); //me deuvuelve el tamano
		
		
		for(int i = 0;i<mi_vector.size();i++){
			(mi_vector.elementAt(i)).moverse();
		}
		

		
		
		
	}

}