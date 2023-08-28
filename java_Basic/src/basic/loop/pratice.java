package basic.loop;

import java.util.Scanner;

public class pratice {

	public static void main(String[] args) {
		/*
		 1. 2가지의 정수를 1~100사이의 난수를 발생시켜서 
		  지속적으로 문제를 출제한 후 정답을 입력받으세요.
		  사용자가 0을 입력하면 반복문을 탈출시키세요.
		  
		 2. 종료 이후에 정답 횟수와 오답 횟수를 각각 출력하세요.
		*/
		Scanner sc = new Scanner(System.in);
		System.out.println("**정답을 입력하세요");
		System.out.println("&중단하시려면 0을 입력해주세요");
		System.out.println("-------------------");
		int gcount = 0;
		int bcount = 0;
		
		
		while(true) {
			int first = (int) (Math.random()*100+1);
			int second = (int) (Math.random()*100+1);
			int num;
			int ran = (int) (Math.random()*2);
			if(ran==0) {
				System.out.printf("%d+%d : ??? ",first,second);
				num = first+second;
			}else {
				System.out.printf("%d-%d : ??? ",first,second);
				num = first-second;
			}
			int answer = sc.nextInt();
			
			if(answer==num) {
				System.out.println("정답입니다");
				gcount++;
			}
			else if(answer==0) {
				System.out.println("수행 종료");
				break;
			}
			else {
				System.out.println("오답입니다");
				bcount++;
			}
			
			
		}
		System.out.println("정답횟수 : "+gcount);
		System.out.println("오답횟수 : "+bcount);

	}

}
