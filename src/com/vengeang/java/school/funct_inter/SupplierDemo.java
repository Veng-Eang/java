package com.vengeang.java.school.funct_inter;

import java.util.List;
import java.util.Optional;
import java.util.function.Supplier;

public class SupplierDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name="vengeang";
		Supplier<String> nameSupplier=()->name;
		System.out.println(nameSupplier.get());
		
		List<Integer> list=List.of(27,33,93,201);
		Optional<Integer> firstEven=list.stream()
				.filter(n->n%2==0)
				.findFirst();
		System.out.println(firstEven.orElseGet(()->0)+1);
		
//		Optional String
		
		List<String> listName=List.of("veng","eng","oeng","nit");
		Optional<String> nameContain=listName.stream()
				.filter(n->n.contains("a"))
				.findFirst();
		System.out.println("Mr/Ms : "+nameContain.orElseGet(()->"vengeang"));
				
		
//		//Optional<T>
//		List<Integer> list=List.of(201,89,65,43);
//		Optional<Integer> firstEven = list.stream()
//			.filter(n->n%2==0)
//			.findFirst();
//		Integer firstSafe=firstEven.orElseGet(()->0);
//		Integer numberSeft=list.stream()
//				.filter(n->n%2==0)
//				.findFirst()
//				.orElseGet(()->0);
//		System.out.println(numberSeft);
////			.orElseGet(()->0);
//		System.out.println(firstSafe+10);
//		System.out.println("==================");
		
		
		
		
		
		
	}

}
