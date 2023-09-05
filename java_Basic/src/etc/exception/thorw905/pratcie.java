package etc.exception.thorw905;

import java.util.Scanner;

public class pratcie {

	   public static void main(String[] args) {
	        try {
		    Scanner sc = new Scanner(System.in);
	        System.out.println("숫자를 입력하세요");
	        int num = sc.nextInt();
	        
	        int total = 0;
	        if(num<=0) {
	        	throw new Exception();
	        }
			for(int i=1; i<=num; i++) {
				total += i;
			}

			System.out.println(total);
		
	    }catch(Exception e) {
	    	System.out.println("오류");
	    }
	   }
	}


