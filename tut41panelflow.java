import java.awt.Color;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class tut41panelflow extends JPanel {
	
	tut41panelflow(){
		setBackground(Color.red);
		setLayout(new FlowLayout());
		add(new JButton("B1"));
		add(new JButton("B2"));
		add(new JButton("B3"));
		add(new JButton("B4"));
		
	}

}
