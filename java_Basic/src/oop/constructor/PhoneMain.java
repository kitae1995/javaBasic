package oop.constructor;

public class PhoneMain {

	public static void main(String[] args) {
		
		
		Phone basic = new Phone();
		basic.showSpec();
		
		System.out.println("------------------------------------------");
		
		Phone Galaxy = new Phone("갤럭시 s23");
		Galaxy.showSpec();
		
		Phone iPhone14 = new Phone("아이폰 14","블랙");
		iPhone14.showSpec();
	}

}
