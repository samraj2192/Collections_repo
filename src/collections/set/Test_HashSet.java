package collections.set;

import java.util.HashSet;

public class Test_HashSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet h = new HashSet();
		h.add("E");
		h.add("B");
		h.add("A");
		h.add(10);
		h.add("C");
		h.add(null);
//		h.add("A"); // no run time or compile time error
//		System.out.println(h.add("A")); // False
		System.out.println(h);
		

	}

}
