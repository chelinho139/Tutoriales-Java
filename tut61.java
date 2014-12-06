/*http://chelintutorials.blogspot.com/
 *Chelin Tutorials 2011 Todos los Derechos Reservados.
 *Tut 61 - Polimorfismo
 */


public class tut61 {

	public static void main(String[] args) {
		
		tut61Animal a1= new tut61Animal();
		tut61Pajaro a2= new tut61Pajaro();
		tut61Oso a3= new tut61Oso();
		tut61Pez a4= new tut61Pez();
		
		a1.moverse();
		a2.moverse();
		a3.moverse();
		a4.moverse();
		//Recuerden que el polimorfismo suele ser utilizado con algun ciclo (for, while)
		
		
		
		
	}

}
