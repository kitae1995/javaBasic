package etc.exception.basic904;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MainClass904 {

	public static void main(String[] args) {
		/*
        1. 스캐너를 통해서 정수 2개를 입력받습니다.
        2. 입력받은 값이 정수라면, 단순히 입력받은 정수의 합을 출력하고
         반복문을 종료시키세요.
        3. 입력받은 값이 에러를 발생시키는 값이라면 "정수로만 입력하세요"
         를 출력한 후에 다시 입력받을 수 있도록 작성해 주세요.
        4. 반복문을 탈출하면 프로그램 정상 종료 문장을 띄워 주세요.
        
        (만약 nextInt에 정수가 아닌 문자열등이 잘못 들어갔을 경우에는
        버퍼에 입력값이 남아있기에 그걸 지워줘야함. 어떻게?
        nextLine(); 메서드를 넣어주면 됨.
        */
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
		try {
			
			System.out.println("1번 정수를 입력해주세요 : ");
			int i = sc.nextInt();
			System.out.println("2번 정수를 입력해주세요 : ");
			int j = sc.nextInt();
			System.out.printf("%d와 %d의 합 : %d ",i,j,i+j);
			break;
		}catch(InputMismatchException e) {
			System.out.println("정수를 입력해주세요");
			sc.nextLine(); // 스캐너에 남아있는 쓰레기값을 지워줌 , 이렇게 지워줘야함
		}
		
		
		
	}
	}

}
