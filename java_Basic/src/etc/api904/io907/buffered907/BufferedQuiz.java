package etc.api904.io907.buffered907;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class BufferedQuiz {

	public static void main(String[] args) {
			
			File file = new File("C:/MyWork/file/20230908");
			
			if(!file.exists()) {
				file.mkdirs();
				System.out.println("폴더 생성 완료");
			}else {
				System.out.println("해당 폴더가 이미 존재합니다");
			}
			
			Scanner sc = new Scanner(System.in);
			FileWriter fw = null;
			BufferedWriter bw = null;
			
			System.out.println("파일명을 입력해주세요");
			String name = sc.next();
			try {
				fw = new FileWriter("C:/MyWork/file/20230908/"+name+".txt");
				bw = new BufferedWriter(fw);
				
					System.out.println("내용을 입력해주세요 '그만'을 입력시 중단됩니다");
					String text = sc.next();
					bw.write(text);
				
		
				
			} catch (Exception e) {
				e.printStackTrace();
			}finally {
				try {
				bw.close();
				fw.close();
				sc.close();
			}catch(IOException e) {
				e.printStackTrace();
			}
			}
	}

}

