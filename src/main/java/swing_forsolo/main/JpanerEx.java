package swing_forsolo.main;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import swing_study.panel.Department;
import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.BoxLayout;
import java.awt.FlowLayout;
import javax.swing.border.TitledBorder;
import swing_study.panel.DeptPanel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

@SuppressWarnings("serial")
public class JpanerEx extends JFrame implements ActionListener {

	private JPanel contentPane;
	private Department dept;
	private JButton btnSetDept;
	private JButton btnGetDept;
	private JButton btnClear;
	private JButton btnSetDept_1;
	private DeptPanel pDept;
	private JButton btnGetDept_1;
	private JButton btnClear_1;
	
	public JpanerEx(){
		initialize();
		
	}
	
	
	private void initialize(){
		setTitle("gridLayOut");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		pDept = new DeptPanel();
		contentPane.add(pDept);
		pDept.setLayout(new GridLayout(0, 2, 10, 10));
		
		JPanel Jpanel = new JPanel();
		contentPane.add(Jpanel, BorderLayout.SOUTH);
		
		btnSetDept_1 = new JButton("부서 세팅");
		btnSetDept_1.addActionListener(this);
		Jpanel.add(btnSetDept_1);
		
		btnGetDept_1 = new JButton("부사가져오기");
		btnGetDept_1.addActionListener(this);
		Jpanel.add(btnGetDept_1);
		
		btnClear_1 = new JButton("초기화");
		btnClear_1.addActionListener(this);
		Jpanel.add(btnClear_1);
	
		
	}
			
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnClear_1) {
			btnClear_1ActionPerformed(e);
		}
		if (e.getSource() == btnGetDept_1) {
			btnGetDept_1ActionPerformed(e);
		}
		if (e.getSource() == btnSetDept_1) {
			btnDeptNoActionPerformed(e);
		}
	}
	protected void btnDeptNoActionPerformed(ActionEvent e) {
		Department dept = new Department(1, "기획", 10);
		pDept.setDepartment(dept);
	}
	
	
	protected void btnGetDept_1ActionPerformed(ActionEvent e) {
		Department dept = pDept.getDepartment();
		JOptionPane.showMessageDialog(null, dept);
	}
	protected void btnClear_1ActionPerformed(ActionEvent e) {
		pDept.clearTf();
	}
}
