package etc.api904.util904.arrays905;

import java.util.Arrays;

import javax.swing.RowFilter.ComparisonType;

import basic.array.array2dquizre;

public class ArraysQuiz905 {

	public static String solution(String[] participant, String[] completion) {
		
		/*
        - 참가한 사람의 이름이 담긴 배열 participant와
        완주한 사람의 이름이 담긴 배열 completion이 주어질 때
        완주하지 못한 선수의 이름을 return하는 solution 함수를 완성하세요.
        완주하지 못한 자는 1명이라고 가정합니다.
       */
		
		Arrays.sort(participant);
		Arrays.sort(completion);
		
		for(int i=0; i<completion.length; i++) {
			if(!participant[i].equals(completion[i])) { // 같지 않다면?
				return participant[i];      
			}
		}
		return participant[participant.length-1];
	}	
	
	public static void main(String[] args) {
		
		String[] participant = {"김민철","김길동","김철수","최철수","박영희"};
		String[] completion = {"김철수","김길동","박영희","최철수"};
		
		solution(participant, completion);
		
		System.out.println(solution(participant, completion));

	}

}
