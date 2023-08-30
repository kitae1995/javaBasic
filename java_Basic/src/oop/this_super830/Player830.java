package oop.this_super830;

public class Player830 extends Object { // Object는 자바 모든 클래스의 최상위 클래스로써 안적어도 이건 기본값임
	
		String name;
		int level;
		int atk;
		int hp;
		
		Player830(){ //player830의 기본 디폴트값
			//super(); -> Object의 값을 가져옴
			System.out.println("Player830의 기본 생성자 호출");
			
			this.level = 1;
			this.atk = 3;
			this.hp = 50;
		}
		
		Player830(String name){
			this(); // 같은 클래스의 다른 생성자를 부르는 문법
			System.out.println("Player830의 2번 생성자 호출");
			//level = 3;
			//atk = 9;
			//hp = 150;
			this.name = name; // 이안에만 통용되는 지역변수라 의미가없음 this를 붙여서 최상위 멤버변수인 name으로 지정해야함
							  // p2	
		}
		
		Player830(String name,int hp){
			this(name); // 다른 생성자의 호출은 생성자 내에서 최상단에 위치해야 합니다.
			System.out.println("Player830의 3번 생성자 호출");
			//this.name = name;
			this.hp = hp;
		}
		
		void attack(Player830 target) {
			//System.out.println("target : " + target);
			//System.out.println("this : " + this);
			System.out.printf("%s가 %s를 공격합니다.\n",this.name,target.name);	// this = 이 메서드를 부른 장본인
			
			if(this == target){// 자기자신을 호출해서 자해하면 안되니까
				System.out.println("자해할 수 없습니다");
				return;
			}else {
				target.hp = target.hp+5;
				this.hp = this.hp-10;
				System.out.printf("%s의 체력 :%d, %s의 체력:%d",this.name,target.hp,target.name,this.hp);
			}
			
			//출력 메세지 : x가 y를 공격합니다.
			//맞는 사람의 hp를 10 낮추고 나의 체력을 5 올림
			//결과를 출력 ( 나의 체력 : XX, 상대의 체력 : XX )
		}
		
		void characterInfo() {
			System.out.println("캐릭터의 정보 ***");
			//System.out.println("this의 주소값 : " + this);
			System.out.println("# 아이디 : " + name);
			System.out.println("# 레벨 : " + level);
			System.out.println("# 공격력 : " + atk);
			System.out.println("# 체력 : " + hp);
			System.out.println("이 메서드를 호출한 객체의 이름은 ? : " + this.name);
		}

	

}
