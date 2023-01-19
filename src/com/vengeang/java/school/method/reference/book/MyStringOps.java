package com.vengeang.java.school.method.reference.book;

public class MyStringOps {
	String strReverse2(String str) {
		return "Hello"+str;
	}
	String strReverse(String str) {
		String result="";
		int i;
		for(i=str.length()-1;i>=0;i--) {
			result+=str.charAt(i);
		}
		return result;
	}
}
