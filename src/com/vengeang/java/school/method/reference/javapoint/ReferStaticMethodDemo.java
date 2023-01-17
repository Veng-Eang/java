package com.vengeang.java.school.method.reference.javapoint;

public class ReferStaticMethodDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Referring static method
		Sayable sayable=MethodReference::saySomething;
		
		//Calling interface method
		sayable.say();
	}
	interface Sayable{
		void say();
	}
	class MethodReference{
		static void saySomething() {
			System.out.println("This is static method");
		}
	}
	
}
