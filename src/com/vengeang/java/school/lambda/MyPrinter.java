package com.vengeang.java.school.lambda;

@FunctionalInterface
public interface MyPrinter {
	void print(String t);
//	void show();
	default void display(String t) {
		System.out.println("default hello ,"+t);
	}
}
