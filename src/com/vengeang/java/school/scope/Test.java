package com.vengeang.java.school.scope;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		String msg="Hello";
		Printer print=msg1->{
//			msg="";
			System.out.println(msg1);
		};
		System.out.println(print);
	}
	public Printer test(){
		final String smg="Hello";
		Printer print=smg1->System.out.println(smg+": "+smg1);
//		smg="Hi";
		return print;
	}
}
