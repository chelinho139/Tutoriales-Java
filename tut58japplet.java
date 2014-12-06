import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JLabel;

import java.awt.*;

public class tut58japplet extends JApplet {
	
	public void init(){
		//Inicializamos el applet
		
		Container contentpane = this.getContentPane(); 
		contentpane.setLayout(new FlowLayout());
		
		contentpane.add(new JLabel("Hola Mundo"));
		contentpane.add(new JButton("ClickME!"));
		
		
	}

}
