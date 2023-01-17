package com.vengeang.java.school.lambda;

@FunctionalInterface
public interface Info {
	void showInfo();
	default void show(String name) {
		System.out.println("Hello "+name);
	}
}
