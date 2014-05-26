import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;


public class MainFrame extends JFrame {

	private JPanel contentPane;

	
	public MainFrame() {
		super("Awesome game");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 860, 640);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(0, 0, 0, 0));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		ImagePanel panel = new ImagePanel("resources/bg.jpg");	
		add(panel);
		panel = new ImagePanel("resources/mario.png");
		add(panel);
		
		setVisible(true);
		setResizable(false);
		
	}

}
