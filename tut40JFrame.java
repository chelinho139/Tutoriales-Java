
/*http://chelintutorials.blogspot.com/
 *Chelin Tutorials 2011 Todos los Derechos Reservados.
 *Tut 40 - Paneles
 */

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import javax.swing.*;

public class tut40JFrame  extends JFrame{

	//Constructor
	tut40JFrame(){
		
		setTitle("Tutorial 40");
		setBounds(0,0,400,400);
		setVisible(true);
		
		Container contentpane= getContentPane();
		
		tut40mypanel panel1 = new tut40mypanel();
		contentpane.add(panel1);
		
		
				
	}
	
	
	//Funcion Main
	public static void main(String[] args){
		tut40JFrame laventana = new tut40JFrame();

	}


}
	


	