package etc.api904.util904.random906;

import java.util.Random;

public class RandomExample906 {

	public static void main(String[] args) {
		
		Random r = new Random();
		
		//실수 난수 : 0.0 <= ~ < 1.0
		
		double d = r.nextDouble();
		System.out.println(d);
		
		int i = r.nextInt();
		System.out.println(i);
		
		//0~5 까지의 정수 난수 생성 ( 끝값이 미만으로 인식됨 )
		
		int j = r.nextInt(6); // 0 이상 6 미만이라는 뜻
		System.out.println(j);
		
		int k = r.nextInt(91)+10; //0이상 101미만
		System.out.println(k);
		
		int p = (int) (Math.random()*10);
		System.out.println(p);
	}

}
