import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.*;

public class Test2 {
      public static void main( String[] args ) {
        System.out.println("Hello, Java!");
        
        JFrame frame = new JFrame( "Hello, Java!" );
        frame.setSize( 300, 300 );
        frame.setVisible( true );
        
        
        JLabel label = new JLabel("Hello, Java!", JLabel.CENTER );
//        frame.add(label);
        
        HelloComponent hc = new HelloComponent();
        hc.setVisible(true);
        frame.add( hc );
        
        
      }
}

class HelloComponent extends JComponent {
	
	
	
    public void paintComponent( Graphics g ) {
      g.drawString( "Hello, Jaaava!", 125, 95 );
    }
}