package practiceProj;

import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.Vector;

public class VectorEx {
	static List<Integer> A1 = null, A2 = null;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		A1 = new Vector<Integer>(5,5);
		A1 = saveEvenNumbers(N);
		A2 = new Vector<Integer>(5,5);
		A2 = printEvenVector(A1);
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
	
	private static List<Integer> printEvenVector(List<Integer> evenList) {
		List<Integer> list = new Vector<Integer>();
		for(Integer i: evenList) {
			int x = i*2;
			list.add(x);
			System.out.print(x + ",");
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
	
	private static List<Integer> saveEvenNumbers(int N) {
		List<Integer> list = new Vector<Integer>();
		for(int i=2; i<= N; i++) {
			if(i%2 == 0) {
				list.add(i);
			}
		}
		return list;
	}
}
