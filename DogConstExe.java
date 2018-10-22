package com.internshala.javaapp;

public class DogConstExe {
	public static void main(String[] args){
		DogConst d1=new DogConst();
		System.out.println(d1.breed="Labored");

		DogConst d2=new DogConst("Germen Speared",25,"black");
		System.out.println(d2.breed);
		System.out.println(d2.size);
		System.out.println(d2.color);
	}
}
