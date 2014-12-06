/*http://chelintutorials.blogspot.com/
 *Chelin Tutorials 2011 Todos los Derechos Reservados.
 *Tut 22- Objetos
 */


public class tut22 {

	public static void main(String[] args) {
		
		//Creo distintas instancias del objeto Avion.
		Avion instancia1= new Avion();
		Avion instancia2= new Avion();
		Avion instancia3= new Avion();
		Avion instancia4= new Avion();
		
		//Cambio los valores de los atrubituso de instancia1
		instancia1.color="Blanco";
		instancia1.anio=1999;
		//Llamo al metodo de instancia1
		instancia1.arrancar_motor();
		
		//cambio el atributo de instancia2
		instancia2.color="Negro";
		
		//Imprimo los atributos
		System.out.println("la instancia1 en color tiene: "+ instancia1.color);
		System.out.println("la instancia2 en color tiene: "+ instancia2.color);
				
	}

}
