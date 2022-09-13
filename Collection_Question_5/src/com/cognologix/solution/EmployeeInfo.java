package com.cognologix.solution;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import com.cognologix.entity.Employee;

public class EmployeeInfo {
	public static void main(String[] args) {
		List<Employee> employeeList = new ArrayList<Employee>();
		employeeList = addEmployees();

		// iterate to get all depts
		List<String> deptList = new ArrayList<String>();
		deptList = getDepartments(employeeList);

		// iterate on deptList and employeeList to get the highest salary for each dept
		Map<String, Integer> highestSalaryArr = calcHighestSalary(employeeList, deptList);
		System.out.println(highestSalaryArr);
	}

	private static Map<String, Integer> calcHighestSalary(List<Employee> employeeList, List<String> deptList) {
		Integer highestSal = 0;
		Employee highestPaidEmployee = null;
		Map<String, Integer> salList = new HashMap<String, Integer>();
		for (Iterator iterator = deptList.iterator(); iterator.hasNext();) {
			String dept = (String) iterator.next();
			for (Iterator iterator2 = employeeList.iterator(); iterator2.hasNext();) {
				Employee emp = (Employee) iterator2.next();
				if (dept.equalsIgnoreCase(emp.getEmpDept())) {
					if (emp.getEmpSalary() > highestSal) {
						highestSal = emp.getEmpSalary();
						highestPaidEmployee = emp;
					}
				}
			}
			salList.put(dept, highestPaidEmployee.getEmpId());
			highestSal = 0;
		}
		return salList;
	}

	private static List<String> getDepartments(List<Employee> employeeList) {
		List<String> list = new ArrayList<String>();
		for (Iterator iterator = employeeList.iterator(); iterator.hasNext();) {
			Employee employee = (Employee) iterator.next();
			if (list.contains(employee.getEmpDept()) == false) {
				list.add(employee.getEmpDept());
			}
		}
		return list;
	}

	private static List<Employee> addEmployees() {
		List<Employee> list = new ArrayList<Employee>();
		Employee emp1 = new Employee(22, "Rajan Anand", "Engineering", 1600000);
		Employee emp2 = new Employee(23, "Swati Patil", "Testing", 800000);
		Employee emp3 = new Employee(27, "Vijay Chawda", "Engineering", 800000);
		Employee emp4 = new Employee(29, "Basant Mahapatra", "Engineering", 600000);
		Employee emp5 = new Employee(32, "Ajay Patel", "Testing", 350000);
		Employee emp6 = new Employee(34, "Swaraj Birla", "Testing", 350000);

		list.add(emp1);
		list.add(emp2);
		list.add(emp3);
		list.add(emp4);
		list.add(emp5);
		list.add(emp6);

		return list;
	}
}
