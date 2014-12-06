/*http://chelintutorials.blogspot.com/
 *Chelin Tutorials 2011 Todos los Derechos Reservados.
 */

public class Contacto {
	//Atributos
	String nombre;
	int edad;
	
	//Metodos
	Contacto(String cadena,int numero){
		nombre=cadena;
		edad=numero;
		imprimir();
	}
	
	
	void imprimir(){
		System.out.println(nombre+" edad: "+edad);
	}

}
