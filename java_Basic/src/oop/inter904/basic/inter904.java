package oop.inter904.basic;


// 인터페이스 : 객체의 규격을 표준화해서 명세하는 역할.

public interface inter904 extends Parentinter {
	
	//인터페이스에서 변수를 선언하면 상수(static final)로 지정합니다.
	int num = 5;
	
	
	//인터페이스에서는 메서드를 선언하면 추상메서드로 지정됨.
	//(abstratct를 지정하지 않았는데도 추상메서드가 됨
	void method1();
	
//	inter904(){
//		
//	}
	// 인터페이스는 생성자를 가질수 없음 . 즉 객체를 생성할수가 없음
	
	public static void staticmethod() {
		System.out.println("가능함");
	} // 스태틱 매서드는 가능함 , 스태틱에 따로 저장되는 것이기에
}
