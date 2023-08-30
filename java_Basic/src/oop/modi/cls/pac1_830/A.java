package oop.modi.cls.pac1_830;

/*
 * default(package friendly) 제한자는 접근 제한자를
 * 붙이지 않는 형태이며, 같은 패키지 내에서만 접근을 허용합니다.
 */

public class A {
	B b = new B(); // B는 애초에 public 제한자라 어디서든 참조 사용 가능
}
