package practiceProj;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class LinkedListEx {
	static List<Integer> A1 = null;
	static List<Integer> A2 = null;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		A1 = new LinkedList<Integer>();
		A1 = saveEvenNumbers(N);
		A2 = new LinkedList<Integer>();
		A2 = printEvenLinkedList(A1);
		System.out.println("Enter a number to search");
		int enteredNumber = sc.nextInt();
		int searchResponse = printEvenNumber(enteredNumber);
		if(searchResponse != 0) {
			System.out.println(searchResponse);
		} else {
			System.out.println("0");
		}
		sc.close();
	}

	private static List<Integer> printEvenLinkedList(List<Integer> a12) {
		List<Integer> list = new LinkedList<Integer>();
		Iterator<Integer> it = a12.iterator();
		while(it.hasNext()) {
			Integer i = it.next();
			Integer x = i*2;
			System.out.println(x);
			list.add(x);
		}
		return list;
	}

	private static List<Integer> saveEvenNumbers(int n) {
		List<Integer> list = new LinkedList<Integer>();
		for(int i = 2;i<=n ;i++) {
			if(i%2 == 0) {
				list.add(i);
			}
		}
		return list;
	}
	
	private static int printEvenNumber(int enteredNumber) {
		Iterator<Integer> it = A1.iterator();
		int x = 0;
		while(it.hasNext()) {
			Integer nextEle = it.next();
			if(nextEle == enteredNumber) {
				x = enteredNumber;
				break;
			} else {
				x = 0;
			}
		}
		return x;
	}

}
