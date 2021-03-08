package swing_study.panel;

import javax.swing.JPanel;
import java.awt.GridLayout;
import java.awt.LayoutManager;

import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.TitledBorder;

@SuppressWarnings("serial")
public class DeptPanel extends JPanel {
	private JTextField tfDeptNo;
	private JTextField tfDeptName;
	private JTextField tfFloor;
	
	
	public DeptPanel() {
		initialize();
	}
	
	// 겟으로 가져오는거.
	public Department getDepartment() {
		int deptNo = Integer.parseInt(tfDeptNo.getText().trim());
		String deptName = tfDeptName.getText().trim();
		int floor = Integer.parseInt(tfFloor.getText().trim());
		return new Department(deptNo, deptName, floor);
		
	}
	// 셋으로 설정 하는것.
	public void setDepartment(Department department) {
		tfDeptNo.setText(department.getDeptNo()+ " ");// "" 가 스트링 타입으로 맞춰주기 위한것
		tfDeptName.setText(department.getDeptName());
		tfFloor.setText(department.getFloor()+ " ");
	}
	
	public void clearTf() { // 초기화 시켜주는 법.
		tfDeptNo.setText(" ");
		tfDeptName.setText(" ");
		tfFloor.setText(" ");
	}
	



	private void initialize(){
		setBorder(new TitledBorder(null, "\uBD80\uC11C \uC815\uBCF4", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		setLayout(new GridLayout(0, 2, 0, 0));
		
		JLabel lblDeptNo = new JLabel("부서번호");
		lblDeptNo.setHorizontalAlignment(SwingConstants.RIGHT);
		add(lblDeptNo);
		
		tfDeptNo = new JTextField();
		add(tfDeptNo);
		tfDeptNo.setColumns(10);
		
		JLabel lblDeptName = new JLabel("부서이름");
		lblDeptName.setHorizontalAlignment(SwingConstants.RIGHT);
		add(lblDeptName);
		
		tfDeptName = new JTextField();
		add(tfDeptName);
		tfDeptName.setColumns(10);
		
		JLabel lblFloor = new JLabel("위치");
		lblFloor.setHorizontalAlignment(SwingConstants.RIGHT);
		add(lblFloor);
		
		tfFloor = new JTextField();
		add(tfFloor);
		tfFloor.setColumns(10);

	}

}
