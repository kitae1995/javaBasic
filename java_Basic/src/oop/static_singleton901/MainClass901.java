package oop.static_singleton901;

public class MainClass901 {

	public static void main(String[] args) {
		
//		Singletion901 s = new Singletion901();
//		s.method1();
//		s.method2();
		
		Singletion901 s1 = Singletion901.getInstance();
		s1.method1();
		s1.method2();
		
		Singletion901 s2 = Singletion901.getInstance();
		Singletion901 s3 = Singletion901.getInstance();
		Singletion901 s4 = Singletion901.getInstance();
		Singletion901 s5 = Singletion901.getInstance();
		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(s4);
		System.out.println(s5);
		
	}

}
