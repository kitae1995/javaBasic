package oop.static_init901;

public class MainClass901 {

	public static void main(String[] args) {
		
		
		//DBmanager manager = new DBManager();
		
		/*
        - 정적 초기화자를 호출하려면 클래스를 로딩하시면 됩니다.
        # 클래스 로딩 방법
        1. 클래스의 이름을 참조하여 static 멤버를 호출.
        2. 객체를 생성함.
        - 정적 초기화자는 클래스 로딩 시 최초 1회만 호출됩니다.
        */
		
		System.out.println("주소 : " + DBManager.addr);
		System.out.println("계정명 : " + DBManager.uid);
		System.out.println("비밀번호 : " + DBManager.upw);
		
		//위의 메소드 실행시키면 null값이 나오는데 , static 멤버들도 초기화값을 줘야함 ( 정적 초기화자 라고 함 )

	}

}
