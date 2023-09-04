package oop.abs901.quiz901;

public class Circle extends Shape {
	
	int radius;
	
	
	Circle(int r) {
		
		radius = r;
	}
	
	public void getArea() {
		System.out.printf("반지름이 %d인 원의 넓이는 %.1f\n",radius,radius*radius*Math.PI);
	}
	
	public int getRadius() {
		return radius;
	}
	
	public void setRadius(int radius) {
		this.radius = radius;
	}
	
}
