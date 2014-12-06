/*http://chelintutorials.blogspot.com/
 *Chelin Tutorials 2011 Todos los Derechos Reservados.
 *Tut 14 - Ejemplo Condiciones
 *Creamos una calculadora
 */


public class tut14 {

	public static void main(String[] args) {
		
		int num1=2;
		int num2=3;
		
		float resultado=0;
		
		char operacion = '+'; //variable para guardar un solo caracter
		
		if (operacion=='+'){
			resultado=num1+num2;
		}
		
		else if(operacion=='-'){
			resultado=num1-num2;
		}

		else if(operacion=='*'){
			resultado=num1*num2;
		}		

		else if(operacion=='/'){
			resultado= 1.0f * num1/num2 ;
		}
		
		else {
			//Si no es niguno de los casos anteriores
			System.out.println("Ingrese un signo valido");	
		}
	
	//Para cualquiera de los casos, se imprime el resultado
	System.out.println("resultado:"+resultado);	
	}
}
