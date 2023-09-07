package etc.api904.io907.folder;

import java.io.File;

public class CreateFolder {

	public static void main(String[] args) {
		
		/*
		 * 자바에서 외부 경로로 폴더를 생성할 때에는 File 클래스를 사용합니다.
		 * 생성자의 매개값으로 폴더를 생성할 경로 + 폴더명을 지정합니다.
		 * 
		 */
		
		File file = new File("C:/Mywork/folder_test/test/mytest/apple");
		
		if(!file.exists()) { //경로에 해당 파일(폴더)가 실존하는가 안하는가? 존재하면 true 아니면 false
			file.mkdirs(); // !file.exists -> 경로에 폴더가 없다면 ?  mkdir : 만들라는 메서드 
						  // 복수개의 폴더를 만들때에는 mkdirs를 붙여야함
			System.out.println("폴더 생성 완료");
		}else {
			System.out.println("해당 폴더가 존재합니다");
		}

	}

}
