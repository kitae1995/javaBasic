package basic.begin;

public class identifier {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//1. 식별자의 이름은 중복을 허용하지 않음.
		//그리고 , 대/소문자를 철저하게 구분함.
		
		int age = 35;
//		int age = 40; (x)
		int Age = 40;
		
		System.out.println(age);
		System.out.println(Age);
		
		//2. 식별자 이름은 숫자로 지정하거나 숫자로 시작하면 안됨.
//		int 700 = 365; (x)
//		int 7number = 7; (x)
//		int number7 = 7; (o)
//		int nu7mber = 7; (o)
//		int num123ber = 123 (o)
		
		//3. 식별자 이름에 공백을 포함 할 수 없다.
//		int my birth day = 19921013; (x)
		int mybrithday = 19921013;
		int myBrithday = 19921013; // camel case 표기법
								   // 연결단어의 첫글자를 대문자로 , 관례임
		
		//4. 식별자 이름에 쓸 수 있는 특수 문자는 밑줄(_),달러기호($)뿐이다.
		//그런데 사용을 권장하지는 않음, 따로 자주쓰는곳이 있기 때문에
		String $hello_ = "안녕";
		
		
		//5. 키워드(예약어)는 식별자 이름으로 사용이 불가능함.
		// 키워드는 이미 어떠한 내용을 내포하고 있는 지정 문자임.
		// String class = "클래스" (x) class는 키워드이기에
		// sitrng Class = "클래스" (o) 이건 되기는함 , 근데 굳이 권장하지는 않음
		
		//6. 한글이나 한자같은 식별자 이름도 지정이 가능하지만
		//사용을 권장하지는 않음.
		int 숫자 = 10;
		String 名 = "춘식이";
		System.out.println(숫자);
		System.out.println(名);
		
		
		
		
	}

}
