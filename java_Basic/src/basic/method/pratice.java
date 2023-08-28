package basic.method;

public class pratice {
	static double[] calcArrayTotal(int[] nums) { // 결국 리턴받는값이 double의 배열이기에
		int total = 0;
		
		for(int n:nums) {
			total += n;
		}
		
		double avg = (double)total/nums.length;
		return new double[] {total,avg}; // double로 해야 소숫점 살려서 가져갈수있음
	}
	
	static void multi(int n1,int n2) {
		int result = n1 * n2;
		System.out.printf("%d x %d = %d\n",n1,n2,result);
	}
	
	static void divide(int n1,int n2) {
		if(n2==0) {
			System.out.println("0으로 나눌수 없습니다");
			return; // void는 return을 쓸수 없지만 , 이경우는 강제종료용도로 쓰는거라 사용가능
		}
		int result = n1 / n2;
		System.out.printf("%d / %d = %d\n",n1,n2,result);
	}
	
	
	
	//return이 없는 메서드는 void를 붙여줘야함
	
	public static void main(String[] args) {
		
		int[] numbers = {57, 89, 78, 91, 93, 47};
		double[] result = calcArrayTotal(numbers);
		//System.out.println((int)result[0]);
		//System.out.println(result[1]);
		System.out.printf("%.0f,%.2f",result[0],result[1]);
		
		
		/*
        1. 메서드 이름은 calcArrayTotal로 정의하겠습니다.
        2. 이 메서드는 정수 배열을 하나 전달받아서 해당 배열 내부에 있는
        모든 정수의 합계(int)와 평균(double)을 '배열'에 담아서
        리턴하는 메서드입니다.
        3. 2번에 정의한 조건대로 메서드를 선언하시고, 실제로 main에서 호출해서
        합계와 평균(소수점 둘째 자리까지)을 출력해 주세요.
        {57, 89, 78, 91, 93, 47}
        */
		
		System.out.println("---------------------------");
		
		multi(10,7);
		
		divide(20,2);
		
		/*
		 * int num = multi(10,7) 같은게 안됨 , return이 없는 void 메서드라서
		 * system.out.println(multi(10,7)) 이것 역시 실행안됨
		 * multi(add(3,4),add(5,10)); <-이건 되는데
		 * add(multi(4,3),multi(2,5)); <- 이건 절대안됨 , multi는 void 메서드 이기에 return이 없어서
        - 반환값이 없는 void 타입의 메서드는 값이 돌아오지 않기 때문에
         실행 결과를 변수에 저장할 수 없고, 다른 메서드의 매개값으로도
         사용이 불가능합니다.
        - !!!!!!!!! 반드시 단독 호출하여 사용해야 합니다. !!!!!!!!!!!!!
        - void 메서드는 단순히 동작을 지시하는 역할을 수행합니다.
        */
	}

}
