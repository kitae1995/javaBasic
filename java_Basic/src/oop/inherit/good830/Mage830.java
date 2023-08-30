package oop.inherit.good830;

public class Mage830 extends Player830 {
	
	int mana;

	@Override
	void characterInfo() {
		
		super.characterInfo();
		System.out.println("# 정신력 : " + mana);
		
	}
	
	
	
	
}
