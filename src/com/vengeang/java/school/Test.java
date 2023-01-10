package com.vengeang.java.school;

public interface Test {
	void show();
	default void show2(String name) {
		
	}
	static int getNum() {
		return 2;
	}
}
