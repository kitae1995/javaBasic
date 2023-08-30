package oop.modi.cls.pac2_830;

import oop.modi.cls.pac1_830.*;

public class C {
	// A a = new A(); // A는 default 제한자라 다른 패키지에 있는 C에서는 가져올수가 없음
					  // private도 마찬가지
	B b = new B();
	A a1 = new A(); // 지금은 public으로 바꿔놔서 가능
}
