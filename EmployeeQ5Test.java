package practiceProj;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class EmployeeQ5Test {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<EmployeeQ5> list = new ArrayList<EmployeeQ5>();
		
		EmployeeQ5 emp1 = new EmployeeQ5(1, "Manjula", "Kothrud, Pune", 50000.00f);
		EmployeeQ5 emp2 = new EmployeeQ5(2, "XYZ", "XYZ, Pune", 60000.00f);
		EmployeeQ5 emp3 = new EmployeeQ5(3, "ABC", "ABC, Pune", 70000.00f);
		
		list.add(emp1);
		list.add(emp2);
		list.add(emp3);
		
		Iterator<EmployeeQ5> it = list.iterator();
		
		System.out.println("Enter an employee id to search");
		Integer empid= sc.nextInt();
		
		while(it.hasNext()) {
			EmployeeQ5 e = it.next();
			if(e.getEmpId() == empid) {
				System.out.println(e.toString());
			}
		}
	}
}
