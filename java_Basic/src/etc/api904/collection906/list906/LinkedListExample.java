package etc.api904.collection906.list906;

import java.util.LinkedList;
import java.util.List;

public class LinkedListExample {

	public static void main(String[] args) {
		
	LinkedList<String> list = new LinkedList<>(); 
	
	//추가
	
	list.add("홍길동");
	list.add("김철수");
	list.add("박영희");
	
	list.addFirst("맨 앞");
	list.addLast("맨 뒤");
	
	System.out.println(list);
	
	System.out.println(list.get(3));
	System.out.println(list.getFirst());
	System.out.println(list.getLast());
	
	list.remove(0);
	System.out.println(list);
	
	//LIFO -> last in first out -> stack 가장 늦게 들어간것이 가장 먼저 나옴
	//LinkedList는 LIFO 형식 (FIFO 형식이기도 함)
	//push , pop , peek 사용 가능 
	
	//push -> 앞에서부터 추가
	list.push("김뽀삐"); 
	System.out.println(list);
	
	//삭제하면서 데이터 읽기
	System.out.println(list.pop()); // 가장 마지막에 들어온 김뽀삐를 확인하면서 동시에 삭제해버림
	System.out.println(list);
	
	//삭제하지 않으면서 읽기
	System.out.println(list.peek());
	System.out.println(list);
	
	//FIFO -> first in first out -> Queue // 가장 먼저 들어간것이 가장 먼저 나옴 , LIFO랑은 반대
	//LInkedList는 FIFO형식(LIFO 형식이기도 함)
	//offer,poll,peek 사용 가능
	
	//offer -> 뒤에서부터 추가
	list.offer("a");
	list.offer("b");
	list.offer("c");
	System.out.println(list);
	
	System.out.println(list.poll());
	System.out.println(list);
	
	System.out.println(list.peek());	
	System.out.println(list);
	
	}

}
