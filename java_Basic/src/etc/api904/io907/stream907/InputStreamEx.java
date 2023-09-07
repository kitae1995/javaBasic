package etc.api904.io907.stream907;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;

public class InputStreamEx {

	public static void main(String[] args) {
		
		/*
        1. 파일을 읽어들이는 데 사용하는 클래스는 FileInputStream 입니다.
        2. 생성자의 매개값으로 읽어들일 파일의 전체 경로를 적습니다.
        3. InputStream 객체는 생성자에 throws가 있기 때문에
         예외처리를 진행하셔야 합니다.
        */
		
		FileInputStream fis = null;
		try {
			fis = new FileInputStream("C:/MyWork/test.txt");
			int data = fis.read(); // 1바이트 단위로 데이터를 읽어들인다.
			System.out.print((char)data);
			
			byte[] arr = new byte[100];
			int result = fis.read(arr);
			System.out.println(Arrays.toString(arr));
			System.out.println(result);
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally { // 예외가 발생하던 안하던 진행시키는 코드 Finally
			try {
				fis.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
	}

}
