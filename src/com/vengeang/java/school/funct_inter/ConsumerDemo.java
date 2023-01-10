package com.vengeang.java.school.funct_inter;

import java.util.List;
import java.util.function.Consumer;

public class ConsumerDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
//		Represents an operation that accepts a single input argument and returns no result. 
		Consumer<String> print=text->System.out.println(text);
		print.accept("Hello World");
		List<Integer> list=List.of(23, 30, 50, 35, 49);
		Consumer<List<Integer>> disply=intList->{
			System.out.println("================");
			System.out.println(intList);
		};
		disply.accept(list);
		Consumer<Integer> display2=num->System.out.println(num);
		list.forEach(display2);
		System.out.println("===================");
		list.forEach(n->System.out.println(n));
		System.out.println("=====method reference");
		list.forEach(System.out::println);
		
//		normal for loop
		System.out.println("========use normal for loop=========");
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i));
			if(list.get(i)%2==0) {
				System.out.println("even");
			}
		}
		
//		use consumer
		System.out.println("========use consumer========");
		
		Consumer<Integer> display3=num->{
			System.out.println(num);
			if(num%2==0) {
				System.out.println("even");
			}
		};
		
		list.forEach(display3);
		System.out.println("===++++=====");
		for(int i=0;i<list.size();i++) {
			display3.accept(list.get(i));
		}
		System.out.println("----------------");
		for(Integer t : list) {
			display3.accept(t);
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
