package swing_forsolo.layout;

import javax.swing.JPanel;
import java.awt.FlowLayout;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Color;

public class PanelBorder extends JPanel {

	
	public PanelBorder() {

		initialize();
	}
	private void initialize() {
		setLayout(new BorderLayout(10, 10));
		
		JLabel lblNorth = new JLabel("North");
		lblNorth.setOpaque(true);
		lblNorth.setBackground(Color.MAGENTA);
		lblNorth.setHorizontalAlignment(SwingConstants.CENTER);
		add(lblNorth, BorderLayout.NORTH);
		
		JLabel lblEast = new JLabel("East");
		lblEast.setBackground(Color.RED);
		lblEast.setOpaque(true);
		add(lblEast, BorderLayout.EAST);
		
		JLabel lblCenter = new JLabel("Center");
		lblCenter.setBackground(Color.GRAY);
		lblCenter.setOpaque(true);
		lblCenter.setHorizontalAlignment(SwingConstants.CENTER);
		add(lblCenter, BorderLayout.CENTER);
		
		JLabel lblWest = new JLabel("West");
		lblWest.setBackground(Color.ORANGE);
		lblWest.setOpaque(true);
		add(lblWest, BorderLayout.WEST);
		
		JLabel lblSouth = new JLabel("South");
		lblSouth.setBackground(Color.GREEN);
		lblSouth.setOpaque(true);
		lblSouth.setHorizontalAlignment(SwingConstants.CENTER);
		add(lblSouth, BorderLayout.SOUTH);
	}

}
