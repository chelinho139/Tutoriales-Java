/*http://chelintutorials.blogspot.com/
 *Chelin Tutorials 2011 Todos los Derechos Reservados.
 */


public class claseestatica {
	
	int x=0;//atributo normal
	static int xcompartida =0; //atributo estatico
	
	
	static void imprimir(){
		//obs: los metodos estaticos no pueden acceder a atributos de las instancias
	}
	
	static void incrementarx(){
		//metodo utilizado para incrementar la variable estatica
		xcompartida++;
	}
	

}
