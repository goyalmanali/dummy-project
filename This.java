package com.internshala.javaapp;

public class This {
	public float length=10.9f;          //Instance variable
	public float breadth;

	public This(){
		this(20.3f);
	}
	public This(float length) {
		length=this.length;
		System.out.println("Constructor");
	}
	public This(float length, float breadth) {    // Parameterized Constructor,constructor overloading
		System.out.println("Parameterized constructor triggered");
		this.length = length;           //this.length=instance, length=local
		this.breadth = breadth;
	}

	public float getArea() {
		float area = length * breadth;                //local variable
		return (area);
	}

	public float getPerimeter() {
		float perimeter = 2 * (length + breadth);
		return (perimeter);
	}
}
