package com.vengeang.java.school.lambda;

public class LambdaDemo {

	public static void main(String[] args) {
		MyPrinter printer=(text)->System.out.println("Hello, "+text);
		printer.print("venng");
		MyPrinter printerInnerClass=new MyPrinter() {
			
			@Override
			public void print(String t) {
				// TODO Auto-generated method stub
				System.out.println("Inner class hello ,"+ t);
			}
		};
		printerInnerClass.display("eang");
		/*
		 * 1. Functional Interface
		 * 2. Parameter of lambda must be the as in method of interface
		 * 3. Same return type 
		 */
		Info myInfo=()->System.out.println("Company Information");
		myInfo.showInfo();
		
	}
}
