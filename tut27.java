/*http://chelintutorials.blogspot.com/
 *Chelin Tutorials 2011 Todos los Derechos Reservados.
 *Tut 27 - Modificadores Public y Private 
 *Cosas publicas pueden ser accedidas por todo el mundo
 *Cosas privadas solamente por la  misma clase
 *
 */


public class tut27 {

	public static void main(String args[]){
		//creo una clase publica
		clasepublica c1 = new clasepublica();
		//creo una clase privada
		claseprivada c2 = new claseprivada();
		
		
		//Clase PUBLICA
		//imprimo y modifico las cosas publicas 
		c1.cadena="cambie lacadena publica";
		System.out.println(c1.cadena);
		System.out.println(c1.numero);
		
		
		//Clase Privada 
		// si quiero hacer esto: c2.numero=3  tengo q usar un metodo publico;
		//modifico y luego imprimo utilizando estos metodos publicos
		c2.setCadena("cambie la cadena privada");
		System.out.println(c2.getCadena());
		
		
	}
	
}







