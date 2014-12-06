import javax.swing.JFrame;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;

/*http://chelintutorials.blogspot.com/
 *Chelin Tutorials 2011 Todos los Derechos Reservados.
 *Tut 49 - EditJField
 */


public class tut49jframe extends JFrame  implements ActionListener {
	
	JLabel texto1,texto2;
	JTextField camponombre;
	JButton boton;
	
	tut49jframe(){
		super("tuto 49");
		setBounds(200,200,300,300);
		setVisible(true);
		
		Container contentpane= getContentPane();
		contentpane.setLayout(new FlowLayout());
		
		boton= new JButton("Go!");
		boton.addActionListener(this);
		texto1=new JLabel("Ingrese su Nombre: ");
		texto2=new JLabel("No se ha ingresado un nombre ");
		camponombre= new JTextField(10);
		camponombre.addActionListener(this);
		
		contentpane.add(texto1);
		contentpane.add(camponombre);
		contentpane.add(boton);
		contentpane.add(texto2);
		
		pack();
		paintComponents(getGraphics());
	}
		
	public static void main(String[] args) {
		tut49jframe ventana =new tut49jframe();
	}


	
	public void actionPerformed(ActionEvent e) {
		if (e.getSource()==camponombre || e.getSource()==boton
				)texto2.setText("Su nombre es: "+camponombre.getText());
		
	}









}

