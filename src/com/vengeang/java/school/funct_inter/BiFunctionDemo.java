package com.vengeang.java.school.funct_inter;

import java.util.function.BiFunction;

public class BiFunctionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Dara,2=>16
		//4 ,2
		
		BiFunction<String, Integer, Integer> lengthAndPower=(text,power)->(int)Math
																.pow(text.length(), power);
		System.out.println(lengthAndPower.apply("eang", 2));
		BiFunction<String, String, String> stringcon=(first,last)->first+" "+last;
		System.out.println(stringcon.apply("oeng", "vengeang"));
	}

}
