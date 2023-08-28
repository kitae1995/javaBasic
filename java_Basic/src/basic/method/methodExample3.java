package basic.method;

public class methodExample3 {
	/*
	 # 반환값, 반환 유형 (return value, return type)
	 
	 1. 반환값이란 메서드의 실행 결과값을 의미합니다.
	 
	 2. 매개변수는 여러 개 존재할 수 있지만, 반환값은 오직 한 개만
	  존재해야 합니다.
	  
	 3. 전달되는 값의 타입을 반환 유형이라고 하며, 메서드를 선언할 때
	  메서드 이름 앞에 반드시 반환 유형을 명시해야 합니다.
	  
	 4. return이라는 키워드를 사용하며 return 뒤에 전달할 값을
	  지정합니다. (변수, 상수)
	  
	 5. 반환값이 있는 메서드는 호출문 자체가 하나의 값으로 처리될 수 있기 때문에
	  반환값을 다른 변수에 대입할 수도 있고, 다른 메서드의 매개값으로도
	  처리될 수 있습니다.
	 
	 6. 모든 메서드가 반환값이 있는 것은 아닙니다. 메서드 실행 후에
	  반환할 값이 딱히 없다면 return을 생략해도 됩니다.
	  
	 7. 이 때는 반환유형을 메서드를 선언할 때 비워두지 마시고
	  void라는 키워드를 작성해 주셔야 합니다.
	  
	 8. 모든 메서드는 return을 만나면 강제로 메서드가 종료됩니다.
	  따라서 조건 없이 return문 아래에 코드를 작성할 수 없습니다.
	  void메서드에서는 return 키워드를 탈출 기능으로 사용할 수 있습니다.
	 
	 */
	static int add(int n1,int n2) {
		return n1+n2;
					
	}
	
	static int[] operateTotal(int n1,int n2){
		/*return n1+n2; // return이 발동이되면 그 메서드(함수)가 끝나버리기에 그 밑에 뭐가 와도 절대 실행안됨
		return n1-n2;
		return n1*n2;
		return n1/n2;*/
		//사칙연산 한번에 , 보통 연산을 한번에 return값을 받고 싶으면 배열을 쓰면됨
		return new int[] {n1+n2,n1-n2,n1*n2,n1/n2};
	}
	
	static int calcArrayTotal(int[] nums) {
		int total = 0;
		for(int n :nums) {
			total += n;
		}
		return total;
	}
	
	public static void main(String[] args) {
		int r1 = add(3,8); //int r1 = 11;	
		int r2 = add(10,15); //int r2 = 35;
		int r3 = add(add(4,6),add(7,8)); // 작동됨.
		System.out.println(r3);
		
		int[] array = operateTotal(30,6);
		System.out.println(array[0]);
		System.out.println(array[1]);
		System.out.println(array[2]);
		System.out.println(array[3]);
		
		/*
        1. 메서드 이름은 calcArrayTotal로 정의하겠습니다.
        2. 이 메서드는 정수 배열을 하나 전달받아서 해당 배열 내부에 있는
        모든 정수의 합계(int)와 평균(double)을 '배열'에 담아서
        리턴하는 메서드입니다.
        3. 2번에 정의한 조건대로 메서드를 선언하시고, 실제로 main에서 호출해서
        합계와 평균(소수점 둘째 자리까지)을 출력해 주세요.
        {57, 89, 78, 91, 93, 47}
        */
		
		int sum = calcArrayTotal(new int[] {57,89,78,91,93,47});
		System.out.println(sum);
	}

	

	private static int calcArrayTotal((int i, int j, int k, int l, int m, int n) {
		// TODO Auto-generated method stub
		return 0;
	}

}

