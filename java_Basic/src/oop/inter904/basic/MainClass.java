package oop.inter904.basic;

public class MainClass {

	public static void main(String[] args) {
		
//		Inter i1 = new Inter(); 인터페이스는 객체를 생성할수 없음
		
		System.out.println("상수 : " + inter904.num);
		inter904.staticmethod(); // static 데이터 호출가능
		
		ImplClass1 i1 = new ImplClass1();
		i1.method1();
		i1.method2();
		i1.method3();
		i1.parentMethod();
		
		System.out.println("----------------------------------------------");
		
		/*
        - 다형성은 상속이 전제되어야 하는 것이 원칙이지만
         예외로 인터페이스와 클래스간의 구현 관계에서도
         다형성 발생을 허용합니다.
         인터페이스 변수 = new 객체();
        */
		
		inter904 it1 = new ImplClass1(); // 상속을 안해도 다형성이 구현됨
		it1.method1();
		it1.parentMethod();
		((ImplClass1)it1).method2();
//		((inter904_2)it1).method2(); 인터페이스는 이런것도 가능함
		
		/*
        - 인터페이스의 다형성도 앞에서 배운 클래스의 다형성처럼
         정보가 없다면 메서드 호출이 불가능하기 때문에 형 변환이 필요합니다.
         
        - 구현하는 클래스가 서로 다른 인터페이스들을 동시에 구현하고 있다면
         구현하는 클래스들끼리 서로 즉시 형 변환이 가능합니다.
        */
		
		inter904_2 it2 = new ImplClass1();
		it2.method2();
		it2.parentMethod();
		
		((inter904) it2).method1();
		
		inter904 it3 = new ImplClass2();
		inter904_2 it4 = new ImplClass3();
		
		Parentinter[] inters = {it1,it2,it3,it4};
	}

}
