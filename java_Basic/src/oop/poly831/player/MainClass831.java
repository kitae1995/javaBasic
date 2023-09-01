package oop.poly831.player;

public class MainClass831 {
	/*
    1. Mage는 blizzard라는 광역 기술(메서드)을 가지고 있습니다.
    
    2. Mage 클래스에 blizzard라는 메서드를 완성하세요.
    
    3. 메서드 호출부에 들어갈 매개값으로 알맞은 매개변수를 선언하세요.
     광역 마법이기 때문에 타겟이 여러 명이어야 합니다.
     그런데 매개변수는 하나입니다.
     ex) m1.blizzard(???); (배열 쓰라는 소리에요.) 다형화로 가장 위의 클래스로 묶어주면 편함
     
    4. blizzard라는 기술을 시전하는 캐릭터의 이름을 적절한 키워드를
     사용하여 출력해 보세요.
     
    5. 피해량(데미지)은 10 ~ 15사이의 난수를 발생시켜서
     타겟들에게 각각 적용해 주세요.
     
    6. 기본 객체의 hp는 50입니다. hp에서 피해량을 뺀 남은 체력을
     출력해 주세요.
    */ 
	public static void main(String[] args) {
		
		Warrior830 w1 = new Warrior830("전사1");
		Warrior830 w2 = new Warrior830("전사2");
		Mage830 m1 = new Mage830("마법사1");
		Mage830 m2 = new Mage830("마법사2");
		Hunter830 h1 = new Hunter830("사냥꾼1");
		Hunter830 h2 = new Hunter830("사냥꾼1");
		
//		Player830[] p = {w1,w2,m2,h1,h2};
//		
//		m1.blizzard(p);
//		
//		
//		Player830[] enemy = {w1,w2,m1,m2,h2};
//		h1.hawkshot(enemy);
//		m1.blizzard(p);
//		h1.hawkshot(enemy);
//		
		Player830[] w = {w2,m1,m2,h1,h2};		
		
		w1.rush(w);
		
	}
	
}
