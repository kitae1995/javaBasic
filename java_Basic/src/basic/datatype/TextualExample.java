package basic.datatype;

public class TextualExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//단일 문자를 표현하는 char
		char c1 = 'A';
		//char c1 = "A"; (x) 쌍따옴표를 쓰면 String으로 인지함
		//char c1 = 'AB'; (x)
		System.out.println(c1);
		char c2 = 65; // 65가 유니코드로는 A를 뜻해서
		System.out.println(c2);
		
		/*
        # 문자열을 저장할 수 있는 데이터 타입 String
        - 저장하고 싶은 문자열을 겹따옴표("")에 담아 대입함.
        - String은 기본 데이터 타입은 아니지만 자주 쓰이기 때문에
        기본 데이터 타입처럼 사용함. (사실은 객체 타입)
        */
		
		String s1 = "my dream "; // (o) 쌍따옴표 안에는 모두 문자열이기에 공백도 인정함
		String s2 = "is a programmer";
		System.out.println(s1);
		System.out.println(s2);
		
		//자바에서는 문자열의 덧셈 연산을 지원함
		//연산 결과로는 문자열을 연결해서 결합한 결과를 보여줌. 예시
		System.out.println(s1+s2);
		System.out.println("치킨" + "게임");
		
		//문자열과 다른 데이터 타입 간의 연산도 가능함.
		//결과는 무조건 문자열의 덧셈 연산과 같습니다.
		System.out.println("===========================");
		
		System.out.println(100+100);
		System.out.println("100"+"100");
		System.out.println(100+"100");
		System.out.println(3.14+"hi");
		
		int month = 10;
		int day = 13;
		
		System.out.println("내 생일은 "+month+"월 "+day+"일 입니다.");
		
	}

}
