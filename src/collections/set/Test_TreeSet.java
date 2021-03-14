package collections.set;

import java.util.*;

public class Test_TreeSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet t = new TreeSet();
		t.add("A");
		t.add("B");
		t.add("d");
		t.add("E");
		t.add("f");
		t.add("a");
		t.add(new Integer(10));
		//t.add(null);
		System.out.println(t);
	}

}
