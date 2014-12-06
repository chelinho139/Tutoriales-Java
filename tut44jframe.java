import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

/*http://chelintutorials.blogspot.com/
 *Chelin Tutorials 2011 Todos los Derechos Reservados.
 *Tut 44 - Eventos
 */


public class tut44jframe extends JFrame {
	
	tut44jframe(){
		super("tuto 44");
		setBounds(200,200,200,200);
		setVisible(true);
		setLayout(new FlowLayout());
		
		tut44mibutton boton1 = new tut44mibutton();
		boton1.addActionListener(boton1);
		add(boton1);
		
	}
	
	public static void main(String [] args){
		tut44jframe ventana = new tut44jframe();
		
	}

}
