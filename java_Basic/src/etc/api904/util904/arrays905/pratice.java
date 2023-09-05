package etc.api904.util904.arrays905;

import java.util.Arrays;

import javax.swing.RowFilter.ComparisonType;

import basic.array.array2dquizre;

public class pratice {
	
	public static void solution(String[] participant,String[] completion) {
		//1. 비교할 배열의 순서를 정리해줌 -> 그래야 편함
		Arrays.sort(participant);
		Arrays.sort(completion);
		
		//2. 순서를 정리한 배열을 반복문으로 하나씩 비교해봄
		for(int i=0; i<completion.length; i++) { // 작은 배열의 길이로 기준을 잡아야 넘어가도 큰 배열의 길이를 넘어가지 않음
			if(!participant[i].equals(completion[i])) {
				System.out.println(participant[i]);
				return;
			}
		}	
			System.out.println(participant[participant.length-1]);
			
			
		}
	
	
	
	public static void main(String[] args) {
		
		/*
        - 참가한 사람의 이름이 담긴 배열 participant와
        완주한 사람의 이름이 담긴 배열 completion이 주어질 때
        완주하지 못한 선수의 이름을 return하는 solution 함수를 완성하세요.
        완주하지 못한 자는 1명이라고 가정합니다.
       */
		String[] participant = {"오영희","김길동","김철수","최철수","박영희"};
		String[] completion = {"김철수","김길동","박영희","최철수"};
		
		
		
		solution(participant,completion);

	}
		//김길동 김민철 김철수 박영희 최철수  
		//김길동 김철수 박영희 최철수
}
