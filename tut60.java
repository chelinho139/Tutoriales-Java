/*http://chelintutorials.blogspot.com/
 *Chelin Tutorials 2011 Todos los Derechos Reservados.
 *Tut 60 - Threads 
 */

public class tut60 {
	
	public static void main (String args[]){
		
		MyThread thread1 = new MyThread();
		MyThread thread2 = new MyThread();
		MyThread thread3 = new MyThread();
		
		while(true){
			System.out.println("Soy una funcion ppal");
			
			//hacer que espere
			try {
				Thread.sleep(2000);
			} 
			catch (InterruptedException e){
				e.printStackTrace();
			}	
		}	
	}			
}

/*Un Thread tiene algunos metodos especiales
 * start: iniciar el thread y va a llamar al metodo run
 * run: lo que queremos que haga el thread
 * destroy,etc.
 */
class MyThread extends Thread{
	
	MyThread(){
		start();
	}
	
	public void run(){
		//Codigo que haga el thread
		while(true){
			System.out.println("Soy un Thread");
			
			//hacer que espere
			try {
				Thread.sleep(4000);
			} 
			catch (InterruptedException e){
				e.printStackTrace();
			}	
		}			
	}
	
	
	
	
}
		













