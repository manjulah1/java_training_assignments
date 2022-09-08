package practiceProj;

import java.util.ArrayList;

import java.util.Iterator;
import java.util.List;

public class EmployeeDB {
	static List<Employee> empList = new ArrayList<Employee>();
	
	public boolean addEmployee(Employee e) {
		return empList.add(e);
	}
	
	public boolean deleteEmployee(Integer empId) {
		Iterator<Employee> it = empList.iterator();
		
		while(it.hasNext()) {
			Employee e = it.next();
			if(e.getEmpId() == empId) {
				return empList.remove(e);
			}
		}
		return false;
	}
	
	public String showPaySlip(Integer empId) {
		Iterator<Employee> it = empList.iterator();
		String paySlip;
		while(it.hasNext()) {
			Employee e = it.next();
			if(e.getEmpId() == empId) {
				paySlip = "Name: " + e.getEmpName() + "\nEmail: " + e.getEmpEmail() + "\nGender: " + e.getEmpGender() + "\nSalary: " + e.getEmpSalary();
				return paySlip;
			}
		}
		return null;
	}
	
	Employee[] listAll() {
		int index = 0;
		Employee[] emp = new Employee[empList.size()];
		Iterator it = empList.iterator();
		while(it.hasNext()) {
			Employee e = (Employee) it.next();
			emp[index++] = e;
		}
		return emp;
	}
}
