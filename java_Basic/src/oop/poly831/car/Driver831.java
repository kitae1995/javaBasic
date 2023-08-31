package oop.poly831.car;

public class Driver831 {
	
	public void drive(Car831 c) {
		System.out.println("운전을 시작합니다");
		c.run();
	}
	
//	public Car831 buyTesla() {
//		System.out.println("테슬라를 구입합니다");
//		return new Sonata(); //Car831의 자식이기에 buyTesla 메소드여도 sonta나 포르쉐도 구입 가
//	}
	
	public Car831 buyCar(String name) {
		if(name.equals("소나타")) {
			System.out.println("소나타를 구입합니다");
			return new Sonata();
		}else if(name.equals("포르쉐")) {
			System.out.println("포르쉐를 구입합니다");
			return new Porsche();
		}else if(name.equals("테슬라")) {
			System.out.println("테슬라를 구입합니다");
			return new Tesla();
		}else {
			System.out.println("오류");
			return null;
		}
		
	}
	
}
