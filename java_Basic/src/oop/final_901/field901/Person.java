package oop.final_901.field901;
//final - > 쉽게 말하면 수정불가
public class Person {

	//final 변수는 불변의 값을 의미합니다.
	//그렇기 때문에 반드시 초기화가 필요합니다.
	//초기화는 직접 하는 방법과, 생성자를 이용하는 방법이 있습니다.

	final String nation = "대한민국"; //final을 붙여서 나중에 메소드에서 nation 수정하려해도 수정안됨
	final String name; // 1번방법 직접 초기화
	int age;

	public Person(String name) { // 2번방법 생성자에 설정해놓기
		this.name = name;
	}


}
