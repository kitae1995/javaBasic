package oop.encap.bad830;

public class Mybirth {
	
	int year;
	int month;
	int day;
	
	void birthInfo() {
		System.out.printf("내 생일은 %d년 %d월 %d일 입니다.\n",this.year,this.month,this.day);
		//birthInfo를 부른 객체의 this
	}

}
