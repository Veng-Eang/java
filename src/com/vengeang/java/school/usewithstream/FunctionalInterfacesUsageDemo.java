package com.vengeang.java.school.usewithstream;

import java.util.List;

public class FunctionalInterfacesUsageDemo {

	public static void main(String[] args) {
		List<String> names=List.of("veng","eang","nitta","ta","tida","seyha");
		
		
		
		
		names.stream()
			.forEach(name->System.out.println(name));
		
//		names.stream()
//			.map(name->name.toUpperCase())
//			.forEach(name->System.out.println(name));
		
		
//		names.stream()
//			.map(name->name.toUpperCase())
//			.filter(name->name.length()>4)
//			.forEach(System.out::println);
		
		

	}

}
