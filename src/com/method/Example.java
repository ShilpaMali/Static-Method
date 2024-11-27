package com.method;

public class Example {
	String getStudentName(String name) {
		return name;
	}
	public static void main(String[]args) {
		Example example = new Example();
		String s=example.getStudentName("Siya");
		System.out.println(s);
	}

}
