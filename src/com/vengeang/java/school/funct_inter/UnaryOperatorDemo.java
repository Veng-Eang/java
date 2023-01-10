package com.vengeang.java.school.funct_inter;

import java.util.function.Function;
import java.util.function.UnaryOperator;

public class UnaryOperatorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//same type or one type
		UnaryOperator<String> toUppercase=text->text.toUpperCase();
		System.out.println(toUppercase.apply("vengeang"));
		//===================
		
		UnaryOperator<Integer> power=n->n*n;
		System.out.println(power.apply(3));
		
		//andThan
		
		Function<String, Integer> nameLength=name->name.length();
		Function<Integer, Integer> powerName=n->n*n;
		System.out.println(nameLength.andThen(powerName).apply("eang"));
		
		
	}

}
