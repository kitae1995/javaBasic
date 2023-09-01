package oop.static_.field901;

public class MainClass901 {

	public static void main(String[] args) {
		
		Count c1 = new Count();
		
		c1.a += 5;
		c1.b += 5;
		
		System.out.println("인스턴수 변수인 c1.a의 값은 " + c1.a);
		System.out.println("정적 변수인 c1.b의 값은 " + c1.b);
		
		System.out.println("---------------------------------------");
		
		Count c2 = new Count();
		
		c2.a += 7;
		c2.b += 7;
		
		System.out.println("인스턴수 변수인 c2.a의 값은 " + c2.a);
		System.out.println("정적 변수인 c2.b의 값은 " + c2.b);
		
		System.out.println("---------------------------------------");
		
		Count c3 = new Count();
		
		c3.a += 8;
		c3.b += 8;
		
		System.out.println("인스턴수 변수인 c3.a의 값은 " + c3.a);
		System.out.println("정적 변수인 c1.b의 값은 " + c1.b);
		System.out.println("정적 변수인 c2.b의 값은 " + c2.b);
		
		/*
		 * Static이 붙은 데이터는 그 데이터가 선언된
		 * 클래스의 이름으로 바로 참조 가능함
		 * ex ) Count 클래스의 static int b는 -> Count.b로 바로 참조가능
		 * 일반 멤버변수와 혼동할수 있기 때문에 주소값으로 접근하지 않는게 국룰(해도 보여주긴 함)
		 */
		Count.b++;
		Count.b++;
		
		System.out.println("정적 변수 Count.b : " + Count.b);
	}
}
