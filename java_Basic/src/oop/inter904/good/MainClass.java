package oop.inter904.good;

import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		//다형성 적용을 위해 인터페이스 타입의 변수를 하나 선언.
		IUserService904 sv;
		
		System.out.println("진행하실 번호를 입력하세요");
		System.out.println("1.가입 2.로그인 3.정보수정 4.탈퇴");
		System.out.println(">");
		int menu = sc .nextInt();
		
		if(menu == 1) {
			sv = new Join904(); // IUserService904 sv; = new Join904();
			sv.execute();
		}else if(menu ==2) {
			sv = new Login();	// IUserService904 sv; = new Login();
			sv.execute();
		}else if(menu ==3) {
			sv = new Update904(); // IUserService904 sv; = new Update904();
			sv.execute();
			
		}else if(menu ==4) {
			sv = new Delete904(); // IUserService904 sv; = new Delete904();
			sv.execute();
		}
		
		//결국 인터페이스를 쓰는 이유는 , 원래 쓰던 다형성에서 더 효율성을 추구한거임

	}

}
