package com.internshala.javaapp;

public class Main {

    public static void main(String[] args) {
	// DOG1
        Dog dog1=new Dog();
        dog1.breed="Germen Shepered";
        dog1.size=50;
        dog1.color="Black";
        dog1.bark();
        dog1.run();

        System.out.println(dog1.breed);
        System.out.println(dog1.size);
        System.out.println(dog1.color);
        //dog 2
        Dog dog2 = new Dog();
        dog2.breed="Labrador";
        dog2.size=35;
        dog2.color="Brown";

        dog2.bark();
        dog2.run();
    }
}
