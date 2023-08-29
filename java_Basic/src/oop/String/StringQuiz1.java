package oop.String;

import java.util.Scanner;

public class StringQuiz1 {
	/*
    1. 스캐너를 통해 id를 입력받습니다.
    2. 말썽꾸러기 사용자는 id에 공백을 입력할 확률이 굉장히 높습니다.
    3. 공백을 제거한 아이디가 5글자 미만이라면 다시 입력받으세요.
    4. 5글자 이상 입력되었다면 "id가 등록되었습니다." 출력후
    종료하세요.
    */
	public static void main(String[] args) {
		/*Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("ID : ");
			String id = sc.nextLine();
			id = id.trim();
			id = id.replace(" ", "");
			if(id.length()<5) {
				System.out.println("5글자 이상입니다");
			}else {
				System.out.println("ID가 등록되었습니다");
				break;
			}
		}
		*/
		Scanner sc = new Scanner(System.in);
		System.out.println("아이디를 입력해주세요");
		
		
		while(true) {
		
		String id = sc.next();
		String realid = id.trim();
		int len = realid.length();
		if(len<5) {
			System.out.println("id가 등록되었습니다");
			
			break;
		}
		else {
			System.out.println("다시 입력하세요");
			
		}
		}
		
	}

}

