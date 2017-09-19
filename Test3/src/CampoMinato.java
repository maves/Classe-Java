import javax.swing.AbstractButton;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JFrame;
import javax.swing.ImageIcon;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

/* 
 * ButtonDemo.java requires the following files:
 *   images/right.gif
 *   images/middle.gif
 *   images/left.gif
 */
public class CampoMinato extends JPanel
                        implements ActionListener {
	
	
	class Campo{
		
		int id = 0;
		boolean coperto = true;
		boolean minato = false;
		int desc = 0;
		int mineVicino = 0;
		
		JButton button;
	}
	
    protected JButton b1, b2, b3;
    
    int numXMines = 10;
    int numYMines = 10;
    
    final JButton[] bMines = new JButton[100];
    
    // 0: coperta minata
    // 1: coperta 
    int[] statoMines = new int[100];
    
    Campo[] campi = new Campo[100];
    

    public CampoMinato() {
//        ImageIcon leftButtonIcon = createImageIcon("images/right.gif");
//        ImageIcon middleButtonIcon = createImageIcon("images/middle.gif");
//        ImageIcon rightButtonIcon = createImageIcon("images/left.gif");

//        b1 = new JButton("Disable middle button");
//        b1.setVerticalTextPosition(AbstractButton.CENTER);
//        b1.setHorizontalTextPosition(AbstractButton.LEADING); //aka LEFT, for left-to-right locales
//        b1.setMnemonic(KeyEvent.VK_D);
//        b1.setActionCommand("disable");
//
//        b2 = new JButton("Middle button");
//        b2.setVerticalTextPosition(AbstractButton.BOTTOM);
//        b2.setHorizontalTextPosition(AbstractButton.CENTER);
//        b2.setMnemonic(KeyEvent.VK_M);
//
//        b3 = new JButton("Enable middle button");
//        //Use the default text position of CENTER, TRAILING (RIGHT).
//        b3.setMnemonic(KeyEvent.VK_E);
//        b3.setActionCommand("enable");
//        b3.setEnabled(false);
//
//        //Listen for actions on buttons 1 and 3.
//        b1.addActionListener(this);
//        b3.addActionListener(this);
//
//        b1.setToolTipText("Click this button to disable the middle button.");
//        b2.setToolTipText("This middle button does nothing when you click it.");
//        b3.setToolTipText("Click this button to enable the middle button.");
//
//        //Add Components to this container, using the default FlowLayout.
//        add(b1);
//        add(b2);
//        add(b3);
        
        
        setLayout(new GridLayout(10,10));
        
        
        
        for(int i=0; i<100; i++) {
        	
        	campi[i] = new Campo();
        	
        	
        	// inizio button
        	
        	campi[i].button = new JButton(""+i);
            //Use the default text position of CENTER, TRAILING (RIGHT).
//        	app.setMnemonic(KeyEvent.VK_E);
        	campi[i].button.setActionCommand("enable");
//        	app.setEnabled(false);
        	
//        	final JButton a = app;
        	
        	
        	
        	campi[i].button.addMouseListener(new MouseAdapter(){
        		
        		private Campo c;
        		
				public void mouseClicked(MouseEvent e){
//					boolean mine = field.isMine(x, y);
					
					
					if (e.getButton() == MouseEvent.BUTTON1) {
						
						clickSx(c);
						
//						button.setText("F");
//						System.out.println(1);
					  
					}else if(e.getButton() == MouseEvent.BUTTON2) {
						c.button.setText("F");
//						System.out.println(2);
					  
					}
					
				}
				
				private MouseAdapter init(Campo var) {
					c = var;
					return this;
				}
				
			}.init(campi[i]));
        		    
        	add(campi[i].button);
        	
        	// fine button
        	
        	campi[i].minato = (Math.random()>0.5) ? true : false;
//        	if(i%2>0) campi[i].minato = true;
        	campi[i].id = i;
        	
        	
        	
        	
        }
        
        
    }
    
    public void persa(Campo c) {
    	
    	
    		
		c.button.setText("X");
		
		// scopri tutti i button
		
		// avvisa ..
    	
    	
    }
    
    public int haMineIntorno(Campo c) {
    	
    	
    	int[] indiciCampiLimitrofi = {
    			-numXMines-1,
    			-numXMines,
    			-numXMines+1,
    			+1,
    			+numXMines+1,
    			+numXMines,
    			+numXMines-1,
    			-1
    	};
    	
    	int numMineVicino = 0;
    	for(int i=0; i<8; i++) {
        	
    		
    		
    		int indice = c.id + indiciCampiLimitrofi[i];
    		
    		if(indice < 0 || indice >= numXMines*numYMines) continue;
    		
    		Campo app = campi[indice];
    		
    		if(campi[indice].minato) numMineVicino++;
//    		else scopri(campi[indice]);
    			
    	}
    	
    	return numMineVicino;
    }
    
    public void scopri(Campo c) {
    	
    	System.out.print("> " + c.id + " ");
    	
    	if(c.minato) {
    		System.out.println(c.id + " già minato.");
    		return;
    	}
    	
    	
    	if(!c.coperto) return;
    	c.coperto = false;
    	
    	
    	
    	
    	
    	// cerco se ha mine vicino
    	
    	int numMineVicino = 0;
    	
    	
    	
    	
    	// scrivo su campo la quantità di mine vicine
    	
    	c.button.setText(String.valueOf("["+c.mineVicino+"]"));
    	System.out.println(c.id + "]");
//    	c.button.setEnabled(false);
    }
    
    public void clickSx(Campo c) {
    	
//    	button.setText("X");
    	if( c.minato ) {
    		
    		persa(c);
    		System.out.println("HAI PERSO");
    		return;
    	}else {
    		
    		scopri(c);
    		
    	}
//    	c.button.setText(" ");
    	
    	
    	
    	
    }

    public void actionPerformed(ActionEvent e) {
        if ("disable".equals(e.getActionCommand())) {
            b2.setEnabled(false);
            b1.setEnabled(false);
            b3.setEnabled(true);
        } else {
            b2.setEnabled(true);
            b1.setEnabled(true);
            b3.setEnabled(false);
        }
    }

    /** Returns an ImageIcon, or null if the path was invalid. */
    protected static ImageIcon createImageIcon(String path) {
        java.net.URL imgURL = CampoMinato.class.getResource(path);
        if (imgURL != null) {
            return new ImageIcon(imgURL);
        } else {
            System.err.println("Couldn't find file: " + path);
            return null;
        }
    }

    /**
     * Create the GUI and show it.  For thread safety, 
     * this method should be invoked from the 
     * event-dispatching thread.
     */
    private static void createAndShowGUI() {

        //Create and set up the window.
        JFrame frame = new JFrame("Campo Minato");
        frame.setSize(500, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //Create and set up the content pane.
        CampoMinato newContentPane = new CampoMinato();
        newContentPane.setOpaque(true); //content panes must be opaque
        frame.setContentPane(newContentPane);

        //Display the window.
//        frame.pack();
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        //Schedule a job for the event-dispatching thread:
        //creating and showing this application's GUI.
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI(); 
            }
        });
    }
}