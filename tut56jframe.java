import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
/*http://chelintutorials.blogspot.com/
 *Chelin Tutorials 2011 Todos los Derechos Reservados.
 *Tut 56 - Menus
 */

public class tut56jframe extends JFrame implements ActionListener{

	JLabel texto;
	JMenuBar menubar1;
	JMenu archivo, ayuda;
	JMenuItem abrir,guardar,salir,acerca;
	
	tut56jframe(){
		super("Tutorial #56: Menus");
		setBounds(200,200,300,300);
		setVisible(true);
		setResizable(false);

		//Barra
		menubar1 = new JMenuBar();
		//Menus
		archivo= new JMenu("Archivo");
		ayuda= new JMenu("Ayuda");
		//MenuItems
		abrir=new JMenuItem("Abrir..");
		guardar=new JMenuItem("Guardar..");
		salir=new JMenuItem("Salir");
		acerca=new JMenuItem("Acerca..");
		
		//Agrego el action command
		abrir.setActionCommand("Abrir");
		guardar.setActionCommand("Guardar");
		salir.setActionCommand("Salir");
		acerca.setActionCommand("Acerca");
		
		//Agrego el listner a cada boton (quien los va a escuchar)
		abrir.addActionListener(this);
		guardar.addActionListener(this);
		salir.addActionListener(this);
		acerca.addActionListener(this);
		
		//agrego los items a cada menu
		archivo.add(abrir);
		archivo.add(guardar);
		archivo.addSeparator();
		archivo.add(salir);
		ayuda.add(acerca);
		//agrego los menus a las barras
		menubar1.add(archivo);
		menubar1.add(ayuda);
		
		setJMenuBar(menubar1); //setiamos la barra a la ventana
		
		texto= new JLabel("Haga click en un Menu");
		
		Container contentpane= getContentPane();
		contentpane.setLayout(new FlowLayout());
		
		contentpane.add(texto);
		
		this.setDefaultCloseOperation(EXIT_ON_CLOSE); //Termino el Programa

	}
	
	/*
	 * Asi lo hariamos sin ActionCommand
	public void actionPerformed(ActionEvent evento) {
		if (evento.getSource()==abrir)texto.setText("Se ha clikiado en Abrir..");
		else if (evento.getSource()==guardar)texto.setText("Se ha clikiado en Guardar..");
		else if (evento.getSource()==salir)System.exit(0);
		else if (evento.getSource()==acerca)texto.setText("Se ha clikiado en Acerca..");
	}
	*/
	
	public void actionPerformed(ActionEvent evento) {
		/*Es mejor utilizar actioncommand ya que no tenemos que saber quien es
		 * el boton abrir, salir,acerca y guardar.
		 */
		if (evento.getActionCommand()=="Abrir")texto.setText("Se ha clikiado en Abrir..");
		else if (evento.getActionCommand()=="Guardar")texto.setText("Se ha clikiado en Guardar..");
		else if (evento.getActionCommand()=="Salir")System.exit(0);
		else if (evento.getActionCommand()=="Acerca")texto.setText("Se ha clikiado en Acerca..");
	}
	

	
	public static void main(String[] args) {
		tut56jframe ventana= new tut56jframe();
	}




	
	
	

}
