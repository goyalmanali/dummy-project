package com.internshala.javaapp;

public class ThisExe {
	public static void main(String[] args){
		This r3=new This();
		This r1=new This(12.9f);
		System.out.println(r1.length);
		//r1=this

		This r2=new This(20.4f,18.2f);
		System.out.println(r2.length);
		System.out.println(r2.breadth);
		//r2=this
	}
}
