package com.internshala.javaapp;

public class DogConst {
	public String breed;
	public int size;
	public String color;

	public DogConst(){
		System.out.println("Default constructor");
	}
	public DogConst(String b,int s,String c){
		System.out.println("Parametrized constructor");
		breed=b;
		size=s;
		color=c;
	}
	public void bark(){
		System.out.println(" Wooh ! Wooh !");
	}
	public void run(){
		System.out.println("My breed is " +breed+ ".I am running");
	}
}
