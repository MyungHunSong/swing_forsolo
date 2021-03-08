package swing_forsolo.layout;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTextArea;

public class PanelAbsolute extends JPanel {

	public PanelAbsolute() {

		initialize();
	}
	private void initialize() {
		setLayout(null);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setBounds(65, 41, 57, 15);
		add(lblNewLabel);
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.setBounds(303, 209, 97, 23);
		add(btnNewButton);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(251, 137, 149, 24);
		add(textArea);
	}
}
