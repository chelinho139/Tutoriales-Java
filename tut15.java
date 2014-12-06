/*http://chelintutorials.blogspot.com/
 *Chelin Tutorials 2011 Todos los Derechos Reservados.
 *Tut 15- Switch
 */


public class tut15 {

	public static void main(String[] args) {
		
		int num1=3;
		int num2=7;
		float resultado=0;
		char operacion ='a';
		
		switch (operacion){
			case '+':
				resultado=num1+num2;
				break; //si no ponemos el break, va a entrar en los demas case
			case '-':
				resultado=num1-num2;
				break;
			case '*':
				resultado=num1*num2;
				break;
			case '/':
				resultado=1.0f*num1/num2;
				break;
			default: System.out.println("ingrese algo valido"); //si no entro en nigun case
		}
		
		System.out.println("Resultado= "+resultado);
		
		
	}
	
}
