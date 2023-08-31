package oop.overloading831;

public class Calculator831 {
	
	private int a;
	private int b;
	private int c;

	/*
    # 오버로딩 (중복): 하나의 클래스 내부에서 같은 이름을 가진 메서드나
     생성자를 여러 개 중복해서 선언할 수 있게 해주는 문법.
     
    - 오버로딩 적용 조건:
    1. 매개 변수의 데이터 타입이 다를 것! or
    2. 매개 변수의 전달 순서가 다를 것! or
    3. 매개 변수의 개수가 다를 것.
    */
	
	void inputData() {
		
	}
	
	void inputData(int a) { // 오버로딩 적용 조건을 만족함 ( 3번 ) 위는 0개 밑에는 1개이므로 작동완료
		
	}
	
//	void inputData(int a,int b) { // 데이터 타입이 int,int로 같아서 작동이 안됨
//		
//	}
	
//	void inputData(int b,int a) {
//		
//	}
	
	void inputData(String s) { // 오버로딩 적용 조건을 만족함 ( 1번 ) 위는 int 밑에는 String
		
	}
	
	void inputData(int a,double d) {
		
	}
	
	void inputData(double d ,int a) {// 오버로딩 적용 조건을 만족함 ( 2번 ) 순서가 바뀜
		
	}
	
//	void inputData(int number) { - number같은 변수이름은 아무리 바뀌어도 상관없음
//	, 한개의 int로 구동되는 함수가 위에 이미 있어서 실행 X
//		
//	}
	
//	int inputData(int number) {
//		return;
//	} return은 오버로딩에 영향을 미치지 못함
	
//	void calcRectArea(int a) {
//		int b = a*a;
//		System.out.printf("정사각형의 넓이 : %d \n",b);
//		
//		
//	}
//	
//	void calcRectArea(int a,int b) {
//		int c = a*b;
//		System.out.printf("직사각형의 넓이 : %d\n",c);
//		
//		
//	}
//	
//	void calcRectArea(int a,int b,int c) {
//		int d = (a+b)/2*c;
//		System.out.printf("사다리꼴의 넓이 : %d\n",d);
//		
//		
//	}
	
	int calcRectArea(int r) {
		return r*r;
	}
	
	int calcRectArea(int width,int height) {
		return width*height;
	}
	
	double calcRectArea(int ceil,int floor, int height) {
		return (ceil*floor)*height/2.0;
	}
	
}
