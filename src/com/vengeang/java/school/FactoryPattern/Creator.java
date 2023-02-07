package com.vengeang.java.school.FactoryPattern;

public class Creator {
	public IProduct factory(String proName) {
		if(proName=="A") {
			return new ProductA();
		}
		if(proName=="B") {
			return new ProductB();
		}
		return null;
	}
}
