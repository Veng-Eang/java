package com.vengeang.java.school.method.reference.book;

import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class TestInstanceMethodReference {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		P1 p1=new P1();
		P2 p2=new P2();
		Predicate<Integer> pred1=p1::greaterThan7;
		Predicate<Integer> pred2=p2::isOod;
		System.out.println(pred1.test(10));
		System.out.println(pred2.test(10));
		Supplier<Integer> lengthName="vengeang"::length;
		System.out.println(lengthName.get());
		Consumer<String> name=System.out::println;
		name.accept("vengeang");
//		use lambda 
//		Function<String, Integer> strLengthFunc=(s)->s.length();
		
//		use unbound receiver Method reference
		Function<String, Integer> strLengthFunc=String::length;
		String greeting="Hello ,";
		String myName="Vengeang";
		Integer strLen = strLengthFunc.apply(myName);
		System.out.println("Name: "+myName+", Length: "+strLen);
//		use lambda 
//		BiFunction<String, String, String> concat=(a,b)->a.concat(b);
		BiFunction<String, String, String> concat=String::concat;
		String greetingName = concat.apply(greeting, myName);
		System.out.println(greetingName);
	}
}
