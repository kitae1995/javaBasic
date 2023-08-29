package oop.String;

import java.util.Scanner;


public class Pratice {

	public static void main(String[] args) {
		/*
		1. 주민등록번호 13자리를 입력받습니다.
		2. 주민등록번호는 -을 포함해서 받을 예정입니다.
		3. 13자리가 아니라면 다시 입력받습니다.
		4. 남자인지 여자인지를 구분해서 출력해 주시면 됩니다.
		*/
		Scanner sc = new Scanner(System.in);
		
		outer:while(true) {
		System.out.println("주민등록번호를 입력해주세요");
		String person = sc.next();
		person = person.replace("-","");
		
		if(person.length()!=13) {
			System.out.println("다시 입력하세요");
			
		}else {
			System.out.println("정상적으로 입력되었습니다.");
			switch(person.charAt(6)) {
			case '1': case '3':
				System.out.println("남성입니다");
				break outer;
				
			case '2': case '4':
				System.out.println("여성입니다");
				break outer;
			default:
				System.out.println("오류입니다");
			}
			
		}

	}
		
}

}
