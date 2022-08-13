package test;

public class Recursion {
	static void f(int n) {
		if(n<=1)
			return;
		f(n-1);
		System.out.println(n);
		//f(n-1);
	}
	public static void main(String[] args) {
		f(5);
	}

}
