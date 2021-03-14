package collections.set;

import java.util.LinkedHashSet;

public class Test_LinkedHashSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedHashSet lh = new LinkedHashSet();
		lh.add("A");
		lh.add(10);
		lh.add(12);
		lh.add("D");
		lh.add(null);
		lh.add("B");
		System.out.println(lh);

	}

}
