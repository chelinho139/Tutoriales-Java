/*http://chelintutorials.blogspot.com/
 *Chelin Tutorials 2011 Todos los Derechos Reservados.
 */
public class Personaje {

	//Atributos
	String nombre;
	int nivel=1, fuerza=15, magia=10;
	
	//Metodos
	
	//Constructor
	Personaje (String nombre){  //Recibo un nombre por parametro y lo guardo
		this.nombre=nombre;
	}
	
	void mover(){
		System.out.println("Se movio el personaje "+nombre);
	}
	
	void atacar(){
		System.out.println("Ataco el personaje "+nombre);
	}	
	
}
