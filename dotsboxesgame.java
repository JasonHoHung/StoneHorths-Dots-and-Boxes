import java.awt.*;
import javax.swing.*;
import javax.swing.ImageIcon.*;
import java.awt.event.*;
//import hava.awt.Font.*;
import javax.swing.event.*;
import javax.swing.event.ChangeListener.*;
import javax.swing.event.ChangeEvent.*;

public class dotsboxesgame implements ActionListener{


//----------------------------------------- PROPERTIES --------------------------------------------


// variable name meaning:
	// button(but)
	// horizonal(h) or vertical(v) line type -|
	// row (1-6)
	// column (1-5)
	
	//rename to 00, 01, 02 and so on
	//Font myFont = new Font ("Courier New", 1, 8);
	//panel1.setFont(myFont);
	JButton buth00 = new JButton("h00");
	JButton buth01 = new JButton("h01");
	JButton buth02 = new JButton("h02");
	JButton buth03 = new JButton("h03");
	JButton buth04 = new JButton("h04");	
	JButton buth10 = new JButton("h10");
	JButton buth11 = new JButton("h11");
	JButton buth12 = new JButton("h12");
	JButton buth13 = new JButton("h13");
	JButton buth14 = new JButton("h14");	
	JButton buth20 = new JButton("h20");
	JButton buth21 = new JButton("h21");
	JButton buth22 = new JButton("h22");
	JButton buth23 = new JButton("h23");
	JButton buth24 = new JButton("h24");	
	JButton buth30 = new JButton("h30");
	JButton buth31 = new JButton("h31");
	JButton buth32 = new JButton("h32");
	JButton buth33 = new JButton("h33");
	JButton buth34 = new JButton("h34");	
	JButton buth40 = new JButton("h40");
	JButton buth41 = new JButton("h41");
	JButton buth42 = new JButton("h42");
	JButton buth43 = new JButton("h43");
	JButton buth44 = new JButton("h44");
	JButton buth50 = new JButton("h50");
	JButton buth51 = new JButton("h51");
	JButton buth52 = new JButton("h52");
	JButton buth53 = new JButton("h53");
	JButton buth54 = new JButton("h54");
	
	JButton butv00 = new JButton("00");
	JButton butv01 = new JButton("01");
	JButton butv02 = new JButton("02");
	JButton butv03 = new JButton("03");
	JButton butv04 = new JButton("04");
	JButton butv05 = new JButton("05");	
	JButton butv10 = new JButton("10");
	JButton butv11 = new JButton("11");
	JButton butv12 = new JButton("12");
	JButton butv13 = new JButton("13");
	JButton butv14 = new JButton("14");
	JButton butv15 = new JButton("15");	
	JButton butv20 = new JButton("20");
	JButton butv21 = new JButton("21");
	JButton butv22 = new JButton("22");
	JButton butv23 = new JButton("23");
	JButton butv24 = new JButton("24");
	JButton butv25 = new JButton("25");	
	JButton butv30 = new JButton("30");
	JButton butv31 = new JButton("31");
	JButton butv32 = new JButton("32");
	JButton butv33 = new JButton("33");
	JButton butv34 = new JButton("34");
	JButton butv35 = new JButton("35");	
	JButton butv40 = new JButton("40");
	JButton butv41 = new JButton("41");
	JButton butv42 = new JButton("42");
	JButton butv43 = new JButton("43");
	JButton butv44 = new JButton("44");
	JButton butv45 = new JButton("45");
	
	
	JButton buttonStart = new JButton("START");
	int intPoints1 = 0;
	int intPoints2 = 0;
	boolean blnPlayerTurn = true;  // p1=true p2=false		
	JFrame theframe = new JFrame("dots and boxes yummy");
	dotsboxesanimate panel1 = new dotsboxesanimate();
	Timer thetimer = new Timer(1000/60, this);
	
	
//------------------------------------------ METHODS --------------------------------------------	

