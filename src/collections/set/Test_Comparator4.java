package collections.set;

import java.util.TreeSet;

public class Test_Comparator4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet t = new TreeSet(new MyComparatorStrStringBuff());
		t.add("A");
		t.add(new StringBuffer("AS"));
		t.add(new StringBuffer("B"));
		t.add(new StringBuffer("W"));
		t.add(new StringBuffer("YT"));
		t.add("AX");
		t.add("WWA");
		t.add("A");
		
		System.out.println(t);

	}

}
