package com.cognologix.entity;

public class Employee {
	private Integer EmpId;
	private String EmpName;
	private String EmpDept;
	private Integer EmpSalary;
	public Employee(Integer empId, String empName, String empDept, Integer empSal) {
		super();
		EmpId = empId;
		EmpName = empName;
		EmpDept = empDept;
		EmpSalary = empSal;
	}
	public Integer getEmpId() {
		return EmpId;
	}
	public void setEmpId(Integer empId) {
		EmpId = empId;
	}
	public String getEmpName() {
		return EmpName;
	}
	public void setEmpName(String empName) {
		EmpName = empName;
	}
	public String getEmpDept() {
		return EmpDept;
	}
	public void setEmpDept(String empDept) {
		EmpDept = empDept;
	}
	public Integer getEmpSalary() {
		return EmpSalary;
	}
	public void setEmpSalary(Integer empSalary) {
		EmpSalary = empSalary;
	}
	
	
}
