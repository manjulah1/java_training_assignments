package practiceProj;

import java.util.ArrayList;
import java.util.List;

class Numbersonly {
	private long num;
	private double num1;

	Numbersonly(int n, double d) {
		num = n;
		num1 = d;
	}

	public String toString() {
		return +num + "\n" + num1;
	}
}

public class DoubleArrayListEx {
	public static void main(String args[]) {
		List<Numbersonly> al = new ArrayList<Numbersonly>();
		al.add(new Numbersonly(2, 4.5));
		al.add(new Numbersonly(7, 8.0));
		al.add(new Numbersonly(8923, 0.07));

		for (Numbersonly element : al)
			System.out.println(element + "\n");
	}
	
	public void method(List<Numbersonly> list) {
		
	}
}










//class NumberDT {
//	long longNum;
//	double doubleNum;
//
//	NumberDT(long num1, double num2) {
//		longNum = num1;
//		doubleNum = num2;
//	}
//
//	@Override
//	public String toString() {
//		return "NumberDT [longNum=" + longNum + ", doubleNum=" + doubleNum + "]";
//	}
//
//}
//
//public class DoubleArrayListEx {
//
//	public static void main(String[] args) {
//		ArrayList<NumberDT> list = new ArrayList<NumberDT>();
//
//		list.add(1L, 3.14);
//		list.add(28.54);
//		list.add(0.265333333);
//		list.add(1.00009);
//
//		for (int i = 0; i < list.size(); i++) {
//			System.out.println(list.get(i));
//		}
//
//	}
//
//}
