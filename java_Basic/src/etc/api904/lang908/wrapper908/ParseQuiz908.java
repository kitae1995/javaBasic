package etc.api904.lang908.wrapper908;

import java.util.Scanner;

public class ParseQuiz908 {
	
//	
//	패키지: etc.api.lang.wrapper
//	클래스이름: ParseQuiz
//
//
//	주민등록번호를 입력받아서 다음과 같은 정보를 추출하여 출력합니다.
//
//	ex) 입력값: 9201013-1234567
//	출력값: 1992년 10월 13일 31세 남자 
//
//	입력값: 040906-4123456
//	출력값: 2004년 9월 6일 19세 여자 
//
//	입력값은 하이픈이 포함된 문자열이어야 합니다. 
//	하이픈이 포함되어 있지 않거나, 주민등록번호 뒷자리 첫번째 숫자가 1,2,3,4가 아닐 시에는 다시 입력받아야 합니다.
//	또한 하이픈을 제외한 값이 숫자가 아닐 시에도 다시 입력받아 주시면 됩니다.
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String ssn;
		char c;
		String gender;
		int birthYear;
		
		while(true) {
		System.out.println("주민등록번호를 입력해주세요 (- 포함)");
		System.out.println(">");
		ssn = sc.next(); // - 까지 들어가기에 nextint 안됨
		
		if(ssn.indexOf("-") == -1) { // ssn에 "-"가 있느냐 ? 없으면 -1이 리턴됨 즉 잘못 입력했다는거
			System.out.println("-을 포함시켜 입력해주세요");
			continue;
		}
		
		if(ssn.length() != 14) { // 주민등록번호는 14자리
			System.out.println("올바른 주민등록번호 형태가 아닙니다");
			continue;
		}
		
		char c = ssn.charAt(7); // 주민등록번호 뒷자리 시작하는 순번
		if(!(c == '1' || c == '2' || c == '3' || c == '4')) { // 4개중 하나도 만족시키지 못했나?
			System.out.println("뒷자리 주민등록번호가 1,2,3,4중 하나여야 합니다");
			continue;
		}
		
		
		
		try {
			String test = ssn.substring(0,6); // 0번 인덱스 이상부터 6번 인덱스 미만까지 0<=ssn<6
			String test2 = ssn.substring(7); //7번 인덱스부터 끝까지
			Integer.parseInt(test); //test에 int값이 아닌게 들어가있다면 오류
			Integer.parseInt(test2);
			break; // 모두 통과하면 여기서 break로 whilt문 통과
		}catch(Exception e) {
			System.out.println("숫자로 입력해야 합니다");
		}
			
		}
		
		//921013-1234567
		int year = Integer.parseInt(ssn.substring(0,2));
		int month = Integer.parseInt(ssn.substring(2,4));
		int day = Integer.parseInt(ssn.substring(4,6));
		
		if(c == '1' || c == '3') {
			gender = "남자";
		}else {
			gender = "여자";
		}
		
		if(c == '1' || c == '2') {
			birthYear = 1900 + year;
		}else
			birthYear = 2000 + year;
		
		int age = 2023 - birthYear;
		
		System.out.println();
		}
	
	
		
		
		
		
	}


