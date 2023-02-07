package com.vengeang.java.school.FactoryPattern;

public class Client {
	Creator creator=new Creator();
	IProduct productA =creator.factory("A"); 
}
