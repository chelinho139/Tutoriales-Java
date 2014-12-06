import java.awt.Color;
import java.awt.Container;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

/*http://chelintutorials.blogspot.com/
 *Chelin Tutorials 2011 Todos los Derechos Reservados.
 *Tut 41 - Grid Layout 
 */

public class tut41JFrame extends JFrame {
	
	//Constructor
	tut41JFrame(){
		
		setTitle("Tutorial 41");
		setBounds(0,500,400,400);
		setVisible(true);
		
		Container contentpane= getContentPane();
		contentpane.setLayout(new GridLayout(2,1));
		
		contentpane.add(new tut41panelflow());
		contentpane.add(new tut41panelgrid());
				
	}
	
	//Funcion Main
	public static void main(String[] args){
		tut41JFrame laventana = new tut41JFrame();
	}
	
	

}
