
/*http://chelintutorials.blogspot.com/
 *Chelin Tutorials 2011 Todos los Derechos Reservados.
 *Tut 39 - FlowLayout
 */

import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.*;

public class tut39JFrame  extends JFrame{

	tut39JFrame(){
		setTitle("Tutorial 39");
		setBounds(0,0,400,400);
		setVisible(true);
		
		Container contentpane= getContentPane();
		
		//FlowLayout layout1 = new FlowLayout();
		contentpane.setLayout(new FlowLayout());
		
		JLabel texto1 = new JLabel ("texto111111111");
		JLabel texto2 = new JLabel ("texto222222222222222222222222222222222222222222222222");
		JButton boton1 = new JButton("Soy el Boton!");
		
		contentpane.add(texto1);
		contentpane.add(texto2);
		contentpane.add(boton1);
	}
	
	
	public static void main(String[] args){
		tut39JFrame laventana = new tut39JFrame();
	}
	
	
	
		
	}
	


	
