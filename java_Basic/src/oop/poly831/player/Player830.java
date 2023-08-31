package oop.poly831.player;

public class Player830 extends Object { // Object는 자바 모든 클래스의 최상위 클래스로써 안적어도 이건 기본값임
	
		String name;
		int level;
		int atk;
		int hp;
		
		Player830(){ 
			
			
			this.level = 1;
			this.atk = 3;
			this.hp = 50;
		}
		
		Player830(String name){
			this();
			this.name = name; 
		}
		
		Player830(String name,int hp){
			this(name); 
			
			
			this.hp = hp;
		}
		
		void attack(Player830 target) {
			
			System.out.printf("%s가 %s를 공격합니다.\n",this.name,target.name);	// this = 이 메서드를 부른 장본인
			
			if(this == target){
				System.out.println("자해할 수 없습니다");
				return;
			}else {
				target.hp = target.hp+5;
				this.hp = this.hp-10;
				System.out.printf("%s의 체력 :%d, %s의 체력:%d",this.name,target.hp,target.name,this.hp);
			}
			
			
		}
		
		void characterInfo() {
			System.out.println("캐릭터의 정보 ***");
			
			System.out.println("# 아이디 : " + name);
			System.out.println("# 레벨 : " + level);
			System.out.println("# 공격력 : " + atk);
			System.out.println("# 체력 : " + hp);
			System.out.println("이 메서드를 호출한 객체의 이름은 ? : " + this.name);
		}

	

}
