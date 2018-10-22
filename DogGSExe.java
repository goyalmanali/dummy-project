package com.internshala.javaapp;

public class DogGSExe {
	public static void main(String[] args){
		DogGS d1=new DogGS();
		d1.setBreed("Germen shepered");
		d1.setSize(24);
		d1.setColor("Black");
		System.out.println(d1.getBreed());
		System.out.println(d1.getSize());
		System.out.println(d1.getColor());
		d1.bark();
		d1.run();

		DogGS d2=new DogGS();
		d2.setBreed("Labrador");
		d2.setColor("White");
		d2.setSize(19);
		System.out.println(d2.getBreed());
		System.out.println(d2.getSize());
		System.out.println(d2.getColor());
		d2.bark();
		d2.run();
	}
}
