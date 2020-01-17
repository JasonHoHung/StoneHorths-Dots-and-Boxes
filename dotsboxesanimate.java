import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import javax.swing.event.*;

public class dotsboxesanimate extends JPanel {
	// Properties
	ImageIcon gamebgimg = new ImageIcon("gamebg.png");
	ImageIcon gamedotsimg = new ImageIcon("gamedots.png");
	ImageIcon gamelineimg = new ImageIcon("gameline.png");
	ImageIcon stickHimg = new ImageIcon("H.png");
	ImageIcon stickVimg = new ImageIcon("V.png");
	ImageIcon redXimg = new ImageIcon("redX.png");
	ImageIcon blueXimg = new ImageIcon("blueX.png");

	boolean blnButtonH[][] = new boolean[6][5];
	boolean blnButtonV[][] = new boolean[5][6];
	int intPointCheck[][] = new int[5][5];
	
	public void paintComponent(Graphics g) {
		g.drawImage(gamebgimg.getImage(), 0, 0, null);
		g.drawImage(gamedotsimg.getImage(), 0, 0, null);
// HORIZONTAL -=-=-=-=-=-==--=-=-==--==----=-=--==--==-=-=-=--=-==--=-==--=-=-=--==--==--=-=		
		if (blnButtonH[0][0] == true) {
			g.drawImage(stickHimg.getImage(),105,80,null);
		}
		if (blnButtonH[0][1] == true) {
			g.drawImage(stickHimg.getImage(),212,80,null);
		}
		if (blnButtonH[0][2] == true) {
			g.drawImage(stickHimg.getImage(),318,80,null);
		}
		if (blnButtonH[0][3] == true) {
			g.drawImage(stickHimg.getImage(),425,80,null);
		} 
		if (blnButtonH[0][4] == true) {
			g.drawImage(stickHimg.getImage(),532,80,null);
		}
		if (blnButtonH[1][0] == true) {
			g.drawImage(stickHimg.getImage(),105,185,null);
		}
		if (blnButtonH[1][1] == true) {
			g.drawImage(stickHimg.getImage(),212,185,null);
		}
		if (blnButtonH[1][2] == true) {
			g.drawImage(stickHimg.getImage(),318,185,null);
		}
		if (blnButtonH[1][3] == true) {
			g.drawImage(stickHimg.getImage(),425,185,null);
		}
		if (blnButtonH[1][4] == true) {
			g.drawImage(stickHimg.getImage(),532,185,null);
		}
		if (blnButtonH[2][0] == true) {
			g.drawImage(stickHimg.getImage(),105,293,null);
		}
		if (blnButtonH[2][1] == true) {
			g.drawImage(stickHimg.getImage(),212,293,null);
		}
		if (blnButtonH[2][2] == true) {
			g.drawImage(stickHimg.getImage(),318,293,null);
		}
		if (blnButtonH[2][3] == true) {
			g.drawImage(stickHimg.getImage(),425,293,null);
		}
		if (blnButtonH[2][4] == true) {
			g.drawImage(stickHimg.getImage(),532,293,null);
		}
		if (blnButtonH[3][0] == true) {
			g.drawImage(stickHimg.getImage(),105,400,null);
		}
		if (blnButtonH[3][1] == true) {
			g.drawImage(stickHimg.getImage(),212,400,null);
		}
		if (blnButtonH[3][2] == true) {
			g.drawImage(stickHimg.getImage(),318,400,null);
		}
		if (blnButtonH[3][3] == true) {
			g.drawImage(stickHimg.getImage(),425,400,null);
		}
		if (blnButtonH[3][4] == true) {
			g.drawImage(stickHimg.getImage(),532,400,null);
		}
		if (blnButtonH[4][0] == true) {
			g.drawImage(stickHimg.getImage(),105,506,null);
		}
		if (blnButtonH[4][1] == true) {
			g.drawImage(stickHimg.getImage(),212,506,null);
		}
		if (blnButtonH[4][2] == true) {
			g.drawImage(stickHimg.getImage(),318,506,null);
		}
		if (blnButtonH[4][3] == true) {
			g.drawImage(stickHimg.getImage(),425,506,null);
		}
		if (blnButtonH[4][4] == true) {
			g.drawImage(stickHimg.getImage(),532,506,null);
		}
		if (blnButtonH[5][0] == true) {
			g.drawImage(stickHimg.getImage(),105,612,null);
		}
		if (blnButtonH[5][1] == true) {
			g.drawImage(stickHimg.getImage(),212,612,null);
		}
		if (blnButtonH[5][2] == true) {
			g.drawImage(stickHimg.getImage(),318,612,null);
		}
		if (blnButtonH[5][3] == true) {
			g.drawImage(stickHimg.getImage(),425,612,null);
		}
		if (blnButtonH[5][4] == true) {
			g.drawImage(stickHimg.getImage(),532,612,null);
		}
		
// VERTICAL -=-=-=-=-=-==--=-=-==--==----=-=--==--==-=-=-=--=-==--=-==--=-=-=--==--==--=-=
		if (blnButtonV[0][0] == true) {
			g.drawImage(stickVimg.getImage(),80,103,null);
		}
		if (blnButtonV[0][1] == true) {
			g.drawImage(stickVimg.getImage(),187,103,null);
		}
		if (blnButtonV[0][2] == true) {
			g.drawImage(stickVimg.getImage(),295,103,null);
		}
		if (blnButtonV[0][3] == true) {
			g.drawImage(stickVimg.getImage(),400,103,null);
		}
		if (blnButtonV[0][4] == true) {
			g.drawImage(stickVimg.getImage(),505,103,null);
		}
		if (blnButtonV[0][5] == true) {
			g.drawImage(stickVimg.getImage(),612,103,null);
		}
		if (blnButtonV[1][0] == true) {
			g.drawImage(stickVimg.getImage(),80,211,null);
		}
		if (blnButtonV[1][1] == true) {
			g.drawImage(stickVimg.getImage(),187,211,null);
		}
		if (blnButtonV[1][2] == true) {
			g.drawImage(stickVimg.getImage(),295,211,null);
		}
		if (blnButtonV[1][3] == true) {
			g.drawImage(stickVimg.getImage(),400,211,null);
		}
		if (blnButtonV[1][4] == true) {
			g.drawImage(stickVimg.getImage(),505,211,null);
		}
		if (blnButtonV[1][5] == true) {
			g.drawImage(stickVimg.getImage(),612,211,null);
		}
		if (blnButtonV[2][0] == true) {
			g.drawImage(stickVimg.getImage(),80,317,null);
		}
		if (blnButtonV[2][1] == true) {
			g.drawImage(stickVimg.getImage(),187,317,null);
		}
		if (blnButtonV[2][2] == true) {
			g.drawImage(stickVimg.getImage(),295,317,null);
		}
		if (blnButtonV[2][3] == true) {
			g.drawImage(stickVimg.getImage(),400,317,null);
		}
		if (blnButtonV[2][4] == true) {
			g.drawImage(stickVimg.getImage(),505,317,null);
		}
		if (blnButtonV[2][5] == true) {
			g.drawImage(stickVimg.getImage(),612,317,null);
		}
		if (blnButtonV[3][0] == true) {
			g.drawImage(stickVimg.getImage(),80,425,null);
		}
		if (blnButtonV[3][1] == true) {
			g.drawImage(stickVimg.getImage(),187,425,null);
		}
		if (blnButtonV[3][2] == true) {
			g.drawImage(stickVimg.getImage(),295,425,null);
		}
		if (blnButtonV[3][3] == true) {
			g.drawImage(stickVimg.getImage(),400,425,null);
		}
		if (blnButtonV[3][4] == true) {
			g.drawImage(stickVimg.getImage(),505,425,null);
		}
		if (blnButtonV[3][5] == true) {
			g.drawImage(stickVimg.getImage(),612,425,null);
		}
		if (blnButtonV[4][0] == true) {
			g.drawImage(stickVimg.getImage(),80,532,null);
		}
		if (blnButtonV[4][1] == true) {
			g.drawImage(stickVimg.getImage(),187,532,null);
		}
		if (blnButtonV[4][2] == true) {
			g.drawImage(stickVimg.getImage(),295,532,null);
		}
		if (blnButtonV[4][3] == true) {
			g.drawImage(stickVimg.getImage(),400,532,null);
		}
		if (blnButtonV[4][4] == true) {
			g.drawImage(stickVimg.getImage(),505,532,null);
		}
		if (blnButtonV[4][5] == true) {
			g.drawImage(stickVimg.getImage(),612,532,null);
		}
		
// FULL BOXES=-==-=-=--=-==-=-=--=-=-=-=-=-=-=-==-=-=-=-=-=--=-=--=-=-=-=-=-=-=--==-=-=-=
		if (blnButtonH[0][0] == true && blnButtonV[0][0] == true		//h00
		&& blnButtonH[1][0] == true && blnButtonV[0][1] == true) {
			if (intPointCheck[0][0] == 1) {
				g.drawImage(redXimg.getImage(),105,105,null);
			}if (intPointCheck[0][0] == 2) {
				g.drawImage(blueXimg.getImage(),105,105,null);
			}	
		}
		if (blnButtonH[0][1] == true && blnButtonV[0][1] == true		//01
		&& blnButtonH[1][1] == true && blnButtonV[0][2] == true) {
			if (intPointCheck[0][1] == 1) {
				g.drawImage(redXimg.getImage(),210,105,null);
			}if (intPointCheck[0][1] == 2) {
				g.drawImage(blueXimg.getImage(),210,105,null);
			}
		}
		if (blnButtonH[0][2] == true && blnButtonV[0][2] == true		//02
		&& blnButtonH[1][2] == true && blnButtonV[0][3] == true) {
			if (intPointCheck[0][2] == 1) {
				g.drawImage(redXimg.getImage(),315,105,null);
			}if (intPointCheck[0][2] == 2) {
				g.drawImage(blueXimg.getImage(),315,105,null);
			}
		}
		if (blnButtonH[0][3] == true && blnButtonV[0][3] == true		//03
		&& blnButtonH[1][3] == true && blnButtonV[0][4] == true) {
			if (intPointCheck[0][3] == 1) {
				g.drawImage(redXimg.getImage(),420,105,null);
			}if (intPointCheck[0][3] == 2) {
				g.drawImage(blueXimg.getImage(),420,105,null);
			}
		}
		if (blnButtonH[0][4] == true && blnButtonV[0][4] == true		//04
		&& blnButtonH[1][4] == true && blnButtonV[0][5] == true) {
			if (intPointCheck[0][4] == 1) {
				g.drawImage(redXimg.getImage(),525,105,null);
			}if (intPointCheck[0][4] == 2) {
				g.drawImage(blueXimg.getImage(),525,105,null);
			}
		}
		if (blnButtonH[1][0] == true && blnButtonV[1][0] == true		//10
		&& blnButtonH[2][0] == true && blnButtonV[1][1] == true) {
			if (intPointCheck[1][0] == 1) {
				g.drawImage(redXimg.getImage(),105,210,null);
			}if (intPointCheck[1][0] == 2) {
				g.drawImage(blueXimg.getImage(),105,210,null);
			}
		}
		if (blnButtonH[1][1] == true && blnButtonV[1][1] == true		//11
		&& blnButtonH[2][1] == true && blnButtonV[1][2] == true) {
			if (intPointCheck[1][1] == 1) {
				g.drawImage(redXimg.getImage(),210,210,null);
			}if (intPointCheck[1][1] == 2) {
				g.drawImage(blueXimg.getImage(),210,210,null);
			}
		}
		if (blnButtonH[1][2] == true && blnButtonV[1][2] == true		//12
		&& blnButtonH[2][2] == true && blnButtonV[1][3] == true) {
			if (intPointCheck[1][2] == 1) {
				g.drawImage(redXimg.getImage(),315,210,null);
			}if (intPointCheck[1][2] == 2) {
				g.drawImage(blueXimg.getImage(),315,210,null);
			}
		}
		if (blnButtonH[1][3] == true && blnButtonV[1][3] == true		//13
		&& blnButtonH[2][3] == true && blnButtonV[1][4] == true) {
			if (intPointCheck[1][3] == 1) {
				g.drawImage(redXimg.getImage(),420,210,null);
			}if (intPointCheck[1][3] == 2) {
				g.drawImage(blueXimg.getImage(),420,210,null);
			}
		}
		if (blnButtonH[1][4] == true && blnButtonV[1][4] == true		//14
		&& blnButtonH[2][4] == true && blnButtonV[1][5] == true) {
			if (intPointCheck[1][4] == 1) {
				g.drawImage(redXimg.getImage(),525,210,null);
			}if (intPointCheck[1][4] == 2) {
				g.drawImage(blueXimg.getImage(),525,210,null);
			}
		}
		if (blnButtonH[2][0] == true && blnButtonV[2][0] == true		//20
		&& blnButtonH[3][0] == true && blnButtonV[2][1] == true) {
			if (intPointCheck[2][0] == 1) {
				g.drawImage(redXimg.getImage(),105,315,null);
			}if (intPointCheck[2][0] == 2) {
				g.drawImage(blueXimg.getImage(),105,315,null);
			}
		}
		if (blnButtonH[2][1] == true && blnButtonV[2][1] == true		//21
		&& blnButtonH[3][1] == true && blnButtonV[2][2] == true) {
			if (intPointCheck[2][1] == 1) {
				g.drawImage(redXimg.getImage(),210,315,null);
			}if (intPointCheck[2][1] == 2) {
				g.drawImage(blueXimg.getImage(),210,315,null);
			}
		}
		if (blnButtonH[2][2] == true && blnButtonV[2][2] == true		//22
		&& blnButtonH[3][2] == true && blnButtonV[2][3] == true) {
			if (intPointCheck[2][2] == 1) {
				g.drawImage(redXimg.getImage(),315,315,null);
			}if (intPointCheck[2][2] == 2) {
				g.drawImage(blueXimg.getImage(),315,315,null);
			}
		}
		if (blnButtonH[2][3] == true && blnButtonV[2][3] == true		//23
		&& blnButtonH[3][3] == true && blnButtonV[2][4] == true) {
			if (intPointCheck[2][3] == 1) {
				g.drawImage(redXimg.getImage(),420,315,null);
			}if (intPointCheck[2][3] == 2) {
				g.drawImage(blueXimg.getImage(),420,315,null);
			}
		}
		if (blnButtonH[2][4] == true && blnButtonV[2][4] == true		//24
		&& blnButtonH[3][4] == true && blnButtonV[2][5] == true) {
			if (intPointCheck[2][4] == 1) {
				g.drawImage(redXimg.getImage(),525,315,null);
			}if (intPointCheck[2][4] == 2) {
				g.drawImage(blueXimg.getImage(),525,315,null);
			}
		}
		if (blnButtonH[3][0] == true && blnButtonV[3][0] == true		//30
		&& blnButtonH[4][0] == true && blnButtonV[3][1] == true) {
			if (intPointCheck[3][0] == 1) {
				g.drawImage(redXimg.getImage(),105,420,null);
			}if (intPointCheck[3][0] == 2) {
				g.drawImage(blueXimg.getImage(),105,420,null);
			}
		}
		if (blnButtonH[3][1] == true && blnButtonV[3][1] == true		//31
		&& blnButtonH[4][1] == true && blnButtonV[3][2] == true) {
			if (intPointCheck[3][1] == 1) {
				g.drawImage(redXimg.getImage(),210,420,null);
			}if (intPointCheck[3][1] == 2) {
				g.drawImage(blueXimg.getImage(),210,420,null);
			}
		}
		if (blnButtonH[3][2] == true && blnButtonV[3][2] == true		//32
		&& blnButtonH[4][2] == true && blnButtonV[3][3] == true) {
			if (intPointCheck[3][2] == 1) {
				g.drawImage(redXimg.getImage(),315,420,null);
			}if (intPointCheck[3][2] == 2) {
				g.drawImage(blueXimg.getImage(),315,420,null);
			}
		}
		if (blnButtonH[3][3] == true && blnButtonV[3][3] == true		//33
		&& blnButtonH[4][3] == true && blnButtonV[3][4] == true) {
			if (intPointCheck[3][3] == 1) {
				g.drawImage(redXimg.getImage(),420,420,null);
			}if (intPointCheck[3][3] == 2) {
				g.drawImage(blueXimg.getImage(),420,420,null);
			}
		}
		if (blnButtonH[3][4] == true && blnButtonV[3][4] == true		//34
		&& blnButtonH[4][4] == true && blnButtonV[3][5] == true) {
			if (intPointCheck[3][4] == 1) {
				g.drawImage(redXimg.getImage(),525,420,null);
			}if (intPointCheck[3][4] == 2) {
				g.drawImage(blueXimg.getImage(),525,420,null);
			}
		}
		if (blnButtonH[4][0] == true && blnButtonV[4][0] == true		//40
		&& blnButtonH[5][0] == true && blnButtonV[4][1] == true) {
			if (intPointCheck[4][0] == 1) {
				g.drawImage(redXimg.getImage(),105,525,null);
			}if (intPointCheck[4][0] == 2) {
				g.drawImage(blueXimg.getImage(),105,525,null);
			}
		}
		if (blnButtonH[4][1] == true && blnButtonV[4][1] == true		//41
		&& blnButtonH[5][1] == true && blnButtonV[4][2] == true) {
			if (intPointCheck[4][1] == 1) {
				g.drawImage(redXimg.getImage(),210,525,null);
			}if (intPointCheck[4][1] == 2) {
				g.drawImage(blueXimg.getImage(),210,525,null);
			}
		}
		if (blnButtonH[4][2] == true && blnButtonV[4][2] == true		//42
		&& blnButtonH[5][2] == true && blnButtonV[4][3] == true) {
			if (intPointCheck[4][2] == 1) {
				g.drawImage(redXimg.getImage(),315,525,null);
			}if (intPointCheck[4][2] == 2) {
				g.drawImage(blueXimg.getImage(),315,525,null);
			}
		}
		if (blnButtonH[4][3] == true && blnButtonV[4][3] == true		//43
		&& blnButtonH[5][3] == true && blnButtonV[4][4] == true) {
			if (intPointCheck[4][3] == 1) {
				g.drawImage(redXimg.getImage(),420,525,null);
			}if (intPointCheck[4][3] == 2) {
				g.drawImage(blueXimg.getImage(),420,525,null);
			}
		}
		if (blnButtonH[4][4] == true && blnButtonV[4][4] == true		//44
		&& blnButtonH[5][4] == true && blnButtonV[4][5] == true) {
			if (intPointCheck[4][4] == 1) {
				g.drawImage(redXimg.getImage(),525,525,null);
			}if (intPointCheck[4][4] == 2) {
				g.drawImage(blueXimg.getImage(),525,525,null);
			}
		}
		
	}	
	// Constructor
	public dotsboxesanimate() {
		super();
	}
	
}
