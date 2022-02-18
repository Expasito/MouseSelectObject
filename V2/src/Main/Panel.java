package Main;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Panel extends JPanel {
	public Panel() {
		setVisible(true);
		setLocation(0,0);
		setSize(500,500);
	}
	
	public void paint(Graphics g) {
		g.clearRect(0,0,500,500);
		g.setColor(Color.black);
		for(int i=0;i<20;i++) {
			g.drawLine(0, i*48, 1000, i*48);
			g.drawLine(i*48, 0, i*48, 1000);
		}
//		g.drawString("hello", 100,100);
		if(Main.cur==0) {
			g.setColor(Color.red);
		}else if(Main.cur==1) {
			g.setColor(Color.green);
		}
//		g.setColor(Color.black);
		for(Square sq: Main.entities) {
			g.fillRect(sq.x,sq.y,sq.size,sq.size);
			System.out.println(sq.x+ " " + sq.y);
		}
		
		if(Main.nextAction) {
			g.setColor(Color.black);
			g.drawString("Select Action:",100,100);
			g.drawString("Attack",120,120);
			g.drawString("Wait",120,140);
			g.setColor(Color.yellow);
			g.fillRect(100,110+Main.cur*20,10,10);
		}
	}

}
