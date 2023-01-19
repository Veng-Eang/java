package com.vengeang.java.school.method.reference.book;

//A functional interface that takes two reference arguments
//and returns a boolean result.

public interface MyFunc<T> {
	boolean func(T v,T v2);
}
