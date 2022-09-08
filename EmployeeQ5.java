package practiceProj;

public class EmployeeQ5 {
	private Integer empId;
	private String empName;
	private String empAddress;
	private float empSal;
	
	public EmployeeQ5(Integer empId, String empName, String empAddress, float empSal) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empAddress = empAddress;
		this.empSal = empSal;
	}

	@Override
	public String toString() {
		return "EmployeeQ5 [empId=" + empId + ", empName=" + empName + ", empAddress=" + empAddress + ", empSal="
				+ empSal + "]";
	}

	public Integer getEmpId() {
		return empId;
	}

	public String getEmpName() {
		return empName;
	}

	public String getEmpAddress() {
		return empAddress;
	}

	public float getEmpSal() {
		return empSal;
	}
	
	
	
}
