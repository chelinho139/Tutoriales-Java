/*http://chelintutorials.blogspot.com/
 *Chelin Tutorials 2011 Todos los Derechos Reservados.
 *Tut 66 - Synchronized
 */


public  class tut66Jugador {

	int vida;
	int curacion;
	
	tut66Jugador(){
		vida=10;
		curacion=5;		
	}
	
	synchronized void recibir_golpe(int cantidad){
		vida-=cantidad;	
		
		//Hacemos q espere 5ms para provocar un conflicto entre los metodos.
		try {Thread.sleep(5);} 
		catch (InterruptedException e){}
		
		vida+=curacion;
	}
	
	synchronized boolean esta_muerto(){
		return (vida<=0);
	}
	
	

}
