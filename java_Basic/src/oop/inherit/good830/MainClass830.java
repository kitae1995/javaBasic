package oop.inherit.good830;

public class MainClass830 {

	public static void main(String[] args) {
		
		Warrior830 w1 = new Warrior830();
		w1.level = 1;
		w1.atk = 3;
		w1.hp = 50;
		w1.name = "전사1";
		w1.rage = 60;
		w1.characterInfo();
		
		System.out.println("----------------------------------------");
		
		Mage830 m1 = new Mage830();
		
		m1.level = 3;
		m1.atk = 1;
		m1.hp = 20;
		m1.name = "법사1";
		m1.mana = 50;
		m1.characterInfo();
		
		
		System.out.println("----------------------------------------");
		
		Hunter830 h1 = new Hunter830();
		h1.level = 2;
		h1.atk = 2;
		h1.hp = 30;
		h1.name = "헌터1";
		h1.pet = "비둘기";
		h1.characterInfo();
	}
	
	

}
