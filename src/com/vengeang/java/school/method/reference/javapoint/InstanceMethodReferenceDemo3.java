package com.vengeang.java.school.method.reference.javapoint;

import java.util.function.BiFunction;

public class InstanceMethodReferenceDemo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BiFunction<Integer, Integer, Integer> adder=new Arithmetic()::add;
		
		Integer result = adder.apply(10, 20);
		System.out.println(result);
	}
    static class Arithmetic{
		public int add(int a,int b) {
			return a+b;
		}
	}
}
