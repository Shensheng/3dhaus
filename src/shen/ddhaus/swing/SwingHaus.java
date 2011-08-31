package shen.ddhaus.swing;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class SwingHaus extends JFrame implements ActionListener{
	
	private static final long serialVersionUID = 1L;
	
	private JLabel textLabel;
	private JButton okButton;
	private KButton KLabel;
	public SwingHaus() {
		// Titel des Fensters
		setTitle("Swing Haus");
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// Setze die Groesse und Position des Fensters
		setFrameLocation(800, 600);
		
		// Verwendetes Layout
		setLayout(new BorderLayout());
		
		// Initialisiere ein neues Label, in dem Text angezeigt werden kann
		textLabel = new JLabel();
		textLabel.setText("Willkommen! :-)");
		
		setLayout(new BorderLayout.center());
		
		textLabel = new KLabel();
		textLabel.setText("Geht es");
		// Initialisiere neuen Button
		okButton = new JButton("OK");
		// Fuege Listener hinzu, damit eine Aktion beim Druecken des Buttons aufgefuehrt wird
		// Siehe dazu Methode actionPerformed(ActionEvent)
		okButton.addActionListener(this);
		
		// Fuege Text zum Fenster hinzu und setze es in den Norden (oben)
		add(textLabel, BorderLayout.NORTH);
		// Fuege Button zum Fenster hinzu und setze es in den Sueden (unten)
		add(okButton, BorderLayout.SOUTH);
		
		// Zeige Fenster an
		setVisible(true);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		Object source = e.getSource();
		
		// Wenn der Button gedrueckt wird, beende das Programm
		if(source == okButton) {
			System.exit(0);
		}
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

