package com.internshala.javaapp;

public class Rectangle {
		//length,breadth
		// getarea() ,getperimeter()
	 public float length;          //Instance variable
	 public float breadth;
     public float getArea() {
     	float area=length*breadth;                //local variable
		return (area);
	 }
	 public float getPerimeter(){
     	float perimeter=2*(length+breadth);
		return (perimeter);
	 }
}

