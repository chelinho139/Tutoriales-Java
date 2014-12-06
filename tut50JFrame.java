import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;

/*http://chelintutorials.blogspot.com/
 *Chelin Tutorials 2011 Todos los Derechos Reservados.
 *Tut 50 - Calculadora 
 */


public class tut50JFrame extends JFrame implements ActionListener{
	/*Clase De la ventana principal tambien es oyente de los eventos*/
	
	//3 ATRIBUTOS
	PaneldeOperandos paneldeoperandos;
	PaneldeOperaciones paneldeoperaciones;
	PaneldeResultado panelderesultado;
	
	
	tut50JFrame(){
		/*Constructor de la ventana*/
		
		super("Tutorial #51: Calculadora");
		setBounds(200,200,300,300);
		setVisible(true);
		setResizable(false); //Para que no puedan cambiar el tamaño

		//Fijo un Grid Layout de 3 filas y 1 columna
		Container contentpane= getContentPane();
		contentpane.setLayout(new GridLayout(3,1));
		
		//Inicializammos los paneles
		paneldeoperandos= new PaneldeOperandos();
		paneldeoperaciones= new PaneldeOperaciones(this);
		panelderesultado= new PaneldeResultado();
		
		//Agrego los paneles
		contentpane.add(paneldeoperandos);
		contentpane.add(paneldeoperaciones);
		contentpane.add(panelderesultado);
		
		
		//Llamo a paintComponents para que se pinten los componentes una vez q los agregue.
		paintComponents(getGraphics());
		
	}
	
	
	public void actionPerformed(ActionEvent e) {
		/*Eventos de Botones*/
		
		float operando1 = paneldeoperandos.getOperando1();
		float operando2 = paneldeoperandos.getOperando2();
		float resultado;//Variable Auxiliar
		
		//Si el eventos es el boton Sumar
		if (e.getSource()== paneldeoperaciones.botonsuma){
			resultado=operando1+operando2;
			panelderesultado.setLabelResultado(resultado); //Camibar el label de resultado
		}
		//Si el eventos es el boton Resta
		
		if (e.getSource()== paneldeoperaciones.botonresta){
			resultado=operando1-operando2;
			panelderesultado.setLabelResultado(resultado);
		}
		//Si el eventos es el boton Multi
		if (e.getSource()== paneldeoperaciones.botonmulti){
			resultado=operando1*operando2;
			panelderesultado.setLabelResultado(resultado);
		}
		//Si el eventos es el boton Dividir
		if (e.getSource()== paneldeoperaciones.botondividir){
			resultado=operando1/operando2;
			panelderesultado.setLabelResultado(resultado);
		}
	}
	
	
	public static void main(String []args){
		tut50JFrame ventana = new tut50JFrame();
	}


	
}










