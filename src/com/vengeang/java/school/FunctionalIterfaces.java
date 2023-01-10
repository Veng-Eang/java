package com.vengeang.java.school;

import com.vengeang.java.school.impl.AddFive;
import com.vengeang.java.school.impl.AddFiveImpl;
import com.vengeang.java.school.impl.AddNumber;

public class FunctionalIterfaces {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//what is functional interface
		//SAM single abstract method
		AddFive addFive= new AddFiveImpl();
		
		int result=addFive.add(10);
		System.out.println(result);
		System.out.println(addFive.add(105));
		//====================
		AddNumber addNumber=new AddNumber() {
			@Override
			public int add(int num) {
				return num+100;
			}
		};
		int total =addNumber.add(25);
		System.out.println(total);
		//=========Lambda =============
		AddNumber addNumberLambda=(int n)->n+300;
		System.out.println(addNumberLambda.add(20));
	}

}
