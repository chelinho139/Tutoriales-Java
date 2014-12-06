import javax.swing.JFrame;

/*http://chelintutorials.blogspot.com/
 *Chelin Tutorials 2011 Todos los Derechos Reservados.
 *Tut - 
 */


import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

/*http://chelintutorials.blogspot.com/
 *Chelin Tutorials 2011 Todos los Derechos Reservados.
 *Tut 46 - Muchos Botones
 */


public class tut46jframe extends JFrame implements ActionListener {
	JLabel texto;
	JButton boton1,boton2,boton3;
	
	tut46jframe(){
		super("tuto 46");
		setBounds(200,200,200,200);
		setVisible(true);
		setLayout(new FlowLayout());
		
		texto= new JLabel("Haga Click en Algun Boton");
		boton1= new JButton("Boton Num 1");
		boton2= new JButton("Boton Num 2");
		boton3= new JButton("Boton Num 3");
		
		boton1.addActionListener(this);
		boton2.addActionListener(this);
		boton3.addActionListener(this);
				
		add(texto);
		add(boton1);
		add(boton2);
		add(boton3);

	}


	public void actionPerformed(ActionEvent evento) {
		if(evento.getSource()==boton1)texto.setText("Boton 1 Elejido");
		if(evento.getSource()==boton2)texto.setText("Boton 2 Elejido");
		if(evento.getSource()==boton3)texto.setText("Boton 3 Elejido");
		
	}
	
	
	public static void main(String[] args) {
		tut46jframe ventana =new tut46jframe();

	}













}
