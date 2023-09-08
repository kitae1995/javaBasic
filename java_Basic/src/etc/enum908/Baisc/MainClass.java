package etc.enum908.Baisc;

public class MainClass {

	public static void main(String[] args) {
		
		Developer kim = new Developer();
		kim.name = "김철수";
		kim.career = 3;
//		kim.lang = Developer.JAVA; //kim의 lang에 상수값 JAVA를 삽입
//		kim.lang = "메롱"; // 난 JAVA만 받고싶은데 이런 쓰레기문자를 방지하려면 ?
//						  // enum 객체를 사용하면 됨
		kim.lang = Languages.JAVA; // lang은 이제 langueages라는 enum값만 들어갈수있음
		
		Developer hong = new Developer();
		hong.name = "홍길동";
		hong.career = 10;
		hong.lang = Languages.PYTHON;
		
		Developer park = new Developer();
		park.name = "박뚜띠";
		park.career = 5;
		park.lang = Languages.JAVASCRIPT;
		
		
		
//		System.out.println("kim의 주력 언어는 ? : " + kim.lang);   // 정상적으로 출력됨
//		System.out.println("hong의 주력 언어는 ? : " + hong.lang);
//		System.out.println("park의 주력 언어는 ? : " + park.lang);
		
		System.out.println("kim의 주력 언어는 ? : " + kim.lang.getName());    //추가로 주었던 한글이름 출력  
		System.out.println("hong의 주력 언어는 ? : " + hong.lang.getName());
		System.out.println("park의 주력 언어는 ? : " + park.lang.getName());
		
		//values() : 열거형 타입에 존재하는 모든 상수를 배열에 담아서 리턴.
		
		for(Languages lang:Languages.values()) {
			System.out.println(lang);
		}
		
		//ordinal() : 열거형 타입에 열거되어 있는 순서를 정수값으로 리턴. ( 몇번째 순서인가 ? )
		System.out.println(park.lang.ordinal());
		
		//valueOf(str) : 매개값으로 전달된 (str) 문자열과 일치하는 요소를 리턴 
		System.out.println(Languages.valueOf("CPP"));
//		System.out.println(Languages.valueOf("메롱")); // 없는값이면 오류
		
		
		
	}

}
