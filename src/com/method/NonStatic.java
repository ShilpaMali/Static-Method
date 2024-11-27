package com.method;

public class NonStatic {
	void getExample() {
		System.out.println("This is NonStatic()method");
	}
	public static void main(String[]args) {
		//to call non static method create object and call using objectname.methodname()
		NonStatic nonStatic = new NonStatic ();
		nonStatic.getExample();
	}

}
