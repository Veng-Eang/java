package com.vengeang.java.school.method.reference.javapoint;

public class InstanceMethodReferenceDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MethodReference method=new MethodReference();
		Sayable printword=method::saySomething;
		printword.say();
		System.out.println("=====================");
		Sayable print=new MethodReference()::saySomething;
		print.say();
	}
	interface Sayable{
		void say();
	}
	static class MethodReference{
		void saySomething() {
			System.out.println("THiS IS INSTANCE METHOD REFERENCE");
		}
	}
}
