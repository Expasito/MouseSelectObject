package Main;

import java.util.ArrayList;



public class Main {
	public static boolean selected=false;
	public static int selX=0,selY=0;
	public static int index=-1;
	public static boolean nextAction=false;
	public static int cur=0;
	public static boolean confirm=false;
	public static ArrayList<Square> entities = new ArrayList<Square>();
	public static void main(String[] args) throws InterruptedException {
		Square sq = new Square(4*48,4*48,48,"Player");
		Square sq2 = new Square(2*48,2*48,48,"Enemy");
		entities.add(sq);
		entities.add(sq2);
		Panel panel = new Panel();
		Frame frame= new Frame(panel);
		
		
		
		frame.add(panel);
		while(true) {
			
//			for(Square s:entities) {
//				System.out.println("X: " + s.x);
//			}
//			System.out.println("Pair value: " + selectedPos.val1 +" " + selectedPos.val2);
			if(selected && index!=-1) {
				try {
					System.out.println(panel.getMousePosition());
					entities.get(index).x=((int)(panel.getMousePosition().x/48))*48;
					entities.get(index).y=((int)(panel.getMousePosition().y/48))*48;
				} catch(Exception e) {
					
				}
				
			}
			panel.repaint();
			Thread.sleep(10);
			
		}
	}

}
