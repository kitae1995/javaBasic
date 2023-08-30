package oop.modi.meber.pac1_830;

public class B {
	
	public B() {
		A a = new A();
		a.x = 1;
		a.y = 2;
		// a.z = 3; -> (x) private이라 안됨
		a.method1();
		a.method2();
		//a.method3(); (x) 마찬가지
	}
	
	
	
	

}
