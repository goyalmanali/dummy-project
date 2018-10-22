package com.internshala.javaapp;

public class GetterSetter {
	private float length;          //Instance variable
	private float breadth;
	public float getArea() {
		float area=length*breadth;                //local variable
		return (area);
	}
	public float getPerimeter(){
		float perimeter=2*(length+breadth);
		return (perimeter);
	}
	//Getter and Setter
	public float getLength(){     //Getter for length
		return length;
	}
	public void setLength(float length){     //setter for length
		this.length=length;
	}

	public float getBreadth() {
		return breadth;
	}

	public void setBreadth(float breadth) {
		this.breadth = breadth;
	}
}
