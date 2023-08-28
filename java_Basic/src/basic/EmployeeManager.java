package basic;

import java.util.Arrays;
import java.util.Scanner;

public class EmployeeManager {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		
		//사원의 정보 사번,이름,나이,부서
		int[] userNums = new int[100];
		String[] names = new String[100];
		int[] ages = new int[100];
		String[] departments = new String[100];
		
		//실제로 입력될 데이터(사원의 정보)의 개수를 체크하는 변수.
		int count = 0;
		
		while(true) {
			System.out.println("\n========== 사원 관리 프로그램 ==========");
            System.out.println("# 1. 사원 정보 신규 등록");
            System.out.println("# 2. 모든 사원 정보 보기");
            System.out.println("# 3. 사원 정보 검색");
            System.out.println("# 4. 사원 정보 수정");
            System.out.println("# 5. 사원 정보 삭제");
            System.out.println("# 6. 프로그램 종료");            
            System.out.println("====================================");
        
            System.out.print("> ");
            int menu = sc.nextInt();
            
            if(menu == 1) {
            	System.out.println("사원 정보를 입력해주세요 [사번/이름/나이/부서]");
            	

                 // 새로운 정보를 저장할 인덱스를 count로 지정
                 int index = count;

                 System.out.println("사번");
                 userNums[index] = sc.nextInt();

                 System.out.println("이름");
                 names[index] = sc.next();

                 System.out.println("나이");
                 ages[index] = sc.nextInt();

                 System.out.println("부서");
                 departments[index] = sc.next();

                 System.out.println("정보가 정상적으로 입력 되었습니다");

                 // count 값을 증가하여 다음에 입력할 위치를 지정
                 count++;
                 
                 System.out.println(Arrays.toString(userNums));
                 System.out.println(count);
            
            	
            	
            	//사원 정보 4가지를 입력받아 각 배열에 저장하는 코드를 작성.
                //사번은 중복되면 안됩니다.
                //(무한루프를 구현해서 사번 중복이 발생하면 다시 입력받기.)
            }else if(menu == 2) {
            	if(count == 0) {
        			System.out.println("등록된 사원 정보가 없습니다");
        			
        		}
            	for(int i=0; i<=count-1; i++) {
            	
            		System.out.println(userNums[i]);
            		System.out.println(names[i]);
            		System.out.println(ages[i]);
            		System.out.println(departments[i]);
            	}
            	//각 배열을 반복문을 통해 저장된 데이터까지만 출력하도록 작성. (count)
                //만약 사용자가 사원 등록을 한 명도 하지 않았다면
                //"등록된 사원 정보가 없습니다." 를 출력하시면 됩니다.
            }else if(menu == 3) {
            	
            	System.out.println("사번을 입력해주세요");
            	int ind = sc.nextInt();
            	boolean found = false;
            	for(int i=0; i<=count; i++) {
            	if(ind == userNums[i]) {
            		System.out.println(userNums[i]);
            		System.out.println(names[i]);
            		System.out.println(ages[i]);
            		System.out.println(departments[i]);
            		found = true;
            		break;
            	}
            	}
            	
            	if(!found) {
            		System.out.println("없는 사번입니다!");
            	
            	
         
            	}
            
            	 //입력한 사번에 일치하는 사원의 4가지 정보를 모두 출력하세요.
                //입력한 사번이 존재하지 않는다면 "조회하신 사원의 정보가 없습니다." 를 출력.
            }else if(menu == 4) {
            	System.out.println("사번을 입력해주세요");
            	int choice;
            	int ind = sc.nextInt();
            	boolean flag = false;
            	for(int i=0; i<=count; i++) {
            	if(ind == userNums[i]) {
            		flag = true;
            		System.out.println("[1. 나이변경 | 2. 부서변경 | 3.취소]");
            		choice = sc.nextInt();
            		if(choice == 1) {
            		ages[i] = sc.nextInt();
            		}
            		if(choice == 2) {
            		departments[i] = sc.next();
            		}
            		if(choice == 3) {
            		break;
            		}
            	}
            	}
            	if(!flag) {
            		System.out.println("사번이 존재하지 않습니다");
            	}
            	//해당 사번과 일치하는 사원의 나이와 부서를 선택적으로 변경할 수 있도록
                //프로그램을 구성하시고, 나이와 부서를 수정하는 코드를 작성하세요.
                //사번 입력 -> 존재하는 사번이 맞다면 -> [1. 나이변경 | 2. 부서변경 | 3.취소]
                //사번이 존재하지 않는다면 없다고 얘기해 주세요.
            }else if(menu == 5) {
            	//사번을 입력받아서
                //해당 사번과 일치하는 사원의 4가지 정보를 각 배열에서 모두 삭제하고
                //삭제하기 전에 "정말 삭제하시겠습니까? [Y/N]" 를 입력받아서
                //y를 눌렀을 시에 삭제가 되도록 코드를 구성하세요.
                //배열의 크기는 줄이지 않겠습니다. 삭제할 인덱스를 기준으로 뒤에 있는 값들을
                //앞으로 한칸씩 땡기신 다음 count를 하나 내려주시면 됩니다.
            }else if(menu == 6 ) {
            	System.out.println("프로그램을 종료합니다");
            	sc.close();
            	break; // while true의 break
            }else {
            	System.out.println("잘못된 메뉴가 입력 되었습니다.");
            }
		}// end while true

	}//end main

}
