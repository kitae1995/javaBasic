package etc.api904.lang904.math905;

import java.util.Scanner;

public class MathQuiz905 {
	
	public static void page() {
		int p;
		System.out.println("숫자를 입력하세요");
		Scanner sc = new Scanner(System.in);
		p = sc.nextInt();
		int p1 = (int)Math.ceil(p*0.1);
		System.out.println(p1);
		
		
		
		
		
	}

	public static void main(String[] args) {
		
		/*
        1 ~ 10이 전달되면 1이 반환되고,
        11 ~ 20이 전달되면 2가 반환되고,
        21 ~ 30이 전달되면 3이 반환되고.......
        이러한 로직을 수행하는 static 메서드 page를 선언해 보세요.
        */
		page();	
	}

}
