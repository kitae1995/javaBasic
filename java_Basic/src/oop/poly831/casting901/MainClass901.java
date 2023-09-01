package oop.poly831.casting901;

public class MainClass901 {

	public static void main(String[] args) {
		
		Parent901 p = new Parent901();
		p.n1 = 1;
//		p.n2 = 2; -> n2는 자식의 값이라 적용 안됨
		
		p.method1();
		p.method2();
//		p.method3(); (x) 마찬가지
		
		System.out.println("------------------------------");
		
		Child901 c = new Child901();
		c.n1 = 1; // 부모에게 물려받은 속성
		c.n2 = 2; // 자식의 고유 속성
		c.method1();
		c.method2(); // 자식이 오버라이딩해서 수정했음
		c.method3(); 
		
		System.out.println("-----------------------------");
		
		//다형성 적용(promotion)
		Parent901 p2 = new Child901();
		
		p2.n1 = 1;
//		p2.n2 = 2; (x)
		
		p2.method1();
		p2.method2();
//		p2.method3(); (x) 
		// 자식 객체인데 왜 사용을 못할까 ?
		// p2는 부모값인 parent901의 값을 상속받았기에
		// Child901의 값이면서 parenet901이 값을 사용 가능하지만 ( 자식이 새롭게 정의한 메서드가 실행되는게 증거)
		// parent에는 없는데 child에만 있는 값이면 사용 불가능함 , (사용하려면 자식의 값이 부모의 값에도 있어야함)
		// !! 즉 부모객체는 자식 객체의 정보를 가져올수가 없음 !! //
		// 고치려면 강제 타입 변환을 사용해야함 (부모객체를 자식객체로 끌어내려야함)
		
		Child901 c2 = (Child901) p2; //이를 downcasting이라고 함
		c2.method3();
		c2.n2 = 2;
		System.out.println("p2의 주소값 : " + p2);
		System.out.println("c2의 주소값 : " + c2);
		
		Object o = new String("안녕하세요");
		String str = (String)o;
		System.out.println("문자열의 길이: " + str.length());
		
		//다형성이 한번도 발생하지 않은 경우에는
		//강제 형 변환을 사용할수 없음
//		Parent901 ppp = new Parent901();
//		Child901 ccc = (Child901) ppp; // child의 정보가없는 '순수' 부모객체인 ppp를 ccc에 넣을순없음 틀린 문법
		
		Parent901 ppp = new Child901();
		Child901 ccc = (Child901) ppp; // 옳은 예시 , ppp인 부모객체가 자식객체의 값과 짬뽕이 되있어야 강제 형 변환 가능
		
		
		
	}

}
