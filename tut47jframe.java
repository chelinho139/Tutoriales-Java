import javax.swing.JFrame;

/*http://chelintutorials.blogspot.com/
 *Chelin Tutorials 2011 Todos los Derechos Reservados.
 *Tut 47 - Botones con imagenes
 */


import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

/*http://chelintutorials.blogspot.com/
 *Chelin Tutorials 2011 Todos los Derechos Reservados.
 *Tut 46 - Muchos Botones
 */


public class tut47jframe extends JFrame implements ActionListener{
	
	JLabel texto;
	JButton boton1,boton2;
	
	tut47jframe(){
		super("tuto 47");
		setBounds(200,200,400,400);
		setVisible(true);
		
		Container contentpane= getContentPane();
		contentpane.setLayout(new GridLayout(3,1));
		contentpane.setBackground(Color.white);
		
		texto= new JLabel("Cambiar Fondo");
		boton1= new JButton(new ImageIcon("azul.png"));
		boton1.setRolloverIcon(new ImageIcon("azul2.png"));
		boton1.setBackground(Color.white);
		boton1.setBorderPainted(false);
		boton1.addActionListener(this);

		boton2= new JButton(new ImageIcon("rojo.png"));
		boton2.setRolloverIcon(new ImageIcon("rojo2.png"));
		boton2.setBackground(Color.white);
		boton2.setBorderPainted(false);
		boton2.addActionListener(this);
		
		contentpane.add(texto);
		contentpane.add(boton1);
		contentpane.add(boton2);
		paintComponents(getGraphics()); //pintar los componentes
	}
	
	public void actionPerformed(ActionEvent evento) {
		Container contentpane= getContentPane();
		Color color = null;
		
		if(evento.getSource()==boton1)color=Color.BLUE;
		if(evento.getSource()==boton2)color=Color.RED;
		
		contentpane.setBackground(color);
		boton1.setBackground(color);
		boton2.setBackground(color);
		
	}
	
	
	public static void main(String[] args) {
		tut47jframe ventana =new tut47jframe();
	}








}

