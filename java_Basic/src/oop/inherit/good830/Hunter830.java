package oop.inherit.good830;

public class Hunter830 extends Player830{
	
	String pet;
	
	void characterInfo() {
		super.characterInfo(); // super = Player830
		System.out.println("# 펫 이름 : " + pet);
	}

}
