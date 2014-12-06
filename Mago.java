/*http://chelintutorials.blogspot.com/
 *Chelin Tutorials 2011 Todos los Derechos Reservados.
 */
public class Mago extends Humano {

	//Atributo Adicional
	int  poder;
	
	
	//Constructor
	Mago(String nombre){
		super(nombre); //simplemente llamo al constructor de su clase madre
	}		
	
	//Metodo Adicional
	void bola_de_fuego(){
		System.out.println("El jugador "+ nombre +" uso bola_de_fuego");
	}
	

	
	
}
