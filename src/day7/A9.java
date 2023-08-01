package day7;

public class A9 {
	public static void main(String[] args) {
		A8 a=new A8();
		int[] x=a.readArray();
		System.out.println("user enter array");
		a.display(x);
		int pc=a.countprime(x);
		System.out.println("count:"+pc);
		
	}

}
