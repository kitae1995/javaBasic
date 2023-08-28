package basic.array;

import java.util.Arrays;

public class Array2dQuiz {

	@SuppressWarnings("null")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] score = {
                {79, 80, 99}, //A학생
                {95, 85, 89}, //B학생
                {90, 65, 56}, //C학생
                {69, 78, 77}  //D학생
                //과목: 3과목
        };
        String[] stuName = {"A학생", "B학생", "C학생", "D학생"};
        String[] subName = {"국어", "영어", "수학"};
        
        /*
        1. 각 학생의 평균을 소수점 첫째 자리까지 출력해 보세요.
        2. 각 과목의 평균을 출력해 보세요.
        3. 반 평균을 출력해 보세요. (모든 학생들의 평균을 더해서 학생수로 나누기)
        */
        
      /*  int idx = 0; //stuName 배열에서 학생의 이름을 꺼내올 용도로 사용할 변수.
        for(int[] stu : score) { // score는 2차배열이므로 int[]로 한번 나눠야함 -> {79,80,99}처럼 나눠줌
        	int total = 0;
        	for(int s:stu) { // {79,80,99} 같은 속 배열의 값 // !! for문처럼 그리고 79로 한번, 끝나고 80으로 한번 , 99로 한번 계산함 !!
        		total+= s;
        	}
        	double avg = (double)total/subName.length;
        	System.out.printf("%s의 평균: %.1f점\n",stuName[idx],avg);
        	idx++;
        	
        	
        }
        */
        //2번
        for(int i=0; i<3; i++) { // 과목
        	int total=0;
        	for(int j=0; j<4; j++) { // 학생
        		total += score[j][i];
        								// 다중 for문 : 안의 j가 3번 반복되야 밖의 i가 바뀌는 구조 ( 구구단처럼 )
        	}
        	double avg = (double)total/stuName.length;
        	System.out.printf("%s의 평균점수:%.1f점\n",subName[i],avg);
        }
        
        double totalavg = 0.0;
        int idx = 0; //stuName 배열에서 학생의 이름을 꺼내올 용도로 사용할 변수.
        for(int[] stu : score) { // score는 2차배열이므로 int[]로 한번 나눠야함 -> {79,80,99}처럼 나눠줌
        	int total = 0;
        	for(int s:stu) { // {79,80,99} 같은 속 배열의 값
        		total+= s;
        	}
        	double avg = (double)total/subName.length;
        	totalavg += avg;
        	System.out.printf("%s의 평균: %.1f점\n",stuName[idx],avg);
        	idx++;
        	
        
	}
        double classavg = totalavg/4;
        System.out.printf("우리반 평균 = %.1f점 \n",classavg);
}
}
        
