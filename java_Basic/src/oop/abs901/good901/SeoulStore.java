package oop.abs901.good901;

public class SeoulStore extends HeadStore{
	
	//추상메서드를 상속받았으면 자식 클래스에서 완성시켜줘야함
	
	@Override
	public void orderApple() {
		System.out.println("사과주스의 가격은 3천원 입니다.");
		
	}@Override
	public void orderBanana() {
		System.out.println("바나나주스의 가격은 2천원 입니다.");
		
	}@Override
	public void orderGrape() {
		System.out.println("포도주스의 가격은 4천원 입니다.");
		
//	public void orderWaterMelon() {
//		System.out.println("수박 주스의 가격은 4천원 입니다.");
//	}  --- 부모에게 상속받은 메서드 , 적혀잇지 않지만 존재하는것
		

		
	}
}
