package collections.interfaces;

import java.util.Stack;

public class Test_Stack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack s = new Stack();
		s.push("A");
		s.push("B");
		s.push("C");
		s.push("D");
		s.push("E");
		System.out.println(s);
		System.out.println(s.search("D"));
		System.out.println(s.search("Z"));

	}

}