	public void actionPerformed(ActionEvent evt) {
		if(evt.getSource() == this.buttonStart) {
			for (int j = 0 ; j<6 ; j++) {
				for (int k = 0 ; k<6 ; k++) {
					// blnButton: set boolean buttons to know if a slot has been taken or not (do not need to know which player)
					// intPointCheck: set Point checker to see who go the specific box that has been filled up
						// 0: neutral (default)
						// 1: player 1
						// 2: player 2
					panel1.blnButtonH[j][k] = false;
					panel1.blnButtonV[j][k] = false;
					
					panel1.intPointCheck[j][k] = 0;

				}
			}
		}	
		
		// if someone clicks a slot button
			// if its the right players turn
				// if the slot is empty
					// place the stick to make the slot occupied
					// switch player turn
					// if the stick made the player win a box (makes sure its not a point made from another round)
						// give player a point and change the PointCheck variable to let the animation know to place the right colour for the box
		
		if(evt.getSource() == this.buth00){				// horizontal 0 0	
			if (blnPlayerTurn == true) {
				if (panel1.blnButtonH[0][0] == false) {
					panel1.blnButtonH[0][0] = true;
					panel1.repaint();
					blnPlayerTurn = false;
					if (panel1.intPointCheck[0][0] == 0) {
						if (panel1.blnButtonH[0][0] == true && panel1.blnButtonV[0][0] == true
						&& panel1.blnButtonH[1][0] == true && panel1.blnButtonV[0][1] == true) {
							intPoints1++;
							panel1.intPointCheck[0][0] = 1;
							blnPlayerTurn = true;
						}
					}
				} else {
					System.out.println("spot taken");
				}
			} else if (blnPlayerTurn == false) {
				if (panel1.blnButtonH[0][0] == false){
					panel1.blnButtonH[0][0] = true;
					panel1.repaint();
					blnPlayerTurn = true;
					if (panel1.intPointCheck[0][0] == 0) {
						if (panel1.blnButtonH[0][0] == true && panel1.blnButtonV[0][0] == true
						&& panel1.blnButtonH[1][0] == true && panel1.blnButtonV[0][1] == true) {
							intPoints2++;
							panel1.intPointCheck[0][0] = 2;
							blnPlayerTurn = false;
						}
					}
				} else {
					System.out.println("spot taken");
				}
			}
		}
		
		if(evt.getSource() == this.buth10){				// horizontal 1 0	
			if (blnPlayerTurn == true) {
				if (panel1.blnButtonH[1][0] == false) {
					panel1.blnButtonH[1][0] = true;
					panel1.repaint();
					blnPlayerTurn = false;
					if (panel1.intPointCheck[0][0] == 0) {
						if (panel1.blnButtonH[0][0] == true && panel1.blnButtonV[0][0] == true
						&& panel1.blnButtonH[1][0] == true && panel1.blnButtonV[0][1] == true) {
							intPoints1++;
							panel1.intPointCheck[0][0] = 1;
							blnPlayerTurn = true;
						} 
					} if (panel1.intPointCheck[1][0] == 0) {
						if (panel1.blnButtonH[1][0] == true && panel1.blnButtonV[1][0] == true
						&& panel1.blnButtonH[2][0] == true && panel1.blnButtonV[1][1] == true) {
							intPoints1++;
							panel1.intPointCheck[1][0] = 1;
							blnPlayerTurn = true;
						}
					}
				} else {
					System.out.println("spot taken");
				}
			} else if (blnPlayerTurn == false) {
				if (panel1.blnButtonH[1][0] == false){
					panel1.blnButtonH[1][0] = true;
					panel1.repaint();
					blnPlayerTurn = true;
					if (panel1.intPointCheck[0][0] == 0) {
						if (panel1.blnButtonH[0][0] == true && panel1.blnButtonV[0][0] == true
						&& panel1.blnButtonH[1][0] == true && panel1.blnButtonV[0][1] == true) {
							intPoints2++;
							panel1.intPointCheck[0][0] = 2;
							blnPlayerTurn = false;
						} 
					} if (panel1.intPointCheck[1][0] == 0) {
						if (panel1.blnButtonH[1][0] == true && panel1.blnButtonV[1][0] == true
						&& panel1.blnButtonH[2][0] == true && panel1.blnButtonV[1][1] == true) {
							intPoints2++;
							panel1.intPointCheck[1][0] = 2;
							blnPlayerTurn = false;
						}
					} 
				}else {
				System.out.println("spot taken");
				}
			}
		}
		if(evt.getSource() == this.buth01){				// horizontal 0 1	
			if (blnPlayerTurn == true) {
				if (panel1.blnButtonH[0][1] == false) {
					panel1.blnButtonH[0][1] = true;
					panel1.repaint();
					blnPlayerTurn = false;
					if (panel1.intPointCheck[0][1] == 0) {
						if (panel1.blnButtonH[0][1] == true && panel1.blnButtonV[0][1] == true
						&& panel1.blnButtonH[1][1] == true && panel1.blnButtonV[0][2] == true) {
							intPoints1++;
							panel1.intPointCheck[0][1] = 1;
							blnPlayerTurn = true;
						} 
					} 
				} else {
					System.out.println("spot taken");
				}
			} else if (blnPlayerTurn == false) {
				if (panel1.blnButtonH[0][1] == false){
					panel1.blnButtonH[0][1] = true;
					panel1.repaint();
					blnPlayerTurn = true;
					if (panel1.intPointCheck[0][1] == 0) {
						if (panel1.blnButtonH[0][1] == true && panel1.blnButtonV[0][1] == true
						&& panel1.blnButtonH[1][1] == true && panel1.blnButtonV[0][2] == true) {
							intPoints2++;
							panel1.intPointCheck[0][1] = 2;
							blnPlayerTurn = false;
						} 
					} 
				}else {
				System.out.println("spot taken");
				}
			}
		}
		if(evt.getSource() == this.buth02){				// horizontal 0 2	
			if (blnPlayerTurn == true) {
				if (panel1.blnButtonH[0][2] == false) {
					panel1.blnButtonH[0][2] = true;
					panel1.repaint();
					blnPlayerTurn = false;
					if (panel1.intPointCheck[0][2] == 0) {
						if (panel1.blnButtonH[0][2] == true && panel1.blnButtonV[0][2] == true
						&& panel1.blnButtonH[1][2] == true && panel1.blnButtonV[0][3] == true) {
							intPoints1++;
							panel1.intPointCheck[0][2] = 1;
							blnPlayerTurn = true;
						} 
					} 
				} else {
					System.out.println("spot taken");
				}
			} else if (blnPlayerTurn == false) {
				if (panel1.blnButtonH[0][2] == false){
					panel1.blnButtonH[0][2] = true;
					panel1.repaint();
					blnPlayerTurn = true;
					if (panel1.intPointCheck[0][2] == 0) {
						if (panel1.blnButtonH[0][2] == true && panel1.blnButtonV[0][2] == true
						&& panel1.blnButtonH[1][2] == true && panel1.blnButtonV[0][3] == true) {
							intPoints2++;
							panel1.intPointCheck[0][2] = 2;
							blnPlayerTurn = false;
						} 
					} 
				}else {
				System.out.println("spot taken");
				}
			}
		}
		if(evt.getSource() == this.buth03){				// horizontal 0 3	
			if (blnPlayerTurn == true) {
				if (panel1.blnButtonH[0][3] == false) {
					panel1.blnButtonH[0][3] = true;
					panel1.repaint();
					blnPlayerTurn = false;
					if (panel1.intPointCheck[0][3] == 0) {
						if (panel1.blnButtonH[0][3] == true && panel1.blnButtonV[0][3] == true
						&& panel1.blnButtonH[1][3] == true && panel1.blnButtonV[0][4] == true) {
							intPoints1++;
							panel1.intPointCheck[0][3] = 1;
							blnPlayerTurn = true;
						} 
					} 
				} else {
					System.out.println("spot taken");
				}
			} else if (blnPlayerTurn == false) {
				if (panel1.blnButtonH[0][3] == false){
					panel1.blnButtonH[0][3] = true;
					panel1.repaint();
					blnPlayerTurn = true;
					if (panel1.intPointCheck[0][3] == 0) {
						if (panel1.blnButtonH[0][3] == true && panel1.blnButtonV[0][3] == true
						&& panel1.blnButtonH[1][3] == true && panel1.blnButtonV[0][4] == true) {
							intPoints2++;
							panel1.intPointCheck[0][3] = 2;
							blnPlayerTurn = false;
						} 
					} 
				}else {
				System.out.println("spot taken");
				}
			}
		}
		if(evt.getSource() == this.buth04){				// horizontal 0 4	
			if (blnPlayerTurn == true) {
				if (panel1.blnButtonH[0][4] == false) {
					panel1.blnButtonH[0][4] = true;
					panel1.repaint();
					blnPlayerTurn = false;
					if (panel1.intPointCheck[0][4] == 0) {
						if (panel1.blnButtonH[0][4] == true && panel1.blnButtonV[0][4] == true
						&& panel1.blnButtonH[1][4] == true && panel1.blnButtonV[0][5] == true) {
							intPoints1++;
							panel1.intPointCheck[0][4] = 1;
							blnPlayerTurn = true;
						} 
					} 
				} else {
					System.out.println("spot taken");
				}
			} else if (blnPlayerTurn == false) {
				if (panel1.blnButtonH[0][4] == false){
					panel1.blnButtonH[0][4] = true;
					panel1.repaint();
					blnPlayerTurn = true;
					if (panel1.intPointCheck[0][4] == 0) {
						if (panel1.blnButtonH[0][4] == true && panel1.blnButtonV[0][4] == true
						&& panel1.blnButtonH[1][4] == true && panel1.blnButtonV[0][5] == true) {
							intPoints2++;
							panel1.intPointCheck[0][3] = 2;
							blnPlayerTurn = false;
						} 
					} 
				}else {
				System.out.println("spot taken");
				}
			}
		}
		if(evt.getSource() == this.buth11){				// horizontal 1 1	
			if (blnPlayerTurn == true) {
				if (panel1.blnButtonH[1][1] == false) {
					panel1.blnButtonH[1][1] = true;
					panel1.repaint();
					blnPlayerTurn = false;
					if (panel1.intPointCheck[1][1] == 0) {
						if (panel1.blnButtonH[1][1] == true && panel1.blnButtonV[1][1] == true
						&& panel1.blnButtonH[2][1] == true && panel1.blnButtonV[1][2] == true) {
							intPoints1++;
							panel1.intPointCheck[1][1] = 1;
							blnPlayerTurn = true;
						} 
					} if (panel1.intPointCheck[0][1] == 0) {
						if (panel1.blnButtonH[1][1] == true && panel1.blnButtonV[0][1] == true
						&& panel1.blnButtonH[0][1] == true && panel1.blnButtonV[0][2] == true) {
							intPoints1++;
							panel1.intPointCheck[0][1] = 1;
							blnPlayerTurn = true;
						} 
					}  
				} else {
					System.out.println("spot taken");
				}
			} else if (blnPlayerTurn == false) {
				if (panel1.blnButtonH[1][1] == false) {
					panel1.blnButtonH[1][1] = true;
					panel1.repaint();
					blnPlayerTurn = true;
					if (panel1.intPointCheck[1][1] == 0) {
						if (panel1.blnButtonH[1][1] == true && panel1.blnButtonV[1][1] == true
						&& panel1.blnButtonH[2][1] == true && panel1.blnButtonV[1][2] == true) {
							intPoints2++;
							panel1.intPointCheck[1][1] = 2;
							blnPlayerTurn = false;
						} 
					} if (panel1.intPointCheck[0][1] == 0) {
						if (panel1.blnButtonH[1][1] == true && panel1.blnButtonV[0][1] == true
						&& panel1.blnButtonH[0][1] == true && panel1.blnButtonV[0][2] == true) {
							intPoints2++;
							panel1.intPointCheck[0][1] = 2;
							blnPlayerTurn = false;
						} 
					}  
				}else {
				System.out.println("spot taken");
				}
			}
		}
		if(evt.getSource() == this.buth11){				// horizontal 1 1	
			if (blnPlayerTurn == true) {
				if (panel1.blnButtonH[1][1] == false) {
					panel1.blnButtonH[1][1] = true;
					panel1.repaint();
					blnPlayerTurn = false;
					if (panel1.intPointCheck[1][1] == 0) {
						if (panel1.blnButtonH[1][1] == true && panel1.blnButtonV[1][1] == true
						&& panel1.blnButtonH[2][1] == true && panel1.blnButtonV[1][2] == true) {
							intPoints1++;
							panel1.intPointCheck[1][1] = 1;
							blnPlayerTurn = true;
						} 
					} if (panel1.intPointCheck[0][1] == 0) {
						if (panel1.blnButtonH[1][1] == true && panel1.blnButtonV[0][1] == true
						&& panel1.blnButtonH[0][1] == true && panel1.blnButtonV[0][2] == true) {
							intPoints1++;
							panel1.intPointCheck[0][1] = 1;
							blnPlayerTurn = true;
						} 
					}  
				} else {
					System.out.println("spot taken");
				}
			} else if (blnPlayerTurn == false) {
				if (panel1.blnButtonH[1][1] == false) {
					panel1.blnButtonH[1][1] = true;
					panel1.repaint();
					blnPlayerTurn = true;
					if (panel1.intPointCheck[1][1] == 0) {
						if (panel1.blnButtonH[1][1] == true && panel1.blnButtonV[1][1] == true
						&& panel1.blnButtonH[2][1] == true && panel1.blnButtonV[1][2] == true) {
							intPoints2++;
							panel1.intPointCheck[1][1] = 2;
							blnPlayerTurn = false;
						} 
					} if (panel1.intPointCheck[0][1] == 0) {
						if (panel1.blnButtonH[1][1] == true && panel1.blnButtonV[0][1] == true
						&& panel1.blnButtonH[0][1] == true && panel1.blnButtonV[0][2] == true) {
							intPoints2++;
							panel1.intPointCheck[0][1] = 2;
							blnPlayerTurn = false;
						} 
					}  
				}else {
				System.out.println("spot taken");
				}
			}
		}
		if(evt.getSource() == this.buth12){				// horizontal 1 2	
			if (blnPlayerTurn == true) {
				if (panel1.blnButtonH[1][2] == false) {
					panel1.blnButtonH[1][2] = true;
					panel1.repaint();
					blnPlayerTurn = false;
					if (panel1.intPointCheck[1][2] == 0) {
						if (panel1.blnButtonH[1][2] == true && panel1.blnButtonV[1][2] == true
						&& panel1.blnButtonH[2][2] == true && panel1.blnButtonV[1][3] == true) {
							intPoints1++;
							panel1.intPointCheck[1][2] = 1;
							blnPlayerTurn = true;
						} 
					} if (panel1.intPointCheck[0][2] == 0) {
						if (panel1.blnButtonH[0][2] == true && panel1.blnButtonV[0][2] == true
						&& panel1.blnButtonH[1][2] == true && panel1.blnButtonV[0][3] == true) {
							intPoints1++;
							panel1.intPointCheck[0][2] = 1;
							blnPlayerTurn = true;
						} 
					}  
				} else {
					System.out.println("spot taken");
				}
			} else if (blnPlayerTurn == false) {
				if (panel1.blnButtonH[1][2] == false) {
					panel1.blnButtonH[1][2] = true;
					panel1.repaint();
					blnPlayerTurn = true;
					if (panel1.intPointCheck[1][2] == 0) {
						if (panel1.blnButtonH[1][2] == true && panel1.blnButtonV[1][2] == true
						&& panel1.blnButtonH[2][2] == true && panel1.blnButtonV[1][3] == true) {
							intPoints2++;
							panel1.intPointCheck[1][2] = 2;
							blnPlayerTurn = false;
						} 
					} if (panel1.intPointCheck[0][2] == 0) {
						if (panel1.blnButtonH[1][2] == true && panel1.blnButtonV[0][2] == true
						&& panel1.blnButtonH[0][2] == true && panel1.blnButtonV[0][3] == true) {
							intPoints2++;
							panel1.intPointCheck[0][2] = 2;
							blnPlayerTurn = false;
						} 
					}  
				}else {
				System.out.println("spot taken");
				}
			}
		}
		if(evt.getSource() == this.buth13){				// horizontal 1 3	
			if (blnPlayerTurn == true) {
				if (panel1.blnButtonH[1][3] == false) {
					panel1.blnButtonH[1][3] = true;
					panel1.repaint();
					blnPlayerTurn = false;
					if (panel1.intPointCheck[1][3] == 0) {
						if (panel1.blnButtonH[1][3] == true && panel1.blnButtonV[1][3] == true
						&& panel1.blnButtonH[2][3] == true && panel1.blnButtonV[1][4] == true) {
							intPoints1++;
							panel1.intPointCheck[1][3] = 1;
							blnPlayerTurn = true;
						} 
					} if (panel1.intPointCheck[0][3] == 0) {
						if (panel1.blnButtonH[0][3] == true && panel1.blnButtonV[0][3] == true
						&& panel1.blnButtonH[1][3] == true && panel1.blnButtonV[0][4] == true) {
							intPoints1++;
							panel1.intPointCheck[0][3] = 1;
							blnPlayerTurn = true;
						} 
					}  
				} else {
					System.out.println("spot taken");
				}
			} else if (blnPlayerTurn == false) {
				if (panel1.blnButtonH[1][3] == false) {
					panel1.blnButtonH[1][3] = true;
					panel1.repaint();
					blnPlayerTurn = true;
					if (panel1.intPointCheck[1][3] == 0) {
						if (panel1.blnButtonH[1][3] == true && panel1.blnButtonV[1][3] == true
						&& panel1.blnButtonH[2][3] == true && panel1.blnButtonV[1][4] == true) {
							intPoints2++;
							panel1.intPointCheck[1][3] = 2;
							blnPlayerTurn = false;
						} 
					} if (panel1.intPointCheck[0][3] == 0) {
						if (panel1.blnButtonH[1][3] == true && panel1.blnButtonV[0][3] == true
						&& panel1.blnButtonH[0][3] == true && panel1.blnButtonV[0][4] == true) {
							intPoints2++;
							panel1.intPointCheck[0][3] = 2;
							blnPlayerTurn = false;
						} 
					}  
				}else {
				System.out.println("spot taken");
				}
			}
		}
		if(evt.getSource() == this.buth14){				// horizontal 1 4	
			if (blnPlayerTurn == true) {
				if (panel1.blnButtonH[1][4] == false) {
					panel1.blnButtonH[1][4] = true;
					panel1.repaint();
					blnPlayerTurn = false;
					if (panel1.intPointCheck[1][4] == 0) {
						if (panel1.blnButtonH[1][4] == true && panel1.blnButtonV[1][4] == true
						&& panel1.blnButtonH[2][4] == true && panel1.blnButtonV[1][5] == true) {
							intPoints1++;
							panel1.intPointCheck[1][4] = 1;
							blnPlayerTurn = true;
						} 
					} if (panel1.intPointCheck[0][4] == 0) {
						if (panel1.blnButtonH[0][4] == true && panel1.blnButtonV[0][4] == true
						&& panel1.blnButtonH[1][4] == true && panel1.blnButtonV[0][5] == true) {
							intPoints1++;
							panel1.intPointCheck[0][4] = 1;
							blnPlayerTurn = true;
						} 
					}  
				} else {
					System.out.println("spot taken");
				}
			} else if (blnPlayerTurn == false) {
				if (panel1.blnButtonH[1][4] == false) {
					panel1.blnButtonH[1][4] = true;
					panel1.repaint();
					blnPlayerTurn = true;
					if (panel1.intPointCheck[1][4] == 0) {
						if (panel1.blnButtonH[1][4] == true && panel1.blnButtonV[1][4] == true
						&& panel1.blnButtonH[2][4] == true && panel1.blnButtonV[1][5] == true) {
							intPoints2++;
							panel1.intPointCheck[1][4] = 2;
							blnPlayerTurn = false;
						} 
					} if (panel1.intPointCheck[0][4] == 0) {
						if (panel1.blnButtonH[0][4] == true && panel1.blnButtonV[0][4] == true
						&& panel1.blnButtonH[1][4] == true && panel1.blnButtonV[0][5] == true) {
							intPoints2++;
							panel1.intPointCheck[0][4] = 2;
							blnPlayerTurn = false;
						} 
					}  
				}else {
				System.out.println("spot taken");
				}
			}
		}
		if(evt.getSource() == this.buth20){				// horizontal 2 0	
			if (blnPlayerTurn == true) {
				if (panel1.blnButtonH[2][0] == false) {
					panel1.blnButtonH[2][0] = true;
					panel1.repaint();
					blnPlayerTurn = false;
					if (panel1.intPointCheck[2][0] == 0) {
						if (panel1.blnButtonH[2][0] == true && panel1.blnButtonV[2][0] == true
						&& panel1.blnButtonH[3][0] == true && panel1.blnButtonV[2][1] == true) {
							intPoints1++;
							panel1.intPointCheck[2][0] = 1;
							blnPlayerTurn = true;
						} 
					} if (panel1.intPointCheck[1][0] == 0) {
						if (panel1.blnButtonH[1][0] == true && panel1.blnButtonV[1][0] == true
						&& panel1.blnButtonH[2][0] == true && panel1.blnButtonV[1][1] == true) {
							intPoints1++;
							panel1.intPointCheck[1][0] = 1;
							blnPlayerTurn = true;
						} 
					}  
				} else {
					System.out.println("spot taken");
				}
			} else if (blnPlayerTurn == false) {
				if (panel1.blnButtonH[2][0] == false) {
					panel1.blnButtonH[2][0] = true;
					panel1.repaint();
					blnPlayerTurn = true;
					if (panel1.intPointCheck[2][0] == 0) {
						if (panel1.blnButtonH[2][0] == true && panel1.blnButtonV[2][0] == true
						&& panel1.blnButtonH[3][0] == true && panel1.blnButtonV[2][1] == true) {
							intPoints2++;
							panel1.intPointCheck[2][0] = 2;
							blnPlayerTurn = false;
						} 
					} if (panel1.intPointCheck[1][0] == 0) {
						if (panel1.blnButtonH[1][0] == true && panel1.blnButtonV[1][0] == true
						&& panel1.blnButtonH[2][0] == true && panel1.blnButtonV[1][1] == true) {
							intPoints2++;
							panel1.intPointCheck[1][0] = 2;
							blnPlayerTurn = false;
						} 
					} 
				}else {
				System.out.println("spot taken");
				}
			}
		}
		if(evt.getSource() == this.buth21){				// horizontal 2 1	
			if (blnPlayerTurn == true) {
				if (panel1.blnButtonH[2][1] == false) {
					panel1.blnButtonH[2][1] = true;
					panel1.repaint();
					blnPlayerTurn = false;
					if (panel1.intPointCheck[2][1] == 0) {
						if (panel1.blnButtonH[2][1] == true && panel1.blnButtonV[2][1] == true
						&& panel1.blnButtonH[3][1] == true && panel1.blnButtonV[2][2] == true) {
							intPoints1++;
							panel1.intPointCheck[2][1] = 1;
							blnPlayerTurn = true;
						} 
					} if (panel1.intPointCheck[1][1] == 0) {
						if (panel1.blnButtonH[1][1] == true && panel1.blnButtonV[1][1] == true
						&& panel1.blnButtonH[2][1] == true && panel1.blnButtonV[1][2] == true) {
							intPoints1++;
							panel1.intPointCheck[1][1] = 1;
							blnPlayerTurn = true;
						} 
					}  
				} else {
					System.out.println("spot taken");
				}
			} else if (blnPlayerTurn == false) {
				if (panel1.blnButtonH[2][1] == false) {
					panel1.blnButtonH[2][1] = true;
					panel1.repaint();
					blnPlayerTurn = true;
					if (panel1.intPointCheck[2][1] == 0) {
						if (panel1.blnButtonH[2][1] == true && panel1.blnButtonV[2][1] == true
						&& panel1.blnButtonH[3][1] == true && panel1.blnButtonV[2][2] == true) {
							intPoints2++;
							panel1.intPointCheck[2][1] = 2;
							blnPlayerTurn = false;
						} 
					} if (panel1.intPointCheck[1][1] == 0) {
						if (panel1.blnButtonH[1][1] == true && panel1.blnButtonV[1][1] == true
						&& panel1.blnButtonH[2][1] == true && panel1.blnButtonV[1][2] == true) {
							intPoints2++;
							panel1.intPointCheck[1][1] = 2;
							blnPlayerTurn = false;
						} 
					}
				}else {
				System.out.println("spot taken");
				}
			}
		}
		if(evt.getSource() == this.buth22){				// horizontal 2 2	
			if (blnPlayerTurn == true) {
				if (panel1.blnButtonH[2][2] == false) {
					panel1.blnButtonH[2][2] = true;
					panel1.repaint();
					blnPlayerTurn = false;
					if (panel1.intPointCheck[2][2] == 0) {
						if (panel1.blnButtonH[2][2] == true && panel1.blnButtonV[2][2] == true
						&& panel1.blnButtonH[3][2] == true && panel1.blnButtonV[2][3] == true) {
							intPoints1++;
							panel1.intPointCheck[2][2] = 1;
							blnPlayerTurn = true;
						} 
					} if (panel1.intPointCheck[1][2] == 0) {
						if (panel1.blnButtonH[1][2] == true && panel1.blnButtonV[1][2] == true
						&& panel1.blnButtonH[2][2] == true && panel1.blnButtonV[1][3] == true) {
							intPoints1++;
							panel1.intPointCheck[1][2] = 1;
							blnPlayerTurn = true;
						} 
					}  
				} else {
					System.out.println("spot taken");
				}
			} else if (blnPlayerTurn == false) {
				if (panel1.blnButtonH[2][2] == false) {
					panel1.blnButtonH[2][2] = true;
					panel1.repaint();
					blnPlayerTurn = true;
					if (panel1.intPointCheck[2][2] == 0) {
						if (panel1.blnButtonH[2][2] == true && panel1.blnButtonV[2][2] == true
						&& panel1.blnButtonH[3][2] == true && panel1.blnButtonV[2][3] == true) {
							intPoints2++;
							panel1.intPointCheck[2][2] = 2;
							blnPlayerTurn = false;
						} 
					} if (panel1.intPointCheck[1][2] == 0) {
						if (panel1.blnButtonH[1][2] == true && panel1.blnButtonV[1][2] == true
						&& panel1.blnButtonH[2][2] == true && panel1.blnButtonV[1][3] == true) {
							intPoints2++;
							panel1.intPointCheck[1][2] = 2;
							blnPlayerTurn = false;
						} 
					}
				}else {
				System.out.println("spot taken");
				}
			}
		}
		if(evt.getSource() == this.buth23){				// horizontal 2 3	
			if (blnPlayerTurn == true) {
				if (panel1.blnButtonH[2][3] == false) {
					panel1.blnButtonH[2][3] = true;
					panel1.repaint();
					blnPlayerTurn = false;
					if (panel1.intPointCheck[2][3] == 0) {
						if (panel1.blnButtonH[2][3] == true && panel1.blnButtonV[2][3] == true
						&& panel1.blnButtonH[3][3] == true && panel1.blnButtonV[2][4] == true) {
							intPoints1++;
							panel1.intPointCheck[2][3] = 1;
							blnPlayerTurn = true;
						} 
					} if (panel1.intPointCheck[1][3] == 0) {
						if (panel1.blnButtonH[1][3] == true && panel1.blnButtonV[1][3] == true
						&& panel1.blnButtonH[2][3] == true && panel1.blnButtonV[1][4] == true) {
							intPoints1++;
							panel1.intPointCheck[1][3] = 1;
							blnPlayerTurn = true;
						} 
					}  
				} else {
					System.out.println("spot taken");
				}
			} else if (blnPlayerTurn == false) {
				if (panel1.blnButtonH[2][3] == false) {
					panel1.blnButtonH[2][3] = true;
					panel1.repaint();
					blnPlayerTurn = true;
					if (panel1.intPointCheck[2][3] == 0) {
						if (panel1.blnButtonH[2][3] == true && panel1.blnButtonV[2][3] == true
						&& panel1.blnButtonH[3][3] == true && panel1.blnButtonV[2][4] == true) {
							intPoints2++;
							panel1.intPointCheck[2][3] = 2;
							blnPlayerTurn = false;
						} 
					} if (panel1.intPointCheck[1][3] == 0) {
						if (panel1.blnButtonH[1][3] == true && panel1.blnButtonV[1][3] == true
						&& panel1.blnButtonH[2][3] == true && panel1.blnButtonV[1][4] == true) {
							intPoints2++;
							panel1.intPointCheck[1][3] = 2;
							blnPlayerTurn = false;
						} 
					}
				}else {
				System.out.println("spot taken");
				}
			}
		}
		if(evt.getSource() == this.buth24){				// horizontal 2 4	
			if (blnPlayerTurn == true) {
				if (panel1.blnButtonH[2][4] == false) {
					panel1.blnButtonH[2][4] = true;
					panel1.repaint();
					blnPlayerTurn = false;
					if (panel1.intPointCheck[2][4] == 0) {
						if (panel1.blnButtonH[2][4] == true && panel1.blnButtonV[2][4] == true
						&& panel1.blnButtonH[3][4] == true && panel1.blnButtonV[2][5] == true) {
							intPoints1++;
							panel1.intPointCheck[2][4] = 1;
							blnPlayerTurn = true;
						} 
					} if (panel1.intPointCheck[1][4] == 0) {
						if (panel1.blnButtonH[1][4] == true && panel1.blnButtonV[1][4] == true
						&& panel1.blnButtonH[2][4] == true && panel1.blnButtonV[1][5] == true) {
							intPoints1++;
							panel1.intPointCheck[1][4] = 1;
							blnPlayerTurn = true;
						} 
					}  
				} else {
					System.out.println("spot taken");
				}
			} else if (blnPlayerTurn == false) {
				if (panel1.blnButtonH[2][4] == false) {
					panel1.blnButtonH[2][4] = true;
					panel1.repaint();
					blnPlayerTurn = true;
					if (panel1.intPointCheck[2][4] == 0) {
						if (panel1.blnButtonH[2][4] == true && panel1.blnButtonV[2][4] == true
						&& panel1.blnButtonH[3][4] == true && panel1.blnButtonV[2][5] == true) {
							intPoints2++;
							panel1.intPointCheck[2][4] = 2;
							blnPlayerTurn = false;
						} 
					} if (panel1.intPointCheck[1][4] == 0) {
						if (panel1.blnButtonH[1][4] == true && panel1.blnButtonV[1][4] == true
						&& panel1.blnButtonH[2][4] == true && panel1.blnButtonV[1][5] == true) {
							intPoints2++;
							panel1.intPointCheck[1][4] = 2;
							blnPlayerTurn = false;
						} 
					}
				}else {
				System.out.println("spot taken");
				}
			}
		}
		if(evt.getSource() == this.buth30){				// horizontal 3 0
			if (blnPlayerTurn == true) {
				if (panel1.blnButtonH[3][0] == false) {
					panel1.blnButtonH[3][0] = true;
					panel1.repaint();
					blnPlayerTurn = false;
					if (panel1.intPointCheck[3][0] == 0) {
						if (panel1.blnButtonH[3][0] == true && panel1.blnButtonV[3][0] == true
						&& panel1.blnButtonH[4][0] == true && panel1.blnButtonV[3][1] == true) {
							intPoints1++;
							panel1.intPointCheck[3][0] = 1;
							blnPlayerTurn = true;
						} 
					} if (panel1.intPointCheck[2][0] == 0) {
						if (panel1.blnButtonH[2][0] == true && panel1.blnButtonV[2][0] == true
						&& panel1.blnButtonH[3][0] == true && panel1.blnButtonV[2][1] == true) {
							intPoints1++;
							panel1.intPointCheck[2][0] = 1;
							blnPlayerTurn = true;
						} 
					}  
				} else {
					System.out.println("spot taken");
				}
			} else if (blnPlayerTurn == false) {
				if (panel1.blnButtonH[3][0] == false) {
					panel1.blnButtonH[3][0] = true;
					panel1.repaint();
					blnPlayerTurn = true;
					if (panel1.intPointCheck[3][0] == 0) {
						if (panel1.blnButtonH[3][0] == true && panel1.blnButtonV[3][0] == true
						&& panel1.blnButtonH[4][0] == true && panel1.blnButtonV[3][1] == true) {
							intPoints2++;
							panel1.intPointCheck[3][0] = 2;
							blnPlayerTurn = false;
						} 
					} if (panel1.intPointCheck[2][0] == 0) {
						if (panel1.blnButtonH[2][0] == true && panel1.blnButtonV[2][0] == true
						&& panel1.blnButtonH[3][0] == true && panel1.blnButtonV[2][1] == true) {
							intPoints2++;
							panel1.intPointCheck[2][0] = 2;
							blnPlayerTurn = false;
						} 
					}
				}else {
				System.out.println("spot taken");
				}
			}
		}
		if(evt.getSource() == this.buth31){				// horizontal 3 1
			if (blnPlayerTurn == true) {
				if (panel1.blnButtonH[3][1] == false) {
					panel1.blnButtonH[3][1] = true;
					panel1.repaint();
					blnPlayerTurn = false;
					if (panel1.intPointCheck[3][1] == 0) {
						if (panel1.blnButtonH[3][1] == true && panel1.blnButtonV[3][1] == true
						&& panel1.blnButtonH[4][1] == true && panel1.blnButtonV[3][2] == true) {
							intPoints1++;
							panel1.intPointCheck[3][1] = 1;
							blnPlayerTurn = true;
						} 
					} if (panel1.intPointCheck[2][1] == 0) {
						if (panel1.blnButtonH[2][1] == true && panel1.blnButtonV[2][1] == true
						&& panel1.blnButtonH[3][1] == true && panel1.blnButtonV[2][2] == true) {
							intPoints1++;
							panel1.intPointCheck[2][1] = 1;
							blnPlayerTurn = true;
						} 
					}  
				} else {
					System.out.println("spot taken");
				}
			} else if (blnPlayerTurn == false) {
				if (panel1.blnButtonH[3][1] == false) {
					panel1.blnButtonH[3][1] = true;
					panel1.repaint();
					blnPlayerTurn = true;
					if (panel1.intPointCheck[3][1] == 0) {
						if (panel1.blnButtonH[3][1] == true && panel1.blnButtonV[3][1] == true
						&& panel1.blnButtonH[4][1] == true && panel1.blnButtonV[3][2] == true) {
							intPoints2++;
							panel1.intPointCheck[3][1] = 2;
							blnPlayerTurn = false;
						} 
					} if (panel1.intPointCheck[2][1] == 0) {
						if (panel1.blnButtonH[2][1] == true && panel1.blnButtonV[2][1] == true
						&& panel1.blnButtonH[3][1] == true && panel1.blnButtonV[2][2] == true) {
							intPoints2++;
							panel1.intPointCheck[2][1] = 2;
							blnPlayerTurn = false;
						} 
					} 
				}else {
				System.out.println("spot taken");
				}
			}
		}
		if(evt.getSource() == this.buth32){				// horizontal 3 2
			if (blnPlayerTurn == true) {
				if (panel1.blnButtonH[3][2] == false) {
					panel1.blnButtonH[3][2] = true;
					panel1.repaint();
					blnPlayerTurn = false;
					if (panel1.intPointCheck[3][2] == 0) {
						if (panel1.blnButtonH[3][2] == true && panel1.blnButtonV[3][2] == true
						&& panel1.blnButtonH[4][2] == true && panel1.blnButtonV[3][3] == true) {
							intPoints1++;
							panel1.intPointCheck[3][2] = 1;
							blnPlayerTurn = true;
						} 
					} if (panel1.intPointCheck[2][2] == 0) {
						if (panel1.blnButtonH[2][2] == true && panel1.blnButtonV[2][2] == true
						&& panel1.blnButtonH[3][2] == true && panel1.blnButtonV[2][3] == true) {
							intPoints1++;
							panel1.intPointCheck[2][2] = 1;
							blnPlayerTurn = true;
						} 
					}  
				} else {
					System.out.println("spot taken");
				}
			} else if (blnPlayerTurn == false) {
				if (panel1.blnButtonH[3][2] == false) {
					panel1.blnButtonH[3][2] = true;
					panel1.repaint();
					blnPlayerTurn = true;
					if (panel1.intPointCheck[3][2] == 0) {
						if (panel1.blnButtonH[3][2] == true && panel1.blnButtonV[3][2] == true
						&& panel1.blnButtonH[4][2] == true && panel1.blnButtonV[3][3] == true) {
							intPoints2++;
							panel1.intPointCheck[3][2] = 2;
							blnPlayerTurn = false;
						} 
					} if (panel1.intPointCheck[2][2] == 0) {
						if (panel1.blnButtonH[2][2] == true && panel1.blnButtonV[2][2] == true
						&& panel1.blnButtonH[3][2] == true && panel1.blnButtonV[2][3] == true) {
							intPoints2++;
							panel1.intPointCheck[2][2] = 2;
							blnPlayerTurn = false;
						} 
					}
				}else {
				System.out.println("spot taken");
				}
			}
		}
		if(evt.getSource() == this.buth33){				// horizontal 3 3
			if (blnPlayerTurn == true) {
				if (panel1.blnButtonH[3][3] == false) {
					panel1.blnButtonH[3][3] = true;
					panel1.repaint();
					blnPlayerTurn = false;
					if (panel1.intPointCheck[3][3] == 0) {
						if (panel1.blnButtonH[3][3] == true && panel1.blnButtonV[3][3] == true
						&& panel1.blnButtonH[4][3] == true && panel1.blnButtonV[3][4] == true) {
							intPoints1++;
							panel1.intPointCheck[3][3] = 1;
							blnPlayerTurn = true;
						} 
					} if (panel1.intPointCheck[2][3] == 0) {
						if (panel1.blnButtonH[2][3] == true && panel1.blnButtonV[2][3] == true
						&& panel1.blnButtonH[3][3] == true && panel1.blnButtonV[2][4] == true) {
							intPoints1++;
							panel1.intPointCheck[2][3] = 1;
							blnPlayerTurn = true;
						} 
					}  
				} else {
					System.out.println("spot taken");
				}
			} else if (blnPlayerTurn == false) {
				if (panel1.blnButtonH[3][3] == false) {
					panel1.blnButtonH[3][3] = true;
					panel1.repaint();
					blnPlayerTurn = true;
					if (panel1.intPointCheck[3][3] == 0) {
						if (panel1.blnButtonH[3][3] == true && panel1.blnButtonV[3][3] == true
						&& panel1.blnButtonH[4][3] == true && panel1.blnButtonV[3][4] == true) {
							intPoints2++;
							panel1.intPointCheck[3][3] = 2;
							blnPlayerTurn = false;
						} 
					} if (panel1.intPointCheck[2][3] == 0) {
						if (panel1.blnButtonH[2][3] == true && panel1.blnButtonV[2][3] == true
						&& panel1.blnButtonH[3][3] == true && panel1.blnButtonV[2][4] == true) {
							intPoints2++;
							panel1.intPointCheck[2][3] = 2;
							blnPlayerTurn = false;
						} 
					} 
				}else {
				System.out.println("spot taken");
				}
			}
		}
		if(evt.getSource() == this.buth34){				// horizontal 3 4
			if (blnPlayerTurn == true) {
				if (panel1.blnButtonH[3][4] == false) {
					panel1.blnButtonH[3][4] = true;
					panel1.repaint();
					blnPlayerTurn = false;
					if (panel1.intPointCheck[3][4] == 0) {
						if (panel1.blnButtonH[3][4] == true && panel1.blnButtonV[3][4] == true
						&& panel1.blnButtonH[4][4] == true && panel1.blnButtonV[3][5] == true) {
							intPoints1++;
							panel1.intPointCheck[3][4] = 1;
							blnPlayerTurn = true;
						} 
					} if (panel1.intPointCheck[2][4] == 0) {
						if (panel1.blnButtonH[2][4] == true && panel1.blnButtonV[2][4] == true
						&& panel1.blnButtonH[3][4] == true && panel1.blnButtonV[2][5] == true) {
							intPoints1++;
							panel1.intPointCheck[2][4] = 1;
							blnPlayerTurn = true;
						} 
					}  
				} else {
					System.out.println("spot taken");
				}
			} else if (blnPlayerTurn == false) {
				if (panel1.blnButtonH[3][4] == false) {
					panel1.blnButtonH[3][4] = true;
					panel1.repaint();
					blnPlayerTurn = true;
					if (panel1.intPointCheck[3][4] == 0) {
						if (panel1.blnButtonH[3][4] == true && panel1.blnButtonV[3][4] == true
						&& panel1.blnButtonH[4][4] == true && panel1.blnButtonV[3][5] == true) {
							intPoints2++;
							panel1.intPointCheck[3][4] = 2;
							blnPlayerTurn = false;
						} 
					} if (panel1.intPointCheck[2][4] == 0) {
						if (panel1.blnButtonH[2][4] == true && panel1.blnButtonV[2][4] == true
						&& panel1.blnButtonH[3][4] == true && panel1.blnButtonV[2][5] == true) {
							intPoints2++;
							panel1.intPointCheck[2][4] = 2;
							blnPlayerTurn = false;
						} 
					}  
				}else {
				System.out.println("spot taken");
				}
			}
		}
		if(evt.getSource() == this.buth40){				// horizontal 4 0 
			if (blnPlayerTurn == true) {
				if (panel1.blnButtonH[4][0] == false) {
					panel1.blnButtonH[4][0] = true;
					panel1.repaint();
					blnPlayerTurn = false;
					if (panel1.intPointCheck[4][0] == 0) {
						if (panel1.blnButtonH[4][0] == true && panel1.blnButtonV[4][0] == true
						&& panel1.blnButtonH[5][0] == true && panel1.blnButtonV[4][1] == true) {
							intPoints1++;
							panel1.intPointCheck[4][0] = 1;
							blnPlayerTurn = true;
						} 
					} if (panel1.intPointCheck[3][0] == 0) {
						if (panel1.blnButtonH[3][0] == true && panel1.blnButtonV[3][0] == true
						&& panel1.blnButtonH[4][0] == true && panel1.blnButtonV[3][1] == true) {
							intPoints1++;
							panel1.intPointCheck[3][0] = 1;
							blnPlayerTurn = true;
						} 
					}  
				} else {
					System.out.println("spot taken");
				}
			} else if (blnPlayerTurn == false) {
				if (panel1.blnButtonH[4][0] == false) {
					panel1.blnButtonH[4][0] = true;
					panel1.repaint();
					blnPlayerTurn = true;
					if (panel1.intPointCheck[4][0] == 0) {
						if (panel1.blnButtonH[4][0] == true && panel1.blnButtonV[4][0] == true
						&& panel1.blnButtonH[5][0] == true && panel1.blnButtonV[4][1] == true) {
							intPoints2++;
							panel1.intPointCheck[4][0] = 2;
							blnPlayerTurn = false;
						} 
					} if (panel1.intPointCheck[3][0] == 0) {
						if (panel1.blnButtonH[3][0] == true && panel1.blnButtonV[3][0] == true
						&& panel1.blnButtonH[4][0] == true && panel1.blnButtonV[3][1] == true) {
							intPoints2++;
							panel1.intPointCheck[3][0] = 2;
							blnPlayerTurn = false;
						} 
					}    
				}else {
				System.out.println("spot taken");
				}
			}
		}
		if(evt.getSource() == this.buth41){				// horizontal 4 1
			if (blnPlayerTurn == true) {
				if (panel1.blnButtonH[4][1] == false) {
					panel1.blnButtonH[4][1] = true;
					panel1.repaint();
					blnPlayerTurn = false;
					if (panel1.intPointCheck[4][1] == 0) {
						if (panel1.blnButtonH[4][1] == true && panel1.blnButtonV[4][1] == true
						&& panel1.blnButtonH[5][1] == true && panel1.blnButtonV[4][2] == true) {
							intPoints1++;
							panel1.intPointCheck[4][1] = 1;
							blnPlayerTurn = true;
						} 
					} if (panel1.intPointCheck[3][1] == 0) {
						if (panel1.blnButtonH[3][1] == true && panel1.blnButtonV[3][1] == true
						&& panel1.blnButtonH[4][1] == true && panel1.blnButtonV[3][2] == true) {
							intPoints1++;
							panel1.intPointCheck[3][1] = 1;
							blnPlayerTurn = true;
						} 
					}  
				} else {
					System.out.println("spot taken");
				}
			} else if (blnPlayerTurn == false) {
				if (panel1.blnButtonH[4][1] == false) {
					panel1.blnButtonH[4][1] = true;
					panel1.repaint();
					blnPlayerTurn = true;
					if (panel1.intPointCheck[4][1] == 0) {
						if (panel1.blnButtonH[4][1] == true && panel1.blnButtonV[4][1] == true
						&& panel1.blnButtonH[5][1] == true && panel1.blnButtonV[4][2] == true) {
							intPoints2++;
							panel1.intPointCheck[4][1] = 2;
							blnPlayerTurn = false;
						} 
					} if (panel1.intPointCheck[3][1] == 0) {
						if (panel1.blnButtonH[3][1] == true && panel1.blnButtonV[3][1] == true
						&& panel1.blnButtonH[4][1] == true && panel1.blnButtonV[3][2] == true) {
							intPoints2++;
							panel1.intPointCheck[3][1] = 2;
							blnPlayerTurn = false;
						} 
					}    
				}else {
				System.out.println("spot taken");
				}
			}
		}
		if(evt.getSource() == this.buth42){				// horizontal 4 2
			if (blnPlayerTurn == true) {
				if (panel1.blnButtonH[4][2] == false) {
					panel1.blnButtonH[4][2] = true;
					panel1.repaint();
					blnPlayerTurn = false;
					if (panel1.intPointCheck[4][2] == 0) {
						if (panel1.blnButtonH[4][2] == true && panel1.blnButtonV[4][2] == true
						&& panel1.blnButtonH[5][2] == true && panel1.blnButtonV[4][3] == true) {
							intPoints1++;
							panel1.intPointCheck[4][2] = 1;
							blnPlayerTurn = true;
						} 
					} if (panel1.intPointCheck[3][2] == 0) {
						if (panel1.blnButtonH[3][2] == true && panel1.blnButtonV[3][2] == true
						&& panel1.blnButtonH[4][2] == true && panel1.blnButtonV[4][3] == true) {
							intPoints1++;
							panel1.intPointCheck[3][2] = 1;
							blnPlayerTurn = true;
						} 
					}  
				} else {
					System.out.println("spot taken");
				}
			} else if (blnPlayerTurn == false) {
				if (panel1.blnButtonH[4][2] == false) {
					panel1.blnButtonH[4][2] = true;
					panel1.repaint();
					blnPlayerTurn = true;
					if (panel1.intPointCheck[4][2] == 0) {
						if (panel1.blnButtonH[4][2] == true && panel1.blnButtonV[4][2] == true
						&& panel1.blnButtonH[5][2] == true && panel1.blnButtonV[4][3] == true) {
							intPoints2++;
							panel1.intPointCheck[4][2] = 2;
							blnPlayerTurn = false;
						} 
					} if (panel1.intPointCheck[3][2] == 0) {
						if (panel1.blnButtonH[3][2] == true && panel1.blnButtonV[3][2] == true
						&& panel1.blnButtonH[4][2] == true && panel1.blnButtonV[4][3] == true) {
							intPoints2++;
							panel1.intPointCheck[3][2] = 2;
							blnPlayerTurn = false;
						} 
					}     
				}else {
				System.out.println("spot taken");
				}
			}
		}
		if(evt.getSource() == this.buth43){				// horizontal 4 3
			if (blnPlayerTurn == true) {
				if (panel1.blnButtonH[4][3] == false) {
					panel1.blnButtonH[4][3] = true;
					panel1.repaint();
					blnPlayerTurn = false;
					if (panel1.intPointCheck[4][3] == 0) {
						if (panel1.blnButtonH[4][3] == true && panel1.blnButtonV[4][3] == true
						&& panel1.blnButtonH[5][3] == true && panel1.blnButtonV[4][4] == true) {
							intPoints1++;
							panel1.intPointCheck[4][3] = 1;
							blnPlayerTurn = true;
						} 
					} if (panel1.intPointCheck[3][3] == 0) {
						if (panel1.blnButtonH[3][3] == true && panel1.blnButtonV[3][3] == true
						&& panel1.blnButtonH[4][3] == true && panel1.blnButtonV[4][4] == true) {
							intPoints1++;
							panel1.intPointCheck[3][3] = 1;
							blnPlayerTurn = true;
						} 
					}  
				} else {
					System.out.println("spot taken");
				}
			} else if (blnPlayerTurn == false) {
				if (panel1.blnButtonH[4][3] == false) {
					panel1.blnButtonH[4][3] = true;
					panel1.repaint();
					blnPlayerTurn = true;
					if (panel1.intPointCheck[4][3] == 0) {
						if (panel1.blnButtonH[4][3] == true && panel1.blnButtonV[4][3] == true
						&& panel1.blnButtonH[5][3] == true && panel1.blnButtonV[4][4] == true) {
							intPoints2++;
							panel1.intPointCheck[4][3] = 2;
							blnPlayerTurn = false;
						} 
					} if (panel1.intPointCheck[3][3] == 0) {
						if (panel1.blnButtonH[3][3] == true && panel1.blnButtonV[3][3] == true
						&& panel1.blnButtonH[4][3] == true && panel1.blnButtonV[4][4] == true) {
							intPoints2++;
							panel1.intPointCheck[3][3] = 2;
							blnPlayerTurn = false;
						} 
					}      
				}else {
				System.out.println("spot taken");
				}
			}
		}
		if(evt.getSource() == this.buth44){				// horizontal 4 4
			if (blnPlayerTurn == true) {
				if (panel1.blnButtonH[4][4] == false) {
					panel1.blnButtonH[4][4] = true;
					panel1.repaint();
					blnPlayerTurn = false;
					if (panel1.intPointCheck[4][4] == 0) {
						if (panel1.blnButtonH[4][4] == true && panel1.blnButtonV[4][4] == true
						&& panel1.blnButtonH[5][4] == true && panel1.blnButtonV[4][5] == true) {
							intPoints1++;
							panel1.intPointCheck[4][4] = 1;
							blnPlayerTurn = true;
						} 
					} if (panel1.intPointCheck[3][4] == 0) {
						if (panel1.blnButtonH[3][4] == true && panel1.blnButtonV[3][4] == true
						&& panel1.blnButtonH[4][4] == true && panel1.blnButtonV[4][5] == true) {
							intPoints1++;
							panel1.intPointCheck[3][4] = 1;
							blnPlayerTurn = true;
						} 
					}  
				} else {
					System.out.println("spot taken");
				}
			} else if (blnPlayerTurn == false) {
				if (panel1.blnButtonH[4][4] == false) {
					panel1.blnButtonH[4][4] = true;
					panel1.repaint();
					blnPlayerTurn = true;
					if (panel1.intPointCheck[4][4] == 0) {
						if (panel1.blnButtonH[4][4] == true && panel1.blnButtonV[4][4] == true
						&& panel1.blnButtonH[5][4] == true && panel1.blnButtonV[4][5] == true) {
							intPoints2++;
							panel1.intPointCheck[4][4] = 2;
							blnPlayerTurn = false;
						} 
					} if (panel1.intPointCheck[3][4] == 0) {
						if (panel1.blnButtonH[3][4] == true && panel1.blnButtonV[3][4] == true
						&& panel1.blnButtonH[4][4] == true && panel1.blnButtonV[4][5] == true) {
							intPoints2++;
							panel1.intPointCheck[3][4] = 2;
							blnPlayerTurn = false;
						} 
					}        
				}else {
				System.out.println("spot taken");
				}
			}
		}
		if(evt.getSource() == this.buth50){				// horizontal 5 0
			if (blnPlayerTurn == true) {
				if (panel1.blnButtonH[5][0] == false) {
					panel1.blnButtonH[5][0] = true;
					panel1.repaint();
					blnPlayerTurn = false;
					if (panel1.intPointCheck[4][0] == 0) {
						if (panel1.blnButtonH[4][0] == true && panel1.blnButtonV[4][0] == true
						&& panel1.blnButtonH[5][0] == true && panel1.blnButtonV[4][1] == true) {
							intPoints1++;
							panel1.intPointCheck[4][0] = 1;
							blnPlayerTurn = true;
						} 
					}  
				} else {
					System.out.println("spot taken");
				}
			} else if (blnPlayerTurn == false) {
				if (panel1.blnButtonH[5][0] == false) {
					panel1.blnButtonH[5][0] = true;
					panel1.repaint();
					blnPlayerTurn = true;
					if (panel1.intPointCheck[4][0] == 0) {
						if (panel1.blnButtonH[4][0] == true && panel1.blnButtonV[4][0] == true
						&& panel1.blnButtonH[5][0] == true && panel1.blnButtonV[4][1] == true) {
							intPoints2++;
							panel1.intPointCheck[4][0] = 2;
							blnPlayerTurn = false;
						} 
					}     
				}else {
				System.out.println("spot taken");
				}
			}
		}
		if(evt.getSource() == this.buth51){				// horizontal 5 1
			if (blnPlayerTurn == true) {
				if (panel1.blnButtonH[5][1] == false) {
					panel1.blnButtonH[5][1] = true;
					panel1.repaint();
					blnPlayerTurn = false;
					if (panel1.intPointCheck[4][1] == 0) {
						if (panel1.blnButtonH[4][1] == true && panel1.blnButtonV[4][1] == true
						&& panel1.blnButtonH[5][1] == true && panel1.blnButtonV[4][2] == true) {
							intPoints1++;
							panel1.intPointCheck[4][1] = 1;
							blnPlayerTurn = true;
						} 
					}  
				} else {
					System.out.println("spot taken");
				}
			} else if (blnPlayerTurn == false) {
				if (panel1.blnButtonH[5][1] == false) {
					panel1.blnButtonH[5][1] = true;
					panel1.repaint();
					blnPlayerTurn = true;
					if (panel1.intPointCheck[4][1] == 0) {
						if (panel1.blnButtonH[4][1] == true && panel1.blnButtonV[4][1] == true
						&& panel1.blnButtonH[5][1] == true && panel1.blnButtonV[4][2] == true) {
							intPoints2++;
							panel1.intPointCheck[4][1] = 2;
							blnPlayerTurn = false;
						} 
					}     
				}else {
				System.out.println("spot taken");
				}
			}
		}
		if(evt.getSource() == this.buth52){				// horizontal 5 2
			if (blnPlayerTurn == true) {
				if (panel1.blnButtonH[5][2] == false) {
					panel1.blnButtonH[5][2] = true;
					panel1.repaint();
					blnPlayerTurn = false;
					if (panel1.intPointCheck[4][2] == 0) {
						if (panel1.blnButtonH[4][2] == true && panel1.blnButtonV[4][2] == true
						&& panel1.blnButtonH[5][2] == true && panel1.blnButtonV[4][3] == true) {
							intPoints1++;
							panel1.intPointCheck[4][2] = 1;
							blnPlayerTurn = true;
						} 
					}  
				} else {
					System.out.println("spot taken");
				}
			} else if (blnPlayerTurn == false) {
				if (panel1.blnButtonH[5][2] == false) {
					panel1.blnButtonH[5][2] = true;
					panel1.repaint();
					blnPlayerTurn = true;
					if (panel1.intPointCheck[4][2] == 0) {
						if (panel1.blnButtonH[4][2] == true && panel1.blnButtonV[4][2] == true
						&& panel1.blnButtonH[5][2] == true && panel1.blnButtonV[4][3] == true) {
							intPoints2++;
							panel1.intPointCheck[4][2] = 2;
							blnPlayerTurn = false;
						} 
					}     
				}else {
				System.out.println("spot taken");
				}
			}
		}
		if(evt.getSource() == this.buth53){				// horizontal 5 3
			if (blnPlayerTurn == true) {
				if (panel1.blnButtonH[5][3] == false) {
					panel1.blnButtonH[5][3] = true;
					panel1.repaint();
					blnPlayerTurn = false;
					if (panel1.intPointCheck[4][3] == 0) {
						if (panel1.blnButtonH[4][3] == true && panel1.blnButtonV[4][3] == true
						&& panel1.blnButtonH[5][3] == true && panel1.blnButtonV[4][4] == true) {
							intPoints1++;
							panel1.intPointCheck[4][3] = 1;
							blnPlayerTurn = true;
						} 
					}  
				} else {
					System.out.println("spot taken");
				}
			} else if (blnPlayerTurn == false) {
				if (panel1.blnButtonH[5][3] == false) {
					panel1.blnButtonH[5][3] = true;
					panel1.repaint();
					blnPlayerTurn = true;
					if (panel1.intPointCheck[4][3] == 0) {
						if (panel1.blnButtonH[4][3] == true && panel1.blnButtonV[4][3] == true
						&& panel1.blnButtonH[5][3] == true && panel1.blnButtonV[4][4] == true) {
							intPoints2++;
							panel1.intPointCheck[4][3] = 2;
							blnPlayerTurn = false;
						} 
					}     
				}else {
				System.out.println("spot taken");
				}
			}
		}
		if(evt.getSource() == this.buth54){				// horizontal 5 4
			if (blnPlayerTurn == true) {
				if (panel1.blnButtonH[5][4] == false) {
					panel1.blnButtonH[5][4] = true;
					panel1.repaint();
					blnPlayerTurn = false;
					if (panel1.intPointCheck[4][4] == 0) {
						if (panel1.blnButtonH[4][4] == true && panel1.blnButtonV[4][4] == true
						&& panel1.blnButtonH[5][4] == true && panel1.blnButtonV[4][5] == true) {
							intPoints1++;
							panel1.intPointCheck[4][4] = 1;
							blnPlayerTurn = true;
						} 
					}  
				} else {
					System.out.println("spot taken");
				}
			} else if (blnPlayerTurn == false) {
				if (panel1.blnButtonH[5][4] == false) {
					panel1.blnButtonH[5][4] = true;
					panel1.repaint();
					blnPlayerTurn = true;
					if (panel1.intPointCheck[4][4] == 0) {
						if (panel1.blnButtonH[4][4] == true && panel1.blnButtonV[4][4] == true
						&& panel1.blnButtonH[5][4] == true && panel1.blnButtonV[4][5] == true) {
							intPoints2++;
							panel1.intPointCheck[4][4] = 2;
							blnPlayerTurn = false;
						} 
					}     
				}else {
				System.out.println("spot taken");
				}
			}
		}
	
		
// VERTICAL BUTTON CHECK=-=--=-=-=-==-=-=-=--=-=-=--=-=-=-=-=--==-=--==-=--=-==-=-=--=-=-=-==-=-=--==--=-==-=-=--==-=-
	if(evt.getSource() == this.butv00){				// vertical 0 0	
			if (blnPlayerTurn == true) {
				if (panel1.blnButtonV[0][0] == false) {
					panel1.blnButtonV[0][0] = true;
					panel1.repaint();
					blnPlayerTurn = false;
					if (panel1.intPointCheck[0][0] == 0) {
						if (panel1.blnButtonH[0][0] == true && panel1.blnButtonV[0][0] == true
						&& panel1.blnButtonH[1][0] == true && panel1.blnButtonV[0][1] == true) {
							intPoints1++;
							panel1.intPointCheck[0][0] = 1;
							blnPlayerTurn = true;
						}
					}
				} else {
					System.out.println("spot taken");
				}
			} else if (blnPlayerTurn == false) {
				if (panel1.blnButtonV[0][0] == false){
					panel1.blnButtonV[0][0] = true;
					panel1.repaint();
					blnPlayerTurn = true;
					if (panel1.intPointCheck[0][0] == 0) {
						if (panel1.blnButtonH[0][0] == true && panel1.blnButtonV[0][0] == true
						&& panel1.blnButtonH[1][0] == true && panel1.blnButtonV[0][1] == true) {
							intPoints2++;
							panel1.intPointCheck[0][0] = 2;
							blnPlayerTurn = false;
						}
					}
				} else {
					System.out.println("spot taken");
				}
			}
		}	
		if(evt.getSource() == this.butv01){				// vertical 0 1	
			if (blnPlayerTurn == true) {
				if (panel1.blnButtonV[0][1] == false) {
					panel1.blnButtonV[0][1] = true;
					panel1.repaint();
					blnPlayerTurn = false;
					if (panel1.intPointCheck[0][0] == 0) {
						if (panel1.blnButtonH[0][0] == true && panel1.blnButtonV[0][0] == true
						&& panel1.blnButtonH[1][0] == true && panel1.blnButtonV[0][1] == true) {
							intPoints1++;
							panel1.intPointCheck[0][0] = 1;
							blnPlayerTurn = true;
						}
					} if (panel1.intPointCheck[0][1] == 0) {
						if (panel1.blnButtonH[0][1] == true && panel1.blnButtonV[0][1] == true
						&& panel1.blnButtonH[1][1] == true && panel1.blnButtonV[0][2] == true) {
							intPoints1++;
							panel1.intPointCheck[0][1] = 1;
							blnPlayerTurn = true;
						}
					}
				} else {
					System.out.println("spot taken");
				}
			} else if (blnPlayerTurn == false) {
				if (panel1.blnButtonV[0][1] == false) {
					panel1.blnButtonV[0][1] = true;
					panel1.repaint();
					blnPlayerTurn = true;
					if (panel1.intPointCheck[0][0] == 0) {
						if (panel1.blnButtonH[0][0] == true && panel1.blnButtonV[0][0] == true
						&& panel1.blnButtonH[1][0] == true && panel1.blnButtonV[0][1] == true) {
							intPoints2++;
							panel1.intPointCheck[0][0] = 2;
							blnPlayerTurn = false;
						}
					} if (panel1.intPointCheck[0][1] == 0) {
						if (panel1.blnButtonH[0][1] == true && panel1.blnButtonV[0][1] == true
						&& panel1.blnButtonH[1][1] == true && panel1.blnButtonV[0][2] == true) {
							intPoints2++;
							panel1.intPointCheck[0][1] = 2;
							blnPlayerTurn = false;
						}
					}
				} else {
					System.out.println("spot taken");
				}
			}
		}
		if(evt.getSource() == this.butv02){				// vertical 0 2	
			if (blnPlayerTurn == true) {
				if (panel1.blnButtonV[0][2] == false) {
					panel1.blnButtonV[0][2] = true;
					panel1.repaint();
					blnPlayerTurn = false;
					if (panel1.intPointCheck[0][2] == 0) {
						if (panel1.blnButtonH[0][2] == true && panel1.blnButtonV[0][2] == true
						&& panel1.blnButtonH[1][2] == true && panel1.blnButtonV[0][3] == true) {
							intPoints1++;
							panel1.intPointCheck[0][2] = 1;
							blnPlayerTurn = true;
						}
					} if (panel1.intPointCheck[0][1] == 0) {
						if (panel1.blnButtonH[0][1] == true && panel1.blnButtonV[0][1] == true
						&& panel1.blnButtonH[1][1] == true && panel1.blnButtonV[0][2] == true) {
							intPoints1++;
							panel1.intPointCheck[0][1] = 1;
							blnPlayerTurn = true;
						}
					}
				} else {
					System.out.println("spot taken");
				}
			} else if (blnPlayerTurn == false) {
				if (panel1.blnButtonV[0][2] == false) {
					panel1.blnButtonV[0][2] = true;
					panel1.repaint();
					blnPlayerTurn = true;
					if (panel1.intPointCheck[0][2] == 0) {
						if (panel1.blnButtonH[0][2] == true && panel1.blnButtonV[0][2] == true
						&& panel1.blnButtonH[1][2] == true && panel1.blnButtonV[0][3] == true) {
							intPoints2++;
							panel1.intPointCheck[0][2] = 2;
							blnPlayerTurn = false;
						}
					} if (panel1.intPointCheck[0][1] == 0) {
						if (panel1.blnButtonH[0][1] == true && panel1.blnButtonV[0][1] == true
						&& panel1.blnButtonH[1][1] == true && panel1.blnButtonV[0][2] == true) {
							intPoints2++;
							panel1.intPointCheck[0][1] = 2;
							blnPlayerTurn = false;
						}
					}
				} else {
					System.out.println("spot taken");
				}
			}
		}
		if(evt.getSource() == this.butv03){				// vertical 0 3	
			if (blnPlayerTurn == true) {
				if (panel1.blnButtonV[0][3] == false) {
					panel1.blnButtonV[0][3] = true;
					panel1.repaint();
					blnPlayerTurn = false;
					if (panel1.intPointCheck[0][2] == 0) {
						if (panel1.blnButtonH[0][2] == true && panel1.blnButtonV[0][2] == true
						&& panel1.blnButtonH[1][2] == true && panel1.blnButtonV[0][3] == true) {
							intPoints1++;
							panel1.intPointCheck[0][2] = 1;
							blnPlayerTurn = true;
						}
					} if (panel1.intPointCheck[0][3] == 0) {
						if (panel1.blnButtonH[0][3] == true && panel1.blnButtonV[0][3] == true
						&& panel1.blnButtonH[1][3] == true && panel1.blnButtonV[0][4] == true) {
							intPoints1++;
							panel1.intPointCheck[0][3] = 1;
							blnPlayerTurn = true;
						}
					}
				} else {
					System.out.println("spot taken");
				}
			} else if (blnPlayerTurn == false) {
				if (panel1.blnButtonV[0][3] == false) {
					panel1.blnButtonV[0][3] = true;
					panel1.repaint();
					blnPlayerTurn = true;
					if (panel1.intPointCheck[0][2] == 0) {
						if (panel1.blnButtonH[0][2] == true && panel1.blnButtonV[0][2] == true
						&& panel1.blnButtonH[1][2] == true && panel1.blnButtonV[0][3] == true) {
							intPoints2++;
							panel1.intPointCheck[0][2] = 2;
							blnPlayerTurn = false;
						}
					} if (panel1.intPointCheck[0][3] == 0) {
						if (panel1.blnButtonH[0][3] == true && panel1.blnButtonV[0][3] == true
						&& panel1.blnButtonH[1][3] == true && panel1.blnButtonV[0][4] == true) {
							intPoints2++;
							panel1.intPointCheck[0][3] = 2;
							blnPlayerTurn = false;
						}
					}
				} else {
					System.out.println("spot taken");
				}
			}
		}
		if(evt.getSource() == this.butv04){				// vertical 0 4
			if (blnPlayerTurn == true) {
				if (panel1.blnButtonV[0][4] == false) {
					panel1.blnButtonV[0][4] = true;
					panel1.repaint();
					blnPlayerTurn = false;
					if (panel1.intPointCheck[0][4] == 0) {
						if (panel1.blnButtonH[0][4] == true && panel1.blnButtonV[0][4] == true
						&& panel1.blnButtonH[1][4] == true && panel1.blnButtonV[0][5] == true) {
							intPoints1++;
							panel1.intPointCheck[0][4] = 1;
							blnPlayerTurn = true;
						}
					} if (panel1.intPointCheck[0][3] == 0) {
						if (panel1.blnButtonH[0][3] == true && panel1.blnButtonV[0][3] == true
						&& panel1.blnButtonH[1][3] == true && panel1.blnButtonV[0][4] == true) {
							intPoints1++;
							panel1.intPointCheck[0][3] = 1;
							blnPlayerTurn = true;
						}
					}
				} else {
					System.out.println("spot taken");
				}
			} else if (blnPlayerTurn == false) {
				if (panel1.blnButtonV[0][4] == false) {
					panel1.blnButtonV[0][4] = true;
					panel1.repaint();
					blnPlayerTurn = true;
					if (panel1.intPointCheck[0][4] == 0) {
						if (panel1.blnButtonH[0][4] == true && panel1.blnButtonV[0][4] == true
						&& panel1.blnButtonH[1][4] == true && panel1.blnButtonV[0][5] == true) {
							intPoints2++;
							panel1.intPointCheck[0][4] = 2;
							blnPlayerTurn = false;
						}
					} if (panel1.intPointCheck[0][3] == 0) {
						if (panel1.blnButtonH[0][3] == true && panel1.blnButtonV[0][3] == true
						&& panel1.blnButtonH[1][3] == true && panel1.blnButtonV[0][4] == true) {
							intPoints2++;
							panel1.intPointCheck[0][3] = 2;
							blnPlayerTurn = false;
						}
					}
				} else {
					System.out.println("spot taken");
				}
			}
		}
		if(evt.getSource() == this.butv05){				// vertical 0 5
			if (blnPlayerTurn == true) {
				if (panel1.blnButtonV[0][5] == false) {
					panel1.blnButtonV[0][5] = true;
					panel1.repaint();
					blnPlayerTurn = false;
					if (panel1.intPointCheck[0][4] == 0) {
						if (panel1.blnButtonH[0][4] == true && panel1.blnButtonV[0][4] == true
						&& panel1.blnButtonH[1][4] == true && panel1.blnButtonV[0][5] == true) {
							intPoints1++;
							panel1.intPointCheck[0][4] = 1;
							blnPlayerTurn = true;
						}
					} 
				} else {
					System.out.println("spot taken");
				}
			} else if (blnPlayerTurn == false) {
				if (panel1.blnButtonV[0][5] == false) {
					panel1.blnButtonV[0][5] = true;
					panel1.repaint();
					blnPlayerTurn = true;
					if (panel1.intPointCheck[0][4] == 0) {
						if (panel1.blnButtonH[0][4] == true && panel1.blnButtonV[0][4] == true
						&& panel1.blnButtonH[1][4] == true && panel1.blnButtonV[0][5] == true) {
							intPoints2++;
							panel1.intPointCheck[0][4] = 2;
							blnPlayerTurn = false;
						}
					} 
				} else {
					System.out.println("spot taken");
				}
			}
		}
		if(evt.getSource() == this.butv10){				// vertical 1 0
			if (blnPlayerTurn == true) {
				if (panel1.blnButtonV[1][0] == false) {
					panel1.blnButtonV[1][0] = true;
					panel1.repaint();
					blnPlayerTurn = false;
					if (panel1.intPointCheck[1][0] == 0) {
						if (panel1.blnButtonH[1][0] == true && panel1.blnButtonV[1][0] == true
						&& panel1.blnButtonH[2][0] == true && panel1.blnButtonV[1][1] == true) {
							intPoints1++;
							panel1.intPointCheck[1][0] = 1;
							blnPlayerTurn = true;
						}
					} 
				} else {
					System.out.println("spot taken");
				}
			} else if (blnPlayerTurn == false) {
				if (panel1.blnButtonV[1][0] == false) {
					panel1.blnButtonV[1][0] = true;
					panel1.repaint();
					blnPlayerTurn = true;
					if (panel1.intPointCheck[1][0] == 0) {
						if (panel1.blnButtonH[1][0] == true && panel1.blnButtonV[1][0] == true
						&& panel1.blnButtonH[2][0] == true && panel1.blnButtonV[1][1] == true) {
							intPoints2++;
							panel1.intPointCheck[1][0] = 2;
							blnPlayerTurn = false;
						}
					} 
				} else {
					System.out.println("spot taken");
				}
			}
		}
		if(evt.getSource() == this.butv11){				// vertical 1 1
			if (blnPlayerTurn == true) {
				if (panel1.blnButtonV[1][1] == false) {
					panel1.blnButtonV[1][1] = true;
					panel1.repaint();
					blnPlayerTurn = false;
					if (panel1.intPointCheck[1][0] == 0) {
						if (panel1.blnButtonH[1][0] == true && panel1.blnButtonV[1][0] == true
						&& panel1.blnButtonH[2][0] == true && panel1.blnButtonV[1][1] == true) {
							intPoints1++;
							panel1.intPointCheck[1][0] = 1;
							blnPlayerTurn = true;
						}
					} 
					if (panel1.intPointCheck[1][1] == 0) {
						if (panel1.blnButtonH[1][1] == true && panel1.blnButtonV[1][1] == true
						&& panel1.blnButtonH[2][1] == true && panel1.blnButtonV[1][2] == true) {
							intPoints1++;
							panel1.intPointCheck[1][1] = 1;
							blnPlayerTurn = false;
						}
					} 
				} else {
					System.out.println("spot taken");
				}
			} else if (blnPlayerTurn == false) {
				if (panel1.blnButtonV[1][1] == false) {
					panel1.blnButtonV[1][1] = true;
					panel1.repaint();
					blnPlayerTurn = true;
					if (panel1.intPointCheck[1][0] == 0) {
						if (panel1.blnButtonH[1][0] == true && panel1.blnButtonV[1][0] == true
						&& panel1.blnButtonH[2][0] == true && panel1.blnButtonV[1][1] == true) {
							intPoints2++;
							panel1.intPointCheck[1][0] = 2;
							blnPlayerTurn = false;
						}
					} 
					if (panel1.intPointCheck[1][1] == 0) {
						if (panel1.blnButtonH[1][1] == true && panel1.blnButtonV[1][1] == true
						&& panel1.blnButtonH[2][1] == true && panel1.blnButtonV[1][2] == true) {
							intPoints2++;
							panel1.intPointCheck[1][1] = 2;
							blnPlayerTurn = false;
						}
					}
				} else {
					System.out.println("spot taken");
				}
			}
		}
		if(evt.getSource() == this.butv12){				// vertical 1 2
			if (blnPlayerTurn == true) {
				if (panel1.blnButtonV[1][2] == false) {
					panel1.blnButtonV[1][2] = true;
					panel1.repaint();
					blnPlayerTurn = false;
					if (panel1.intPointCheck[1][2] == 0) {
						if (panel1.blnButtonH[1][2] == true && panel1.blnButtonV[1][2] == true
						&& panel1.blnButtonH[2][2] == true && panel1.blnButtonV[1][3] == true) {
							intPoints1++;
							panel1.intPointCheck[1][2] = 1;
							blnPlayerTurn = true;
						}
					} 
					if (panel1.intPointCheck[1][1] == 0) {
						if (panel1.blnButtonH[1][1] == true && panel1.blnButtonV[1][1] == true
						&& panel1.blnButtonH[2][1] == true && panel1.blnButtonV[1][2] == true) {
							intPoints1++;
							panel1.intPointCheck[1][1] = 1;
							blnPlayerTurn = true;
						}
					} 
				} else {
					System.out.println("spot taken");
				}
			} else if (blnPlayerTurn == false) {
				if (panel1.blnButtonV[1][2] == false) {
					panel1.blnButtonV[1][2] = true;
					panel1.repaint();
					blnPlayerTurn = true;
					if (panel1.intPointCheck[1][2] == 0) {
						if (panel1.blnButtonH[1][2] == true && panel1.blnButtonV[1][2] == true
						&& panel1.blnButtonH[2][2] == true && panel1.blnButtonV[1][3] == true) {
							intPoints2++;
							panel1.intPointCheck[1][2] = 2;
							blnPlayerTurn = false;
						}
					} 
					if (panel1.intPointCheck[1][1] == 0) {
						if (panel1.blnButtonH[1][1] == true && panel1.blnButtonV[1][1] == true
						&& panel1.blnButtonH[2][1] == true && panel1.blnButtonV[1][2] == true) {
							intPoints2++;
							panel1.intPointCheck[1][1] = 2;
							blnPlayerTurn = false;
						}
					} 
				} else {
					System.out.println("spot taken");
				}
			}
		}
		if(evt.getSource() == this.butv13){				// vertical 1 3
			if (blnPlayerTurn == true) {
				if (panel1.blnButtonV[1][3] == false) {
					panel1.blnButtonV[1][3] = true;
					panel1.repaint();
					blnPlayerTurn = false;
					if (panel1.intPointCheck[1][2] == 0) {
						if (panel1.blnButtonH[1][2] == true && panel1.blnButtonV[1][2] == true
						&& panel1.blnButtonH[2][2] == true && panel1.blnButtonV[1][3] == true) {
							intPoints1++;
							panel1.intPointCheck[1][2] = 1;
							blnPlayerTurn = true;
						}
					} 
					if (panel1.intPointCheck[1][3] == 0) {
						if (panel1.blnButtonH[1][3] == true && panel1.blnButtonV[1][3] == true
						&& panel1.blnButtonH[2][3] == true && panel1.blnButtonV[1][4] == true) {
							intPoints1++;
							panel1.intPointCheck[1][3] = 1;
							blnPlayerTurn = true;
						}
					} 
				} else {
					System.out.println("spot taken");
				}
			} else if (blnPlayerTurn == false) {
				if (panel1.blnButtonV[1][3] == false) {
					panel1.blnButtonV[1][3] = true;
					panel1.repaint();
					blnPlayerTurn = true;
					if (panel1.intPointCheck[1][2] == 0) {
						if (panel1.blnButtonH[1][2] == true && panel1.blnButtonV[1][2] == true
						&& panel1.blnButtonH[2][2] == true && panel1.blnButtonV[1][3] == true) {
							intPoints2++;
							panel1.intPointCheck[1][2] = 2;
							blnPlayerTurn = false;
						}
					} 
					if (panel1.intPointCheck[1][3] == 0) {
						if (panel1.blnButtonH[1][3] == true && panel1.blnButtonV[1][3] == true
						&& panel1.blnButtonH[2][3] == true && panel1.blnButtonV[1][4] == true) {
							intPoints2++;
							panel1.intPointCheck[1][3] = 2;
							blnPlayerTurn = false;
						}
					} 
				} else {
					System.out.println("spot taken");
				}
			}
		}
		if(evt.getSource() == this.butv14){				// vertical 1 4
			if (blnPlayerTurn == true) {
				if (panel1.blnButtonV[1][4] == false) {
					panel1.blnButtonV[1][4] = true;
					panel1.repaint();
					blnPlayerTurn = false;
					if (panel1.intPointCheck[1][4] == 0) {
						if (panel1.blnButtonH[1][4] == true && panel1.blnButtonV[1][4] == true
						&& panel1.blnButtonH[2][4] == true && panel1.blnButtonV[1][5] == true) {
							intPoints1++;
							panel1.intPointCheck[1][4] = 1;
							blnPlayerTurn = true;
						}
					} 
					if (panel1.intPointCheck[1][3] == 0) {
						if (panel1.blnButtonH[1][3] == true && panel1.blnButtonV[1][3] == true
						&& panel1.blnButtonH[2][3] == true && panel1.blnButtonV[1][4] == true) {
							intPoints1++;
							panel1.intPointCheck[1][3] = 1;
							blnPlayerTurn = true;
						}
					} 
				} else {
					System.out.println("spot taken");
				}
			} else if (blnPlayerTurn == false) {
				if (panel1.blnButtonV[1][4] == false) {
					panel1.blnButtonV[1][4] = true;
					panel1.repaint();
					blnPlayerTurn = true;
					if (panel1.intPointCheck[1][4] == 0) {
						if (panel1.blnButtonH[1][4] == true && panel1.blnButtonV[1][4] == true
						&& panel1.blnButtonH[2][4] == true && panel1.blnButtonV[1][5] == true) {
							intPoints2++;
							panel1.intPointCheck[1][4] = 2;
							blnPlayerTurn = false;
						}
					} 
					if (panel1.intPointCheck[1][3] == 0) {
						if (panel1.blnButtonH[1][3] == true && panel1.blnButtonV[1][3] == true
						&& panel1.blnButtonH[2][3] == true && panel1.blnButtonV[1][4] == true) {
							intPoints2++;
							panel1.intPointCheck[1][3] = 2;
							blnPlayerTurn = false;
						}
					} 
				} else {
					System.out.println("spot taken");
				}
			}
		}
		if(evt.getSource() == this.butv15){				// vertical 1 5
			if (blnPlayerTurn == true) {
				if (panel1.blnButtonV[1][5] == false) {
					panel1.blnButtonV[1][5] = true;
					panel1.repaint();
					blnPlayerTurn = false;
					if (panel1.intPointCheck[1][4] == 0) {
						if (panel1.blnButtonH[1][4] == true && panel1.blnButtonV[1][4] == true
						&& panel1.blnButtonH[2][4] == true && panel1.blnButtonV[1][5] == true) {
							intPoints1++;
							panel1.intPointCheck[1][4] = 1;
							blnPlayerTurn = true;
						}
					} 
				} else {
					System.out.println("spot taken");
				}
			} else if (blnPlayerTurn == false) {
				if (panel1.blnButtonV[1][5] == false) {
					panel1.blnButtonV[1][5] = true;
					panel1.repaint();
					blnPlayerTurn = true;
					if (panel1.intPointCheck[1][4] == 0) {
						if (panel1.blnButtonH[1][4] == true && panel1.blnButtonV[1][4] == true
						&& panel1.blnButtonH[2][4] == true && panel1.blnButtonV[1][5] == true) {
							intPoints2++;
							panel1.intPointCheck[1][4] = 2;
							blnPlayerTurn = false;
						}
					} 
				} else {
					System.out.println("spot taken");
				}
			}
		}

		if(evt.getSource() == this.butv20){				// vertical 2 0
			if (blnPlayerTurn == true) {
				if (panel1.blnButtonV[2][0] == false) {
					panel1.blnButtonV[2][0] = true;
					panel1.repaint();
					blnPlayerTurn = false;
					if (panel1.intPointCheck[2][0] == 0) {
						if (panel1.blnButtonH[2][0] == true && panel1.blnButtonV[2][0] == true
						&& panel1.blnButtonH[3][0] == true && panel1.blnButtonV[2][1] == true) {
							intPoints1++;
							panel1.intPointCheck[2][0] = 1;
							blnPlayerTurn = true;
						}
					} 
				} else {
					System.out.println("spot taken");
				}
			} else if (blnPlayerTurn == false) {
				if (panel1.blnButtonV[2][0] == false) {
					panel1.blnButtonV[2][0] = true;
					panel1.repaint();
					blnPlayerTurn = true;
					if (panel1.intPointCheck[2][0] == 0) {
						if (panel1.blnButtonH[2][0] == true && panel1.blnButtonV[2][0] == true
						&& panel1.blnButtonH[3][0] == true && panel1.blnButtonV[2][1] == true) {
							intPoints2++;
							panel1.intPointCheck[2][0] = 2;
							blnPlayerTurn = false;
						}
					}  
				} else {
					System.out.println("spot taken");
				}
			}
		}
		if(evt.getSource() == this.butv21){				// vertical 2 1
			if (blnPlayerTurn == true) {
				if (panel1.blnButtonV[2][1] == false) {
					panel1.blnButtonV[2][1] = true;
					panel1.repaint();
					blnPlayerTurn = false;
					if (panel1.intPointCheck[2][0] == 0) {
						if (panel1.blnButtonH[2][0] == true && panel1.blnButtonV[2][0] == true
						&& panel1.blnButtonH[3][0] == true && panel1.blnButtonV[2][1] == true) {
							intPoints1++;
							panel1.intPointCheck[2][0] = 1;
							blnPlayerTurn = true;
						}
					} 
					if (panel1.intPointCheck[2][1] == 0) {
						if (panel1.blnButtonH[2][1] == true && panel1.blnButtonV[2][1] == true
						&& panel1.blnButtonH[3][1] == true && panel1.blnButtonV[2][2] == true) {
							intPoints1++;
							panel1.intPointCheck[2][1] = 1;
							blnPlayerTurn = true;
						}
					} 
				} else {
					System.out.println("spot taken");
				}
			} else if (blnPlayerTurn == false) {
				if (panel1.blnButtonV[2][1] == false) {
					panel1.blnButtonV[2][1] = true;
					panel1.repaint();
					blnPlayerTurn = true;
					if (panel1.intPointCheck[2][0] == 0) {
						if (panel1.blnButtonH[2][0] == true && panel1.blnButtonV[2][0] == true
						&& panel1.blnButtonH[3][0] == true && panel1.blnButtonV[2][1] == true) {
							intPoints2++;
							panel1.intPointCheck[2][0] = 2;
							blnPlayerTurn = false;
						}
					} 
					if (panel1.intPointCheck[2][1] == 0) {
						if (panel1.blnButtonH[2][1] == true && panel1.blnButtonV[2][1] == true
						&& panel1.blnButtonH[3][1] == true && panel1.blnButtonV[2][2] == true) {
							intPoints2++;
							panel1.intPointCheck[2][1] = 2;
							blnPlayerTurn = false;
						}
					}
				} else {
					System.out.println("spot taken");
				}
			}
		}
		if(evt.getSource() == this.butv22){				// vertical 2 2
			if (blnPlayerTurn == true) {
				if (panel1.blnButtonV[2][2] == false) {
					panel1.blnButtonV[2][2] = true;
					panel1.repaint();
					blnPlayerTurn = false;
					if (panel1.intPointCheck[2][2] == 0) {
						if (panel1.blnButtonH[2][2] == true && panel1.blnButtonV[2][2] == true
						&& panel1.blnButtonH[3][2] == true && panel1.blnButtonV[2][3] == true) {
							intPoints1++;
							panel1.intPointCheck[2][2] = 1;
							blnPlayerTurn = true;
						}
					} 
					if (panel1.intPointCheck[2][1] == 0) {
						if (panel1.blnButtonH[2][1] == true && panel1.blnButtonV[2][1] == true
						&& panel1.blnButtonH[3][1] == true && panel1.blnButtonV[2][2] == true) {
							intPoints1++;
							panel1.intPointCheck[2][1] = 1;
							blnPlayerTurn = true;
						}
					} 
				} else {
					System.out.println("spot taken");
				}
			} else if (blnPlayerTurn == false) {
				if (panel1.blnButtonV[2][2] == false) {
					panel1.blnButtonV[2][2] = true;
					panel1.repaint();
					blnPlayerTurn = true;
					if (panel1.intPointCheck[2][2] == 0) {
						if (panel1.blnButtonH[2][2] == true && panel1.blnButtonV[2][2] == true
						&& panel1.blnButtonH[3][2] == true && panel1.blnButtonV[2][3] == true) {
							intPoints2++;
							panel1.intPointCheck[2][2] = 2;
							blnPlayerTurn = false;
						}
					} 
					if (panel1.intPointCheck[2][1] == 0) {
						if (panel1.blnButtonH[2][1] == true && panel1.blnButtonV[2][1] == true
						&& panel1.blnButtonH[3][1] == true && panel1.blnButtonV[2][2] == true) {
							intPoints2++;
							panel1.intPointCheck[2][1] = 2;
							blnPlayerTurn = false;
						}
					}  
				} else {
					System.out.println("spot taken");
				}
			}
		}
		if(evt.getSource() == this.butv23){				// vertical 2 3
			if (blnPlayerTurn == true) {
				if (panel1.blnButtonV[2][3] == false) {
					panel1.blnButtonV[2][3] = true;
					panel1.repaint();
					blnPlayerTurn = false;
					if (panel1.intPointCheck[2][2] == 0) {
						if (panel1.blnButtonH[2][2] == true && panel1.blnButtonV[2][2] == true
						&& panel1.blnButtonH[3][2] == true && panel1.blnButtonV[2][3] == true) {
							intPoints1++;
							panel1.intPointCheck[2][2] = 1;
							blnPlayerTurn = true;
						}
					} 
					if (panel1.intPointCheck[2][3] == 0) {
						if (panel1.blnButtonH[2][3] == true && panel1.blnButtonV[2][3] == true
						&& panel1.blnButtonH[3][3] == true && panel1.blnButtonV[2][4] == true) {
							intPoints1++;
							panel1.intPointCheck[2][3] = 1;
							blnPlayerTurn = true;
						}
					} 
				} else {
					System.out.println("spot taken");
				}
			} else if (blnPlayerTurn == false) {
				if (panel1.blnButtonV[2][3] == false) {
					panel1.blnButtonV[2][3] = true;
					panel1.repaint();
					blnPlayerTurn = true;
					if (panel1.intPointCheck[2][2] == 0) {
						if (panel1.blnButtonH[2][2] == true && panel1.blnButtonV[2][2] == true
						&& panel1.blnButtonH[3][2] == true && panel1.blnButtonV[2][3] == true) {
							intPoints2++;
							panel1.intPointCheck[2][2] = 2;
							blnPlayerTurn = false;
						}
					} 
					if (panel1.intPointCheck[2][3] == 0) {
						if (panel1.blnButtonH[2][3] == true && panel1.blnButtonV[2][3] == true
						&& panel1.blnButtonH[3][3] == true && panel1.blnButtonV[2][4] == true) {
							intPoints2++;
							panel1.intPointCheck[2][3] = 2;
							blnPlayerTurn = false;
						}
					}
				} else {
					System.out.println("spot taken");
				}
			}
		}
		if(evt.getSource() == this.butv24){				// vertical 2 4
			if (blnPlayerTurn == true) {
				if (panel1.blnButtonV[2][4] == false) {
					panel1.blnButtonV[2][4] = true;
					panel1.repaint();
					blnPlayerTurn = false;
					if (panel1.intPointCheck[2][4] == 0) {
						if (panel1.blnButtonH[2][4] == true && panel1.blnButtonV[2][4] == true
						&& panel1.blnButtonH[3][4] == true && panel1.blnButtonV[2][5] == true) {
							intPoints1++;
							panel1.intPointCheck[2][4] = 1;
							blnPlayerTurn = true;
						}
					} 
					if (panel1.intPointCheck[2][3] == 0) {
						if (panel1.blnButtonH[2][3] == true && panel1.blnButtonV[2][3] == true
						&& panel1.blnButtonH[3][3] == true && panel1.blnButtonV[2][4] == true) {
							intPoints1++;
							panel1.intPointCheck[2][3] = 1;
							blnPlayerTurn = true;
						}
					} 
				} else {
					System.out.println("spot taken");
				}
			} else if (blnPlayerTurn == false) {
				if (panel1.blnButtonV[2][4] == false) {
					panel1.blnButtonV[2][4] = true;
					panel1.repaint();
					blnPlayerTurn = true;
					if (panel1.intPointCheck[2][4] == 0) {
						if (panel1.blnButtonH[2][4] == true && panel1.blnButtonV[2][4] == true
						&& panel1.blnButtonH[3][4] == true && panel1.blnButtonV[2][5] == true) {
							intPoints2++;
							panel1.intPointCheck[2][4] = 2;
							blnPlayerTurn = false;
						}
					} 
					if (panel1.intPointCheck[2][3] == 0) {
						if (panel1.blnButtonH[2][3] == true && panel1.blnButtonV[2][3] == true
						&& panel1.blnButtonH[3][3] == true && panel1.blnButtonV[2][4] == true) {
							intPoints2++;
							panel1.intPointCheck[2][3] = 2;
							blnPlayerTurn = false;
						}
					} 
				} else {
					System.out.println("spot taken");
				}
			}
		}
		if(evt.getSource() == this.butv25){				// vertical 2 5
			if (blnPlayerTurn == true) {
				if (panel1.blnButtonV[2][5] == false) {
					panel1.blnButtonV[2][5] = true;
					panel1.repaint();
					blnPlayerTurn = false;
					if (panel1.intPointCheck[2][4] == 0) {
						if (panel1.blnButtonH[2][4] == true && panel1.blnButtonV[2][4] == true
						&& panel1.blnButtonH[3][4] == true && panel1.blnButtonV[2][5] == true) {
							intPoints1++;
							panel1.intPointCheck[2][4] = 1;
							blnPlayerTurn = true;
						}
					} 
				} else {
					System.out.println("spot taken");
				}
			} else if (blnPlayerTurn == false) {
				if (panel1.blnButtonV[2][5] == false) {
					panel1.blnButtonV[2][5] = true;
					panel1.repaint();
					blnPlayerTurn = true;
					if (panel1.intPointCheck[2][4] == 0) {
						if (panel1.blnButtonH[2][4] == true && panel1.blnButtonV[2][4] == true
						&& panel1.blnButtonH[3][4] == true && panel1.blnButtonV[2][5] == true) {
							intPoints2++;
							panel1.intPointCheck[2][4] = 2;
							blnPlayerTurn = false;
						}
					} 
				} else {
					System.out.println("spot taken");
				}
			}
		}
		if(evt.getSource() == this.butv30){				// vertical 3 0
			if (blnPlayerTurn == true) {
				if (panel1.blnButtonV[3][0] == false) {
					panel1.blnButtonV[3][0] = true;
					panel1.repaint();
					blnPlayerTurn = false;
					if (panel1.intPointCheck[3][0] == 0) {
						if (panel1.blnButtonH[3][0] == true && panel1.blnButtonV[3][0] == true
						&& panel1.blnButtonH[4][0] == true && panel1.blnButtonV[3][1] == true) {
							intPoints1++;
							panel1.intPointCheck[3][0] = 1;
							blnPlayerTurn = true;
						}
					} 
				} else {
					System.out.println("spot taken");
				}
			} else if (blnPlayerTurn == false) {
				if (panel1.blnButtonV[3][0] == false) {
					panel1.blnButtonV[3][0] = true;
					panel1.repaint();
					blnPlayerTurn = true;
					if (panel1.intPointCheck[3][0] == 0) {
						if (panel1.blnButtonH[3][0] == true && panel1.blnButtonV[3][0] == true
						&& panel1.blnButtonH[4][0] == true && panel1.blnButtonV[3][1] == true) {
							intPoints2++;
							panel1.intPointCheck[3][0] = 2;
							blnPlayerTurn = false;
						}
					} 
				} else {
					System.out.println("spot taken");
				}
			}
		}
		if(evt.getSource() == this.butv31){				// vertical 3 1
			if (blnPlayerTurn == true) {
				if (panel1.blnButtonV[3][1] == false) {
					panel1.blnButtonV[3][1] = true;
					panel1.repaint();
					blnPlayerTurn = false;
					if (panel1.intPointCheck[3][0] == 0) {
						if (panel1.blnButtonH[3][0] == true && panel1.blnButtonV[3][0] == true
						&& panel1.blnButtonH[4][0] == true && panel1.blnButtonV[3][1] == true) {
							intPoints1++;
							panel1.intPointCheck[3][0] = 1;
							blnPlayerTurn = true;
						}
					} 
					if (panel1.intPointCheck[3][1] == 0) {
						if (panel1.blnButtonH[3][1] == true && panel1.blnButtonV[3][1] == true
						&& panel1.blnButtonH[4][1] == true && panel1.blnButtonV[3][2] == true) {
							intPoints1++;
							panel1.intPointCheck[3][1] = 1;
							blnPlayerTurn = true;
						}
					} 
				} else {
					System.out.println("spot taken");
				}
			} else if (blnPlayerTurn == false) {
				if (panel1.blnButtonV[3][1] == false) {
					panel1.blnButtonV[3][1] = true;
					panel1.repaint();
					blnPlayerTurn = true;
					if (panel1.intPointCheck[3][0] == 0) {
						if (panel1.blnButtonH[3][0] == true && panel1.blnButtonV[3][0] == true
						&& panel1.blnButtonH[4][0] == true && panel1.blnButtonV[3][1] == true) {
							intPoints2++;
							panel1.intPointCheck[3][0] = 2;
							blnPlayerTurn = false;
						}
					} 
					if (panel1.intPointCheck[3][1] == 0) {
						if (panel1.blnButtonH[3][1] == true && panel1.blnButtonV[3][1] == true
						&& panel1.blnButtonH[4][1] == true && panel1.blnButtonV[3][2] == true) {
							intPoints2++;
							panel1.intPointCheck[3][1] = 2;
							blnPlayerTurn = false;
						}
					} 
				} else {
					System.out.println("spot taken");
				}
			}
		}
		if(evt.getSource() == this.butv32){				// vertical 3 2
			if (blnPlayerTurn == true) {
				if (panel1.blnButtonV[3][2] == false) {
					panel1.blnButtonV[3][2] = true;
					panel1.repaint();
					blnPlayerTurn = false;
					if (panel1.intPointCheck[3][2] == 0) {
						if (panel1.blnButtonH[3][2] == true && panel1.blnButtonV[3][2] == true
						&& panel1.blnButtonH[4][2] == true && panel1.blnButtonV[3][3] == true) {
							intPoints1++;
							panel1.intPointCheck[3][2] = 1;
							blnPlayerTurn = true;
						}
					} 
					if (panel1.intPointCheck[3][1] == 0) {
						if (panel1.blnButtonH[3][1] == true && panel1.blnButtonV[3][1] == true
						&& panel1.blnButtonH[4][1] == true && panel1.blnButtonV[3][2] == true) {
							intPoints1++;
							panel1.intPointCheck[3][1] = 1;
							blnPlayerTurn = true;
						}
					} 
				} else {
					System.out.println("spot taken");
				}
			} else if (blnPlayerTurn == false) {
				if (panel1.blnButtonV[3][2] == false) {
					panel1.blnButtonV[3][2] = true;
					panel1.repaint();
					blnPlayerTurn = true;
					if (panel1.intPointCheck[3][2] == 0) {
						if (panel1.blnButtonH[3][2] == true && panel1.blnButtonV[3][2] == true
						&& panel1.blnButtonH[4][2] == true && panel1.blnButtonV[3][3] == true) {
							intPoints2++;
							panel1.intPointCheck[3][2] = 2;
							blnPlayerTurn = false;
						}
					} 
					if (panel1.intPointCheck[3][1] == 0) {
						if (panel1.blnButtonH[3][1] == true && panel1.blnButtonV[3][1] == true
						&& panel1.blnButtonH[4][1] == true && panel1.blnButtonV[3][2] == true) {
							intPoints2++;
							panel1.intPointCheck[3][1] = 2;
							blnPlayerTurn = false;
						}
					}   
				} else {
					System.out.println("spot taken");
				}
			}
		}
		if(evt.getSource() == this.butv33){				// vertical 3 3
			if (blnPlayerTurn == true) {
				if (panel1.blnButtonV[3][3] == false) {
					panel1.blnButtonV[3][3] = true;
					panel1.repaint();
					blnPlayerTurn = false;
					if (panel1.intPointCheck[3][2] == 0) {
						if (panel1.blnButtonH[3][2] == true && panel1.blnButtonV[3][2] == true
						&& panel1.blnButtonH[4][2] == true && panel1.blnButtonV[3][3] == true) {
							intPoints1++;
							panel1.intPointCheck[3][2] = 1;
							blnPlayerTurn = true;
						}
					} 
					if (panel1.intPointCheck[3][3] == 0) {
						if (panel1.blnButtonH[3][3] == true && panel1.blnButtonV[3][3] == true
						&& panel1.blnButtonH[4][3] == true && panel1.blnButtonV[3][4] == true) {
							intPoints1++;
							panel1.intPointCheck[3][3] = 1;
							blnPlayerTurn = true;
						}
					} 
				} else {
					System.out.println("spot taken");
				}
			} else if (blnPlayerTurn == false) {
				if (panel1.blnButtonV[3][3] == false) {
					panel1.blnButtonV[3][3] = true;
					panel1.repaint();
					blnPlayerTurn = true;
					if (panel1.intPointCheck[3][2] == 0) {
						if (panel1.blnButtonH[3][2] == true && panel1.blnButtonV[3][2] == true
						&& panel1.blnButtonH[4][2] == true && panel1.blnButtonV[3][3] == true) {
							intPoints2++;
							panel1.intPointCheck[3][2] = 2;
							blnPlayerTurn = false;
						}
					} 
					if (panel1.intPointCheck[3][3] == 0) {
						if (panel1.blnButtonH[3][3] == true && panel1.blnButtonV[3][3] == true
						&& panel1.blnButtonH[4][3] == true && panel1.blnButtonV[3][4] == true) {
							intPoints2++;
							panel1.intPointCheck[3][3] = 2;
							blnPlayerTurn = false;
						}
					}
				} else {
					System.out.println("spot taken");
				}
			}
		}
		if(evt.getSource() == this.butv34){				// vertical 3 4
			if (blnPlayerTurn == true) {
				if (panel1.blnButtonV[3][4] == false) {
					panel1.blnButtonV[3][4] = true;
					panel1.repaint();
					blnPlayerTurn = false;
					if (panel1.intPointCheck[3][4] == 0) {
						if (panel1.blnButtonH[3][4] == true && panel1.blnButtonV[3][4] == true
						&& panel1.blnButtonH[4][4] == true && panel1.blnButtonV[3][5] == true) {
							intPoints1++;
							panel1.intPointCheck[3][4] = 1;
							blnPlayerTurn = true;
						}
					} 
					if (panel1.intPointCheck[3][3] == 0) {
						if (panel1.blnButtonH[3][3] == true && panel1.blnButtonV[3][3] == true
						&& panel1.blnButtonH[4][3] == true && panel1.blnButtonV[3][4] == true) {
							intPoints1++;
							panel1.intPointCheck[3][3] = 1;
							blnPlayerTurn = true;
						}
					} 
				} else {
					System.out.println("spot taken");
				}
			} else if (blnPlayerTurn == false) {
				if (panel1.blnButtonV[3][4] == false) {
					panel1.blnButtonV[3][4] = true;
					panel1.repaint();
					blnPlayerTurn = true;
					if (panel1.intPointCheck[3][4] == 0) {
						if (panel1.blnButtonH[3][4] == true && panel1.blnButtonV[3][4] == true
						&& panel1.blnButtonH[4][4] == true && panel1.blnButtonV[3][5] == true) {
							intPoints2++;
							panel1.intPointCheck[3][4] = 2;
							blnPlayerTurn = false;
						}
					} 
					if (panel1.intPointCheck[3][3] == 0) {
						if (panel1.blnButtonH[3][3] == true && panel1.blnButtonV[3][3] == true
						&& panel1.blnButtonH[4][3] == true && panel1.blnButtonV[3][4] == true) {
							intPoints2++;
							panel1.intPointCheck[3][3] = 2;
							blnPlayerTurn = false;
						}
					}
				} else {
					System.out.println("spot taken");
				}
			}
		}
		if(evt.getSource() == this.butv35){				// vertical 3 5
			if (blnPlayerTurn == true) {
				if (panel1.blnButtonV[3][5] == false) {
					panel1.blnButtonV[3][5] = true;
					panel1.repaint();
					blnPlayerTurn = false;
					if (panel1.intPointCheck[3][4] == 0) {
						if (panel1.blnButtonH[3][4] == true && panel1.blnButtonV[3][4] == true
						&& panel1.blnButtonH[4][4] == true && panel1.blnButtonV[3][5] == true) {
							intPoints1++;
							panel1.intPointCheck[3][4] = 1;
							blnPlayerTurn = true;
						}
					} 
				} else {
					System.out.println("spot taken");
				}
			} else if (blnPlayerTurn == false) {
				if (panel1.blnButtonV[3][5] == false) {
					panel1.blnButtonV[3][5] = true;
					panel1.repaint();
					blnPlayerTurn = true;
					if (panel1.intPointCheck[3][4] == 0) {
						if (panel1.blnButtonH[3][4] == true && panel1.blnButtonV[3][4] == true
						&& panel1.blnButtonH[4][4] == true && panel1.blnButtonV[3][5] == true) {
							intPoints2++;
							panel1.intPointCheck[3][4] = 2;
							blnPlayerTurn = false;
						}
					}  
				} else {
					System.out.println("spot taken");
				}
			}
		}
		if(evt.getSource() == this.butv40){				// vertical 4 0
			if (blnPlayerTurn == true) {
				if (panel1.blnButtonV[4][0] == false) {
					panel1.blnButtonV[4][0] = true;
					panel1.repaint();
					blnPlayerTurn = false;
					if (panel1.intPointCheck[4][0] == 0) {
						if (panel1.blnButtonH[4][0] == true && panel1.blnButtonV[4][0] == true
						&& panel1.blnButtonH[5][0] == true && panel1.blnButtonV[4][1] == true) {
							intPoints1++;
							panel1.intPointCheck[4][0] = 1;
							blnPlayerTurn = true;
						}
					} 
				} else {
					System.out.println("spot taken");
				}
			} else if (blnPlayerTurn == false) {
				if (panel1.blnButtonV[4][0] == false) {
					panel1.blnButtonV[4][0] = true;
					panel1.repaint();
					blnPlayerTurn = true;
					if (panel1.intPointCheck[4][0] == 0) {
						if (panel1.blnButtonH[4][0] == true && panel1.blnButtonV[4][0] == true
						&& panel1.blnButtonH[5][0] == true && panel1.blnButtonV[4][1] == true) {
							intPoints2++;
							panel1.intPointCheck[4][0] = 2;
							blnPlayerTurn = false;
						}
					} 
				} else {
					System.out.println("spot taken");
				}
			}
		}
		if(evt.getSource() == this.butv41){				// vertical 4 1
			if (blnPlayerTurn == true) {
				if (panel1.blnButtonV[4][1] == false) {
					panel1.blnButtonV[4][1] = true;
					panel1.repaint();
					blnPlayerTurn = false;
					if (panel1.intPointCheck[4][0] == 0) {
						if (panel1.blnButtonH[4][0] == true && panel1.blnButtonV[4][0] == true
						&& panel1.blnButtonH[5][0] == true && panel1.blnButtonV[4][1] == true) {
							intPoints1++;
							panel1.intPointCheck[4][0] = 1;
							blnPlayerTurn = true;
						}
					} 
					if (panel1.intPointCheck[4][1] == 0) {
						if (panel1.blnButtonH[4][1] == true && panel1.blnButtonV[4][1] == true
						&& panel1.blnButtonH[5][1] == true && panel1.blnButtonV[4][2] == true) {
							intPoints1++;
							panel1.intPointCheck[4][1] = 1;
							blnPlayerTurn = true;
						}
					} 
				} else {
					System.out.println("spot taken");
				}
			} else if (blnPlayerTurn == false) {
				if (panel1.blnButtonV[4][1] == false) {
					panel1.blnButtonV[4][1] = true;
					panel1.repaint();
					blnPlayerTurn = true;
					if (panel1.intPointCheck[4][0] == 0) {
						if (panel1.blnButtonH[4][0] == true && panel1.blnButtonV[4][0] == true
						&& panel1.blnButtonH[5][0] == true && panel1.blnButtonV[4][1] == true) {
							intPoints2++;
							panel1.intPointCheck[4][0] = 2;
							blnPlayerTurn = false;
						}
					} 
					if (panel1.intPointCheck[4][1] == 0) {
						if (panel1.blnButtonH[4][1] == true && panel1.blnButtonV[4][1] == true
						&& panel1.blnButtonH[5][1] == true && panel1.blnButtonV[4][2] == true) {
							intPoints2++;
							panel1.intPointCheck[4][1] = 2;
							blnPlayerTurn = false;
						}
					}  
				} else {
					System.out.println("spot taken");
				}
			}
		}
		if(evt.getSource() == this.butv42){				// vertical 4 2
			if (blnPlayerTurn == true) {
				if (panel1.blnButtonV[4][2] == false) {
					panel1.blnButtonV[4][2] = true;
					panel1.repaint();
					blnPlayerTurn = false;
					if (panel1.intPointCheck[4][2] == 0) {
						if (panel1.blnButtonH[4][2] == true && panel1.blnButtonV[4][2] == true
						&& panel1.blnButtonH[5][2] == true && panel1.blnButtonV[4][3] == true) {
							intPoints1++;
							panel1.intPointCheck[4][2] = 1;
							blnPlayerTurn = true;
						}
					} 
					if (panel1.intPointCheck[4][1] == 0) {
						if (panel1.blnButtonH[4][1] == true && panel1.blnButtonV[4][1] == true
						&& panel1.blnButtonH[5][1] == true && panel1.blnButtonV[4][2] == true) {
							intPoints1++;
							panel1.intPointCheck[4][1] = 1;
							blnPlayerTurn = true;
						}
					} 
				} else {
					System.out.println("spot taken");
				}
			} else if (blnPlayerTurn == false) {
				if (panel1.blnButtonV[4][2] == false) {
					panel1.blnButtonV[4][2] = true;
					panel1.repaint();
					blnPlayerTurn = true;
					if (panel1.intPointCheck[4][2] == 0) {
						if (panel1.blnButtonH[4][2] == true && panel1.blnButtonV[4][2] == true
						&& panel1.blnButtonH[5][2] == true && panel1.blnButtonV[4][3] == true) {
							intPoints2++;
							panel1.intPointCheck[4][2] = 2;
							blnPlayerTurn = false;
						}
					} 
					if (panel1.intPointCheck[4][1] == 0) {
						if (panel1.blnButtonH[4][1] == true && panel1.blnButtonV[4][1] == true
						&& panel1.blnButtonH[5][1] == true && panel1.blnButtonV[4][2] == true) {
							intPoints2++;
							panel1.intPointCheck[4][1] = 2;
							blnPlayerTurn = false;
						}
					}  
				} else {
					System.out.println("spot taken");
				}
			}
		}
		if(evt.getSource() == this.butv43){				// vertical 4 3
			if (blnPlayerTurn == true) {
				if (panel1.blnButtonV[4][3] == false) {
					panel1.blnButtonV[4][3] = true;
					panel1.repaint();
					blnPlayerTurn = false;
					if (panel1.intPointCheck[4][2] == 0) {
						if (panel1.blnButtonH[4][2] == true && panel1.blnButtonV[4][2] == true
						&& panel1.blnButtonH[5][2] == true && panel1.blnButtonV[4][3] == true) {
							intPoints1++;
							panel1.intPointCheck[4][2] = 1;
							blnPlayerTurn = true;
						}
					} 
					if (panel1.intPointCheck[4][3] == 0) {
						if (panel1.blnButtonH[4][3] == true && panel1.blnButtonV[4][3] == true
						&& panel1.blnButtonH[5][3] == true && panel1.blnButtonV[4][4] == true) {
							intPoints1++;
							panel1.intPointCheck[4][3] = 1;
							blnPlayerTurn = true;
						}
					} 
				} else {
					System.out.println("spot taken");
				}
			} else if (blnPlayerTurn == false) {
				if (panel1.blnButtonV[4][3] == false) {
					panel1.blnButtonV[4][3] = true;
					panel1.repaint();
					blnPlayerTurn = true;
					if (panel1.intPointCheck[4][2] == 0) {
						if (panel1.blnButtonH[4][2] == true && panel1.blnButtonV[4][2] == true
						&& panel1.blnButtonH[5][2] == true && panel1.blnButtonV[4][3] == true) {
							intPoints2++;
							panel1.intPointCheck[4][2] = 2;
							blnPlayerTurn = false;
						}
					} 
					if (panel1.intPointCheck[4][3] == 0) {
						if (panel1.blnButtonH[4][3] == true && panel1.blnButtonV[4][3] == true
						&& panel1.blnButtonH[5][3] == true && panel1.blnButtonV[4][4] == true) {
							intPoints2++;
							panel1.intPointCheck[4][3] = 2;
							blnPlayerTurn = false;
						}
					} 
				} else {
					System.out.println("spot taken");
				}
			}
		}
		if(evt.getSource() == this.butv44){				// vertical 4 4
			if (blnPlayerTurn == true) {
				if (panel1.blnButtonV[4][4] == false) {
					panel1.blnButtonV[4][4] = true;
					panel1.repaint();
					blnPlayerTurn = false;
					if (panel1.intPointCheck[4][4] == 0) {
						if (panel1.blnButtonH[4][4] == true && panel1.blnButtonV[4][4] == true
						&& panel1.blnButtonH[5][4] == true && panel1.blnButtonV[4][5] == true) {
							intPoints1++;
							panel1.intPointCheck[4][4] = 1;
							blnPlayerTurn = true;
						}
					} 
					if (panel1.intPointCheck[4][3] == 0) {
						if (panel1.blnButtonH[4][3] == true && panel1.blnButtonV[4][3] == true
						&& panel1.blnButtonH[5][3] == true && panel1.blnButtonV[4][4] == true) {
							intPoints1++;
							panel1.intPointCheck[4][3] = 1;
							blnPlayerTurn = true;
						}
					} 
				} else {
					System.out.println("spot taken");
				}
			} else if (blnPlayerTurn == false) {
				if (panel1.blnButtonV[4][4] == false) {
					panel1.blnButtonV[4][4] = true;
					panel1.repaint();
					blnPlayerTurn = true;
					if (panel1.intPointCheck[4][4] == 0) {
						if (panel1.blnButtonH[4][4] == true && panel1.blnButtonV[4][4] == true
						&& panel1.blnButtonH[5][4] == true && panel1.blnButtonV[4][5] == true) {
							intPoints2++;
							panel1.intPointCheck[4][4] = 2;
							blnPlayerTurn = false;
						}
					} 
					if (panel1.intPointCheck[4][3] == 0) {
						if (panel1.blnButtonH[4][3] == true && panel1.blnButtonV[4][3] == true
						&& panel1.blnButtonH[5][3] == true && panel1.blnButtonV[4][4] == true) {
							intPoints2++;
							panel1.intPointCheck[4][3] = 2;
							blnPlayerTurn = false;
						}
					}
				} else {
					System.out.println("spot taken");
				}
			}
		}
		if(evt.getSource() == this.butv45){				// vertical 4 5
			if (blnPlayerTurn == true) {
				if (panel1.blnButtonV[4][5] == false) {
					panel1.blnButtonV[4][5] = true;
					panel1.repaint();
					blnPlayerTurn = false;
					if (panel1.intPointCheck[4][4] == 0) {
						if (panel1.blnButtonH[4][4] == true && panel1.blnButtonV[4][4] == true
						&& panel1.blnButtonH[5][4] == true && panel1.blnButtonV[4][5] == true) {
							intPoints1++;
							panel1.intPointCheck[4][4] = 1;
							blnPlayerTurn = true;
						}
					} 
				} else {
					System.out.println("spot taken");
				}
			} else if (blnPlayerTurn == false) {
				if (panel1.blnButtonV[4][5] == false) {
					panel1.blnButtonV[4][5] = true;
					panel1.repaint();
					blnPlayerTurn = true;
					if (panel1.intPointCheck[4][4] == 0) {
						if (panel1.blnButtonH[4][4] == true && panel1.blnButtonV[4][4] == true
						&& panel1.blnButtonH[5][4] == true && panel1.blnButtonV[4][5] == true) {
							intPoints2++;
							panel1.intPointCheck[4][4] = 2;
							blnPlayerTurn = false;
						}
					}  
				} else {
					System.out.println("spot taken");
				}
			}
		}
		
		
		
		if(evt.getSource()==thetimer){ 
			panel1.repaint();
			System.out.println(blnPlayerTurn + "   P1: " + intPoints1 + "  P2: " +intPoints2);
		}
	}
	
	
//---------------------------------------- CONSTRUCTOR -------------------------------------------	


