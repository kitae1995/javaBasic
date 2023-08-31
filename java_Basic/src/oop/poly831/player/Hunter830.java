package oop.poly831.player;

public class Hunter830 extends Player830 {
	String pet;
	
	Hunter830(String name){
		super(name);
		this.pet = "멍멍이";
		
	}

	@Override
	void characterInfo() {
		// TODO Auto-generated method stub
		super.characterInfo();
		System.out.println("#펫 이름"+pet);
	}
	
	public void hawkshot(Player830[] enemy) {
		System.out.printf("%s님이 호크샷을 시전했습니다!\n",this.name);
		this.pet = "독수리";
		System.out.println("협동공격한 펫 : " + this.pet);
		
		for(int i=0; i<enemy.length; i++) {
			int Damage = (int) (Math.random()*6+10);
			enemy[i].hp -= Damage;
			System.out.printf("호크샷으로 인해 %s님이 %d의 피해를 입었습니다 (남은 체력 : %d)\n",enemy[i].name,Damage,
					enemy[i].hp);
			//enemy[i].hp = (enemy[i].hp -= Damage);
//			enemy[i].hp -=Damage;
//			System.out.printf("호크샷으로 인해 %s님이 %d의 피해를 입었습니다 (남은 체력 : %d)\n",enemy[i].name,Damage,
//					enemy[i].hp);
			
			if(enemy[i].hp<-0) {
				System.out.printf("%s가 사망했습니다\n",enemy[i].name);
			}
		}
			
		
		}
			
		
		
	
	
}
