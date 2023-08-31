package oop.obj_arr831;

import java.util.Scanner;

public class ArrayInsert831 {

	public static void main(String[] args) {
		
		/*
        - 스캐너를 이용하여 Person객체를 생성하는 데 필요한
         정보를 입력받으시면 되겠습니다.
         입력받은 정보를 토대로 Person객체를 생성한 후
         여러 개의 Person 객체를 배열에다 담아 둘 생각입니다.
         
        - 배열의 크기는 3개로 하겠습니다. 반복문을 이용하여
         입력을 반복해서 받아주시면 됩니다.
         
        - 입력이 끝나면 배열 안에 있는 모든 주소값을 순회하여
         각 객체의 personInfo()를 호출해 보세요. 
        */
		
		Scanner sc = new Scanner(System.in);
		System.out.println("정보를 입력해 주세요");
		
		Person831[] person = new Person831[3];
		for(int i=0; i<person.length; i++) {
			System.out.println("이름을 입력해 주세요");
			String name = sc.next(); // person[i].setName(sc.next());로도 가능
			System.out.println("나이를 입력해 주세요");
			int age = sc.nextInt();
			System.out.println("성별을 입력해 주세요");
			String gender = sc.next();
			person[i] = new Person831(name,age,gender);
			//person[i].personInfo();
			
		}	
			for(Person831 p : person) {
				p.personInfo();
			}
		
		
//			person[0].personInfo();
//			person[1].personInfo();
//			person[2].personInfo();
//		
	
		
		

	}

}
