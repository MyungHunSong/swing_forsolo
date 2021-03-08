package swing_forsolo.layout;

import javax.swing.JPanel;
import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class PanelGrid extends JPanel {
	private JTextField tfName;
	private JTextField tfNo;
	private JTextField tfMaj;
	private JTextField tfMa;

	
	public PanelGrid() {

		initialize();
	}
	private void initialize() {
		setLayout(new GridLayout(0, 2, 10, 10));
		
		JLabel lblName = new JLabel("이름");
		lblName.setHorizontalAlignment(SwingConstants.RIGHT);
		add(lblName);
		
		tfName = new JTextField();
		add(tfName);
		tfName.setColumns(10);
		
		JLabel lblNo = new JLabel("학번");
		lblNo.setHorizontalAlignment(SwingConstants.RIGHT);
		add(lblNo);
		
		tfNo = new JTextField();
		tfNo.setColumns(10);
		add(tfNo);
		
		JLabel lblMaj = new JLabel("학과");
		lblMaj.setHorizontalAlignment(SwingConstants.RIGHT);
		add(lblMaj);
		
		tfMaj = new JTextField();
		tfMaj.setColumns(10);
		add(tfMaj);
		
		JLabel lblMa = new JLabel("과목");
		lblMa.setHorizontalAlignment(SwingConstants.RIGHT);
		add(lblMa);
		
		tfMa = new JTextField();
		tfMa.setColumns(10);
		add(tfMa);
	}

}
