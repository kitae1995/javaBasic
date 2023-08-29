package oop.constructor;

public class Person {
	String name;
	int age;
	int height;
	
	Person(String pName,int pAge,int pHeight){
		
		name = pName;
		age = pAge;
		height = pHeight;
		
	}
	
	void info() {
		System.out.println("신상 정보");
		System.out.println(name);
		System.out.println(age);
		System.out.println(height);
	}
}
