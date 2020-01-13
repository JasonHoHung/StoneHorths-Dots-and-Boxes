import java.awt.*;
import javax.swing.*;
import javax.swing.ImageIcon.*;
import java.awt.image.*;

public class background extends JPanel{
	// Properties
	public ImageIcon image;
	public JLabel labelImage;
	ImageIcon printImage = new javax.swing.ImageIcon("background.png");

	// Methods
	public void paintComponent(Graphics g){
		g.drawImage(printImage.getImage(), 0, 0, null);
	}

	// Constructor
	public background(){
		super();
	}
}
