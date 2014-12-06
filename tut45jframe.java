import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

/*http://chelintutorials.blogspot.com/
 *Chelin Tutorials 2011 Todos los Derechos Reservados.
 *Tut 45 - Eventos 2
 */


public class tut45jframe extends JFrame implements ActionListener{
	JLabel texto;
	
	tut45jframe(){
		super("tuto 45");
		setBounds(200,200,200,200);
		setVisible(true);
		setLayout(new FlowLayout());
		
		texto= new JLabel("Haga click en el boton");
		JButton boton1 = new JButton("Click me ");
		boton1.addActionListener(this);
		
		add(texto);
		add(boton1);
				
	}

	public static void main(String[] args) {
		tut45jframe ventana =new tut45jframe();

	}


	public void actionPerformed(ActionEvent event) {		
		System.out.println("se ha clikiado en el boton");
		texto.setText("se Ha clickiado un boton");
		
	}

}








