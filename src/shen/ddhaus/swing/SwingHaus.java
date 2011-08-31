package shen.ddhaus.swing;

import java.awt.BorderLayout;
import java.awt.Dimension;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class SwingHaus extends JFrame{
	
	private static final long serialVersionUID = 1L;
	
	private JLabel textLabel;
	private JButton okButton;

	public SwingHaus() {
		setTitle("Swing Haus");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setFrameLocation(800, 600);
		setLayout(new BorderLayout());
		
		textLabel = new JLabel();
		textLabel.setText("Willkommen! :-)");
		
		okButton = new JButton("OK");
		
		
		add(textLabel, BorderLayout.NORTH);
		add(okButton, BorderLayout.SOUTH);
		
		setVisible(true);
	}
	
	private void setFrameLocation(int frameWidth, int frameHeight) {
		setSize(frameWidth, frameHeight);
		Dimension screen = getToolkit().getScreenSize();
		setLocation((screen.width - frameWidth) / 2,
				(screen.height - frameHeight) / 2);
	}
	
	public static void main(String[] args) {
		new SwingHaus();
	}
}

