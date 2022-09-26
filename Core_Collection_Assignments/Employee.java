package practiceProj;

public class Employee implements Comparable<Employee> {
	private Integer EmpId;
	private String EmpName;
	private String EmpEmail;
	private char EmpGender;
	private float EmpSalary;

	public Employee(Integer EmpId, String EmpName, String EmpEmail, char EmpGender, float EmpSalary) {
		super();
		this.EmpId = EmpId;
		this.EmpName = EmpName;
		this.EmpEmail = EmpEmail;
		this.EmpGender = EmpGender;
		this.EmpSalary = EmpSalary;
	}

	public Integer getEmpId() {
		return EmpId;
	}

	public String getEmpName() {
		return EmpName;
	}

	public String getEmpEmail() {
		return EmpEmail;
	}

	public char getEmpGender() {
		return EmpGender;
	}

	public float getEmpSalary() {
		return EmpSalary;
	}

	void GetEmployeeDetails() {
		System.out.println("Emp Id: " + this.getEmpId() + "\nEmp Name: " + this.getEmpName() + "\nEmp Email: " + this.getEmpEmail() + "\nEmp Gender: " + this.getEmpGender() + "\nEmp Salary: " + this.getEmpSalary());
	}

	@Override
	public int compareTo(Employee e) {
		return e.EmpId.compareTo(this.EmpId);
	}

	@Override
	public String toString() {
		return "Employee [EmpId=" + EmpId + ", EmpName=" + EmpName + ", EmpEmail=" + EmpEmail + ", EmpGender="
				+ EmpGender + ", EmpSalary=" + EmpSalary + "]";
	}

}