package Deafult_customized_sorting_customized_Classes;

import java.util.TreeSet;

public class CompBLCompTR {

	public static void main(String[] args) {
		Employee e1 = new Employee("Anu", 21);
		Employee e2 = new Employee("Manu", 40);
		Employee e3 = new Employee("Tanu", 51);
		Employee e4 = new Employee("Kanu", 01);
		Employee e5 = new Employee("Ranu", 02);
		Employee e6 = new Employee("Anu", 21);
		
		TreeSet t = new TreeSet();
		t.add(e1);
		t.add(e2);
		t.add(e3);
		t.add(e4);
		t.add(e5);
		t.add(e6);
		System.out.println(t);
		
		TreeSet t1 = new TreeSet(new MyComparator());
		t1.add(e1);
		t1.add(e2);
		t1.add(e3);
		t1.add(e4);
		t1.add(e5);
		t1.add(e6);
		System.out.println(t1);
	}

}
