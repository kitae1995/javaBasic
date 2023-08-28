package basic;

import java.util.Arrays;

public class Array2d {

	public static void main(String[] args) {
		
		
		/*
		 * 2차원 배열
		 * 배열 안에 배열이 존재하는 형태를 2차원 배열이라 함
		 * 실제 배열에는 배열의 주소값이 들어가게 됩니다.
		 * 
		 */
		
		// [] arr = {1,2,3}; 1차원 배열
		int[][] arr = {{1,2,3},{4,5,6},{7,8,9},{10,11,12}}; // 2차원 배열의 형태예시
		System.out.println(arr.length); // 2차원 배열이기에 12가 아닌 배열덩어리 '4'개를 가지고 있으므로 출력값은 4
		System.out.println(Arrays.toString(arr[0]));
		System.out.println(Arrays.toString(arr[1]));
		System.out.println(Arrays.toString(arr[2]));
		System.out.println(arr[2][2]);
		System.out.println(arr[1][0]);
		
		
		//2차원 배열 내부의 배열 요소들을 한 눈에 확인할 수 있는 메서드
		System.out.println(Arrays.deepToString(arr)); // 2차원 배열을 한번에 볼수있는 명령어
		
		System.out.println("--------------------------------------");
		
		int[][]arr2 = new int[3][4]; // 4의 크기를 가지는 배열덩어리 3개
		System.out.println(Arrays.deepToString(arr2));
		
		arr2[1][2] = 50;
		arr2[2][1] = 70;
		
		for(int[] array:arr2) { // arr2는 이차원 배열이라 int가 아닌 int[]로 해야 그 안의 배열을 받을수 있음
			for(int n:array) {
				System.out.print(n + " ");
			}
			System.out.println();
		}
			
		
		
		
	}

}
