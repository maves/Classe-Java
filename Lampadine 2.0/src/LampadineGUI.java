import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.*;

public class LampadineGUI {

	
	public static int[] calcoloPos(int i, int wLed, int hLed, int wFrame, int hFrame) {

		int x;
		if ((wLed * i) % wFrame == 0)
			x = wFrame - wLed;
		else
			x = (wLed * i) % wFrame;

		
		
		int y;
		if ((hLed * i) % hFrame == 0)
			y = hFrame - hLed;
		else
			y = (hLed * i) % hFrame - hLed;

		int[] res = { x, y };

		return res;
	}
	
	
	public static void main(String[] args) {

		int widthFrame = 600;
		int heightFrame = 600;
		
		int numLedX = 5;
		int numLedY = 5;

		JFrame frame = new JFrame("Lampadine 2.0");
		frame.setSize(widthFrame, heightFrame);
		frame.setVisible(true);

		int wLed = (int) widthFrame / numLedX;
		int hLed = (int) heightFrame / numLedY;
		

		

		int totLed = numLedX * numLedY;
		
		Led[] arrLed = new Led[totLed];
		
//		for(int i=0; i<totLed; i++) {
//			
//			int[] pos = calcoloPos(i, wLed, hLed, widthFrame, heightFrame );
//			arrLed[i] = new Led(pos[0],pos[1],wLed,hLed);
//			frame.add(arrLed[i]);
//			System.out.println(i + " " + pos[0] + " " + pos[1]);
//		}
//		
//		frame.repaint();
		
		
		new Led(10,10,100,100);
		
		
//		Led l = new Led(widthFrame, heightFrame, 2, 2);
//		frame.add(l);
//		int[] arr = {0,0,1,1};
//		
//		l.aggiorna(arr);
		
		

	
	}

}

class Led extends JComponent {



	int posX;
	int posY;
	
	int width;
	int height;
	
	int stato;
	
	/////////////////////////////
	

	Led(int x, int y, int w, int h) {

		posX = x;
		posY = y;
		width = w;
		height = h;
		
		stato = 0;
		

	}

	public void aggiorna() {

		
		this.paint(getGraphics());
		
		
	}

	

	public void paintComponent( Graphics g ) {
    	
		System.out.println(posX);
		
		if(stato==0) {
			g.setColor(Color.PINK);
	    	g.fillRect(posX, posY, width, height);
		}
		
		if(stato==1) {
			g.setColor(Color.LIGHT_GRAY);
	    	g.fillRect(posX, posY, width, height);
		}
		
		if(stato==-1) {
			g.setColor(Color.BLACK);
	    	g.fillRect(posX, posY, width, height);
		}
//    	if( currentLed < 0 ) return;
    	
//    	int[] pos = calcoloPos(currentLed);
    	
//    	g.drawString( "Hello, Jaaava!", 125, 95 );
//      
//		int[] pos;
//		
//		for(int i=0; i<totLed; i++) {
//			
//			pos = calcoloPos(arrLed[i]);
//			
//			if(arrLed[i] == -1) {
//				
//				g.setColor(Color.BLACK);
//		    	g.fillRect(pos[0], pos[1], wLed, hLed);
//		    	
//		    	System.out.println("i: "+ i + " stato: " + -1);
//			}
//			
//			if(arrLed[i] == 0) {
//				
//				g.setColor(Color.GRAY);
//		    	g.fillRect(pos[0], pos[1], wLed, hLed);
//		    	System.out.println("i: "+ i + " stato: " + 0);
//			}
//			
//			if(arrLed[i] == 1) {
//				
//				g.setColor(Color.LIGHT_GRAY);
//		    	g.fillRect(pos[0], pos[1], wLed, hLed);
//		    	System.out.println("i: "+ i + " stato: " + 1);
//			}
//		}
//    	g.setColor(Color.LIGHT_GRAY);
//    	g.fillRect(pos[0], pos[1], wLed, hLed);
//    	
//    	log(pos[0]);
//    	log(pos[1]);
//    	log(pos[0]+wLed);
//    	log(pos[1]+hLed);
//    	
//    	log(wLed);
    	
    }
	
	public void log(String s) { System.out.println(s);}
	public void log(int i) { System.out.println(i);}
}