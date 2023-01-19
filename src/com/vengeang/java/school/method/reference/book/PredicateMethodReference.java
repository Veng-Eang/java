package com.vengeang.java.school.method.reference.book;

import java.util.function.Predicate;

public class PredicateMethodReference {

	public static void main(String[] args) {
		Predicate<Integer> trueOrfalse1=x->x>9;
		if(trueOrfalse1.test(10)) {
			System.out.println("10 > 9");
		}
		Predicate<Integer> trueOrfalse2=PredicateMethodReference::myTest;
		if(trueOrfalse2.test(10)) {
			System.out.println("10>9");
		}
	}
	static boolean myTest(Integer x) {
		return x>9;
	}
}
