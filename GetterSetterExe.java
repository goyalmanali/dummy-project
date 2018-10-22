package com.internshala.javaapp;

public class GetterSetterExe {
	public static void main(String [] args){
		GetterSetter r1=new GetterSetter();
		r1.setLength(12.9f);
		r1.setBreadth(10.9f);

		System.out.println(r1.getLength());
		System.out.println(r1.getBreadth());
	}
}
