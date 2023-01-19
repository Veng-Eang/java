package com.vengeang.java.school.method.reference.book;

import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.ToIntFunction;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ToIntFunction<String> length1=str->str.length();
		
		//use method reference 			
		ToIntFunction<String> length2=   String::length;// String is the qualifier and length is the method name.
//									<Qualifier>::<MethodName>
		Function<Integer, String> func1=x->Integer.toBinaryString(x);
		System.out.println("This is use lanba expression= "+func1.apply(17));
		Function<Integer, String> func2=Integer::toBinaryString;
		System.out.println("This is use static method reference= "+func2.apply(17));
		Function<Integer, Integer> func3=Integer::valueOf;
		Function<String,Integer> func5=Integer::valueOf;
		BiFunction<String, Integer, Integer> func6=Integer::valueOf;
		System.out.println("Function 6= "+func6.apply("11", 2));
		System.out.println("Function 5= "+func5.apply("10"));
		System.out.println("Function 3="+func3.apply(10));
		BiFunction<Integer, Integer, Integer> func4=(a,b)->Integer.sum(a, b);
		Integer sumResult = func4.apply(10, 10);
		System.out.println("Sum is result= "+sumResult);
		String name="vengeang";
		int len1=length1.applyAsInt(name);
		int len2=length2.applyAsInt(name);
		System.out.println(len1+" "+len2);
		
	}

}
