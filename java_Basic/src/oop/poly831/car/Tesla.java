package oop.poly831.car;

public class Tesla extends Car831{
	
	@Override
	void run() {
		//super.run();
		System.out.println("테슬라가 달립니다");
	}
	
	void activeAutoPilot() {
		System.out.println("테슬라의 오토파일럿이 켜집니다");
	}

}
