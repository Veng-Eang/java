package com.vengeang.java.school.method.reference;

public class MethodReferenceDemo {

	public static void main(String[] args) {
		Finder finder=new MyFinder();
		String text="Welcom to Cambodia";
		int index=finder.find(text.toUpperCase(), "cam".toUpperCase());
		System.out.println(index);
		
		Finder finder2=(text1,text2)->text1.indexOf(text2);
		System.out.println(finder2.find("Hello", "ll"));
		
	}

}
