package etc.api904.lang904.obj;

public class Person implements Cloneable{
	
	private String name;
	private int age;
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	
	
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}



	public void personInfo() {
		System.out.println("이름 : " + name);
		System.out.println("나이 : " + age + "세");
	}
	
	//equals를 오버라이딩 할 때는 hashcode도 함께 오버라이딩을 진행해 주시는 것이 좋습니다.
	//equlas를 재 정의 한다는 것은 내가 원하는 방식의 동등 비교를 하겠다는 것이기 때문에
	//hashcode의 값도 그에 맞게 재 정의가 되어야 한다
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return super.hashCode();
	}
	
	
	@Override
	public boolean equals(Object obj) {
		if(this==obj) return true;
		if(obj instanceof Person) {
			Person p = (Person) obj;//object타입을 person 타입으로 형 변환 -> name,age 확인 가능
			if(this.name.equals(p.name) && this.age == p.age) {
				return true;
			}
		}		
		return false;
	}
	
	@Override
	protected void finalize() throws Throwable {
		//생성된 객체가 사라지는 시점에서 자동으로 호출 (gc가 실행될 때)
		System.out.println(this.name + "이 죽었습니다");
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}

}
