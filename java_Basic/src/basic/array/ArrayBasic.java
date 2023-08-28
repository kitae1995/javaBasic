package basic.array;

import java.util.Arrays;

public class ArrayBasic {

	public static void main(String[] args) {
		
		
		//# 배열 ( array )
		//-> 같은 데이터 타입의 값을 집합 형태로 나열하기 위한 자료형
		//1. 배열 변수의 선언
		
		int[] arr;  // java의 스타일
		int arr2[]; // c의 스타일 (되기는 함)
		
		//2. 배열 객체를 생성한다 - 실제 값들이 저장될 공간을 형성
		//생성할 떄 배열의 크기를 정해 주셔야 합니다.
		
		arr = new int[5];
		
		//3. 배열의 초기화 - 배열 내부에 실제 값들을 저장.
        //배열의 초기화는 인덱스를 통해 수행합니다.
        //인덱스란 배열 내부의 위치를 지정할 수 있는 값입니다.
        //인덱스는 0번부터 시작하여 1씩 순차적으로 증가합니다.
		
		arr[0] = 65; // arr은 이미 배열타입을 가졌기에 arr[]로 들어갈 칸 번호를 지정해줘야함
		arr[1] = 88;
		arr[2] = arr[0]; 
		arr[3] = (int) 3.14;
		//arr[4] = "들어갈까요?"; // 절대안됨 애초에 int 배열이기때문에
		arr[4] = 100;
		//arr[5] = 60; int[5]짜리 배열이라 크기를 벗어났으므로 숫자 대입이 안됨
		//arr[6] = 30;
		
		//4. 배열의 총 크기(길이) 확인. -> 배열변수명.length
		
		
		System.out.println("arr 배열의 길이는 ? : " + arr.length);
		
		//5. 배열에 저장된 값을 참조(사용)하는 법. (인덱스를 이용)
		System.out.println("배열의 1번째 데이터: "+arr[0]);
		System.out.println("배열의 2번째 데이터: "+arr[1]);
		System.out.println("배열의 3번째 데이터: "+arr[2]);
		System.out.println("배열의 4번째 데이터: "+arr[3]);
		System.out.println("배열의 5번째 데이터: "+arr[4]);
		
		//6. 배열의 반복문 처리
		//배열은 인덱스 번호를 제어변수로 활용하여 쉽게 반복문을 처리 할 수 있다.
		for(int idx=0; idx<arr.length; idx++) {
			System.out.printf("배배열의 %d번째 데이터: %d\n",idx+1,arr[idx]);
		}
		
		//7. 배열 내부의 요소값을 문자열 형태로 한눈에 출력하기
		System.out.println(Arrays.toString(arr));
		
		//8. 배열의 선언과 생성을 동시에 하기.
		double[] dArr = new double[3];
		String[] sArr = new String[4];
		byte[] bArr = new byte[10];
		
		//배열은 생성됨과 동시에 각 타입의 기본값으로 자동 지정됨.
		System.out.println(Arrays.toString(dArr));
		System.out.println(Arrays.toString(sArr));
		System.out.println(Arrays.toString(bArr));
		
		//9. 배열의 생성과 동시에 초기화도 하는 방법.
		char[] letters = new char[] {'a','b','c'};
		System.out.println(Arrays.toString(letters));
		
		//선언과 동시에 초기화
		//딱 1번만 가능한 문법
		String[] names = {"홍길동","김철수","박영희"};
		//names = {"홍길동","김철수","박영희","김뽀삐"}; 이런건 안됨
		//기존의 배열을 조작하는게 아니라 새롭게 생성해야함.
		names = new String[] {"홍길동","김철수","박영희","김뽀삐"};
				
		
		
	}

}
