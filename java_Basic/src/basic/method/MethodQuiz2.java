package basic.method;

import java.util.Arrays;

public class MethodQuiz2 {
	static String[] foods = {"떡볶이","치킨","파스타"};
	
	//1.배열의 맨 마지막 위치에 데이터를 추가하는 함수 (push -> void)
	//기존 배열보다 크기가 하나 큰 배열을 선언해서 값 고대로 내리기
	//매개값으로 전달된 값을 마지막 위치에 채우기
	
	static void push(String newfood) {
		String[] temp = new String[foods.length+1];
		for(int i=0; i<foods.length; i++) {
			temp[i] = foods[i];
		}
		temp[temp.length-1] = newfood;
		foods = temp;
		temp = null;
	}
	
	
	//2. 배열 내부 데이터를 단순 출력 함수
	static void printfood() {
		System.out.println(Arrays.toString(foods));
	}
	
	//3. 배열 내 특정 음식의 위치를 찾아주는 함수 (indexOf -> int)
	// 매개값을 전달하면 해당 매개값이 배열 내의 몇 번 인덱스인지를 리턴하는 함수
	// 존재하지 않는 값이라면 -1을 리턴
	static int indexOf(String targetName) {
		for(int i=0; i<foods.length; i++) {
			if(targetName.equals(foods[i])) {
				return i;
			}
		}
		return -1;
	}
	/*static void indexOf(String s) { 내가 한 방식
		boolean flag = false;
		for(int i=0; i<foods.length; i++) {
			if(s.equals(foods[i])) {
				System.out.println(i);
				flag = true;
				break;
			}
			
				
			}
		if(!flag) {
			System.out.println("-1");
			
		}
		
	}
	*/
	//4. 특정 음식의 배열 포함 여부( include 메서드 ) boolean타입 사용
	//매개값이 전달된 음식이 배열에 포함되어 있는가?
	// 힌트 - > indexOf라는 메서드 활용하면 됨
	
	static boolean include(String targetName) {
		return indexOf(targetName) != -1;
		
	}
	
	/*static void include(String s) { 내가 한 방식
		
		boolean flag = false;
		for(int i=0; i<foods.length; i++) {
			if(s.equals(foods[i])) {
				System.out.println("포함되어 있습니다");
				flag=true;
				break;
			}
			
		}
		if(!flag) {
			System.out.println("포함되어 있지 않습니다");
		}
		
	}
	*/
	
	//5. 특정 음식 제거 함수 ( remove -> void )
	// 전달된 음식을 배열에서 삭제하고 배열의 길이를 줄이기
	// 음식이 3개 들어있으면 배열의 길이는 3 ( null값이 없어야함 )
	static void remove(String targetName) {
		int idx = indexOf(targetName);
		if(idx == -1) {
			System.out.println("존재하지 않는 음식입니다");
		}else {
			for(int i=idx; i<foods.length-1; i++) {
				foods[i] = foods[i+1];
			}
			String[] temp = new String[foods.length-1];
			for(int j=0; j<temp.length; j++) {
				temp[j] = foods[j];
			}
			foods = temp;
			temp = null;
		}
	}
	
	/*static void remove(String s) {
		boolean flag = false;
		for(int i=0; i<foods.length; i++) {
			if(s.equals(foods[i])) {
				flag = true;
				for(int j=i; j<foods.length-1; j++) {
					foods[j]=foods[j-1];
				}
			}
		}
		
	}
	*/
	
	//6. 특정 음식 수정 메서드 (modify -> void)
	//매개값으로 전달한 인덱스의 값을 전달한 값으로 수정해 주는 메서드
	//1,탕수육을 작성하면 1번 인덱스의 떡볶이를 치우고 탕수육이 들어감
	static void modify(int i,String n) { // 매개변수 두개 쓰는 예제
		foods[i] = n;
	}
	

	public static void main(String[] args) {
		
		
		
		printfood();
		push("라면");
		push("김치찌개");
		printfood();
		
		System.out.println("파스타 : " + indexOf("파스타"));
		
		remove("김치찌개");
		remove("망고");
		printfood();
		
		System.out.println("라면의 존재 여부 : " + include("라면"));
		System.out.println("양념치킨의 존재 여부 : " + include("양념치킨"));
		
		modify(2,"닭갈비");
		printfood();
		
		
		
	}

}
