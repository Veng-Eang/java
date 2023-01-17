package com.vengeang.java.school.method.reference;

public class ConstructorReference {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Student 
		
		StudentService studentService=(name,age)->new Student(name,age);
		Student st1 = studentService.createStudent("Vengeang", 23);
		System.out.println(st1);
		
		StudentService student=Student::new;
		Student st2 = student.createStudent("eang", 23);
		System.out.println(st2);
	}

}
