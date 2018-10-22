package com.internshala.javaapp;

public class Constructer {
	public float length;          //Instance variable
	public float breadth;

	public Constructer() {                          //Default constructor
		System.out.println("Default constructor triggered");
	}
	public Constructer(float l, float b) {        // Parameterized Constructor,constructor overloading
		System.out.println("Parameterized constructor triggered");
		length=l;
		breadth=b;
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
