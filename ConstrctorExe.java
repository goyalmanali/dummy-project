package com.internshala.javaapp;

public class ConstrctorExe {
	public static void main(String[] args){
		Constructer r1=new Constructer();       //Default construtor
		r1.length=12.9f;
		r1.breadth=8.7f;

		Constructer r2=new Constructer(20.4f,18.2f);
		System.out.println(r2.length);
		System.out.println(r2.breadth);
	}
}
