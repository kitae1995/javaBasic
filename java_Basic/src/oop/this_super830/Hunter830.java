package oop.this_super830;

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
	
	
}
