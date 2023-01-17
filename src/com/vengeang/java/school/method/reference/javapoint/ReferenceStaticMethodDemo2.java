package com.vengeang.java.school.method.reference.javapoint;

public class ReferenceStaticMethodDemo2 {

	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		In the following example, We are using predefined 
//		functional interface runnable to refer static method

		Thread t2= new Thread(ReferenceStaticMethodDemo2::ThreadStatus);
		t2.start();
		
	}
	
	static void ThreadStatus() {
		System.out.println("this is thread");
	}

}
