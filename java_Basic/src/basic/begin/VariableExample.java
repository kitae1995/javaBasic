package basic.begin;

public class VariableExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * #변수 (Variable)
		 * 
		 * 1. 변수는 데이터가 저장되는 공간에 이름을 붙여놓은 것입니다.
		 * 2. 변수는 생성할 때 변수에 저장되는 데이터의 크기와 모양에 따라
		 * 적당한 데이터 타입을 선언해야 합니다.
		 * ex) int : 4바이트의 정수, String: 문자열(문장)
		 * 3. 변수는 동일한 이름으로 중복 선언할 수 없습니다.
		 * 4. 변수 내부의 값은 언제든지 변경이 가능합니다.
		 */
		
		//변수의 선언 : [자료형(데이터타입)] [변수명];
		int age;
		
		//변수의 초기화: [변수명] = [값];
		age = 40;
		
		//변수의 값 참조(사용)
		System.out.println(age);
		
		//변수는 선언과 초기화를 동시에 할 수 있음.
		//(처음 만들때 한 번만 가능)
		int score = 100;
	//	int score = 95; (X)선언은 2번은 안됨.
		score = 95;
		// 기존값이 소멸하고 새로운 값이 할당 됨.
		score = 90;
		System.out.println(score);
		
	// 변수에는 다른 변수의 값도 저장이 가능하다.
		int myScore = score - 20;
		System.out.println(myScore); //70이 나옴 90-20 = 70
		
		//변수의 자료형에 맞지 않는 데이터는 저장이 불가능합니다.
		// int = 기태 <- 이런건 안됨 ex) int count = "한번" XX
		// int count = 23.5; (X) 정수가 아니기에 int로는 안됨
		// String str = 100; (X) 문자 자료형인데 숫자가 들어가서 X
		
		//변수는 자료형(데이터 타입)이 달라도 이름이 동일하다면
		//중복 선언할수 없음.
		// String name = "홍길동" 과 int name = 1004;는 공존 XX
		
		//선언 및 초기화하지 않은 변수는 사용이 불가능
		// num = 100; (X)
		// int result = myScore + num; (X) num을 선언한적이 없음
		
		
		
		
	}

}
