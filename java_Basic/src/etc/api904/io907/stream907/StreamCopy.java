package etc.api904.io907.stream907;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class StreamCopy {

	public static void main(String[] args) {

		FileInputStream oldFile = null;
		FileOutputStream newFile = null;
		
		try {
			oldFile = new FileInputStream("C:/MyWork/penguin.jpg");
			newFile = new FileOutputStream("C:\\Users\\ict\\Desktop");
			
			byte[] arr = new byte[100];
			
			while(true) {
				int result = oldFile.read(arr);
				if(result == -1 )break;
				
				//바이트 단위로 데이터를 쓰는데 0부터 읽은 크기까지의 파일을 작성함
				newFile.write(arr,0,result);
			}
			
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				oldFile.close();
				newFile.close();
			}catch(IOException e) {
				e.printStackTrace();
			}
		}
		

	}

}
