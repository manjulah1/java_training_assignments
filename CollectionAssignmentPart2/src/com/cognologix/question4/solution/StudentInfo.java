package com.cognologix.question4.solution;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.cognologix.question4.entity.Student;

public class StudentInfo {

	public static void main(String[] args) {
		List<Student> studentList = new ArrayList<Student>(); 
		studentList = addStudents();
		
		//iterate through each student and access the lowest stud id records
		List<Student> lowestIdStudRecords = fetchLowestIdRecords(studentList);
		
		// calculate average
		Double average = calculateAvgOfLowestStudId(lowestIdStudRecords);
		System.out.println("The Average marks scored across all subjects by the student with lowest Id: " + average);
	}

	private static Double calculateAvgOfLowestStudId(List<Student> lowestIdStudRecords) {
		Double average = 0.0;
		Integer sum = 0;
		for (Iterator iterator = lowestIdStudRecords.iterator(); iterator.hasNext();) {
			Student student = (Student) iterator.next();
			sum += student.getMarks();
		}
		average = (double) (sum/lowestIdStudRecords.size());
		return average;
	}

	private static List<Student> fetchLowestIdRecords(List<Student> studentList) {
		List<Student> lowestIdStudList = new ArrayList<Student>();
		Integer lowestId = studentList.get(0).getStudentId();
		for (Iterator iterator = studentList.iterator(); iterator.hasNext();) {
			Student student = (Student) iterator.next();
			if(student.getStudentId() < lowestId) {
				lowestId = student.getStudentId();
			}
		}
		for (Iterator iterator = studentList.iterator(); iterator.hasNext();) {
			Student student = (Student) iterator.next();
			if(student.getStudentId() == lowestId) {
				lowestIdStudList.add(student);
			}
		}
		System.out.println(lowestIdStudList.toString());
		return lowestIdStudList;
	}

	private static List<Student> addStudents() {
		List<Student> list = new ArrayList<Student>();
		Student student1 = new Student(22, "Data Structures", 45);
		Student student2 = new Student(23, "English", 52);
		Student student3 = new Student(22, "English", 51);
		Student student4 = new Student(26, "Data Structures", 72);
		Student student5 = new Student(23, "Data Structures", 61);
		Student student6 = new Student(24, "English", 81);	
		list.add(student1);
		list.add(student2);
		list.add(student3);
		list.add(student4);
		list.add(student5);
		list.add(student6);
		return list;
	}

}
