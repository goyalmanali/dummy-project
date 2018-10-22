package com.internshala.javaapp;

public class Cake {
	String cakeName;
	float prize;
	String flavour;
	public void isAvailable(){
		if(prize>=500)
			System.out.println("Cake is available");
		else
			System.out.println("Cake is not available");
	};
}
