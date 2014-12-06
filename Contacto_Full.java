/*http://chelintutorials.blogspot.com/
 *Chelin Tutorials 2011 Todos los Derechos Reservados.
 */


public class Contacto_Full {
	//Atributos
	String nombre = "nombre Desconocido";
	long tel= 00000;
	long fecha_nacimiento = 00000;
	String email = "email Desconocido";
	String direccion =" direc Desconocida";
	
	//Constructores
	Contacto_Full(String cadena,long numero){
		nombre=cadena;
		tel=numero;
	}
	
	Contacto_Full(String cadena, long numero, long fecha){
		//Este constructor recibe ademas una fecha de nacimiento
		nombre=cadena;
		tel=numero;		
		fecha_nacimiento=fecha;
	}
	
	Contacto_Full(String cadena, long numero, long fecha, String correo, String direc){
		nombre=cadena;
		tel=numero;		
		fecha_nacimiento=fecha;
		email=correo;
		direccion=direc;
	}

	//Metodo para imprimir
	public void imprimir(){
		System.out.println(nombre + " tel: "+ tel);
		System.out.println("fecha N: "+ fecha_nacimiento);
		System.out.println(email + " " + direccion);
		System.out.println("----------------");
	}
	
	}
	





