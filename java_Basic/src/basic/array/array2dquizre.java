package basic.array;

public class array2dquizre {

	public static void main(String[] args) {
		int[][] score = {
                {79, 80, 99}, //A학생 [0]0 01 02
                {95, 85, 89}, //B학생 [1]0 11 12
                {90, 65, 56}, //C학생 [2]0 21 22
                {69, 78, 77}  //D학생 [3]0 31 32
                //과목: 3과목
        };
        String[] stuName = {"A학생", "B학생", "C학생", "D학생"};
        String[] subName = {"국어", "영어", "수학"};
        
        /*
        1. 각 학생의 평균을 소수점 첫째 자리까지 출력해 보세요.
        2. 각 과목의 평균을 출력해 보세요.
        3. 반 평균을 출력해 보세요. (모든 학생들의 평균을 더해서 학생수로 나누기)
        */
        for(int[] sc:score) { // sc = {79,80,99} ~
        	int total = 0;
        	for(int s:sc) { // sc의 요소를 for문처럼
        		total += s;
        	}
        	
        	System.out.printf("%.1f\n",(double)total/3);
        	}
        
        for(int i=0; i<3; i++) {
        	int total = 0;
        	for(int j=0; j<4; j++) {
        		total += score[j][i]; //00 10 20 30
        	}
        	 System.out.println(total/4);
        }
        
        double classavg = 0.0;
        int idx = 0;
        for(int[] sc:score) { // sc = {79,80,99} ~
        	int total = 0;
        	for(int s:sc) { // sc의 요소를 for문처럼
        		total += s;
        	}
        	 double avg = (double)total/3;
        	 classavg += avg;
        	 System.out.printf("%s의 평균 : %f\n",stuName[idx],avg);
        	
        	 idx++;
        	
        	}
        
        System.out.println(classavg/4);
        
	}
	}
