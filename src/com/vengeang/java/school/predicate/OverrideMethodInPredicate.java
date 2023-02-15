package com.vengeang.java.school.predicate;

import java.util.function.Predicate;

public class OverrideMethodInPredicate {
	public static void main(String[] args) {
		Predicate<String> chatOisA=x->x.charAt(0)=='a';
		Predicate<String> nullExceptionTest=new Predicate<String> (){

			@Override
			public boolean test(String t) {
				// TODO Auto-generated method stub
				return t.length()>4;
			}
			
			public Predicate<String> and(Predicate<? super String> p){
				return x->x==null?false:test(x)&&p.test(x);
				
			}
		};
		System.out.println(nullExceptionTest.and(chatOisA)
											.test("alpha")
				);
		System.out.println(nullExceptionTest.and(chatOisA)
											.test(null)
				);
	}

}