	public dotsboxesgame(){
		 
	panel1.setLayout(null);
	panel1.setPreferredSize(new Dimension(1280, 720));
//----------------------------------------------------------------------
	buttonStart.setSize(150,60);
	buttonStart.setLocation(900,300);
	buttonStart.addActionListener(this);
	panel1.add(buttonStart);		

	buth00.setSize(87,30);
	buth00.setLocation(105,80);
	buth00.setOpaque(false); 
	buth00.setContentAreaFilled(false); 
	buth00.setBorderPainted(false);
	buth00.addActionListener(this);
	panel1.add(buth00);
	
	buth01.setSize(87,30);
	buth01.setLocation(212,80);
	buth01.setOpaque(false); 
	buth01.setContentAreaFilled(false); 
	buth01.setBorderPainted(false);
	buth01.addActionListener(this);
	panel1.add(buth01);
	
	buth02.setSize(87,30);
	buth02.setLocation(318,80);
	buth02.setOpaque(false); 
	buth02.setContentAreaFilled(false); 
	buth02.setBorderPainted(false);
	buth02.addActionListener(this);
	panel1.add(buth02);
	
	buth03.setSize(87,30);
	buth03.setLocation(425,80);
	buth03.setOpaque(false); 
	buth03.setContentAreaFilled(false); 
	buth03.setBorderPainted(false);
	buth03.addActionListener(this);
	panel1.add(buth03);
	
	buth04.setSize(87,30);
	buth04.setLocation(532,80);
	buth04.setOpaque(false); 
	buth04.setContentAreaFilled(false); 
	buth04.setBorderPainted(false);
	buth04.addActionListener(this);
	panel1.add(buth04);
//----------------------------------------------------------------------	
	buth10.setSize(87,30);
	buth10.setLocation(105,185);
	buth10.setOpaque(false); 
	buth10.setContentAreaFilled(false); 
	buth10.setBorderPainted(false);
	buth10.addActionListener(this);
	panel1.add(buth10);

	buth11.setSize(87,30);
	buth11.setLocation(212,185);
	buth11.setOpaque(false); 
	buth11.setContentAreaFilled(false); 
	buth11.setBorderPainted(false);
	buth11.addActionListener(this);
	panel1.add(buth11);
	
	buth12.setSize(87,30);
	buth12.setLocation(318,185);
	buth12.setOpaque(false); 
	buth12.setContentAreaFilled(false); 
	buth12.setBorderPainted(false);
	buth12.addActionListener(this);
	panel1.add(buth12);
	
	buth13.setSize(87,30);
	buth13.setLocation(425,185);
	buth13.setOpaque(false); 
	buth13.setContentAreaFilled(false); 
	buth13.setBorderPainted(false);
	buth13.addActionListener(this);
	panel1.add(buth13);
	
	buth14.setSize(87,30);
	buth14.setLocation(532,185);
	buth14.setOpaque(false); 
	buth14.setContentAreaFilled(false); 
	buth14.setBorderPainted(false);
	buth14.addActionListener(this);
	panel1.add(buth14);			
//----------------------------------------------------------------------
	buth20.setSize(87,30);
	buth20.setLocation(105,293);
	buth20.setOpaque(false); 
	buth20.setContentAreaFilled(false); 
	buth20.setBorderPainted(false);
	buth20.addActionListener(this);
	panel1.add(buth20);

	buth21.setSize(87,30);
	buth21.setLocation(212,293);
	buth21.setOpaque(false); 
	buth21.setContentAreaFilled(false); 
	buth21.setBorderPainted(false);
	buth21.addActionListener(this);
	panel1.add(buth21);
	
	buth22.setSize(87,30);
	buth22.setLocation(318,293);
	buth22.setOpaque(false); 
	buth22.setContentAreaFilled(false); 
	buth22.setBorderPainted(false);
	buth22.addActionListener(this);
	panel1.add(buth22);
	
	buth23.setSize(87,30);
	buth23.setLocation(425,293);
	buth23.setOpaque(false); 
	buth23.setContentAreaFilled(false); 
	buth23.setBorderPainted(false);
	buth23.addActionListener(this);
	panel1.add(buth23);
	
	buth24.setSize(87,30);
	buth24.setLocation(532,293);
	buth24.setOpaque(false); 
	buth24.setContentAreaFilled(false); 
	buth24.setBorderPainted(false);
	buth24.addActionListener(this);
	panel1.add(buth24);			
//----------------------------------------------------------------------
	buth30.setSize(87,30);
	buth30.setLocation(105,400);
	buth30.setOpaque(false); 
	buth30.setContentAreaFilled(false); 
	buth30.setBorderPainted(false);
	buth30.addActionListener(this);
	panel1.add(buth30);

	buth31.setSize(87,30);
	buth31.setLocation(212,400);
	buth31.setOpaque(false); 
	buth31.setContentAreaFilled(false); 
	buth31.setBorderPainted(false);
	buth31.addActionListener(this);
	panel1.add(buth31);
	
	buth32.setSize(87,30);
	buth32.setLocation(318,400);
	buth32.setOpaque(false); 
	buth32.setContentAreaFilled(false); 
	buth32.setBorderPainted(false);
	buth32.addActionListener(this);
	panel1.add(buth32);
	
	buth33.setSize(87,30);
	buth33.setLocation(425,400);
	buth33.setOpaque(false); 
	buth33.setContentAreaFilled(false); 
	buth33.setBorderPainted(false);
	buth33.addActionListener(this);
	panel1.add(buth33);
	
	buth34.setSize(87,30);
	buth34.setLocation(532,400);
	buth34.setOpaque(false); 
	buth34.setContentAreaFilled(false); 
	buth34.setBorderPainted(false);
	buth34.addActionListener(this);
	panel1.add(buth34);			
//----------------------------------------------------------------------
	buth40.setSize(87,30);
	buth40.setLocation(105,506);
	buth40.setOpaque(false); 
	buth40.setContentAreaFilled(false); 
	buth40.setBorderPainted(false);
	buth40.addActionListener(this);
	panel1.add(buth40);

	buth41.setSize(87,30);
	buth41.setLocation(212,506);
	buth41.setOpaque(false); 
	buth41.setContentAreaFilled(false); 
	buth41.setBorderPainted(false);
	buth41.addActionListener(this);
	panel1.add(buth41);
	
	buth42.setSize(87,30);
	buth42.setLocation(318,506);
	buth42.setOpaque(false); 
	buth42.setContentAreaFilled(false); 
	buth42.setBorderPainted(false);
	buth42.addActionListener(this);
	panel1.add(buth42);
	
	buth43.setSize(87,30);
	buth43.setLocation(425,506);
	buth43.setOpaque(false); 
	buth43.setContentAreaFilled(false); 
	buth43.setBorderPainted(false);
	buth43.addActionListener(this);
	panel1.add(buth43);
	
	buth44.setSize(87,30);
	buth44.setLocation(532,506);
	buth44.setOpaque(false); 
	buth44.setContentAreaFilled(false); 
	buth44.setBorderPainted(false);
	buth44.addActionListener(this);
	panel1.add(buth44);			
//----------------------------------------------------------------------
	buth50.setSize(87,30);
	buth50.setLocation(105,612);
	buth50.setOpaque(false); 
	buth50.setContentAreaFilled(false); 
	buth50.setBorderPainted(false);
	buth50.addActionListener(this);
	panel1.add(buth50);

	buth51.setSize(87,30);
	buth51.setLocation(212,612);
	buth51.setOpaque(false); 
	buth51.setContentAreaFilled(false); 
	buth51.setBorderPainted(false);
	buth51.addActionListener(this);
	panel1.add(buth51);
	
	buth52.setSize(87,30);
	buth52.setLocation(318,612);
	buth52.setOpaque(false); 
	buth52.setContentAreaFilled(false); 
	buth52.setBorderPainted(false);
	buth52.addActionListener(this);
	panel1.add(buth52);
	
	buth53.setSize(87,30);
	buth53.setLocation(425,612);
	buth53.setOpaque(false); 
	buth53.setContentAreaFilled(false); 
	buth53.setBorderPainted(false);
	buth53.addActionListener(this);
	panel1.add(buth53);
	
	buth54.setSize(87,30);
	buth54.setLocation(532,612);
	buth54.setOpaque(false); 
	buth54.setContentAreaFilled(false); 
	buth54.setBorderPainted(false);
	buth54.addActionListener(this);
	panel1.add(buth54);			
//----------------------------------------------------------------------
//----------------------------------------------------------------------
//----------------------------------------------------------------------
	butv00.setSize(30,87);
	butv00.setLocation(80,103);
	butv00.setOpaque(false); 
	butv00.setContentAreaFilled(false); 
	butv00.setBorderPainted(false);
	butv00.addActionListener(this);
	panel1.add(butv00);
	
	butv01.setSize(30,87);
	butv01.setLocation(187,103);
	butv01.setOpaque(false); 
	butv01.setContentAreaFilled(false); 
	butv01.setBorderPainted(false);
	butv01.addActionListener(this);
	panel1.add(butv01);
	
	butv02.setSize(30,87);
	butv02.setLocation(295,103);
	butv02.setOpaque(false); 
	butv02.setContentAreaFilled(false); 
	butv02.setBorderPainted(false);
	butv02.addActionListener(this);
	panel1.add(butv02);
	
	butv03.setSize(30,87);
	butv03.setLocation(400,103);
	butv03.setOpaque(false); 
	butv03.setContentAreaFilled(false); 
	butv03.setBorderPainted(false);
	butv03.addActionListener(this);
	panel1.add(butv03);
	
	butv04.setSize(30,87);
	butv04.setLocation(505,103);
	butv04.setOpaque(false); 
	butv04.setContentAreaFilled(false); 
	butv04.setBorderPainted(false);
	butv04.addActionListener(this);
	panel1.add(butv04);
	
	butv05.setSize(30,87);
	butv05.setLocation(612,103);
	butv05.setOpaque(false); 
	butv05.setContentAreaFilled(false); 
	butv05.setBorderPainted(false);
	butv05.addActionListener(this);
	panel1.add(butv05);
//----------------------------------------------------------------------
	butv10.setSize(30,87);
	butv10.setLocation(80,211);
	butv10.setOpaque(false); 
	butv10.setContentAreaFilled(false); 
	butv10.setBorderPainted(false);
	butv10.addActionListener(this);
	panel1.add(butv10);
	
	butv11.setSize(30,87);
	butv11.setLocation(187,211);
	butv11.setOpaque(false); 
	butv11.setContentAreaFilled(false); 
	butv11.setBorderPainted(false);
	butv11.addActionListener(this);
	panel1.add(butv11);
	
	butv12.setSize(30,87);
	butv12.setLocation(295,211);
	butv12.setOpaque(false); 
	butv12.setContentAreaFilled(false); 
	butv12.setBorderPainted(false);
	butv12.addActionListener(this);
	panel1.add(butv12);
	
	butv13.setSize(30,87);
	butv13.setLocation(400,211);
	butv13.setOpaque(false); 
	butv13.setContentAreaFilled(false); 
	butv13.setBorderPainted(false);
	butv13.addActionListener(this);
	panel1.add(butv13);
	
	butv14.setSize(30,87);
	butv14.setLocation(505,211);
	butv14.setOpaque(false); 
	butv14.setContentAreaFilled(false); 
	butv14.setBorderPainted(false);
	butv14.addActionListener(this);
	panel1.add(butv14);
	
	butv15.setSize(30,87);
	butv15.setLocation(612,211);
	butv15.setOpaque(false); 
	butv15.setContentAreaFilled(false); 
	butv15.setBorderPainted(false);
	butv15.addActionListener(this);
	panel1.add(butv15);
//----------------------------------------------------------------------
	butv20.setSize(30,87);
	butv20.setLocation(80,317);
	butv20.setOpaque(false); 
	butv20.setContentAreaFilled(false); 
	butv20.setBorderPainted(false);
	butv20.addActionListener(this);
	panel1.add(butv20);
	
	butv21.setSize(30,87);
	butv21.setLocation(187,317);
	butv21.setOpaque(false); 
	butv21.setContentAreaFilled(false); 
	butv21.setBorderPainted(false);
	butv21.addActionListener(this);
	panel1.add(butv21);
	
	butv22.setSize(30,87);
	butv22.setLocation(295,317);
	butv22.setOpaque(false); 
	butv22.setContentAreaFilled(false); 
	butv22.setBorderPainted(false);
	butv22.addActionListener(this);
	panel1.add(butv22);
	
	butv23.setSize(30,87);
	butv23.setLocation(400,317);
	butv23.setOpaque(false); 
	butv23.setContentAreaFilled(false); 
	butv23.setBorderPainted(false);
	butv23.addActionListener(this);
	panel1.add(butv23);
	
	butv24.setSize(30,87);
	butv24.setLocation(505,317);
	butv24.setOpaque(false); 
	butv24.setContentAreaFilled(false); 
	butv24.setBorderPainted(false);
	butv24.addActionListener(this);
	panel1.add(butv24);
	
	butv25.setSize(30,87);
	butv25.setLocation(612,317);
	butv25.setOpaque(false); 
	butv25.setContentAreaFilled(false); 
	butv25.setBorderPainted(false);
	butv25.addActionListener(this);
	panel1.add(butv25);
//----------------------------------------------------------------------
	butv30.setSize(30,87);
	butv30.setLocation(80,425);
	butv30.setOpaque(false); 
	butv30.setContentAreaFilled(false); 
	butv30.setBorderPainted(false);
	butv30.addActionListener(this);
	panel1.add(butv30);
	
	butv31.setSize(30,87);
	butv31.setLocation(187,425);
	butv31.setOpaque(false); 
	butv31.setContentAreaFilled(false); 
	butv31.setBorderPainted(false);
	butv31.addActionListener(this);
	panel1.add(butv31);
	
	butv32.setSize(30,87);
	butv32.setLocation(295,425);
	butv32.setOpaque(false); 
	butv32.setContentAreaFilled(false); 
	butv32.setBorderPainted(false);
	butv32.addActionListener(this);
	panel1.add(butv32);
	
	butv33.setSize(30,87);
	butv33.setLocation(400,425);
	butv33.setOpaque(false); 
	butv33.setContentAreaFilled(false); 
	butv33.setBorderPainted(false);
	butv33.addActionListener(this);
	panel1.add(butv33);
	
	butv34.setSize(30,87);
	butv34.setLocation(505,425);
	butv34.setOpaque(false); 
	butv34.setContentAreaFilled(false); 
	butv34.setBorderPainted(false);
	butv34.addActionListener(this);
	panel1.add(butv34);
	
	butv35.setSize(30,87);
	butv35.setLocation(612,425);
	butv35.setOpaque(false); 
	butv35.setContentAreaFilled(false); 
	butv35.setBorderPainted(false);
	butv35.addActionListener(this);
	panel1.add(butv35);
//----------------------------------------------------------------------
	butv40.setSize(30,87);
	butv40.setLocation(80,532);
	butv40.setOpaque(false); 
	butv40.setContentAreaFilled(false); 
	butv40.setBorderPainted(false);
	butv40.addActionListener(this);
	panel1.add(butv40);
	
	butv41.setSize(30,87);
	butv41.setLocation(187,532);
	butv41.setOpaque(false); 
	butv41.setContentAreaFilled(false); 
	butv41.setBorderPainted(false);
	butv41.addActionListener(this);
	panel1.add(butv41);
	
	butv42.setSize(30,87);
	butv42.setLocation(295,532);
	butv42.setOpaque(false); 
	butv42.setContentAreaFilled(false); 
	butv42.setBorderPainted(false);
	butv42.addActionListener(this);
	panel1.add(butv42);
	
	butv43.setSize(30,87);
	butv43.setLocation(400,532);
	butv43.setOpaque(false); 
	butv43.setContentAreaFilled(false); 
	butv43.setBorderPainted(false);
	butv43.addActionListener(this);
	panel1.add(butv43);
	
	butv44.setSize(30,87);
	butv44.setLocation(505,532);
	butv44.setOpaque(false); 
	butv44.setContentAreaFilled(false); 
	butv44.setBorderPainted(false);
	butv44.addActionListener(this);
	panel1.add(butv44);
	
	butv45.setSize(30,87);
	butv45.setLocation(612,532);
	butv45.setOpaque(false); 
	butv45.setContentAreaFilled(false); 
	butv45.setBorderPainted(false);
	butv45.addActionListener(this);
	panel1.add(butv45);
//----------------------------------------------------------------------


	theframe.setContentPane(panel1);
	theframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	theframe.pack();
	theframe.setVisible(true);
	theframe.setResizable(false);
	thetimer.start();
	
	}
	public static void main (String[] args){ 
		new dotsboxesgame();
	}
}
