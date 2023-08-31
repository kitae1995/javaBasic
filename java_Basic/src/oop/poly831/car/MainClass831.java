package oop.poly831.car;

public class MainClass831 {

	public static void main(String[] args) {
		
		Sonata s1 = new Sonata();
		Sonata s2 = new Sonata();
		Sonata s3 = new Sonata();
		
		Porsche p1 = new Porsche();
		Porsche p2 = new Porsche();
		Porsche p3 = new Porsche();
		
		Tesla t1 = new Tesla();
		Tesla t2 = new Tesla();
		Tesla t3 = new Tesla();
		Tesla t4 = new Tesla();
		
//		Sonata[] sonatas = {s1,s2,s3};
//		for(Sonata s:sonatas) {
//			s.run();
//		}
		
		//다형성을 적용해서 이종모음 배열을 선언할 수 있다.
		Car831[] cars = {s1,s2,s3,p1,p2,p3,t1,t2,t3,t4}; // 최고 상위 클래스인 Car로 선언했기에
														 // sonata,tesla등의 하위 클래스도 선언 가능
		for(Car831 c :cars) {
			c.run();
		}
		
		System.out.println("-----------------------------");
		
		System.out.println("*** 타이어 교체 작업 ***");
		t1.frontLeft = new NTire();
		t1.frontRight = new NTire();
		t1.rearLeft = new NTire();
		t1.rearRight = new NTire();
		
		System.out.println("-----------------------------");
		
		Driver831 Kim = new Driver831();
		Kim.drive(p1);
		Kim.drive(t1);
		Kim.drive(s1);
		
		System.out.println("-----------------------------");
		
		Car831 c = Kim.buyCar("테슬라");
		c.run();
		
		
	}

}
