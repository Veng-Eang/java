package com.vengeang.java.school.method.reference.book;

import java.util.function.ToIntFunction;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ToIntFunction<String> length1=str->str.length();
		
		//use method reference 			
		ToIntFunction<String> length2=   String::length;// String is the qualifier and length is the method name.
//									<Qualifier>::<MethodName>
		String name="vengeang";
		int len1=length1.applyAsInt(name);
		int len2=length2.applyAsInt(name);
		System.out.println(len1+" "+len2);
	}

}
