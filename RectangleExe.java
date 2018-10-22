package com.internshala.javaapp;

public class RectangleExe {
	public static void main(String[] args){
		Rectangle r1 = new Rectangle();
		r1.length=2.3f;
		r1.breadth=3.4f;
		System.out.println("Length is: "+r1.length);
		System.out.println("Breath is: "+r1.breadth);
		System.out.println("Area is: "+r1.getArea());
		System.out.println("Perimeter is:"+r1.getPerimeter());

		Rectangle r2 =new Rectangle();
		r2.length=4.5f;
		r2.breadth=6.8f;
		System.out.println("Area is: "+r2.length);
		System.out.println("Perimeter is: "+r2.breadth);
	}
}
