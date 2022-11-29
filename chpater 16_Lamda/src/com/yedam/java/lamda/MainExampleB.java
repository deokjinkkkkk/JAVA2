package com.yedam.java.lamda;

public class MainExampleB {
	
	public static void main(String[] args) {
		MyInterfaceB fib = (x, y) -> { int result = x + y;
										return result;};
										
		System.out.println(fib.method(10, 25));
		
		fib = (x, y) -> { return x + y;};
		
		fib = (x, y) -> x + y;
		
		fib = (x, y) -> sum(x, y);
		
		// fib = (x, y) -> { return sum(x, y);};
		
		
	}
	
	public static int sum(int x, int y) {
		return x + y;
	}
}
