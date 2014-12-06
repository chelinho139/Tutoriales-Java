/*http://chelintutorials.blogspot.com/
 *Chelin Tutorials 2011 Todos los Derechos Reservados.
 */


public class claseprivada {
	//Los atributos y metodos privados solo pueden ser accedidos por la misma clase
	private String cadena= "cadena privada";
	private int numero =12;
	
	private void metodo1(){
		System.out.println("metodo privado");
	}
	
	
	//Estos metodos me van a permitir modificar y obtener los atributos privados
	public void setCadena(String cad){
		cadena=cad;
	}
	
	public String getCadena(){
		return cadena;
	}
	
	
	
	
}
