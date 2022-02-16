package Main;
public class Main {
	public static boolean selected=false;
	public static boolean nextAction=false;
	public static int cur=0;
	public static boolean confirm=false;
	public static void main(String[] args) {
		Square sq = new Square(40,40,50);
		Panel panel = new Panel(sq);
		Frame frame= new Frame(sq,panel);
		
		
		
		frame.add(panel);
		while(true) {
			panel.repaint();
			if(selected) {
				try {
					sq.x=panel.getMousePosition().x-10;
					sq.y=panel.getMousePosition().y-10;
				} catch(Exception e) {
					
				}
				
			}
			
		}
	}

}
