package collections.set;

import java.util.TreeSet;

public class Test_Comparator2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet t = new TreeSet(new MyComparatorStr());
		t.add("Samraj");
		t.add("Anant");
		t.add("Rahim");
		t.add("Isha");
		t.add("Zea");
		
		System.out.println(t);

	}

}
