package oop.obj_arr831;

import java.util.Arrays;

public class MainClass831 {

	public static void main(String[] args) {
		
		
//		Person831 kim = new Person831("김철수",32,"남자");
//		Person831 lee = new Person831("이영희",25,"여자");
//		Person831 park = new Person831("박뽀삐",50,"남자");
//		
//		kim.personInfo();
//		lee.personInfo();
//		park.personInfo();
		
//		int[] arr = new int[5];
		
//		Person831[] people = new Person831[3];
//		people[0] = new Person831("김철수",32,"남자");
		
//		int[] arr = {1,2,3,4,5};
		Person831[] people = {
				new Person831("김철수",32,"남자"),
				new Person831("이영희",25,"여자"),
				new Person831("박뽀삐",50,"남자"),
		};
		
//		System.out.println(Arrays.toString(people));
		
//		people[0].personInfo();
//		people[1].personInfo();
//		people[2].personInfo();
		
//		for(int i=0; i<people.length; i++) {
//			people[i].personInfo();
//		}
		
		for(Person831 p : people) {
			p.personInfo();
		}
		
	}

}
