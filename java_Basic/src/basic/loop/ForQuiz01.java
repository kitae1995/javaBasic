package basic.loop;

public class ForQuiz01 {

	public static void main(String[] args) {
		
		//double rn = Math.random();
        //System.out.println(rn);

        // 1~10까지의 정수난수를 발생시키려면 ? 0.0<= ? < 1.0
		int max = 19;
        int rn = (int)(Math.random()*18+2) ;  
        for(int i=1; i<=max; i++) {
        	System.out.printf("%d X %d = %d\n",rn,i,i*rn);
        }
       
		
		
	}

}
