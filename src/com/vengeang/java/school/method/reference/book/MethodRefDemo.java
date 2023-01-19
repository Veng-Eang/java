package com.vengeang.java.school.method.reference.book;

public class MethodRefDemo {

	static String stringOps(StringFunc sf ,String s) {
		return sf.func(s);
	}
	public static void main(String[] args) {
		String inStr="Static method reference";
		String outStr;
		StringFunc strRef=MyStringOps::strReverse;
		outStr=stringOps(strRef, inStr);
		System.out.println(inStr);
		System.out.println(outStr);
	}
	interface StringFunc{
		String func(String s);
	}
	class MyStringOps{
		static String strReverse(String str) {
			String result="";
			int i;
			for(i=str.length()-1;i>=0;i--) {
				result+=str.charAt(i);
			}
			return result;
		}
	}
}
