package etc.api904.lang904.obj;

public class MainClass {

	public static void main(String[] args) {
		
		Person park = new Person("박영희",25);
		Person hong = new Person("홍길동",24);
		
		park.personInfo();
		hong.personInfo();
		
		System.out.println(park.toString());
		
		System.out.println(hong.equals(hong));
		
		if(hong.equals(park)) {
			System.out.println("이름과 나이가 같다");
		}else {
			System.out.println("이름,나이 둘 중 하나가 다릅니다");
		}
		
//		//finallize- 객체가 마무리될때 실행되는 코드로써
//		//gc(가비지 콜렉터)가 호출 되는 순서가 보장되지 않기떄문에 사용을 권장하지 않음.
//		hong = null;
//		park = null;
//		System.gc();
		
		Person kim = new Person("김복제인간",100);
		
		try {
			Person clonePerson = (Person) kim.clone();
			System.out.println("복사된 개체 정보 : " + clonePerson);
			System.out.println("kim의 주소 " + kim.hashCode());
			System.out.println("복사된 개체 주소 : " + clonePerson.hashCode());
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
