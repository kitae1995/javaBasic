package oop.modi.protec.pac2;

import oop.modi.protec.pac1.A;

public class C extends A{
	
	// A a1 = new A(30); -> protected 패키지가 바뀌니 호출이 안됨 !! 그러나 상속받으면 사용 가능함
	// A a2 = new A(5.67); - > default 패키지가 바뀌니 마찬가지로 호출이 안됨
	
	/*
	 * protected 제한자는 패키지가 다른 경우 참조가 안되지만
	 * 상속을 받는다면 사용이 가능해진다
	 */
	
	
	public C() {
		super(30);
		//super(5.67); // default 패키지라 상속받아도 안됨
		super.x = 1;
		// super.y = 2; // 마찬가지로 x와 마찬가지로 y는 default 패키지라 사용 불가능함
		
 	}
}
