package oop.inter904.basic;

/*
1. 인터페이스를 작성한 후에는 클래스를 생성해서
 인터페이스에 명세된 내용을 구현하시면 됩니다.
 
2. 인터페이스의 구현 키워드는 implements 입니다.
 상속과 같이 클래스 이름 뒤에 구현하고자 하는 인터페이스 이름을 작성합니다.
 
3. 인터페이스에 선언된 추상 메서드는 반드시 구현 클래스에서
 오버라이딩을 진행해야 합니다.
 
4. 인터페이스는 하나의 클래스에서 여러 개의 인터페이스를
 동시에 다중 구현할 수 있습니다.
*/

public class ImplClass1 implements inter904,inter904_2{

	@Override
	public void method1() {
		System.out.println("inter904의 추상메서드 구현");
		
	}
	
	public void method2() {
		System.out.println("inter904_2의 추상메서드 구현");
	}

	@Override
	public void parentMethod() {
		
		System.out.println("부모 인터페이스의 추상메서드 구현");
	} // pareninter에 있는 추상메서드인데, paretinter는 직접 상속 받진 않았지만
	  // 상속받은 모든 인터페이스들의 부모인 pareninter에서 가져온 추상메서드라 얘도 구현시켜줘야함 
	
	public void method3() {
		
		System.out.println("impclass1의 메서드");
	}
	
	

}


