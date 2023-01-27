package com.vengeang.java.school.stream;

//import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Student> students=List.of(
				new Student("Dara",23,List.of("Eng","Math")),
				new Student("Thida",23,List.of("Che","Math","Khmer")),
				new Student("Cheata",23,List.of("Eng","Japan")),
				new Student("Sopeak",23,List.of("Phy","Math"))
				);
//		find all subject
//		students.stream()
//				.map(st->st.getSubject())
//				.collect(Collectors.toList());
		List<String> collect = students.stream()
				.flatMap(st->st.getSubject().stream())
				.distinct()
				.sorted()
				.collect(Collectors.toList());
		System.out.println(collect);
		String greeting = "Hello";
		greeting = greeting.substring(0, 3) + "p!";
		System.out.println(greeting);
	}

}
