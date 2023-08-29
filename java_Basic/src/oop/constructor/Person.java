package oop.constructor;

public class Person {
	String name;
	int age;
	int height;
	
	Person(){
		
	} //이렇게 기본 생성자 하나 만들어놔야 다른 바리에이션도 실행할수 있음
	
	
	Person(String pName,int pAge,int pHeight){ // 이렇게 선언자를 하나 만들면 기본값이였던 Person()을 이제 쓸수없음
		
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
