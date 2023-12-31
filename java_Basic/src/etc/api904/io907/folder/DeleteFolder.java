package etc.api904.io907.folder;

import java.io.File;
import java.util.Arrays;

public class DeleteFolder {

	public static void main(String[] args) {
		
		File file = new File("C:/Mywork/folder_test");
		
		/*
		if(file.exists()) {
			file.delete(); // delete 성공시 true, 실패 시 false를 리턴
			System.out.println("삭제 완료");
		}else {
			System.out.println("삭제 실패 or 경로가 존재하지 않음");
		}
		*/
		
		/*
		 * 폴더를 삭제 할 때, 해당 폴더에 내부 경로가 더 존재하거나, 파일이 있는 경우에는
		 * 폴더를 삭제 할 수 없습니다.
		 * listFiles()를 통해 파일 내부 경로 또는 파일명을 얻어와서 파일부터 삭제 한 후에
		 * 폴더를 삭제할 수 있습니다.
		 * 지우고자 하는 경로가 여러개라면 위의 행동을 반복해야 합니다.
		 */
		
		if(file.exists()) { // 경로에 파일(폴더)가 잇는지 확인
			if(file.isDirectory()) {// 파일이 디렉토리인지 확인
				File[] files = file.listFiles();
//				System.out.println(Arrays.toString(files));
				for(int i=0; i<files.length; i++) {
					if(files[i].delete()) {
						System.out.println(files[i].getName() + "삭제 성공");
					}else {
						System.out.println(files[i].getName() + "삭제 실패");
					}
				}
			}
			if(file.delete()) {
				System.out.println("삭제 성공!");
			}else {
				System.out.println("삭제 실패!");
			}
		}
		
	}

}
