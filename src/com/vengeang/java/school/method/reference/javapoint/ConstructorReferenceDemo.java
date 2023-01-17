package com.vengeang.java.school.method.reference.javapoint;

public class ConstructorReferenceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Messageable hello=Message::new;
		hello.getMessage("Hello");
	}
	interface Messageable{
		Message getMessage(String smg);
	}
	static class Message{
		public Message(String msg) {
			// TODO Auto-generated constructor stub
			System.out.println(msg);
		}
	}
	
}
