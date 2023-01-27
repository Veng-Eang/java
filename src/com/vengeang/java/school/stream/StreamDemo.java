package com.vengeang.java.school.stream;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class StreamDemo {
	static List<String> names=List.of("Dara","Thida","Davan","Cheata","Seyha","Dany","Thida");
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		collectDemo();
//		List<Integer> collect = names.stream()
////				.distinct()
//			.map(String::length)
////			.distinct()
//			.collect(Collectors.toList());//concrete
//		System.out.println(collect);
		
	}
	
	static void collectDemo() {
		Set<String> namesSet = names.stream()
		.collect(Collectors.toSet());
		System.out.println(namesSet);
	}
	static void distinct() {
		names.stream()
		.distinct()
		.forEach(System.out::println);
	}
	static void test() {
	long numberOfName=names.stream()
							.map(name->name.length())
							.count();
	System.out.println(numberOfName);
    }
}
