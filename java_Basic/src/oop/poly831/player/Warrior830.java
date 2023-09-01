package oop.poly831.player;



public class Warrior830 extends Player830{

	int rage;
	
//	Warrior830(){
//		super(); <- 부모 생성자 참조
//	} <- 생성자를 생성하지 않았을시 기본으로 제공되는 생성자
	
	Warrior830(String name){
		super(name);
		rage = 60;
	}
		
	public void rush(Player830 w[]) {
		/*
        - 전사의 고유 기능인 rush 메서드를 작성합니다.
        
        - rush의 대상은 모든 직업들 입니다.
        
        - 만약 rush의 대상이 전사라면 10의 피해를 받고,
         마법사라면 20의 피해를 받고, 사냥꾼이라면 15의 피해를 받습니다.
         
        - 서로 다른 데미지를 instanceof를 사용하여 구분해서 적용해 주세요.
        
        - 남은 체력도 출력해 주세요.
        
        - main에서 객체를 생성한 후 호출하셔서 잘 적용됐는지 확인해 주세요.
        */
//		System.out.printf("%s이 %s님에게 돌진을 사용했습니다!\n",
//				this.name,p.name);
//		int damage; 
//		String job;
//		if(p instanceof Warrior830) {
//			damage = 10; job ="전사";
//		}else if(p instanceof Mage830) {
//			damage = 20; job ="마법사";
//		}else {
//			damage = 15; job ="사냥꾼";
//		}
//		p.hp -= damage;
//		System.out.printf("%s님이 %d의 피해를 입었습니다 (남은체력:%d)\n",p.name,damage,p.hp);
		System.out.println("전사1님이 돌진을 시전했습니다");
		for(int i=0; i<w.length; i++) {
			int Damage;
			if(w[i] instanceof Warrior830) {
				Damage = 10; 
				}else if(w[i] instanceof Mage830) {
					Damage = 20; 
				}else {
					Damage = 15; 
				}
			w[i].hp = (int) (w[i].hp - Damage);
			System.out.printf("%s님이 %d의 피해를 입었습니다. 남은체력 : %d\n",w[i].name,Damage,w[i].hp);
		}
		
	}
		
	
	@Override
	void characterInfo() {
		name = "광전사";
		super.characterInfo();
		System.out.println("#분노 : " + rage);
	}
	
	
	
}
