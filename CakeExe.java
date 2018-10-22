package com.internshala.javaapp;

public class CakeExe {
	public static void main(String [] args){
		Cake c1=new Cake();
		System.out.println("_____________________");
		System.out.println(c1.cakeName="Black Forest");
		System.out.println(c1.prize=510.45f);
		System.out.println(c1.flavour="Choclate");
		System.out.println("______________________");
		c1.isAvailable();

	}
}
