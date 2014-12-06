/*http://chelintutorials.blogspot.com/
 *Chelin Tutorials 2011 Todos los Derechos Reservados.
 *Tut 30 - Herencia
 */


public class tut30 {

	public static void main(String[] args) {
		
		//creo un mago
		Mago mago1 = new Mago("Merlin");
		mago1.mover();
		mago1.atacar();
		mago1.bola_de_fuego();

		
		//creo un guerrero
		Guerrero guer1 = new Guerrero("Arthas");
		guer1.diplomacia();
		guer1.atacar();
		guer1.mover();
		guer1.supergolpe();

		
	}

}
