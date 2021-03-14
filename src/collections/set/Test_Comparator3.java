package collections.set;

import java.util.TreeSet;

public class Test_Comparator3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet t = new TreeSet(new MyComparatorStriBuff());
		t.add(new StringBuffer("A"));
		t.add(new StringBuffer("P"));
		t.add(new StringBuffer("T"));
		t.add(new StringBuffer("L"));
		t.add(new StringBuffer("M"));
		t.add(new StringBuffer("Z"));
		
		System.out.println(t);

	}

}
