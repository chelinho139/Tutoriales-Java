/*http://chelintutorials.blogspot.com/
 *Chelin Tutorials 2011 Todos los Derechos Reservados.
 */
public class Guerrero extends Humano {
	
	//Atributo Adicional
	int  durabilidad;

	
	//Constructor
	Guerrero(String nombre){
		super(nombre); //simplemente llamo al constructor de su clase madre
	}	
	
	//Metodo Adicional
	void supergolpe(){
		System.out.println("El jugador "+ nombre +" uso supergolpe");
	}
	

	
}
