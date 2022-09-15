package practiceProj;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class CollectionsEx1 {
	static ArrayList<Integer> A1 = null;
	static ArrayList<Integer> A2 = null;
	

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		A1 = saveEvenNumbers(N);
		A2 = printEvenArrayList(A1);
		System.out.println("Enter a number to search");
		int enteredNumber = sc.nextInt();
		int searchResponse = printEvenNumber(enteredNumber);
		if(searchResponse != 0) {
			System.out.println(searchResponse);
		} else {
			System.out.println("0");
		}

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

	private static ArrayList<Integer> printEvenArrayList(ArrayList<Integer> evenList) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		for(Integer i: evenList) {
			int x = i*2;
			list.add(x);
			System.out.print(x + ",");
		}
		return list;
	}

	private static ArrayList<Integer> saveEvenNumbers(int N) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		for(int i=2; i<= N; i++) {
			if(i%2 == 0) {
				list.add(i);
			}
		}
		return list;
	}

}
