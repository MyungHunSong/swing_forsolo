package swing_forsolo.main;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import swing_forsolo.component.FrameComponentEx;
import swing_forsolo.layout.FrameLayout;
import swing_forsolo.layout.LayoutGuBun;
import swing_forsolo.uiframe.ContentPaneEx;

import javax.swing.JButton;
import java.awt.GridLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class SwingMain extends JFrame implements ActionListener {

	private JPanel contentPane;
	private JButton btn01;
	private JButton btn02;
	private JPanel pLayOut;
	private JButton btnFlowLayOut;
	private JButton btnBorderLayOut;
	private JButton btnGridLayOut;
	private JButton btnAbsoulteLayOut;
	private JButton btn03;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SwingMain frame = new SwingMain();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public SwingMain() {

		initialize();
	}
	private void initialize() {
		setTitle("공부할것들");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 841, 516);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new GridLayout(0, 5, 10, 10));
		
		
		// btn01
		btn01 = new JButton("Jframe01예");
		btn01.addActionListener(this);
		
				contentPane.add(btn01);
		
		
		// btn02
		btn02 = new JButton("Jframe02예");
		btn02.addActionListener(this);
		
			contentPane.add(btn02);
		
		pLayOut = new JPanel();
		contentPane.add(pLayOut);
		pLayOut.setLayout(new GridLayout(0, 1, 0, 0));
		
		btnFlowLayOut = new JButton("플로우 레이아웃");
		btnFlowLayOut.addActionListener(this);
		pLayOut.add(btnFlowLayOut);
		
		btnBorderLayOut = new JButton("보더 레이아웃");
		btnBorderLayOut.addActionListener(this);
		pLayOut.add(btnBorderLayOut);
		
		btnGridLayOut = new JButton("그리드 레이아웃");
		btnGridLayOut.addActionListener(this);
		pLayOut.add(btnGridLayOut);
		
		btnAbsoulteLayOut = new JButton("절대 레이아웃");
		btnAbsoulteLayOut.addActionListener(this);
		pLayOut.add(btnAbsoulteLayOut);
		
		btn03 = new JButton("JComopnent");
		btn03.addActionListener(this);
		contentPane.add(btn03);
	}
	
	
	
	
	
	
	// --------------- 다른영역

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btn03) {
			btn03ActionPerformed(e);
		}
		if (e.getSource() == btnAbsoulteLayOut) {
			btnAbsoulteLayOutActionPerformed(e);
		}
		if (e.getSource() == btnGridLayOut) {
			btnGridLayOutActionPerformed(e);
		}
		if (e.getSource() == btnBorderLayOut) {
			btnBorderLayOutActionPerformed(e);
		}
		if (e.getSource() == btnFlowLayOut) {
			btnFlowLayOutActionPerformed(e);
		}
		if (e.getSource() == btn02) {
			btn02ActionPerformed(e);
		}
		if (e.getSource() == btn01) {
			btn01ActionPerformed(e);
		}
	}
	protected void btn01ActionPerformed(ActionEvent e) {
		ContentPaneEx frame = new ContentPaneEx();
		frame.setVisible(true);
	}
	protected void btn02ActionPerformed(ActionEvent e) {
		JpanerEx frame = new JpanerEx();
		frame.setVisible(true);
	}
	//----
	protected void btnFlowLayOutActionPerformed(ActionEvent e) {
		FrameLayout frame = new FrameLayout(LayoutGuBun.FLOW);
		frame.setVisible(true);
	}
	
	//----
	protected void btnBorderLayOutActionPerformed(ActionEvent e) {
		FrameLayout frame = new FrameLayout(LayoutGuBun.BORDER);
		frame.setVisible(true);
	}
	
	//----
	protected void btnGridLayOutActionPerformed(ActionEvent e) {
		FrameLayout frame = new FrameLayout(LayoutGuBun.GRID);
		frame.setVisible(true);
	}
	
	//----
	protected void btnAbsoulteLayOutActionPerformed(ActionEvent e) {
		FrameLayout frame = new FrameLayout(LayoutGuBun.ABSOLUTE);
		frame.setVisible(true);
	}
	
	// ------JComponent
	protected void btn03ActionPerformed(ActionEvent e) {
		FrameComponentEx frame = new FrameComponentEx();
		frame.setVisible(true);
	}
}
