package oop.this_super830;

public class MainClass830 {

	public static void main(String[] args) {
		
		Player830 p1 = new Player830();
		p1.name = "플레이어1";
		System.out.println("p1의 주소값은 : " +p1);
		p1.characterInfo();
		
		System.out.println("-----------------------------------------");
		
		Player830 p2 = new Player830("플레이어2");
		System.out.println("p2의 주소값은 : "+p2);
		p2.characterInfo();
		
		System.out.println("-----------------------------------------");
		
		Player830 p3 = new Player830("플레이어3",20);
		System.out.println("p3의 주소값은 : "+p3);
		p3.characterInfo();
		
		System.out.println("-----------------------------------------");
		
		p1.attack(p3);
		
		System.out.println("-----------------------------------------");
		
		Warrior830 w1 = new Warrior830("1전사");
		w1.characterInfo();
		
		Mage830 m1 = new Mage830("1법사");
		m1.characterInfo();
		
		Hunter830 h1 = new Hunter830("1헌터");
		h1.characterInfo();
	}

}
