package oop.poly831.casting901;

public class Child901 extends Parent901{
	
	public int n2; // 자식 고유의 필드
	
//	public void method1() {
//		부모한테 물려받은 메서드 ( 안써있어도 잇는거임)
//	}
	
	public void method2() { // 부모한테 물려받앗지만 , 본인이 수정해서 씀
		
		System.out.println("재정의한 2번 메서드 추출");
	}
	
	public void method3() {
		System.out.println("자식 고유의 3번 메서드 호출");
	}

}
