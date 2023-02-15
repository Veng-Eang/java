package com.vengeang.java.school.predicate;

import java.util.function.Predicate;

public class PredicatMethod {
	//use Generic X for dynamic arg in method result 
	public static <X> void result(Predicate<X> p,X arg) {
		if(p.test(arg)) {
			System.out.println("The predicate is true for "+arg);
		}else {
			System.out.println("The predicate is false for "+arg);
		}
	}

	public static void main(String[] args) {
		
		Predicate<Integer> p=arg->arg==5;
		Predicate<String> p2=n->n.length()==5;
		result(p, 5);
		result(x->x>5,5);
		result(p2,"vengeang");
		result(name->name.toLowerCase().charAt(0)=='a',"Hello");
		
	}

}
