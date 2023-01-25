package com.vengeang.java.school.method.reference.book;


//import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import java.util.function.Function;
//import java.util.function.Supplier;

public class ConstructorRefDemo {
	public static void main(String[] args) {
//		Supplier<String> func1=()->new String();
		Function<String, String> str=(st)->new String(st);
		String result = str.apply("Hello");
//		String str1 = func1.get();
//		Supplier<List<Integer>> func2=;
//		Function<String, List<String>> func4=(a)->List.of(a);
		Function<String, String> func3=String::new;
		System.out.println(func3.apply("vengeang"));
//		System.out.println(str1.valueOf(12));
		System.out.println(result);
//		Using constructor reference
		
		String[] namesArray= {"Jim","Ken","Li","arrey"};
		Function<String[], List<String>> asList=Arrays::<String>asList;
		List<String> namesList=asList.apply(namesArray);
		namesList.forEach(name->System.out.println(name));
//		After sorted
		System.out.println("==========after sorted============");
		namesList.stream()
				.map(nameCap->nameCap.toUpperCase())
				.sorted()
				.forEach(name->System.out.println(name));
//		namesList.forEach(System.out::println);
//		ArrayList<String> 
	}

}
