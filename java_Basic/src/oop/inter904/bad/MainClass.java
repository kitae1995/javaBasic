package oop.inter904.bad;

import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("진행하실 번호를 입력하세요");
		System.out.println("1.가입 2.로그인 3.정보수정 4.탈퇴");
		System.out.println(">");
		int menu = sc .nextInt();
		
		if(menu == 1) {
			Join904 j = new Join904();
			j.join();
		}else if(menu ==2) {
			Login904 log = new Login904();
			log.login();
		}else if(menu ==3) {
			Update904 update = new Update904();
			update.update();
		}else if(menu ==4) {
			Delete904 delete = new Delete904();
			delete.delete();
		}

	}

}
