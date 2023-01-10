package com.vengeang.java.school.shape;

public class Client {
	
	public static void main(String[] args) {
		Circle circle=new Circle();
		Rectrangle rectrangle=new Rectrangle();
		Square square=new Square();
		Shape shape=new Shape();
		shape.setDraw(square);
		shape.d.draw();
		shape.setDraw(rectrangle);
		shape.d.draw();
		shape.setDraw(circle);
		shape.d.draw();
	}
}
