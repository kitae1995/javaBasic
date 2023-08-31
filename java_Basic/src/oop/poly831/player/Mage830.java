package oop.poly831.player;

public class Mage830 extends Player830 {
	int mana;

	Mage830(String name){
		super(name);
		this.mana = 100;
	}
	
	public void blizzard(Player830[] p) {
		System.out.println("마법사1님이 블리자드 스톰 시전!!");
		this.mana -= 30;
		System.out.println("남은 마나 : " + this.mana);
		System.out.println("-------------------------------------");
		for(int i=0; i<p.length; i++) {
			int Damage = (int) (Math.random()*6+10);
			p[i].hp = (int) (p[i].hp - Damage);
			System.out.printf("%s님이 %d의 피해를 입었습니다. 남은체력 : %d\n",p[i].name,Damage,p[i].hp);
		}
		
		
	}
	
	@Override
	void characterInfo() {
		super.characterInfo();
		System.out.println("# 정신력: "+mana);
	}
	
	
	 
}
