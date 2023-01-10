package com.vengeang.java.school.funct_inter;

import java.util.function.Function;

public class FunctionalInterfaceFromJavaDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Function<String, Integer> getLength=new ToLength();
		int length=getLength.apply("Dara is a student");
		System.out.println(length);
		//======================
		
		Function<String, Integer> getLength2=name->name.length();
		System.out.println(getLength2.apply("dara"));
		//===================
		//print first char
		
		Function<String, Character> firstChar=text->text.charAt(0);
		System.out.println(firstChar.apply("Eang"));
		//=================
		//4=>16
		//3=>9
		
		Function<Integer, Integer> power=n->n*n;
		System.out.println(power.apply(4));
		System.out.println(power.apply(3));
		//=====================
		//dara=>4=>16
		
		Function<String, Integer> toLengthName=name->name.length();
		Function<Integer, Integer> powerName=n->n*n;
		System.out.println(toLengthName.andThen(powerName).apply("eang"));
		
	}
	static class ToLength implements Function<String, Integer>{

		@Override
		public Integer apply(String t) {
			// TODO Auto-generated method stub
			return t.length();
		}
	}
	
}
