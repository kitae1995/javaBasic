package oop.inter904.basic;


//클래스가 상속 가능한 것처럼 인터페이스도 extends를 사용해서
//인터페이스끼리 상속이 가능함
//다중 상속 역시 가능함 
public interface inter904_2 extends Parentinter{

	int i = 5; // static final(상수화)가 자동으로
	
	void method2(); // abstract가 자동으로

	void parentMethod();
	
	
}
