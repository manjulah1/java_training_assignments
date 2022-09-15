package com.cognologix.solution;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Anagram {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		String givenString;
		List<String> candidatesList = new ArrayList<String>();
		
		System.out.println("Enter a string: ");
		givenString = sc.nextLine();
		
		// get candidates list
		candidatesList = getCandidates();
		Iterator<String> it = candidatesList.iterator();
		
		char[] givenArray = givenString.toCharArray();
		Arrays.sort(givenArray);
		while(it.hasNext()) {
			String candidate = it.next();
			char[] candidateArr = candidate.toCharArray();
			Arrays.sort(candidateArr);			
			boolean isAnagram = Arrays.equals(givenArray, candidateArr);
			
			if(isAnagram) {
				System.out.println(candidate);
			}
		}
	}
	private static List<String> getCandidates() {
		List<String> list = new ArrayList<String>();
		list.add("enlists");
		list.add("google");
		list.add("inlets");
		list.add("banana");
		return list;
	}

}
