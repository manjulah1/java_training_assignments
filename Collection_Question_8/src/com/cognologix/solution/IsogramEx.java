package com.cognologix.solution;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class IsogramEx {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		String inputString = null;

		// take user input
		System.out.println("Enter the string:");
		inputString = userInput();

		// check whether given input is an isogram
		Boolean isIsogram = checkIsIsogram(inputString);
		if (isIsogram) {
			System.out.println("The given input string is an Isogram");
		} else {
			System.out.println("The given input string is not an Isogram");
		}
	}

	private static Boolean checkIsIsogram(String inputString) {
		String[] arr = inputString.split("");
		Set<String> set = new HashSet<String>(Arrays.asList(arr));
		if (inputString.length() == set.size()) {
			return true;
		} else {
			return false;
		}
	}

	private static String userInput() {
		String str = sc.nextLine();
		return str;
	}

}
