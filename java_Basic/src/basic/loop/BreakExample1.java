package basic.loop;

public class BreakExample1 {

	public static void main(String[] args) {
		
		for(int i=1; i<=10; i++) {
			if(i>6) {
				break;
			}
			System.out.print(i + " ");
		}
		System.out.println("\n반복문종료!");
		
		System.out.println("----------------------------");
		
	  outer:for(int i=0; i<=2; i++) {
			for(int j=0; j<=1; j++) {
				if(i==j) break outer;
				System.out.println(i+"-"+j);
			}
		}
		
		
	}

}
