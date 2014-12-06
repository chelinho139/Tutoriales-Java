import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class tut41panelgrid extends JPanel {

	tut41panelgrid(){
		setBackground(Color.blue);
		setLayout(new GridLayout(2,2));
		add(new JButton("B1"));
		add(new JButton("B2"));
		add(new JButton("B3"));
		add(new JButton("B4"));
	}
	
}
