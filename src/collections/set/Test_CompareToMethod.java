package collections.set;

public class Test_CompareToMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("A".compareTo("C"));
		System.out.println("Z".compareTo("C"));
		System.out.println("C".compareTo("C"));
		System.out.println("A".compareTo(null));//NullPointerException
	}

}
