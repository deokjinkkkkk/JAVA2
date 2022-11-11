package com.yedam.java.chapter0702;

public class Application3 {
	public static void method1(Parent parent) {
		if(parent instanceof Child) {
			Child child = (Child) parent;
			System.out.println("method1 - child 변환 성공");
		}else {
			System.out.println("변환실패");
		}
	}
	public static void method2(Parent parent) {
		Child child = (Child) parent;
		System.out.println("method1 - child 변환 성공");
	}
	
	
	
	public static void main(String[] args) {
		
		Parent parentA = new Child();
		method1(parentA);
		
		Parent parentB = new Parent();
		method2(parentB);
		
		
		
		Driver driver = new Driver();
		
		//bus, taxi -> Vehicle 부모클래스
		Bus bus = new Bus();
		Taxi taxi =new Taxi();
		//driver.drive(Vehicle vehicle = new Bus();
		driver.drive(bus);
		
		
		
		
		
		
		driver.drive(taxi);
		
		Animal animal = null;
		animal = new Cat();
		animal.speak();
		animal = new Dog();
		animal.speak();
		
		Parent parent =new Child();
		parent.field = "parent";
		parent.method1();
		parent.method2();
		
//		parent.field2 = "child";
//		parent.method3();
		
		//Casting
		Child child = (Child)parent;
		
		child.field2 = "parent";
		child.method3();
		
		child.field = "parent";
		
		
		
		
	}
}
