/*http://chelintutorials.blogspot.com/
 *Chelin Tutorials 2011 Todos los Derechos Reservados.
 *Tut 66 - Syncronized Threads
 */

public class tut66 {


	public static void main(String[] args) {
		
		tut66Jugador jugador1 = new tut66Jugador();
		
		Thread1 thread1 = new Thread1(jugador1); //thread1
		Thread2 thread2 = new Thread2(jugador1); //thread2
	}

}
/*--------------------------------------------------------------------------*/

/*Esta thread recibe el golpe en el jugador*/
class Thread1 extends Thread{
	
	tut66Jugador jugador;
	
	public Thread1(tut66Jugador passjugador){
		jugador=passjugador;
		start();
	}
	public void run(){
		jugador.recibir_golpe(12);
	}
	
}
/*--------------------------------------------------------------------------*/

/*Esta thread imprime el estado del jugador*/
class Thread2 extends Thread{
	
	tut66Jugador jugador;
	
	public Thread2(tut66Jugador passjugador){
		jugador=passjugador;
		start();
	}
	public void run(){
		if(jugador.esta_muerto())System.out.println("El jugador esta muerto");
		else System.out.println("El jugador esta vivo");
	}

	
}



