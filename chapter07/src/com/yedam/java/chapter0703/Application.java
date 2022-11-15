package com.yedam.java.chapter0703;

public class Application {
	public static void main(String[] args) {
		Dog dog = new Dog();
		Cat cat = new Cat();
		
		dog.sound();
		cat.sound();
		
		System.out.println("-------");
		Animal animal =null;
		
		animal = new Dog();
		animal.sound();
		
		animal.breathe();
		
		animal = new Cat();
		animal.sound();
		
		System.out.println("-------");
		
		animalSound(new Dog());
		animalSound(new Cat());
		
		
		
	}
	
	public static void animalSound(Animal animal) {
		animal.sound();
	}
}