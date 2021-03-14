package collections.interfaces;

import java.util.ArrayList;

public class Test_Arraylist {
	public static void main(String[] args) {
		ArrayList AL = new ArrayList();
		System.out.println(AL.size());
		AL.add("A");
		AL.add(10);
		AL.add("A");
		AL.add(null);
		System.out.println(AL.size());
		System.out.println(AL);
		AL.add("tuntuni");
		System.out.println(AL.size());
		System.out.println(AL);
	}

}
