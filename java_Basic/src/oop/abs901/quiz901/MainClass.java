package oop.abs901.quiz901;

public class MainClass {

	public static void main(String[] args) {
		Shape s1 = new Circle(4);
		s1.getArea();
		
		System.out.println("-------------------------------");
		
		Shape r1 = new Rect(5,"kitae");
		r1.getArea();
	}

}
