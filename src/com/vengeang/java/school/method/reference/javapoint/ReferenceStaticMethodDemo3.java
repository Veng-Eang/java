package com.vengeang.java.school.method.reference.javapoint;

import java.util.function.BiFunction;

//You can also use predefined functional interface to refer
//methods in the following example ,we are using BiFunction interface
//and using it's apply() method.
public class ReferenceStaticMethodDemo3 {
		public static void main(String[] args) {
			BiFunction<Integer, Integer, Integer> adder=Arithmetic::add;
			Integer result = adder.andThen(a->a*2).apply(10, 20);
			System.out.println(result);
		}
}
class Arithmetic{
	static int add(int a,int b) {
		return a+b;
	}
}