package oop.static_singleton901;

import java.security.SignatureException;

public class Singletion901 {

	/*
	 *  싱글톤 디자인 패턴은 : 클래스의 객체를 단 1개로 제한하기 위한 코드 디자인 패턴
	 *  1. 외부에서 이 클래스의 객체를 생성하지 못하게 생성자를 단 한 1개만 선언하고
	 *  private 접근 제한을 붙임.	   
	 */
	
	private Singletion901() {
		System.out.println("객체 생성");
	}
	
	/*
	 * 2. 생성자를 호출할 수 있는 영역은 같은 클래스 내부 뿐이므로
	 * 자신의 클래스 내부에서 스스로의 객체를 단 1개만 생성함.
	 */
	private static Singletion901 s = new Singletion901();
	
	/*
	 * 3. 외부에서 이 클래스의 객체를 요구할 시 , 2번에서 미리 만들어 놓은
	 * 단 하나의 객체의 주소값을 공개된 메서드를 통해 리턴합니다.
	 */
	
	public static Singletion901 getInstance() {
		return s;
	} // static을 붙여야 객체생성없이 메서드를 부를수 있음.
	
	
	
	///////////////////////////////////////////////
	
	public void method1() {
		System.out.println("여러 군데에서 쓰이는 굉장히 중요한 메서드");
	}
	
	public void method2() {
		System.out.println("프로그램 내에서 꼭 한번 불러야 하는 귀한 메서드");
	}
	
		
}
