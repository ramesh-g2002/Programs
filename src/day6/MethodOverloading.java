package day6;

public class MethodOverloading {
	public static void main(String[] args) {
		test(2);
		test(2.3);
		test(true);
		test(2,4);
	}

	private static void test(int i, int j) {
		// TODO Auto-generated method stub
		System.out.println("bye");
	}

	private static void test(boolean b) {
		// TODO Auto-generated method stub
		System.out.println("am");
	}

	private static void test(double d) {
		// TODO Auto-generated method stub
		System.out.println("Hello");
	}

	private static void test(int i) {
		// TODO Auto-generated method stub
		System.out.println("Hii");
		
	}

}
