package collections.set;

import java.util.TreeSet;

public class Test_Comparator1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet t = new TreeSet(new MyComparator());
		//TreeSet t = new TreeSet();
		t.add(10);
		t.add(1);
		t.add(14);
		t.add(11);
		t.add(9);
		t.add(9);
		
		System.out.println(t);

	}

}
