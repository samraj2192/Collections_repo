package collections.interfaces;

import java.util.Vector;

public class Test_Vector {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector v = new Vector();
		System.out.println("initial capacity" + v.capacity());
		
		for(int i=0; i<v.capacity(); i++) {
			v.addElement(i);
		}
		System.out.println(v);
		System.out.println("capacity after adding elements" + v.capacity());
		v.addElement("A");
		System.out.println("Capacity after adding 11th element" + v.capacity());
	}

}
