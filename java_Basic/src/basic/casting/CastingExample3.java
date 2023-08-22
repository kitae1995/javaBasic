package basic.casting;

public class CastingExample3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		char c = 'B';
		int i = 2;
		
		int intResult = c + i; // 서로 다른 연산에서는 '작은'쪽이 큰쪽에 맞춰짐
							   // 이경우엔 char가 더 작으므로 int로 취급이 됨
		char charResult = (char) (c + i); // 이경우엔 int가 큰 편이니 억지로 char로 끌어 내려야함
										  // 이렇기에 데이터타입간의 서열을 알아야함.
		System.out.println(intResult);
		System.out.println(charResult);
		
		int k = 10;
		double d = (double)k/4 ;
		System.out.println(d); // 값은 2.0 왜냐면 처음에 k/4에서 k는 int였기에 값도 int인 2가 나옴
		
		// 2.5를 받고 싶으면 여러 방법
		// 1) 4를 4.0으로 해서 k/4.0을 double 데이터로 유도
		// 2) (double)k/4 ;로 k를 double로 올려버리면 double/int의 계산이기에 int가 double이 됨
		
		//int보다 작은 크기의 데이터 연산은 자동으로 값이
		//int로 변환되어 처리됨 . ( 데이터 손실 방지 )
		byte b1 = 100;
		byte b2 = 70;
		System.out.println(b1+b2); // 이 경우도 합은 170이라 byte로 처리 안되지만
								   // 숫자가 int의 한계를 넘어가지 않으면 그냥 int로 처리가 됨
	}

}
