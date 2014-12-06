import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;



public class tut40mypanel extends JPanel {
	
	tut40mypanel(){
		
		setBackground(Color.red);
		
		JLabel texto1= new JLabel("Hola soy panel 1");
		JButton boton1= new JButton("Click me!");
		
		
		add(texto1);
		add(boton1);
		
		
		
		
	}
	

}
