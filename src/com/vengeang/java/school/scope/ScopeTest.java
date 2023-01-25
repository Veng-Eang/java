package com.vengeang.java.school.scope;

public class ScopeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ScopeTest test = new ScopeTest();
		Printer lambdaPrinter=test.getLambdaPrinter();
		lambdaPrinter.printer("This lambda");
		Printer anonymousPrinter=test.getAnonymousPrinter();
		anonymousPrinter.printer("This is anonymous class");
	}
	public Printer getLambdaPrinter() {
		System.out.println("This lambda expression");
		Printer print=msg->System.out.println(msg+": "+this.getClass());
		return print;
	}
	public Printer getAnonymousPrinter() {
		System.out.println("This is anonymous class");
		Printer print=new Printer() {
			
			@Override
			public void printer(String msg) {
				// TODO Auto-generated method stub
				System.out.println(msg+": "+this.getClass());
			}
		};
		return print;
	}
}
