package Main;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Panel extends JPanel {
	public Square sq;
	public Panel(Square sq) {
		setVisible(true);
		setLocation(0,0);
		setSize(500,500);
		this.sq=sq;
	}
	
	public void paint(Graphics g) {
		g.clearRect(0,0,500,500);
//		g.drawString("hello", 100,100);
		if(Main.cur==0) {
			g.setColor(Color.red);
		}else if(Main.cur==1) {
			g.setColor(Color.green);
		}
//		g.setColor(Color.black);
		g.drawRect(sq.x,sq.y,sq.size,sq.size);
		if(Main.nextAction) {
			g.drawString("Select Action:",100,100);
			g.drawString("Attack",120,120);
			g.drawString("Wait",120,140);
			g.setColor(Color.yellow);
			g.fillRect(100,110+Main.cur*20,10,10);
		}
	}

}
