package oop.String;

import java.util.Arrays;

public class StringMethod {

	public static void main(String[] args) {
		
		
		String str = "Hello java";
		
		//charAt(index): 문자열 인덱스에 따른 단일 문자 반환.
		char c = str.charAt(4); // 이경우에는 4번째 인덱스인 Hello에서 o를 가져옴
		System.out.println(c);
		
		//subString(begin,end)
		//: 문자열을 범위를 지정하여 추출 
		String ss1 = str.substring(1, 5); //1번이상 5번미만의 인덱스를 추출해옴
		System.out.println(ss1);
		
		String ss2 = str.substring(6); // 6번부터 끝까지
		System.out.println(ss2);
		
		//length(): 문자열의 총 길이 반환
		int len = str.length();
		System.out.println(len);
		
		//indexOf(str) : 해당 문자가 있는 인덱스를 반환
		//해당 문자가 존재하지 않으면 -1을 리턴
		int idx1 = str.indexOf("e"); // l은 2번째 인덱스이므로 2를 반환함
		System.out.println(idx1);
		
		int idx2 = str.lastIndexOf("e"); // 뒤에서부터 탐색
		System.out.println(idx2);
		
		int idx3 = str.indexOf("java");
		System.out.println(idx3);
		
		String str2 = "HeLLo WoRlD";
		
		String lower = str2.toLowerCase(); // 일괄적으로 값을 소문자로 변경
		System.out.println(lower);
		String upper = str2.toUpperCase(); // 일괄적응로 대문자로 변경
		System.out.println(upper);
		
		//trim(): 문자열의 앞,뒤 공백을 제거
		String name = "          홍길동             ";
		System.out.println(name.trim() + "님 안녕하세요");
		
		//replace(old,new)
		//: 기존 문자열 내부의 old값을 모두 찾아서 new 문자열로 일괄 변경해줌
		
		String java = "자바는 재밌습니다 자바 커피는 맛있습니다";
		System.out.println(java.replace("자바","java"));
		System.out.println(java.replace("습니",""));
		
		//split: 문자열을 구분자로 구분하여 분할.
		//분할된 문자들은 String 배열에 담아서 리턴.
		String phone = "010-1234-5678";
		String[] numbers = phone.split("-");
		System.out.println(Arrays.toString(numbers)); // 010,1234,5678이 나옴
		
		String pet = "멍멍이,야옹이,짹짹이";
		String[] pets = pet.split(", ");
		System.out.println(Arrays.toString(pets));
		
		System.out.println("---------------------------------------------");
		
		//문자열의 정수/실수 변환
		String s1 = "100";
		String s2 = "3.14";
		
		int i = Integer.parseInt(s1); // s1의 값을 '진짜 정수'로 변경해줌
		double d = Double.parseDouble(s2); // s2의 값을 '진짜 실수'로 변경해줌
		
		System.out.println(i+d);
		
		//valueOf: 기본 타입을 문자열로 변경
		System.out.println(3+4);
		System.out.println(String.valueOf(3)+String.valueOf(4)); //34가 나옴 원래는 3+4는 7인데 문자열이 되버려서
		
	}

}
