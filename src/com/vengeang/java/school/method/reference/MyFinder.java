package com.vengeang.java.school.method.reference;

public class MyFinder implements Finder{

	@Override
	public int find(String source, String textToFind) {
		// TODO Auto-generated method stub
		return source.indexOf(textToFind);
	}

}
