package oop.this_super830;



public class Warrior830 extends Player830{

	int rage;
	
//	Warrior830(){
//		super(); <- 부모 생성자 참조
//	} <- 생성자를 생성하지 않았을시 기본으로 제공되는 생성자
	
	Warrior830(String name){
		super(name);
		rage = 60;
		
	}
	@Override
	void characterInfo() {
		name = "광전사";
		super.characterInfo();
		System.out.println("#분노 : " + rage);
	}
	
	
	
}
