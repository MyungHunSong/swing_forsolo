package swing_forsolo.component;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridLayout;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class FrameComponentEx extends JFrame implements ActionListener {

	private JPanel contentPane;
	private JButton btnCreate;
	private JButton btnDisable;
	private JButton btnGetXY;


	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	
	public FrameComponentEx() {
		initialize();
	}
	private void initialize() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new GridLayout(0, 1, 0, 0));
		
		btnCreate = new JButton("Magenta/Yellow Button");
		btnCreate.addActionListener(this);
		btnCreate.setBackground(Color.MAGENTA);
		btnCreate.setForeground(Color.YELLOW);
		btnCreate.setFont(new Font("Arial", Font.ITALIC, 20));
		contentPane.add(btnCreate);
		
		btnDisable = new JButton("Disabled Button");
		btnDisable.addActionListener(this);
		contentPane.add(btnDisable);
		
		btnGetXY = new JButton("getX(),getY()");
		btnGetXY.addActionListener(this);
		contentPane.add(btnGetXY);
	}

	public void actionPerformed(ActionEvent arg0) {
		if (arg0.getSource() == btnCreate) {// 1
			btnCreateActionPerformed(arg0);
		}
		
		
		if (arg0.getSource() == btnDisable) {// 2
			btnDisableActionPerformed(arg0);
		}
		
		
		
		if (arg0.getSource() == btnGetXY) {// 3
			btnGetXYActionPerformed(arg0);
		}
		
		
	}
	
	// MagenTa 1
	protected void btnCreateActionPerformed(ActionEvent arg0) {
		if(btnGetXY.isVisible()) {
			btnGetXY.setVisible(false);
		}else {
			btnGetXY.setVisible(true);
		}
	}
	
	
	//Disable 2
	protected void btnDisableActionPerformed(ActionEvent arg0) {
		if(btnCreate != null) {
			contentPane.remove(btnCreate);
			btnCreate = null;
			revalidate();
			
			
		}else {
			contentPane.add(btnCreate, 0);
			revalidate();
		}
		
	}
	
	
	
	//GetXY 3
	protected void btnGetXYActionPerformed(ActionEvent arg0) {
		JButton btn = (JButton) arg0.getSource();
		FrameComponentEx parent = (FrameComponentEx) btn.getTopLevelAncestor();
		parent.setTitle(btn.getX() + ", " + btn.getY());
	}
}
