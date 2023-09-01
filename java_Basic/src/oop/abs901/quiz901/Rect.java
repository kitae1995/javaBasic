package oop.abs901.quiz901;

public class Rect extends Shape{

	int radius;
	String name;


	Rect(int r,String n) {
		radius = r;
		name = n;
	}

	public void getArea() {
		System.out.printf("이름이 %s이고 반지름이 %d인 정사각형의 넓이 %d  ",name,radius,radius*radius);
	}


}

