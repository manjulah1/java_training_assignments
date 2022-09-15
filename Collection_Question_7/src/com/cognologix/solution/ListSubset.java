package com.cognologix.solution;

import java.util.ArrayList;
import java.util.List;

public class ListSubset {

	public static void main(String[] args) {
		List<Integer> list1 = new ArrayList<Integer>();
		List<Integer> list2 = new ArrayList<Integer>();
		int[] l1 = new int[] { 6, 7, 8, 9 };
		int[] l2 = new int[] { 1, 2, 3, 4 };
		list1 = addNumbersToList(l1);
		list2 = addNumbersToList(l2);

		// check if list2 is a subset of list1
		checkSubList(list1, list2);
	}

	private static void checkSubList(List<Integer> list1, List<Integer> list2) {
		if (list1.size() > list2.size()) {
			if (list1.containsAll(list2)) {
				System.out.println("List1 is a superlist of List2");
			} else {
				System.out.println("List1 is not a superlist of List2");
			}
		} else if (list1.size() < list2.size()) {
			if (list2.containsAll(list1)) {
				System.out.println("List2 is a superlist of List1");
			} else {
				System.out.println("List2 is not a superlist of List1");
			}
		} else if (list1.size() == list2.size()) {
			if (list1.containsAll(list2)) {
				System.out.println("List1 is equal to List2");
			} else {
				System.out.println("List1 is not equal to List2");
			}
		}
	}

	private static List<Integer> addNumbersToList(int[] arr) {
		List<Integer> list = new ArrayList<Integer>();
		for (int i = 0; i < arr.length; i++) {
			list.add(arr[i]);
		}
		return list;
	}

}
