package oop.final_901.method901;

public class Child901 extends Parent901{

	@Override
	void method1() {
		// TODO Auto-generated method stub
		super.method1();
	}

	@Override
	void method2() {
		// TODO Auto-generated method stub
		super.method2();
	}
	
	
//	@Override
//	void method3() {
//		// TODO Auto-generated method stub
//		super.method2();
//	}     
// 	method3는 부모 클래스에서 final을 걸어놨기에 수정(오버라이딩)해서 쓰기가 불가능함 (물려주는 대로 써라 이말)


	/*
    - 클래스 선언 시 final을 사용하면 그 클래스는 상속이 불가능해집니다.
    
    - final 클래스는 자식 클래스를 가질 수 없고, 오직 외부에서 객체 생성을
    통해서만 사용할 수 있습니다.
    
    - 대표적인 final 클래스는 String 입니다.
    */
	
	
}
