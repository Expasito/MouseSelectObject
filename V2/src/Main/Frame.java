package Main;

import java.awt.Graphics;
import java.awt.event.*;

import javax.swing.JFrame;

public class Frame extends JFrame implements MouseListener, KeyListener{
	public Panel panel;
	public Frame(Panel panel) {
		setVisible(true);
		setLocation(0,0);
		setSize(500,500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		addKeyListener(this);
		addMouseListener(this);
		this.panel=panel;
	}
	
	public void paint(Graphics g) {
		
	}

	@Override
	public void keyTyped(KeyEvent e) {
		if(e.getKeyChar()=='w') {
			if(Main.cur>0) {Main.cur-=1;} else {
				Main.cur =1;
			}
		}
		if(e.getKeyChar()=='s') {
			if(Main.cur<1) {Main.cur+=1;}else {
				Main.cur=0;
			}
		}
		System.out.println(Main.cur);
		if(e.getKeyChar()==' ') {
			Main.confirm=true;
			Main.selected=false;
			Main.nextAction=false;
			Main.cur=0;
			Main.index=-1;
			
		}
		if(e.getKeyChar()=='b') {
			System.exit(0);
		}
		if(e.getKeyChar()=='f') {
			if((Main.selected || Main.nextAction)&& Main.index!=-1) {
				Main.entities.get(Main.index).x=Main.selX;
				Main.entities.get(Main.index).y=Main.selY;
			}
			Main.selected=false;
			Main.nextAction=false;
			Main.index=-1;
			
		}
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		if(Main.selected) {
			Main.selected=false;
			Main.nextAction=true;
		}else if(!Main.nextAction){
			Main.selected=false;
			for(int i=0;i<Main.entities.size();i++) {
				Square sq = Main.entities.get(i);
				
				if(panel.getMousePosition().y > sq.y && panel.getMousePosition().y < (sq.y+sq.size) && this.getMousePosition().x>sq.x && this.getMousePosition().x <(sq.x+sq.size)) {
					Main.selected=true;
					Main.index=i;
					Main.selX=sq.x;
					Main.selY=sq.y;
//					Main.entities.get(Main.index).x=0;
					break;
				}
			}
			
		}
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		System.out.println("Bye");
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

}
