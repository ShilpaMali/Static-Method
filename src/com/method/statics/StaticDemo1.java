package com.method.statics;

public class StaticDemo1 {
	static void getStatic() {
		System.out.println("This is Static() method");
	}
	public static void main(String[] args) {
		/*3 ways to call Static method
		1st way: Using Classname
		         classname.methodname  */
		StaticDemo1.getStatic();
		
		/*2nd way: Using Objectname
                   Objectname.methodname  */
		StaticDemo1 staticDemo1 = new StaticDemo1();        //object created
        staticDemo1.getStatic();                            //method call
        
        /*2nd way: Direct way
                   Methodname  */
        getStatic();
		
	}

}
