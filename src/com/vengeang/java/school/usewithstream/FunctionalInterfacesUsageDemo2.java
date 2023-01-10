package com.vengeang.java.school.usewithstream;

import java.util.List;
import java.util.Map;
//import java.util.stream.Collector;
import java.util.stream.Collectors;

import com.vengeang.java.school.model.Student;

public class FunctionalInterfacesUsageDemo2 {
	
	static List<Student> students=List.of(
			new Student(1,"Dara", "M", 18),
			new Student(2,"Thida", "F", 16),
			new Student(3,"Seyha", "M", 16),
			new Student(4,"Cheata", "F", 18),
			new Student(5,"ta", "F", 18),
			new Student(6,"Chea", "M", 18),
			new Student(7,"Dalin", "F", 19)
			);

	public static void main(String[] args) {
		
	
		
//		students.stream()
//			.filter(st->st.getGender()=="F")
//			.sorted((age1,age2)->age2.getAge()-age1.getAge())
//			.limit(3)
//			.forEach(st->System.out.println(st.getName()+" , "+st.getAge()));
//		
//		Map<String, List<Student>> groupByGender = students.stream()
//			.collect(Collectors.groupingBy(st->st.getGender()));
////			Collector
//			System.out.println(groupByGender);
//			
//		List<Student> femaleStudents = students.stream()
//			.filter(name->name.getGender()=="F")
//			.collect(Collectors.toList());
//		System.out.println(femaleStudents);
		students.stream()
			.filter(n->n.getGender()=="F")
			.sorted((st1,st2)->st2.getId()-st1.getId())
			.limit(3)
			.forEach(student->System.out.println(student.getName()+" , "+student.getGender()));
//		System.out.println(studentByAge);
		
		Map<String, List<Student>> mapGroupByGender = students.stream()
			.collect(Collectors.groupingBy(p->p.getGender()));
		
		System.out.println(mapGroupByGender);
		
		List<Student> femaleList = students.stream()
			.filter(p->p.getGender()=="F")
			.collect(Collectors.toList());
		List<Student> maleList = students.stream()
			.filter(p->p.getGender()=="M")
			.collect(Collectors.toList());
		System.out.println("F:"+femaleList+" M:"+maleList);
		
		Map<Integer, List<Student>> groupByAge = students.stream()
			.collect(Collectors.groupingBy(a->a.getAge()));
		System.out.println(groupByAge);
		Map<Integer, Long> countingAge = students.stream()
			.collect(Collectors.groupingBy(a->a.getAge(),Collectors.counting()));
		System.out.println(countingAge);
		
//		Group students who can vote and can't vote
		
		Map<Boolean, List<Student>> vote = students.stream()
			.collect(Collectors.partitioningBy(st->st.getAge()>17));
		
		System.out.println(vote);
	}

}
