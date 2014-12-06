/*http://chelintutorials.blogspot.com/
 *Chelin Tutorials 2011 Todos los Derechos Reservados.
 *Tut 23- Metodos 
 */


public class tut23 {
	
	public static void main(String args[]){
		
		int suma;
		
		Punto p1 = new Punto();
		p1.x=3;
		p1.y=5;
		
		//este metodo no devuelve nada
		p1.imprimir_punto();
		
		//suma=p1.x+p1.y;
		
		//este metodo devuelve un entero
		suma= p1.suma_x_y();
		System.out.println("suma:"+suma);
		
	}

}
