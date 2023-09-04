package oop.obj_arr831;

public class Score {

	private String name;
	private int kor;
	private int eng;
	private int math;
	private int total;
	private double average;
	
	public Score() {
		// TODO Auto-generated constructor stub
	}

	public Score(String name, int kor, int eng, int math) {
		super();
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		this.total = kor + eng + math;
		this.average = this.total/3.0;
	}
	
//	public double getAverage() {
//		return average;
//	}
//	
//	public void setAverage(double average) {
//		this.average = average;
//	}
	
	public void scoreInfo() {
		System.out.printf("이름 : %s 국어 : %d 영어 : %d 수학 : %d\n 총점 : %d \n 평균 : %.2f"
				,name,kor,eng,math,total,average);
	}
	
	
}
