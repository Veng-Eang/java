package com.vengeang.java.school.lambda;

import java.util.Comparator;
import java.util.HashMap;
import java.util.function.Consumer;
//import java.util.function.Function;
//import java.util.function.Predicate;
import java.util.function.Supplier;
//import java.util.List;
//import java.util.Map;

public class LambdaDemo {
	static String nameMethod() {
		return "Vengeang";
	}
	public static void main(String[] args) {
		MyPrinter myPrinter =System.out::println;
		Supplier<String> name1=LambdaDemo::nameMethod;
		System.out.println(name1.get());
		Consumer<String> name=System.out::println;
		name.accept("Hello ,Vengeang");
		myPrinter.print("Hello Java ");
		
		Caculator  myCaculator = new MyCaculator();
		Caculator myCaculator2=(a,b)->(a+b)*2;
		myCaculator.sum(10, 20);
		myCaculator2.sum(10, 20);
		
		MyPrinter printer=(text)->System.out.println("Hello, "+text);
		printer.print("venng");
		MyPrinter printerInnerClass=new MyPrinter() {
			
			@Override
			public void print(String t) {
				// TODO Auto-generated method stub
				System.out.println("Inner class hello ,"+ t);
			}
		};
		
		
		printerInnerClass.display("eang");
		/*
		 * 1. Functional Interface
		 * 2. Parameter of lambda must be the as in method of interface
		 * 3. Same return type 
		 */
		Info myInfo=()->System.out.println("Company Information");
		myInfo.showInfo();
		myInfo.show("vengeang");
		myInfo.show("eang");
		MyPrinter print=(s)->System.out.println("wellcome "+s);
		print.display("eang");
		print.print("Eang");
		//List<Integer> listNumber =List.of(23,43,5,6,77,8) ;
		
		Comparator<Integer> compareByNumber =(var p1,var p2)->p1-p2;
		compareByNumber.compare(10, 0);
//		Map<String, Long> priceMap=new HashMap<>();
		var priceMap=new HashMap<>();
		
		priceMap.put("apple", 30L);
		
		Caculator caculate=(a, b) -> {
			a=a*2;
			b=b*2;
			return a+b;
		};
		System.out.println(caculate.sum(20, 30));
		
	} 
	static class MyCaculator implements Caculator{

		@Override
		public int sum(int a, int b) {
			// TODO Auto-generated method stub
			return (a+b)*2;
		}
		
	}
	
	
}
