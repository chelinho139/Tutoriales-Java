/*http://chelintutorials.blogspot.com/
 *Chelin Tutorials 2011 Todos los Derechos Reservados.
 */
public class Humano extends Personaje {
	
	//Atributo Adicional
	String Descendencia;
	
	//Constructor
	Humano(String nombre){
		super(nombre); //simplemente llamo al constructor de su clase madre
	}
	
	//Metodo Adicional
	void diplomacia(){
		System.out.println("El jugador "+ nombre +" uso diplomacia");
	}
	

}
