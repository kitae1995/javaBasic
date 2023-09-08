package etc.api904.io907.buffered907;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;

public class BufferedInputStream908 {

	public static void main(String[] args) {


		FileInputStream fis = null;
		BufferedInputStream bis = null;
		
		try {
			fis = new FileInputStream("C:/MyWork/merong.txt");
			bis = new BufferedInputStream(fis);
			
			/*
            - read(): 한 바이트를 int로 읽어옴
            - read(byte[]): 전달한 byte[]의 크기만큼 채워준다.
             전달한 배열에 몇 byte를 채웠는지 반환한다.
            - read(byte[], off, len)
            : 전달한 byte[]중에 off부터 len까지만 데이터를 채운다.
            */
			byte[] data = new byte[100];
			int b = bis.read(data,5,50);
			System.out.println(b);
			System.out.println(Arrays.toString(data));
			
			
			
		} catch (Exception e) {
			
			e.printStackTrace();
		}finally {
			try {
				bis.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}