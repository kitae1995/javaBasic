package oop.pac;
//작성중인 패키지와 다른 곳에 위치한 클래스를 사용하려면 import 선언이 필요합니다.
//import oop.fruit.Apple;
//import oop.fruit.banana;
//import oop.fruit.melon;
import oop.fruit.*; // 위에처럼 패키지를 하나하나 가져오면 지저분해지니 *을 주면 모든 패키지를 가져옴

public class MainClass {

	public static void main(String[] args) {
		//외부에 있는 패키지 값을 가져오려면 정보를 가져와야함.
		
		
		Apple a = new Apple();
		oop.juice.Apple a2 = new oop.juice.Apple();
		//다른 패키지 내의 같은 이름을 가진 클래스 객체를 생성할때에는
				//반드시 패키지 경로를 직접 표시해 주어야함.
		banana b = new banana();
		melon m = new melon();

	}
}
