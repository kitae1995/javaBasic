package oop.poly831.basic;

/*
- 자바에서는 하나의 클래스 파일에 여러 개의 클래스를 선언할 수 있습니다.
 밀접한 연관이 있는 클래스를 모아 놓기 위해 사용합니다.
- 단, 파일명과 동일한 클래스가 반드시 존재해야 하고,
 해당 클래스만 public으로 선언할 수 있습니다.
*/

class A{}
class B extends A{}
class C extends A{}
class D extends B{}
class E extends C{}

public class Basic831 {
	
	A a = new A();
	B b = new B();
	C c = new C();
	D d = new D();
	E e = new E();
	
	/*
	 * - 다형성이란 자식 객체가 모든 부모의 타입을 가질수 있다는 것을
	 * 의미합니다.
	 * 
	 * - 즉, 부모 타입의 변수에 자식 객체의 주소값을 얼마든지 저장할 수
	 * 있다는 것을 의미합니다.
	 */
	
	int i = 5;
	double d2 = i;
	
	Object v0 = new A();
	A v1 = new B(); // 클래스 타입 B -> A타입으로 자동 형 변환(상위 타입으로) (promotion)
					// A는 B의 부모이므로
	A v2 = new C(); // 
	A v3 = new D(); // D는 B의 자식이지만 , B는 A의 자식이므로 D도 A의 자식임 ( 굳이 따지면 손자? )
	A v4 = new E();
	A v5 = b; // b > B b = new B();
	
	B v6 = new D();
	C v7 = new E();
	
	//상속 관계가 없다면 다형성 작용 안됨 , 상속 관계 하에서만 발생함!!
	
//	B v8 = new C(); // B랑 C는 부모자식관계가 아니라 다형성 X
//	C v9 = new D()  (X)
//	B v10 = new E(); (X)
//	D v11 = new E(); (X)
	
	//object는 자바의 최상위 클래시임.
	//모든 클래스는 결국 object의 자식이라는건데..
	//다형성에 따르면 object의 타입의 변수엔 모든 객체가 다 들어갈수 있음.
	//근데 실제로는 쓰지않음 문제점이 있어서
	
	Object o1 = new A();
	Object o2 = new B();
	Object o3 = new C();
	Object o4 = new D();
	Object o5 = new String("안녕하세요");
	Object o6 = new Basic831();
	
}
