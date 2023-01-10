package com.vengeang.java.school.funct_inter;

import java.util.function.Predicate;

public class PredicateDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Represents a predicate (boolean-valued function) of one argument.
//		Predicate<T>(ទស្សន៍ទាយ)
		
		Predicate<String> containA=text->text.toUpperCase().contains("A");
		String name="dara";
		System.out.println(containA.test(name));
	}

}
