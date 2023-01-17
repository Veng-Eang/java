package com.vengeang.java.school.method.reference.javapoint;

public class InstanceMethodReferenceDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread th=new Thread(new InstanceMethodReferenceDemo2()::printsmg);
		th.start();
	}
	public void printsmg() {
		System.out.println("Hello, this is instance method");
	}
	
}
