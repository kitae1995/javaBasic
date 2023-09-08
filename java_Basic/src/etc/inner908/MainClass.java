package etc.inner908;

public class MainClass {
	
	//내부 클래스(inner class)
	//해당 객체와 밀접한 연관이 있는 경우 클래스 내에서 클래스를 선언.
	//일반적인 클래스를 정의할때에는 private를 사용 할 수 없지만
	//클래스 내에 클래스를 선언하는 내부 클래스는 private 선언 가능
	//static  선언 이유?- > 메모리 효율을 높이기 위해( 바깥족 클래스에서 재생성 방지 ) 
	
	private static class SubCalculator implements Calculator{ // static은 꼭 줘야 작동함 객체 생성없이 해야하니까
		
		@Override
		public int operate(int n1, int n2) {
			return n1-n2;
		}
	}
	
	
	public static void main(String[] args) {
		
		//덧셈 계산을 하는 계산기를 만들어 쓰고 싶음.
		
		Calculator addcal = new AddCalculator();
		System.out.println(addcal.operate(30, 50));
		
		//뺄셈 계산을 하는 계산기도 필요.
		//그럼 Calculator 인터페이스에서 또 상속받아서 뺄셈 클래스를 만들어줘야하는데
		//여기서 밖에 안쓸 클래스인거 같아서 파일 하나 또 만들면 너무 낭비인거같음.
		//이럴때 사용하는게 바로 내부 클래스(inner class)
		//해당 객체와 밀접한 연관이 있는 경우 클래스 내에서 클래스를 선언(만들어줌).
		
		Calculator subcal = new SubCalculator();
		System.out.println(subcal.operate(100, 40));
		
		//곱셈 계산을 하는 계산기가 필요. (익명 클래스 사용해서 해보기)
		//원래는 인터페이스를 상속받은 클래스를 만들어서 곱셈계산기를 만들어야하지만, 이곳에서만 쓸거같고 , 데이터 절약을 하고 싶으면
		//말 그대로 이름이 없는 클래스를 즉석에서 선언.(곱셈계산기를 바로 쓰는 느낌)
		//선언한 클래스내에선 마음껏 사용 가능하지만
		//즉흥으로 만든 클래스이기에 외부에선 사용 불가능
		
		Calculator multical = new Calculator() { //원래 인터페이스로 객체를 못만들지만 , 익명클래스로는 가능함
			
			@Override
			public int operate(int n1, int n2) {
				return n1*n2;
			}
		};
			
		System.out.println(multical.operate(2, 5));
		
		//나눗셈을 하는 계산기가 필요. ( lambda 식으로 선언 ) -> 을 씀
		//!! 인터페이스의 추상메서드가 단 한개일 경우 (지금 있는 Calculator 처럼)만 사용 가능.
		//추상메서드가 한개이기 때문에 이름도 따로 명시하지 않음
		//메서드 내부 로직이 단 한줄이라면 괄호조차 생략 가능 (밑에처럼) -> return 값으로 취급.
		Calculator divCal = (n1,n2) -> n1/n2; // operate를 구현한 로직임 ,단 하나라서 operate 이름조차 붙일 필요 X
		System.out.println(divCal.operate(25, 5));
		
		
		
		//람다식 추상메서드가 2줄이면 ?
		
		Pet dog = new Pet() { // 익명 클래스
			
			@Override
			public void play() {
				System.out.println("강아지가 마당에서 놈");
				
			}
			
			@Override
			public void eat() {
				System.out.println("강아지는 사료를 먹음");
				
			}
		};
		
		dog.play();
		dog.eat();
		
		
		
		
	}

}
