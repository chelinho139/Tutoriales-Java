/*http://chelintutorials.blogspot.com/
 *Chelin Tutorials 2011 Todos los Derechos Reservados.
 *Tut 65 - Threads Runnable
 */

public class tut65 implements Runnable{
	
	int numero;//extra para imprimir un numero
	
	tut65(int numero){
		this.numero=numero; //me guardo un numero
		
		Thread thread = new Thread(this); //Pasarle como parametro la clase runnable
		thread.start();
	}
	

	/*Bloque que quiero correr en un thread(hilo)*/
	public void run() {
		//Puede ser cualquier codigo, he aqui un ejemplo:
		
		while (true){
			System.out.println("Soy un Thread/tut65 #: "+numero);
			
			//Esperar 1seg.
			try {Thread.sleep(1000);} 
			catch (InterruptedException e) {e.printStackTrace();}
		}
	}	
	
	
	
	public static void main(String[] args) {
		tut65 thread1 = new tut65(1);
		tut65 thread2 = new tut65(2);
		tut65 thread3 = new tut65(3);

	}



}
