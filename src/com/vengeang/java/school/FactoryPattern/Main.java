package com.vengeang.java.school.FactoryPattern;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Client test=new Client();
//		test.productA.create();
		Creator cr=new Creator();
		cr.factory("B").create();
		cr.factory("A").create();
	}

}
