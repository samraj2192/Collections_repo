package collections.interfaces;

import java.util.LinkedList;

public class Test_linkedlist {

	public static void main(String[] args) {
		LinkedList L = new LinkedList<>();
		L.add(10);
		L.add("sam");
		L.add(null);
		L.add(10);
		L.add("sam");
		System.out.println(L);
		L.set(0, 11);
		L.add(1, "Vish");
		L.addFirst("Jai mata di");
		System.out.println(L);

	}

}
