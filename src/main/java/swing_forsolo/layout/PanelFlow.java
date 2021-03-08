package swing_forsolo.layout;

import javax.swing.JPanel;
import java.awt.GridLayout;
import javax.swing.border.TitledBorder;
import javax.swing.UIManager;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.FlowLayout;

public class PanelFlow extends JPanel {

	
	public PanelFlow() {

		initialize();
	}
	private void initialize() {
		setLayout(new GridLayout(0, 1, 0, 0));
		
		JPanel panel01 = new JPanel();
		FlowLayout flowLayout = (FlowLayout) panel01.getLayout();
		flowLayout.setAlignment(FlowLayout.LEFT);
		panel01.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "\uCCAB\uBC88\uC9F8", TitledBorder.LEFT, TitledBorder.TOP, null, new Color(0, 0, 0)));
		add(panel01);
		
		JButton btn01 = new JButton("1");
		btn01.setHorizontalAlignment(SwingConstants.LEFT);
		panel01.add(btn01);
		
		JButton btn02 = new JButton("2");
		btn02.setHorizontalAlignment(SwingConstants.LEFT);
		panel01.add(btn02);
		
		JPanel panel02 = new JPanel();
		panel02.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "\uB450\uBC88\uC9F8", TitledBorder.CENTER, TitledBorder.TOP, null, new Color(0, 0, 0)));
		add(panel02);
		
		JButton btnNewButton = new JButton("1");
		panel02.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("2");
		panel02.add(btnNewButton_1);
		
		JPanel panel03 = new JPanel();
		FlowLayout flowLayout_1 = (FlowLayout) panel03.getLayout();
		flowLayout_1.setAlignment(FlowLayout.RIGHT);
		panel03.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "3\uBC88\uC9F8", TitledBorder.RIGHT, TitledBorder.TOP, null, new Color(0, 0, 0)));
		add(panel03);
		
		JButton btnNewButton_2 = new JButton("1");
		panel03.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("2");
		panel03.add(btnNewButton_3);
	}

}
