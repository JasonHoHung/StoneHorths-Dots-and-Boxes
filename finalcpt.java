import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import javax.swing.event.*;

public class finalcpt implements ActionListener{
	// Properties
	JFrame frame = new JFrame("test");
	JPanel panel = new JPanel();
	JButton but1 = new JButton("Start");
	JButton but2 = new JButton("Help");
	JButton but3 = new JButton("Settings");
	JButton but4 = new JButton("Quit");
	JLabel label = new JLabel("StoneHearth");

	// Methods
	public void actionPerformed(ActionEvent evt){
		if(evt.getSource() == but4){
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		}
	}

	// Constructor
	public finalcpt(){
		panel.setLayout(null);
		panel.setPreferredSize(new Dimension(1280, 720));
		but1.setSize(640, 50);
		but1.setLocation(320,100);
		but1.addActionListener(this);
		panel.add(but1);
		but2.setSize(640, 50);
		but2.setLocation(320,225);
		but2.addActionListener(this);
		panel.add(but2);
		but3.setSize(640, 50);
		but3.setLocation(320,350);
		but3.addActionListener(this);
		panel.add(but3);
		but4.setSize(640, 50);
		but4.setLocation(320,475);
		but4.addActionListener(this);
		panel.add(but4);
		label.setSize(640, 50);
		label.setLocation(600,0);
		panel.add(label);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setContentPane(panel);
		frame.pack();
		frame.setVisible(true);

	}

	// Main method 
	public static void main(String[] agrs){
		new finalcpt();
	}
}
