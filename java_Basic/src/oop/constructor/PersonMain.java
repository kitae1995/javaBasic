package oop.constructor;

import java.util.Scanner;

public class PersonMain {

	public static void main(String[] args) {
		
		/*
        Scanner를 이용해서 사용자에게
        이름, 나이, 키를 입력받아서 
        해당 정보를 저장하는 객체를 디자인 해 보세요.
        객체 내에는 해당 사람의 정보를 모두 출력 해 주는
        info() 메서드가 존재합니다.
        */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("이름을 입력해주세요");
		String name = sc.next();
		System.out.println("나이를 입력해주세요");
		int age = sc.nextInt();
		System.out.println("키를 입력해주세요");
		int height = sc.nextInt();
		
		Person maninfo = new Person(name,age,height);
		maninfo.info();
		
		
		
		
		
	}

}
