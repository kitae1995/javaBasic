package etc.api904.collection906.list906;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ListDelete {

	public static void main(String[] args) {
		try {
		Scanner sc = new Scanner(System.in);
		
		List<String> kakao = new ArrayList<>();
		Collections.addAll(kakao, "무지","네오","어피치","라이언","제이지","춘식이");
		System.out.println("현재 저장된 친구들 : " + kakao);
		while(true) {
//		System.out.println("현재 저장된 친구들 : " + kakao);
		System.out.println("삭제할 친구들을 입력하세요 : ");
		String name = sc.next();
		if(kakao.contains(name) == false) {
			throw new Exception();
		}
		kakao.remove(name);
		System.out.println(kakao);
		
		if(kakao.isEmpty()==true) {
			System.out.println("더이상 삭제할 친구가 없습니다");
			break;
		}
		
		/*
		 * 입력받은 이름을 삭제하세요
		 * 삭제 후 결과도 출력하세요
		 * 없으면 없는 이름이라고 출력해주세요
		 */
		}
	}catch(Exception e) {
		System.out.println("없는 이름입니다");
	}
	}
	
//	if(kakao.contains(name)) {  --------- 선생님 버전 훨씬 간편함
//		kakao.remove(name);
//		System.out.println("삭제후 정보 : " + kakao);
//	}else {
//		System.out.println("없습니다");
//	}

}


