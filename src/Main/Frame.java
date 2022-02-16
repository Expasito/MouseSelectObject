package Main;

import java.awt.Graphics;
import java.awt.event.*;

import javax.swing.JFrame;

public class Frame extends JFrame implements MouseListener, KeyListener{
	public Square sq;
	public Panel panel;
	public Frame(Square sq, Panel panel) {
		setVisible(true);
		setLocation(0,0);
		setSize(500,500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		addKeyListener(this);
		addMouseListener(this);
		this.sq=sq;
		this.panel=panel;
	}
	
	public void paint(Graphics g) {
		
	}

	@Override
	public void keyTyped(KeyEvent e) {
		if(e.getKeyChar()=='w') {
			if(Main.cur>0) {Main.cur-=1;}
		}
		if(e.getKeyChar()=='s') {
			if(Main.cur<1) {Main.cur+=1;}
		}
		System.out.println(Main.cur);
		if(e.getKeyChar()==' ') {
			Main.confirm=true;
			Main.selected=false;
			Main.nextAction=false;
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
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		if(Main.selected) {
			Main.selected=false;
			Main.nextAction=true;
		}else if(!Main.nextAction){
			System.out.println("Mouse Y " + panel.getMousePosition().y +" " + sq.y);
			Main.selected=false;
			if(panel.getMousePosition().y > sq.y && panel.getMousePosition().y < (sq.y+sq.size) && this.getMousePosition().x>sq.x && this.getMousePosition().x <(sq.x+sq.size)) {
				Main.selected=true;
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
