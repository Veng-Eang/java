package com.vengeang.java.school.scope;

public class VariableCapture {
	private int counter=0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		VariableCapture vc1=new VariableCapture();
		VariableCapture vc2=new VariableCapture();
		Printer p1=vc1.createLambda(1);
		Printer p2=vc2.createLambda(100);
		p1.printer("Lambda 1");
		p1.printer("Lambda 1");
		p1.printer("Lambda 1");
		p1.printer("Lambda 1");
		p2.printer("Lambda 2");
		p2.printer("Lambda 2");
		p2.printer("Lambda 2");
		p2.printer("Lambda 2");
	}
	public Printer createLambda(int incrementBy) {
		Printer printer=msg->{
			counter+=incrementBy;
			System.out.println(msg+": counter= "+counter);
		};
		return printer;
	}
}
