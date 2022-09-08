package practiceProj;

import java.util.ArrayList;
import java.util.Iterator;

public class StringArrayListEx {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		
		list.add("abc");
		list.add("123");
		list.add("xyz");
		
		printAll(list);
	}

	private static void printAll(ArrayList<String> list) {
		Iterator<String> it = list.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}
}
