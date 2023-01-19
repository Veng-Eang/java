package com.vengeang.java.school.method.reference.book;

public class InstanceMethodRefDemo {
	static String stringOps(StringFunc sf,String str) {
		return sf.func(str);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String inStr="HelloWorld";
		String outStr;
//		MyStringOps strFun=new MyStringOps();
		StringFunc strFun=new MyStringOps()::strReverse;
//		outStr=strOps.stringOps(inStr);
		outStr=stringOps(strFun, inStr);
		System.out.println(inStr);
		System.out.println(outStr);
	}
	
}
