import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.GridLayout;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextPane;

public class test4 {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					test4 window = new test4();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public test4() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.ORANGE);
		frame.setBounds(100, 100, 450, 503);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new GridLayout(2, 2, 10, 10));
		
		JTextPane textPane = new JTextPane();
		frame.getContentPane().add(textPane);
		
		JButton btnCliccami = new JButton("Cliccami");
		btnCliccami.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("ho cliccato???");
			}
		});
		frame.getContentPane().add(btnCliccami);
		
		JButton btnBoh = new JButton("boh");
		frame.getContentPane().add(btnBoh);
	}

}
