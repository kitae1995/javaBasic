package oop.obj_arr831;

import java.util.Scanner;

public class ScoreMain {

	public static void main(String[] args) {
		
		Score[] scores = new Score[100];
		Scanner sc = new Scanner(System.in);
		
		for(int i=0; i<scores.length; i++) {
			System.out.println("**** 학생 점수 입력 프로그램 ****");
			System.out.println("'그만'을 입력하시면 종료됩니다.");
			
			System.out.print("이름:");
			String name = sc.next();
			if(name.equals("그만")) {
				System.out.println("입력을 종료합니다.");
				break;
			}
			
			System.out.println("국어 : ");
			int kor = sc.nextInt();
			System.out.println("영어 : ");
			int eng = sc.nextInt();
			System.out.println("수학 : ");
			int math = sc.nextInt();
			
			scores[i] = new Score(name,kor,eng,math);
			
			System.out.println("**** 입력완료 ****\n");
		}
		
		for(Score s :scores) {
			if(s==null) {
				break;
			}
			s.scoreInfo();
			System.out.println("--------------------------");
		}

	}

}
