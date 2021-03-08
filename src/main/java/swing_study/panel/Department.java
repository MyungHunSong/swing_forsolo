package swing_study.panel;

public class Department {
	
	private int deptNo;
	private String deptName;
	private int Floor;
	

	
	public Department() {
	
	}
	
	
	
	

	public Department(int deptNo) {
		super();
		this.deptNo = deptNo;
	}


	public Department(String deptName) {
		super();
		this.deptName = deptName;
	}



	public Department(int deptNo, String deptName, int floor) {
		this.deptNo = deptNo;
		this.deptName = deptName;
		Floor = floor;
	}

	public int getDeptNo() {
		return deptNo;
	}

	public void setDeptNo(int deptNo) {
		this.deptNo = deptNo;
	}

	public String getDeptName() {
		return deptName;
	}

	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}

	public int getFloor() {
		return Floor;
	}

	public void setFloor(int floor) {
		Floor = floor;
	}

	@Override
	public String toString() {
		return String.format("%s", deptName);
	}
	
	
	
	
	
	
}
