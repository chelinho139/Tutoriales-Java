import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;


public class tut44mibutton extends JButton implements ActionListener {

	
	tut44mibutton(){
		super("Click Me!");
	}
	
	
	public void actionPerformed(ActionEvent e) {
		System.out.println("Se ha clikeado en el Boton");

	}

}
