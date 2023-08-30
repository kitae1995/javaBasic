package oop.modi.meber.pac2_830;

import oop.modi.meber.pac1_830.A;

public class C {
	
	public C() {
		A a = new A();
		a.x = 1; // public(o)
		//a.y = 2; -> 패키지가 달라져서 (x)
		//a.z = 1; -> 얘는 private라 그냥 안됨
		
		
	}

}
