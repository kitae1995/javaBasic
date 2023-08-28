package basic.loop;

public class ForExample {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		/*int i = 1;
		int total = 0;
		while(i <= 10) {
			total += i;
			i++
		}*/
		int total = 0; // total += i
		for(int i=1; i<=200; i++) {
			if(i%6==0 && i%12 !=0) {
			System.out.print(i + " ");
			}
		}
		System.out.println();
		int count = 0;
		for(int i=1; i<=60000; i++) {
			 if(i%177==0) {
				 count++;
			}
		}
		
		System.out.println(count);
		
		
		
		System.out.println("정수를 입력하시오");
		int all = 1;
		int r = sc.nextInt();
		for(int i=1; i<=r; i++) {
			all *= i;			
		}
		System.out.printf("%d! = %d\n" , r , all);

}
}
