package oop.this_super830;

public class Mage830 extends Player830 {
	int mana;

	Mage830(String name){
		super(name);
		this.mana = 100;
	}
	
	@Override
	void characterInfo() {
		super.characterInfo();
		System.out.println("# 정신력: "+mana);
	}
	
	 
}
