package oop.encap.bad830;

public class MainClass830 {

	public static void main(String[] args) {
		Mybirth my = new Mybirth();
		my.year = 19922134;
		my.month = 1012341;
		my.day = 1312341;
		// 말도 안되는 날짜를 넣어도 작동이 되서 안좋은 코드
		my.birthInfo();
	}

}
