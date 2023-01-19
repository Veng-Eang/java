package com.vengeang.java.school.method.reference.book;

public class InstamceMethodWithObjectRefDemo {
	
//	A method that returns the number of occurrences
//	of an object for which some criteria, as specified by
//	the MyFunc parameter, is true.
	static <T> int counter(T[] vals,MyFunc<T> f,T v) {
		int count=0;
		for(int i=0;i<vals.length;i++) {
			if(f.func(vals[i], v)) count++;
		}
		return count;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count;
//		Create an array of HighTemp objects
		HighTemp[] weekDayHighs= {
			new HighTemp(89),new HighTemp(82),
			new HighTemp(90),new HighTemp(89),
			new HighTemp(89),new HighTemp(91),
			new HighTemp(84),new HighTemp(83)
		};
		count =counter(weekDayHighs, HighTemp::sameTemp, new HighTemp(89));
		System.out.println(count+" days had a high of 89");

		count=counter(weekDayHighs,HighTemp::lessThanTemp,new HighTemp(89));
		System.out.println(count+" days had a high less than 89");
		
		count=counter(weekDayHighs,HighTemp::lessThanTemp,new HighTemp(19));
		System.out.println(count + " days had a high of less than 19");
		
		
		
	}

}
