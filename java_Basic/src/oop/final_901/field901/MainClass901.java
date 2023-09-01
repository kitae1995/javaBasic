package oop.final_901.field901;

public class MainClass901 {

	public static void main(String[] args) {
		
		Person kim = new Person("김철수");
//		kim.nation = "미국"; (final을 설정해놔서 수정 불가)
//		kim.name = "김마이클"; (마찬가지로 name도 final이라 절대 수정불가)
		kim.age = 30;
		
		Person park = new Person("박영희");
//		park.nation ="미국";
//		park.name = "박영국";
		
	}

}
