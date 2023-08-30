package oop.modi.cls.pac1_830;

/*
 * public 제한자는 접근 제한 자체가 없는 형태
 * (어디에서나 참조해서 사용이 가능한 클래스)
 */

public class B {
	A a = new A(); // A는 default 제한자긴 하지만 , 같은 '패키지 내부의 클래스'끼린 접근이 가능하기에 정상실행됨
	
}
