package swing_forsolo.uiframe;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.FlowLayout;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.GridLayout;
import javax.swing.border.TitledBorder;
import javax.swing.SwingConstants;
import java.awt.Color;

public class ContentPaneEx extends JFrame {

	private JPanel contentPane;


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

	public ContentPaneEx() {
		setTitle("J프레임씌작");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(450, 550, 348, 294);
		contentPane = new JPanel();
		contentPane.setBackground(Color.RED);
		contentPane.setBorder(new EmptyBorder(10, 20, 30, 40));
		setContentPane(contentPane);
		contentPane.setLayout(new FlowLayout(FlowLayout.CENTER, 30, 50));
		
		JButton btnNewButton = new JButton("왜않됨?");
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_2 = new JButton("먼데");
		contentPane.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("이거");
		contentPane.add(btnNewButton_3);
		
		JButton btnNewButton_1 = new JButton("불가능");
		contentPane.add(btnNewButton_1);
	}

}
