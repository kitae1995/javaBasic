package etc.enum908.Baisc;

//상수(static final)의 모음집
//이 enum에 있는 모든 값은 상수임

/*
 * 상수를 정의해서 코드를 작성하면 다양한 문제가 발생할 수 있다.
 * 1. 상수의 값 자체는 변경이 불가능하겠지만 , 상수를 받는 객체의 필드값은 장난을 칠수 있음
 * int a = 상수 <- 이렇게 들어가도 다시 a = "이상한값" 을 주는게 가능한거처럼
 * 2. 상수는 어느 클래스에서나 선언할 수 있기 떄문에 무분별한 상수 선언이 이뤄질수 있음.
 * 3. 코드의 가독성이 좋지가 않음. (Public static final String kitae = "기태" 이렇게 길어짐)
 * 
 * 이러한 단점들을 보완한것이 이 enum임.
 * enum class를 사용하면 얻을 수 있는 장점
 * 1. 코드가 단순해지고 가독성이 좋아짐.
 * 2. 정의한 상수 이외의 값을 컴파일 과정에서 막기 때문에 타입 안정성이 증가함.
 * 3. 관련있는 상수들끼리 모아놓기 때문에 구현의 의도를 명확하게 파악 가능
 */

public enum Languages {
	
//	JAVA,PYTHON,CPP,JAVASCRIPT,C -- 기본 enum 값 형태
	
	//상수("연관시킬 문자")
	JAVA("자바"),
	PYTHON("파이썬"),
	CPP("C++"),
	JAVASCRIPT("자바스크립트"),
	C ("C"); // 마무리에 세미콜론 붙이기
	
	
//--------------------------------------------------------------------------------------------- 
	
	final private String name; //상수와 연관시킬 문자값을 담을 필드 선언.
	
	public String getName() { // 한글 이름을 얻어내기 위한 메서드(private)
		return name; 
	}
	
	//외부에서 enum 타입의 상수를 사용시 enum 객체가 생성됨.
	//위에 선언한 방식의 상수와 연관 문자를 전달해서 name 필드에 값을 초기화.
	private Languages(String name) { 
		this.name = name;
	}
}
