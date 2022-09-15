package practiceProj;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class EmployeeTreeSetDB {
	static Set<Employee> empTreeSet = new TreeSet<Employee>();

	public boolean addEmployee(Employee e) {
		return empTreeSet.add(e);
	}

	public boolean deleteEmployee(Integer empId) {
		Iterator<Employee> it = empTreeSet.iterator();

		while (it.hasNext()) {
			Employee e = it.next();
			if (e.getEmpId() == empId) {
				return empTreeSet.remove(e);
			}
		}
		return false;
	}

	public String showPaySlip(Integer empId) {
		Iterator<Employee> it = empTreeSet.iterator();
		String paySlip;
		while (it.hasNext()) {
			Employee e = it.next();
			if (e.getEmpId() == empId) {
				paySlip = "Name: " + e.getEmpName() + "\nEmail: " + e.getEmpEmail() + "\nGender: " + e.getEmpGender()
						+ "\nSalary: " + e.getEmpSalary();
				return paySlip;
			}
		}
		return null;
	}

	Employee[] listAll() {
		int index = 0;
		Employee[] emp = new Employee[empTreeSet.size()];
		Iterator it = empTreeSet.iterator();
		while (it.hasNext()) {
			Employee e = (Employee) it.next();
			emp[index++] = e;
		}
		return emp;
	}
}
