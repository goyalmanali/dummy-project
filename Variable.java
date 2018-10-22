package com.internshala.javaapp;

public class Variable {
	public static void main(String[] args) {
		String name = "India";
		int population = 1326572000;
		float populationDensity = 393.0f;
		double GDP = 2.454d;
		char currency = '\u20B9'; //OR \u20B9
		boolean isSecular;
		isSecular = true;
		// India has a population of 1326572000 and population density of 393.0 person per sq km.
		System.out.println(name + " has a population of " + population + " and population density of " +populationDensity + " person per sq km. and GDP is "+ GDP+" trillion dollar and India's currency as "+currency+" and secular state is "+isSecular);
	}
}
