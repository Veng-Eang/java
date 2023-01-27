package com.vengeang.java.school.testadapterpattern;

public class Client {
	public static void test() {
		RussianTranslator dany=new RussianTranslator();
		dany.originalSpeech();
		dany.translate();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		test();
	}

}
